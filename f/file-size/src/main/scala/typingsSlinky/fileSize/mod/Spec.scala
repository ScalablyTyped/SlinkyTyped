package typingsSlinky.fileSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fileSize.fileSizeStrings.si
  - typingsSlinky.fileSize.fileSizeStrings.iec
  - typingsSlinky.fileSize.fileSizeStrings.jedec
*/
trait Spec extends js.Object

object Spec {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iec: typingsSlinky.fileSize.fileSizeStrings.iec = this.cast("iec")
  @scala.inline
  def jedec: typingsSlinky.fileSize.fileSizeStrings.jedec = this.cast("jedec")
  @scala.inline
  def si: typingsSlinky.fileSize.fileSizeStrings.si = this.cast("si")
}

