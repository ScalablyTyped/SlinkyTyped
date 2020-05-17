package typingsSlinky.rsocketTypes.reactiveSocketTypesMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
*/
trait Encodable extends js.Object

object Encodable {
  @scala.inline
  implicit def apply(value: Buffer): Encodable = value.asInstanceOf[Encodable]
  @scala.inline
  implicit def apply(value: String): Encodable = value.asInstanceOf[Encodable]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Encodable = value.asInstanceOf[Encodable]
}

