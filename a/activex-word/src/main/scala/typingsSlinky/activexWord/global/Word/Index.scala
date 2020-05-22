package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexWord.Word.WdHeadingSeparator
import typingsSlinky.activexWord.Word.WdIndexFilter
import typingsSlinky.activexWord.Word.WdIndexSortBy
import typingsSlinky.activexWord.Word.WdIndexType
import typingsSlinky.activexWord.Word.WdLanguageID
import typingsSlinky.activexWord.Word.WdTabLeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Index")
@js.native
class Index protected ()
  extends typingsSlinky.activexWord.Word.Index {
  /* CompleteClass */
  override var AccentedLetters: Boolean = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Filter: WdIndexFilter = js.native
  /* CompleteClass */
  override var HeadingSeparator: WdHeadingSeparator = js.native
  /* CompleteClass */
  override var IndexLanguage: WdLanguageID = js.native
  /* CompleteClass */
  override var NumberOfColumns: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Range: typingsSlinky.activexWord.Word.Range = js.native
  /* CompleteClass */
  override var RightAlignPageNumbers: Boolean = js.native
  /* CompleteClass */
  override var SortBy: WdIndexSortBy = js.native
  /* CompleteClass */
  override var TabLeader: WdTabLeader = js.native
  /* CompleteClass */
  override var Type: WdIndexType = js.native
  /* CompleteClass */
  @JSName("Word.Index_typekey")
  override var WordDotIndex_typekey: typingsSlinky.activexWord.Word.Index = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Update(): Unit = js.native
}

