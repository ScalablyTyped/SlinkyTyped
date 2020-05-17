package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.Script
import typingsSlinky.activexOffice.Office.SmartArt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineShape extends js.Object {
  var AlternativeText: String = js.native
  val AnchorID: Double = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Borders: typingsSlinky.activexWord.Word.Borders = js.native
  val Chart: typingsSlinky.activexWord.Word.Chart = js.native
  val Creator: Double = js.native
  val EditID: Double = js.native
  val Field: typingsSlinky.activexWord.Word.Field = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val GroupItems: GroupShapes = js.native
  val HasChart: MsoTriState = js.native
  val HasSmartArt: MsoTriState = js.native
  var Height: Double = js.native
  val HorizontalLineFormat: typingsSlinky.activexWord.Word.HorizontalLineFormat = js.native
  val Hyperlink: typingsSlinky.activexWord.Word.Hyperlink = js.native
  val IsPictureBullet: Boolean = js.native
  val Line: LineFormat = js.native
  val LinkFormat: typingsSlinky.activexWord.Word.LinkFormat = js.native
  var LockAspectRatio: MsoTriState = js.native
  val OLEFormat: typingsSlinky.activexWord.Word.OLEFormat = js.native
  val OWSAnchor: Double = js.native
  val Parent: js.Any = js.native
  var PictureFormat: typingsSlinky.activexWord.Word.PictureFormat = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  val Reflection: ReflectionFormat = js.native
  var ScaleHeight: Double = js.native
  var ScaleWidth: Double = js.native
  val Script: typingsSlinky.activexOffice.Office.Script = js.native
  val Shadow: ShadowFormat = js.native
  val SmartArt: typingsSlinky.activexOffice.Office.SmartArt = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  var TextEffect: TextEffectFormat = js.native
  var Title: String = js.native
  val Type: WdInlineShapeType = js.native
  var Width: Double = js.native
  @JSName("Word.InlineShape_typekey")
  var WordDotInlineShape_typekey: InlineShape = js.native
  def Activate(): Unit = js.native
  def ConvertToShape(): Shape = js.native
  def Delete(): Unit = js.native
  def Reset(): Unit = js.native
  def Select(): Unit = js.native
}

object InlineShape {
  @scala.inline
  def apply(
    Activate: () => Unit,
    AlternativeText: String,
    AnchorID: Double,
    Application: Application,
    Borders: Borders,
    Chart: Chart,
    ConvertToShape: () => Shape,
    Creator: Double,
    Delete: () => Unit,
    EditID: Double,
    Field: Field,
    Fill: FillFormat,
    Glow: GlowFormat,
    GroupItems: GroupShapes,
    HasChart: MsoTriState,
    HasSmartArt: MsoTriState,
    Height: Double,
    HorizontalLineFormat: HorizontalLineFormat,
    Hyperlink: Hyperlink,
    IsPictureBullet: Boolean,
    Line: LineFormat,
    LinkFormat: LinkFormat,
    LockAspectRatio: MsoTriState,
    OLEFormat: OLEFormat,
    OWSAnchor: Double,
    Parent: js.Any,
    PictureFormat: PictureFormat,
    Range: Range,
    Reflection: ReflectionFormat,
    Reset: () => Unit,
    ScaleHeight: Double,
    ScaleWidth: Double,
    Script: Script,
    Select: () => Unit,
    Shadow: ShadowFormat,
    SmartArt: SmartArt,
    SoftEdge: SoftEdgeFormat,
    TextEffect: TextEffectFormat,
    Title: String,
    Type: WdInlineShapeType,
    Width: Double,
    WordDotInlineShape_typekey: InlineShape
  ): InlineShape = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), AlternativeText = AlternativeText.asInstanceOf[js.Any], AnchorID = AnchorID.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Chart = Chart.asInstanceOf[js.Any], ConvertToShape = js.Any.fromFunction0(ConvertToShape), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EditID = EditID.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], GroupItems = GroupItems.asInstanceOf[js.Any], HasChart = HasChart.asInstanceOf[js.Any], HasSmartArt = HasSmartArt.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HorizontalLineFormat = HorizontalLineFormat.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], IsPictureBullet = IsPictureBullet.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], LinkFormat = LinkFormat.asInstanceOf[js.Any], LockAspectRatio = LockAspectRatio.asInstanceOf[js.Any], OLEFormat = OLEFormat.asInstanceOf[js.Any], OWSAnchor = OWSAnchor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), ScaleHeight = ScaleHeight.asInstanceOf[js.Any], ScaleWidth = ScaleWidth.asInstanceOf[js.Any], Script = Script.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], SmartArt = SmartArt.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextEffect = TextEffect.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.InlineShape_typekey")(WordDotInlineShape_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineShape]
  }
  @scala.inline
  implicit class InlineShapeOps[Self <: InlineShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAlternativeText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlternativeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnchorID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorders(value: Borders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChart(value: Chart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvertToShape(value: () => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertToShape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEditID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EditID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(value.asInstanceOf[js.Any])
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
    def withGroupItems(value: GroupShapes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasChart(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasSmartArt(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasSmartArt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalLineFormat(value: HorizontalLineFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HorizontalLineFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperlink(value: Hyperlink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPictureBullet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPictureBullet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: LineFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkFormat(value: LinkFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockAspectRatio(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOLEFormat(value: OLEFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OLEFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOWSAnchor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OWSAnchor")(value.asInstanceOf[js.Any])
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
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReflection(value: ReflectionFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reflection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScaleHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript(value: Script): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShadow(value: ShadowFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmartArt(value: SmartArt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmartArt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftEdge(value: SoftEdgeFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextEffect(value: TextEffectFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdInlineShapeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotInlineShape_typekey(value: InlineShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.InlineShape_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

