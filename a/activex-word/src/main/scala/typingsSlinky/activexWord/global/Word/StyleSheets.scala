package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexWord.Word.WdStyleSheetLinkType
import typingsSlinky.activexWord.Word.WdStyleSheetPrecedence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.StyleSheets")
@js.native
class StyleSheets protected ()
  extends typingsSlinky.activexWord.Word.StyleSheets {
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.StyleSheets_typekey")
  override var WordDotStyleSheets_typekey: typingsSlinky.activexWord.Word.StyleSheets = js.native
  /* CompleteClass */
  override def Add(
    FileName: String,
    LinkType: WdStyleSheetLinkType,
    Title: String,
    Precedence: WdStyleSheetPrecedence
  ): typingsSlinky.activexWord.Word.StyleSheet = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexWord.Word.StyleSheet = js.native
}

