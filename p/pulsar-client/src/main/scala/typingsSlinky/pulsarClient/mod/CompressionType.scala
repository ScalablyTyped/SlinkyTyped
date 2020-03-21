package typingsSlinky.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulsarClient.pulsarClientStrings.LZ4
  - typingsSlinky.pulsarClient.pulsarClientStrings.Zlib
*/
trait CompressionType extends js.Object

object CompressionType {
  @scala.inline
  def LZ4: typingsSlinky.pulsarClient.pulsarClientStrings.LZ4 = this.cast("LZ4")
  @scala.inline
  def Zlib: typingsSlinky.pulsarClient.pulsarClientStrings.Zlib = this.cast("Zlib")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

