package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable picture feature in Spreadsheet. By enabling this, you can add pictures in Spreadsheet.
    * @Default {true}
    */
  var allowPictures: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to define height to picture in the Spreadsheet.
    * @Default {220}
    */
  var height: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates to define width to picture in the Spreadsheet.
    * @Default {440}
    */
  var width: js.UndefOr[Double] = js.native
}

object PictureSettings {
  @scala.inline
  def apply(): PictureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureSettings]
  }
  @scala.inline
  implicit class PictureSettingsOps[Self <: PictureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPictures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPictures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPictures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPictures")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

