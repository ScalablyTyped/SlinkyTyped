package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulletFormat2 extends js.Object {
  val Application: js.Any = js.native
  var Character: Double = js.native
  val Creator: Double = js.native
  val Font: Font2 = js.native
  val Number: Double = js.native
  @JSName("Office.BulletFormat2_typekey")
  var OfficeDotBulletFormat2_typekey: BulletFormat2 = js.native
  val Parent: js.Any = js.native
  var RelativeSize: Double = js.native
  var StartValue: Double = js.native
  var Style: MsoNumberedBulletStyle = js.native
  var Type: MsoBulletType = js.native
  var UseTextColor: MsoTriState = js.native
  var UseTextFont: MsoTriState = js.native
  var Visible: MsoTriState = js.native
  def Picture(FileName: String): Unit = js.native
}

object BulletFormat2 {
  @scala.inline
  def apply(
    Application: js.Any,
    Character: Double,
    Creator: Double,
    Font: Font2,
    Number: Double,
    OfficeDotBulletFormat2_typekey: BulletFormat2,
    Parent: js.Any,
    Picture: String => Unit,
    RelativeSize: Double,
    StartValue: Double,
    Style: MsoNumberedBulletStyle,
    Type: MsoBulletType,
    UseTextColor: MsoTriState,
    UseTextFont: MsoTriState,
    Visible: MsoTriState
  ): BulletFormat2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Character = Character.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Picture = js.Any.fromFunction1(Picture), RelativeSize = RelativeSize.asInstanceOf[js.Any], StartValue = StartValue.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseTextColor = UseTextColor.asInstanceOf[js.Any], UseTextFont = UseTextFont.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.BulletFormat2_typekey")(OfficeDotBulletFormat2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletFormat2]
  }
  @scala.inline
  implicit class BulletFormat2Ops[Self <: BulletFormat2] (val x: Self) extends AnyVal {
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
    def withCharacter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Character")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: Font2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotBulletFormat2_typekey(value: BulletFormat2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.BulletFormat2_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicture(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Picture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRelativeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: MsoNumberedBulletStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoBulletType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTextColor(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTextFont(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseTextFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

