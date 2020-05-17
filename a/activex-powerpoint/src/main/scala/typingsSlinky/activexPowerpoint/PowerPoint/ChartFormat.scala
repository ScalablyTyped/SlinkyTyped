package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.GlowFormat
import typingsSlinky.activexOffice.Office.SoftEdgeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartFormat extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Creator: Double = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val Line: LineFormat = js.native
  val Parent: js.Any = js.native
  val PictureFormat: typingsSlinky.activexPowerpoint.PowerPoint.PictureFormat = js.native
  @JSName("PowerPoint.ChartFormat_typekey")
  var PowerPointDotChartFormat_typekey: ChartFormat = js.native
  val Shadow: ShadowFormat = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val TextFrame2: typingsSlinky.activexPowerpoint.PowerPoint.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
}

object ChartFormat {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Fill: FillFormat,
    Glow: GlowFormat,
    Line: LineFormat,
    Parent: js.Any,
    PictureFormat: PictureFormat,
    PowerPointDotChartFormat_typekey: ChartFormat,
    Shadow: ShadowFormat,
    SoftEdge: SoftEdgeFormat,
    TextFrame2: TextFrame2,
    ThreeD: ThreeDFormat
  ): ChartFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextFrame2 = TextFrame2.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartFormat_typekey")(PowerPointDotChartFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFormat]
  }
  @scala.inline
  implicit class ChartFormatOps[Self <: ChartFormat] (val x: Self) extends AnyVal {
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
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: FillFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlow(value: GlowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Glow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: LineFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureFormat(value: PictureFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotChartFormat_typekey(value: ChartFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.ChartFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadow(value: ShadowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftEdge(value: SoftEdgeFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextFrame2(value: TextFrame2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextFrame2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreeD(value: ThreeDFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreeD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

