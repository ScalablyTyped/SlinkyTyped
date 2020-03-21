package typingsSlinky.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeJose.nodeJoseStrings.sig
  - typingsSlinky.nodeJose.nodeJoseStrings.enc
  - typingsSlinky.nodeJose.nodeJoseStrings.desc
*/
trait KeyUse extends js.Object

object KeyUse {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: typingsSlinky.nodeJose.nodeJoseStrings.desc = this.cast("desc")
  @scala.inline
  def enc: typingsSlinky.nodeJose.nodeJoseStrings.enc = this.cast("enc")
  @scala.inline
  def sig: typingsSlinky.nodeJose.nodeJoseStrings.sig = this.cast("sig")
}

