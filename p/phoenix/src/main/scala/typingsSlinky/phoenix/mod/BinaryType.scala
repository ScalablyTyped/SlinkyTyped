package typingsSlinky.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phoenix.phoenixStrings.arraybuffer
  - typingsSlinky.phoenix.phoenixStrings.blob
*/
trait BinaryType extends js.Object

object BinaryType {
  @scala.inline
  def arraybuffer: typingsSlinky.phoenix.phoenixStrings.arraybuffer = this.cast("arraybuffer")
  @scala.inline
  def blob: typingsSlinky.phoenix.phoenixStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

