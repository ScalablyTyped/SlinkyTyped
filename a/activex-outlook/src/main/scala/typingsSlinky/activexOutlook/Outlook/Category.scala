package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.OLE_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val CategoryBorderColor: OLE_COLOR = js.native
  val CategoryGradientBottomColor: OLE_COLOR = js.native
  val CategoryGradientTopColor: OLE_COLOR = js.native
  val CategoryID: String = js.native
  val Class: OlObjectClass = js.native
  var Color: OlCategoryColor = js.native
  var Name: String = js.native
  @JSName("Outlook.Category_typekey")
  var OutlookDotCategory_typekey: Category = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  var ShortcutKey: OlCategoryShortcutKey = js.native
}

object Category {
  @scala.inline
  def apply(
    Application: Application,
    CategoryBorderColor: OLE_COLOR,
    CategoryGradientBottomColor: OLE_COLOR,
    CategoryGradientTopColor: OLE_COLOR,
    CategoryID: String,
    Class: OlObjectClass,
    Color: OlCategoryColor,
    Name: String,
    OutlookDotCategory_typekey: Category,
    Parent: js.Any,
    Session: NameSpace,
    ShortcutKey: OlCategoryShortcutKey
  ): Category = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CategoryBorderColor = CategoryBorderColor.asInstanceOf[js.Any], CategoryGradientBottomColor = CategoryGradientBottomColor.asInstanceOf[js.Any], CategoryGradientTopColor = CategoryGradientTopColor.asInstanceOf[js.Any], CategoryID = CategoryID.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShortcutKey = ShortcutKey.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Category_typekey")(OutlookDotCategory_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
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
    def withCategoryBorderColor(value: OLE_COLOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoryBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryGradientBottomColor(value: OLE_COLOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoryGradientBottomColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryGradientTopColor(value: OLE_COLOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoryGradientTopColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CategoryID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: OlCategoryColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotCategory_typekey(value: Category): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Category_typekey")(value.asInstanceOf[js.Any])
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
    def withShortcutKey(value: OlCategoryShortcutKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortcutKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

