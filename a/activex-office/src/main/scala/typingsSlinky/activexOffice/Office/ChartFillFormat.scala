package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartFillFormat extends js.Object {
  val Application: js.Any = js.native
  val BackColor: ChartColorFormat = js.native
  val Creator: Double = js.native
  val ForeColor: ChartColorFormat = js.native
  val GradientColorType: Double = js.native
  val GradientDegree: Double = js.native
  val GradientStyle: Double = js.native
  val GradientVariant: Double = js.native
  @JSName("Office.ChartFillFormat_typekey")
  var OfficeDotChartFillFormat_typekey: ChartFillFormat = js.native
  val Parent: js.Any = js.native
  val Pattern: Double = js.native
  val PresetGradientType: Double = js.native
  val PresetTexture: Double = js.native
  val TextureName: String = js.native
  val TextureType: Double = js.native
  val Type: Double = js.native
  var Visible: Double = js.native
  def OneColorGradient(Style: Double, Variant: Double, Degree: Double): Unit = js.native
  def Patterned(Pattern: Double): Unit = js.native
  def PresetGradient(Style: Double, Variant: Double, PresetGradientType: Double): Unit = js.native
  def PresetTextured(PresetTexture: Double): Unit = js.native
  def Solid(): Unit = js.native
  def TwoColorGradient(Style: Double, Variant: Double): Unit = js.native
  def UserPicture(PictureFile: String, PictureFormat: js.Any, PictureStackUnit: js.Any, PicturePlacement: js.Any): Unit = js.native
  def UserTextured(TextureFile: String): Unit = js.native
}

object ChartFillFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    BackColor: ChartColorFormat,
    Creator: Double,
    ForeColor: ChartColorFormat,
    GradientColorType: Double,
    GradientDegree: Double,
    GradientStyle: Double,
    GradientVariant: Double,
    OfficeDotChartFillFormat_typekey: ChartFillFormat,
    OneColorGradient: (Double, Double, Double) => Unit,
    Parent: js.Any,
    Pattern: Double,
    Patterned: Double => Unit,
    PresetGradient: (Double, Double, Double) => Unit,
    PresetGradientType: Double,
    PresetTexture: Double,
    PresetTextured: Double => Unit,
    Solid: () => Unit,
    TextureName: String,
    TextureType: Double,
    TwoColorGradient: (Double, Double) => Unit,
    Type: Double,
    UserPicture: (String, js.Any, js.Any, js.Any) => Unit,
    UserTextured: String => Unit,
    Visible: Double
  ): ChartFillFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GradientColorType = GradientColorType.asInstanceOf[js.Any], GradientDegree = GradientDegree.asInstanceOf[js.Any], GradientStyle = GradientStyle.asInstanceOf[js.Any], GradientVariant = GradientVariant.asInstanceOf[js.Any], OneColorGradient = js.Any.fromFunction3(OneColorGradient), Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Patterned = js.Any.fromFunction1(Patterned), PresetGradient = js.Any.fromFunction3(PresetGradient), PresetGradientType = PresetGradientType.asInstanceOf[js.Any], PresetTexture = PresetTexture.asInstanceOf[js.Any], PresetTextured = js.Any.fromFunction1(PresetTextured), Solid = js.Any.fromFunction0(Solid), TextureName = TextureName.asInstanceOf[js.Any], TextureType = TextureType.asInstanceOf[js.Any], TwoColorGradient = js.Any.fromFunction2(TwoColorGradient), Type = Type.asInstanceOf[js.Any], UserPicture = js.Any.fromFunction4(UserPicture), UserTextured = js.Any.fromFunction1(UserTextured), Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ChartFillFormat_typekey")(OfficeDotChartFillFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFillFormat]
  }
  @scala.inline
  implicit class ChartFillFormatOps[Self <: ChartFillFormat] (val x: Self) extends AnyVal {
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
    def withBackColor(value: ChartColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeColor(value: ChartColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientColorType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GradientColorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientDegree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GradientDegree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GradientStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientVariant(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GradientVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotChartFillFormat_typekey(value: ChartFillFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.ChartFillFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneColorGradient(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OneColorGradient")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatterned(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Patterned")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPresetGradient(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetGradient")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPresetGradientType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetGradientType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetTexture(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresetTextured(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PresetTextured")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSolid(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Solid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTextureName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextureName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoColorGradient(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwoColorGradient")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPicture(value: (String, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPicture")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUserTextured(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserTextured")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisible(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

