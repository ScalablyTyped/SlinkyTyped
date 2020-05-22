package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexWord.Word.WdBorderDistanceFrom
import typingsSlinky.activexWord.Word.WdBorderType
import typingsSlinky.activexWord.Word.WdColor
import typingsSlinky.activexWord.Word.WdColorIndex
import typingsSlinky.activexWord.Word.WdLineStyle
import typingsSlinky.activexWord.Word.WdLineWidth
import typingsSlinky.activexWord.activexWordNumbers.`9999999`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Borders")
@js.native
class Borders protected ()
  extends typingsSlinky.activexWord.Word.Borders {
  /* CompleteClass */
  override var AlwaysInFront: Boolean = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var DistanceFrom: WdBorderDistanceFrom = js.native
  /* CompleteClass */
  override var DistanceFromBottom: Double = js.native
  /* CompleteClass */
  override var DistanceFromLeft: Double = js.native
  /* CompleteClass */
  override var DistanceFromRight: Double = js.native
  /* CompleteClass */
  override var DistanceFromTop: Double = js.native
  /* CompleteClass */
  override var Enable: Boolean | `9999999` | WdLineStyle = js.native
  /* CompleteClass */
  override var EnableFirstPageInSection: Boolean = js.native
  /* CompleteClass */
  override var EnableOtherPagesInSection: Boolean = js.native
  /* CompleteClass */
  override val HasHorizontal: Boolean = js.native
  /* CompleteClass */
  override val HasVertical: Boolean = js.native
  /* CompleteClass */
  override var InsideColor: WdColor = js.native
  /* CompleteClass */
  override var InsideColorIndex: WdColorIndex = js.native
  /* CompleteClass */
  override var InsideLineStyle: WdLineStyle = js.native
  /* CompleteClass */
  override var InsideLineWidth: WdLineWidth = js.native
  /* CompleteClass */
  override var JoinBorders: Boolean = js.native
  /* CompleteClass */
  override var OutsideColor: WdColor = js.native
  /* CompleteClass */
  override var OutsideColorIndex: WdColorIndex = js.native
  /* CompleteClass */
  override var OutsideLineStyle: WdLineStyle = js.native
  /* CompleteClass */
  override var OutsideLineWidth: WdLineWidth = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Shadow: Boolean = js.native
  /* CompleteClass */
  override var SurroundFooter: Boolean = js.native
  /* CompleteClass */
  override var SurroundHeader: Boolean = js.native
  /* CompleteClass */
  @JSName("Word.Borders_typekey")
  override var WordDotBorders_typekey: typingsSlinky.activexWord.Word.Borders = js.native
  /* CompleteClass */
  override def ApplyPageBordersToAllSections(): Unit = js.native
  /* CompleteClass */
  override def Item(Index: WdBorderType): typingsSlinky.activexWord.Word.Border = js.native
}

