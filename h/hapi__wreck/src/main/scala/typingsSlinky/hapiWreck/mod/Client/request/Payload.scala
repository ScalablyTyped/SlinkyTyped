package typingsSlinky.hapiWreck.mod.Client.request

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.streamMod.Readable
  - js.Object
*/
trait Payload extends js.Object

object Payload {
  @scala.inline
  implicit def apply(value: Buffer): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: js.Object): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: Readable): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: String): Payload = value.asInstanceOf[Payload]
}

