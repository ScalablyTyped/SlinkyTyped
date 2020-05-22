package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexWord.Word.WdStyleSheetLinkType
import typingsSlinky.activexWord.Word.WdStyleSheetPrecedence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.StyleSheet")
@js.native
class StyleSheet protected ()
  extends typingsSlinky.activexWord.Word.StyleSheet {
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val FullName: String = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Path: String = js.native
  /* CompleteClass */
  override var Title: String = js.native
  /* CompleteClass */
  override var Type: WdStyleSheetLinkType = js.native
  /* CompleteClass */
  @JSName("Word.StyleSheet_typekey")
  override var WordDotStyleSheet_typekey: typingsSlinky.activexWord.Word.StyleSheet = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Move(Precedence: WdStyleSheetPrecedence): Unit = js.native
}

