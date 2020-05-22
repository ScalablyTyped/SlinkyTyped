package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexWord.Word.WdLockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CoAuthLock")
@js.native
class CoAuthLock protected ()
  extends typingsSlinky.activexWord.Word.CoAuthLock {
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val HeaderFooter: Boolean = js.native
  /* CompleteClass */
  override val Owner: typingsSlinky.activexWord.Word.CoAuthor = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Range: typingsSlinky.activexWord.Word.Range = js.native
  /* CompleteClass */
  override val Type: WdLockType = js.native
  /* CompleteClass */
  @JSName("Word.CoAuthLock_typekey")
  override var WordDotCoAuthLock_typekey: typingsSlinky.activexWord.Word.CoAuthLock = js.native
  /* CompleteClass */
  override def Unlock(): Unit = js.native
}

