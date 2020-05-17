package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartArtQuickStyle extends js.Object {
  val Application: js.Any = js.native
  val Category: String = js.native
  val Creator: Double = js.native
  val Description: String = js.native
  val Id: String = js.native
  val Name: String = js.native
  @JSName("Office.SmartArtQuickStyle_typekey")
  var OfficeDotSmartArtQuickStyle_typekey: SmartArtQuickStyle = js.native
  val Parent: js.Any = js.native
}

object SmartArtQuickStyle {
  @scala.inline
  def apply(
    Application: js.Any,
    Category: String,
    Creator: Double,
    Description: String,
    Id: String,
    Name: String,
    OfficeDotSmartArtQuickStyle_typekey: SmartArtQuickStyle,
    Parent: js.Any
  ): SmartArtQuickStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SmartArtQuickStyle_typekey")(OfficeDotSmartArtQuickStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartArtQuickStyle]
  }
  @scala.inline
  implicit class SmartArtQuickStyleOps[Self <: SmartArtQuickStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotSmartArtQuickStyle_typekey(value: SmartArtQuickStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.SmartArtQuickStyle_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

