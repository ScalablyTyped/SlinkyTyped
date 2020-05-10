package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget is a UI element that presents texts, images, etc.
  */
@js.native
trait SchemaWidgetMarkup extends js.Object {
  /**
    * A list of buttons. Buttons is also oneof data and only one of these
    * fields should be set.
    */
  var buttons: js.UndefOr[js.Array[SchemaButton]] = js.native
  /**
    * Display an image in this widget.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  /**
    * Display a key value item in this widget.
    */
  var keyValue: js.UndefOr[SchemaKeyValue] = js.native
  /**
    * Display a text paragraph in this widget.
    */
  var textParagraph: js.UndefOr[SchemaTextParagraph] = js.native
}

object SchemaWidgetMarkup {
  @scala.inline
  def apply(): SchemaWidgetMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWidgetMarkup]
  }
  @scala.inline
  implicit class SchemaWidgetMarkupOps[Self <: SchemaWidgetMarkup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: js.Array[SchemaButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: SchemaImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyValue(value: SchemaKeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTextParagraph(value: SchemaTextParagraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textParagraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextParagraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textParagraph")(js.undefined)
        ret
    }
  }
  
}

