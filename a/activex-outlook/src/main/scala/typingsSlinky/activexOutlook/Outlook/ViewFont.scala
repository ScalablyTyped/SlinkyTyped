package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewFont extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  var Bold: Boolean = js.native
  val Class: OlObjectClass = js.native
  var Color: OlColor = js.native
  var ExtendedColor: OlCategoryColor = js.native
  var Italic: Boolean = js.native
  var Name: String = js.native
  @JSName("Outlook.ViewFont_typekey")
  var OutlookDotViewFont_typekey: ViewFont = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  var Size: Double = js.native
  var Strikethrough: Boolean = js.native
  var Underline: Boolean = js.native
}

object ViewFont {
  @scala.inline
  def apply(
    Application: Application,
    Bold: Boolean,
    Class: OlObjectClass,
    Color: OlColor,
    ExtendedColor: OlCategoryColor,
    Italic: Boolean,
    Name: String,
    OutlookDotViewFont_typekey: ViewFont,
    Parent: js.Any,
    Session: NameSpace,
    Size: Double,
    Strikethrough: Boolean,
    Underline: Boolean
  ): ViewFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ExtendedColor = ExtendedColor.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewFont_typekey")(OutlookDotViewFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFont]
  }
  @scala.inline
  implicit class ViewFontOps[Self <: ViewFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: OlColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedColor(value: OlCategoryColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotViewFont_typekey(value: ViewFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.ViewFont_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikethrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Strikethrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Underline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

