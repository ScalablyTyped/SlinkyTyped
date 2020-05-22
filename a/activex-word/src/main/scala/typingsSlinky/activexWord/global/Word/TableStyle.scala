package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexWord.Word.WdConditionCode
import typingsSlinky.activexWord.Word.WdRowAlignment
import typingsSlinky.activexWord.Word.WdTableDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TableStyle")
@js.native
class TableStyle protected ()
  extends typingsSlinky.activexWord.Word.TableStyle {
  /* CompleteClass */
  override var Alignment: WdRowAlignment = js.native
  /* CompleteClass */
  override var AllowBreakAcrossPage: Double = js.native
  /* CompleteClass */
  override var AllowPageBreaks: Boolean = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var Borders: typingsSlinky.activexWord.Word.Borders = js.native
  /* CompleteClass */
  override var BottomPadding: Double = js.native
  /* CompleteClass */
  override var ColumnStripe: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var LeftIndent: Double = js.native
  /* CompleteClass */
  override var LeftPadding: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var RightPadding: Double = js.native
  /* CompleteClass */
  override var RowStripe: Double = js.native
  /* CompleteClass */
  override val Shading: typingsSlinky.activexWord.Word.Shading = js.native
  /* CompleteClass */
  override var Spacing: Double = js.native
  /* CompleteClass */
  override var TableDirection: WdTableDirection = js.native
  /* CompleteClass */
  override var TopPadding: Double = js.native
  /* CompleteClass */
  @JSName("Word.TableStyle_typekey")
  override var WordDotTableStyle_typekey: typingsSlinky.activexWord.Word.TableStyle = js.native
  /* CompleteClass */
  override def Condition(ConditionCode: WdConditionCode): typingsSlinky.activexWord.Word.ConditionalStyle = js.native
}

