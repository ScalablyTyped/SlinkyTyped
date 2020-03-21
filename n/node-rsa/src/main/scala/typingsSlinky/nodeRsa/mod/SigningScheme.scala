package typingsSlinky.nodeRsa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeRsa.nodeRsaStrings.pkcs1
  - typingsSlinky.nodeRsa.nodeRsaStrings.pss
*/
trait SigningScheme extends js.Object

object SigningScheme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pkcs1: typingsSlinky.nodeRsa.nodeRsaStrings.pkcs1 = this.cast("pkcs1")
  @scala.inline
  def pss: typingsSlinky.nodeRsa.nodeRsaStrings.pss = this.cast("pss")
}

