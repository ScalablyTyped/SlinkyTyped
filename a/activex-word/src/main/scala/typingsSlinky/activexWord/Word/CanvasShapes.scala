package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoCalloutType
import typingsSlinky.activexOffice.Office.MsoConnectorType
import typingsSlinky.activexOffice.Office.MsoEditingType
import typingsSlinky.activexOffice.Office.MsoPresetTextEffect
import typingsSlinky.activexOffice.Office.MsoTextOrientation
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasShapes extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.CanvasShapes_typekey")
  var WordDotCanvasShapes_typekey: CanvasShapes = js.native
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  def AddCurve(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  def AddPicture(
    FileName: String,
    LinkToFile: js.UndefOr[js.Any],
    SaveWithDocument: js.UndefOr[js.Any],
    Left: js.UndefOr[js.Any],
    Top: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any]
  ): Shape = js.native
  def AddPolyline(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddShape(Type: Double, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddTextEffect(
    PresetTextEffect: MsoPresetTextEffect,
    Text: String,
    FontName: String,
    FontSize: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    Left: Double,
    Top: Double
  ): Shape = js.native
  def AddTextbox(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder = js.native
  def Item(Index: js.Any): Shape = js.native
  def Range(Index: js.Any): ShapeRange = js.native
  def SelectAll(): Unit = js.native
}

object CanvasShapes {
  @scala.inline
  def apply(
    AddCallout: (MsoCalloutType, Double, Double, Double, Double) => Shape,
    AddConnector: (MsoConnectorType, Double, Double, Double, Double) => Shape,
    AddCurve: js.Any => Shape,
    AddLabel: (MsoTextOrientation, Double, Double, Double, Double) => Shape,
    AddLine: (Double, Double, Double, Double) => Shape,
    AddPicture: (String, js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Shape,
    AddPolyline: js.Any => Shape,
    AddShape: (Double, Double, Double, Double, Double) => Shape,
    AddTextEffect: (MsoPresetTextEffect, String, String, Double, MsoTriState, MsoTriState, Double, Double) => Shape,
    AddTextbox: (MsoTextOrientation, Double, Double, Double, Double) => Shape,
    Application: Application,
    BuildFreeform: (MsoEditingType, Double, Double) => FreeformBuilder,
    Count: Double,
    Creator: Double,
    Item: js.Any => Shape,
    Parent: js.Any,
    Range: js.Any => ShapeRange,
    SelectAll: () => Unit,
    WordDotCanvasShapes_typekey: CanvasShapes
  ): CanvasShapes = {
    val __obj = js.Dynamic.literal(AddCallout = js.Any.fromFunction5(AddCallout), AddConnector = js.Any.fromFunction5(AddConnector), AddCurve = js.Any.fromFunction1(AddCurve), AddLabel = js.Any.fromFunction5(AddLabel), AddLine = js.Any.fromFunction4(AddLine), AddPicture = js.Any.fromFunction7(AddPicture), AddPolyline = js.Any.fromFunction1(AddPolyline), AddShape = js.Any.fromFunction5(AddShape), AddTextEffect = js.Any.fromFunction8(AddTextEffect), AddTextbox = js.Any.fromFunction5(AddTextbox), Application = Application.asInstanceOf[js.Any], BuildFreeform = js.Any.fromFunction3(BuildFreeform), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Range = js.Any.fromFunction1(Range), SelectAll = js.Any.fromFunction0(SelectAll))
    __obj.updateDynamic("Word.CanvasShapes_typekey")(WordDotCanvasShapes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasShapes]
  }
  @scala.inline
  implicit class CanvasShapesOps[Self <: CanvasShapes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCallout(value: (MsoCalloutType, Double, Double, Double, Double) => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddCallout")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withAddConnector(value: (MsoConnectorType, Double, Double, Double, Double) => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddConnector")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withAddCurve(value: js.Any => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddCurve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddLabel(value: (MsoTextOrientation, Double, Double, Double, Double) => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddLabel")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withAddLine(value: (Double, Double, Double, Double) => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddLine")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAddPicture(
      value: (String, js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Shape
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddPicture")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withAddPolyline(value: js.Any => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddPolyline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddShape(value: (Double, Double, Double, Double, Double) => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddShape")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withAddTextEffect(
      value: (MsoPresetTextEffect, String, String, Double, MsoTriState, MsoTriState, Double, Double) => Shape
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddTextEffect")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withAddTextbox(value: (MsoTextOrientation, Double, Double, Double, Double) => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddTextbox")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildFreeform(value: (MsoEditingType, Double, Double) => FreeformBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildFreeform")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any => Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: js.Any => ShapeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotCanvasShapes_typekey(value: CanvasShapes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.CanvasShapes_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

