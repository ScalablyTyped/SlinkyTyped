package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProperties
  extends ComponentProperties
     with ComponentWithIcon {
  /**
  		 * The content of the currently selected file
  		 */
  var fileContent: js.UndefOr[String] = js.native
  /**
  		 * Whether the button opens the file browser dialog
  		 */
  var isFile: js.UndefOr[Boolean] = js.native
  /**
  		 * The label for the button
  		 */
  var label: js.UndefOr[String] = js.native
  /**
  		 * @deprecated This will be moved to `ComponentWithIconProperties`
  		 *
  		 * The title for the button. This title will show when hovered over
  		 */
  var title: js.UndefOr[String] = js.native
}

object ButtonProperties {
  @scala.inline
  def apply(): ButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProperties]
  }
  @scala.inline
  implicit class ButtonPropertiesOps[Self <: ButtonProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContent")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

