package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulletFormat extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var Character: Double = js.native
  val Font: typingsSlinky.activexPowerpoint.PowerPoint.Font = js.native
  val Number: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.BulletFormat_typekey")
  var PowerPointDotBulletFormat_typekey: BulletFormat = js.native
  var RelativeSize: Double = js.native
  var StartValue: Double = js.native
  var Style: PpNumberedBulletStyle = js.native
  var Type: PpBulletType = js.native
  var UseTextColor: MsoTriState = js.native
  var UseTextFont: MsoTriState = js.native
  var Visible: MsoTriState = js.native
  def Picture(Picture: String): Unit = js.native
}

object BulletFormat {
  @scala.inline
  def apply(
    Application: Application,
    Character: Double,
    Font: Font,
    Number: Double,
    Parent: js.Any,
    Picture: String => Unit,
    PowerPointDotBulletFormat_typekey: BulletFormat,
    RelativeSize: Double,
    StartValue: Double,
    Style: PpNumberedBulletStyle,
    Type: PpBulletType,
    UseTextColor: MsoTriState,
    UseTextFont: MsoTriState,
    Visible: MsoTriState
  ): BulletFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Character = Character.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Picture = js.Any.fromFunction1(Picture), RelativeSize = RelativeSize.asInstanceOf[js.Any], StartValue = StartValue.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseTextColor = UseTextColor.asInstanceOf[js.Any], UseTextFont = UseTextFont.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.BulletFormat_typekey")(PowerPointDotBulletFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletFormat]
  }
  @scala.inline
  implicit class BulletFormatOps[Self <: BulletFormat] (val x: Self) extends AnyVal {
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
    def withCharacter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Character")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
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
    def withPowerPointDotBulletFormat_typekey(value: BulletFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.BulletFormat_typekey")(value.asInstanceOf[js.Any])
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
    def withStyle(value: PpNumberedBulletStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PpBulletType): Self = {
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

