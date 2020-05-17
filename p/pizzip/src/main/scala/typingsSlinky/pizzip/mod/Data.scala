package typingsSlinky.pizzip.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.node.Buffer
*/
trait Data extends LoadData

object Data {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: Buffer): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: String): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Data = value.asInstanceOf[Data]
}

