package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A button. Can be a text button or an image button.
  */
@js.native
trait SchemaButton extends js.Object {
  /**
    * A button with image and onclick action.
    */
  var imageButton: js.UndefOr[SchemaImageButton] = js.native
  /**
    * A button with text and onclick action.
    */
  var textButton: js.UndefOr[SchemaTextButton] = js.native
}

object SchemaButton {
  @scala.inline
  def apply(): SchemaButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaButton]
  }
  @scala.inline
  implicit class SchemaButtonOps[Self <: SchemaButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageButton(value: SchemaImageButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTextButton(value: SchemaTextButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textButton")(js.undefined)
        ret
    }
  }
  
}

