package typingsSlinky.activexWord.global.Word

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Version")
@js.native
class Version protected ()
  extends typingsSlinky.activexWord.Word.Version {
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Comment: String = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Date: VarDate = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val SavedBy: String = js.native
  /* CompleteClass */
  @JSName("Word.Version_typekey")
  override var WordDotVersion_typekey: typingsSlinky.activexWord.Word.Version = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Open(): typingsSlinky.activexWord.Word.Document = js.native
  /* CompleteClass */
  override def OpenOld(): Unit = js.native
}

