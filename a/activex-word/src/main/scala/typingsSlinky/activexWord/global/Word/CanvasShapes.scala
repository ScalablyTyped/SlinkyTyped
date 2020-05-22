package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexOffice.Office.MsoCalloutType
import typingsSlinky.activexOffice.Office.MsoConnectorType
import typingsSlinky.activexOffice.Office.MsoEditingType
import typingsSlinky.activexOffice.Office.MsoPresetTextEffect
import typingsSlinky.activexOffice.Office.MsoTextOrientation
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CanvasShapes")
@js.native
class CanvasShapes protected ()
  extends typingsSlinky.activexWord.Word.CanvasShapes {
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.CanvasShapes_typekey")
  override var WordDotCanvasShapes_typekey: typingsSlinky.activexWord.Word.CanvasShapes = js.native
  /* CompleteClass */
  override def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def AddCurve(SafeArrayOfPoints: js.Any): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def AddPicture(
    FileName: String,
    LinkToFile: js.UndefOr[js.Any],
    SaveWithDocument: js.UndefOr[js.Any],
    Left: js.UndefOr[js.Any],
    Top: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any]
  ): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def AddPolyline(SafeArrayOfPoints: js.Any): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def AddShape(Type: Double, Left: Double, Top: Double, Width: Double, Height: Double): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def AddTextEffect(
    PresetTextEffect: MsoPresetTextEffect,
    Text: String,
    FontName: String,
    FontSize: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    Left: Double,
    Top: Double
  ): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def AddTextbox(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): typingsSlinky.activexWord.Word.FreeformBuilder = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override def Range(Index: js.Any): typingsSlinky.activexWord.Word.ShapeRange = js.native
  /* CompleteClass */
  override def SelectAll(): Unit = js.native
}

