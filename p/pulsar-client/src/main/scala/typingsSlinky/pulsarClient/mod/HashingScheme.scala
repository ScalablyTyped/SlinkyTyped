package typingsSlinky.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulsarClient.pulsarClientStrings.BoostHash
  - typingsSlinky.pulsarClient.pulsarClientStrings.JavaStringHash
  - typingsSlinky.pulsarClient.pulsarClientStrings.Murmur3_32Hash
*/
trait HashingScheme extends js.Object

object HashingScheme {
  @scala.inline
  def BoostHash: typingsSlinky.pulsarClient.pulsarClientStrings.BoostHash = this.cast("BoostHash")
  @scala.inline
  def JavaStringHash: typingsSlinky.pulsarClient.pulsarClientStrings.JavaStringHash = this.cast("JavaStringHash")
  @scala.inline
  def Murmur3_32Hash: typingsSlinky.pulsarClient.pulsarClientStrings.Murmur3_32Hash = this.cast("Murmur3_32Hash")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

