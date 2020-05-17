package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoShadowStyle
import typingsSlinky.activexOffice.Office.MsoShadowType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowFormat extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Blur: Double = js.native
  val Creator: Double = js.native
  val ForeColor: ColorFormat = js.native
  var Obscured: MsoTriState = js.native
  var OffsetX: Double = js.native
  var OffsetY: Double = js.native
  val Parent: js.Any = js.native
  var RotateWithShape: MsoTriState = js.native
  var Size: Double = js.native
  var Style: MsoShadowStyle = js.native
  var Transparency: Double = js.native
  var Type: MsoShadowType = js.native
  var Visible: MsoTriState = js.native
  @JSName("Word.ShadowFormat_typekey")
  var WordDotShadowFormat_typekey: ShadowFormat = js.native
  def IncrementOffsetX(Increment: Double): Unit = js.native
  def IncrementOffsetY(Increment: Double): Unit = js.native
}

object ShadowFormat {
  @scala.inline
  def apply(
    Application: Application,
    Blur: Double,
    Creator: Double,
    ForeColor: ColorFormat,
    IncrementOffsetX: Double => Unit,
    IncrementOffsetY: Double => Unit,
    Obscured: MsoTriState,
    OffsetX: Double,
    OffsetY: Double,
    Parent: js.Any,
    RotateWithShape: MsoTriState,
    Size: Double,
    Style: MsoShadowStyle,
    Transparency: Double,
    Type: MsoShadowType,
    Visible: MsoTriState,
    WordDotShadowFormat_typekey: ShadowFormat
  ): ShadowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], IncrementOffsetX = js.Any.fromFunction1(IncrementOffsetX), IncrementOffsetY = js.Any.fromFunction1(IncrementOffsetY), Obscured = Obscured.asInstanceOf[js.Any], OffsetX = OffsetX.asInstanceOf[js.Any], OffsetY = OffsetY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RotateWithShape = RotateWithShape.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ShadowFormat_typekey")(WordDotShadowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
  @scala.inline
  implicit class ShadowFormatOps[Self <: ShadowFormat] (val x: Self) extends AnyVal {
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
    def withBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeColor(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncrementOffsetX(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncrementOffsetX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncrementOffsetY(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncrementOffsetY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObscured(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Obscured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateWithShape(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotateWithShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: MsoShadowStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoShadowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotShadowFormat_typekey(value: ShadowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.ShadowFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

