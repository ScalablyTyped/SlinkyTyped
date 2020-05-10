package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.ui method when 'name' is set to
  * 'skydrivepicker'.
  */
@js.native
trait ISkyDrivePickerProperies extends IUIProperties {
  /**
    * Defines the color pallette used for the file picker dialog box. Valid
    * values are "white", "gray", and "transparent".
    * @default "white"
    */
  var lightbox: js.UndefOr[String] = js.native
  /**
    * The type of SkyDrive file picker button to display. Specify "save" to
    * display the upload button. Specify "open" to display the download
    * button.
    */
  var mode: String = js.native
  /**
    * Specifies the function to call if the selected files cannot be
    * successfully uploaded or downloaded.
    */
  var onerror: js.UndefOr[js.Function] = js.native
  /**
    * If the mode property is set to "save", specifies the function to call
    * after the user clicks either Save or Cancel in the file picker. If
    * the mode property is set to "open", specifies the function to call
    * after the user clicks either Open or Cancel in the file picker.
    */
  var onselected: js.UndefOr[js.Function] = js.native
  /**
    * Required if the mode property is set to "open". Specifies how many
    * files the user can select to download. Specify "single" for a single
    * file. Specify "multi" for multiple files.
    * @default "single"
    */
  var select: js.UndefOr[String] = js.native
  /**
    * Defines the color pallette used for the file picker button. Valid
    * values are "white" and "blue".
    * @default "white"
    */
  var theme: js.UndefOr[String] = js.native
}

object ISkyDrivePickerProperies {
  @scala.inline
  def apply(element: String, mode: String, name: String): ISkyDrivePickerProperies = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISkyDrivePickerProperies]
  }
  @scala.inline
  implicit class ISkyDrivePickerProperiesOps[Self <: ISkyDrivePickerProperies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightbox")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnselected(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onselected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

