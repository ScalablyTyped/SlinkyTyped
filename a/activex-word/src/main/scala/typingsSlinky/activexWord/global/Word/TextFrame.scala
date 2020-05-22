package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexOffice.Office.MsoHorizontalAnchor
import typingsSlinky.activexOffice.Office.MsoPathFormat
import typingsSlinky.activexOffice.Office.MsoTextOrientation
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.MsoVerticalAnchor
import typingsSlinky.activexOffice.Office.MsoWarpFormat
import typingsSlinky.activexOffice.Office.TextColumn2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextFrame")
@js.native
class TextFrame protected ()
  extends typingsSlinky.activexWord.Word.TextFrame {
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var AutoSize: Double = js.native
  /* CompleteClass */
  override val Column: TextColumn2 = js.native
  /* CompleteClass */
  override val ContainingRange: typingsSlinky.activexWord.Word.Range = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val HasText: Double = js.native
  /* CompleteClass */
  override var HorizontalAnchor: MsoHorizontalAnchor = js.native
  /* CompleteClass */
  override var MarginBottom: Double = js.native
  /* CompleteClass */
  override var MarginLeft: Double = js.native
  /* CompleteClass */
  override var MarginRight: Double = js.native
  /* CompleteClass */
  override var MarginTop: Double = js.native
  /* CompleteClass */
  override var Next: typingsSlinky.activexWord.Word.TextFrame = js.native
  /* CompleteClass */
  override var NoTextRotation: MsoTriState = js.native
  /* CompleteClass */
  override var Orientation: MsoTextOrientation = js.native
  /* CompleteClass */
  override val Overflowing: Boolean = js.native
  /* CompleteClass */
  override val Parent: typingsSlinky.activexWord.Word.Shape = js.native
  /* CompleteClass */
  override var PathFormat: MsoPathFormat = js.native
  /* CompleteClass */
  override var Previous: typingsSlinky.activexWord.Word.TextFrame = js.native
  /* CompleteClass */
  override val TextRange: typingsSlinky.activexWord.Word.Range = js.native
  /* CompleteClass */
  override val ThreeD: typingsSlinky.activexWord.Word.ThreeDFormat = js.native
  /* CompleteClass */
  override var VerticalAnchor: MsoVerticalAnchor = js.native
  /* CompleteClass */
  override var WarpFormat: MsoWarpFormat = js.native
  /* CompleteClass */
  @JSName("Word.TextFrame_typekey")
  override var WordDotTextFrame_typekey: typingsSlinky.activexWord.Word.TextFrame = js.native
  /* CompleteClass */
  override var WordWrap: Double = js.native
  /* CompleteClass */
  override def BreakForwardLink(): Unit = js.native
  /* CompleteClass */
  override def DeleteText(): Unit = js.native
  /* CompleteClass */
  override def ValidLinkTarget(TargetTextFrame: typingsSlinky.activexWord.Word.TextFrame): Boolean = js.native
}

