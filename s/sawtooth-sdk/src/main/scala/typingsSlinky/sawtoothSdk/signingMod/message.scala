package typingsSlinky.sawtoothSdk.signingMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.NodeJS.TypedArray
  - typingsSlinky.std.DataView
*/
trait message extends js.Object

object message {
  @scala.inline
  implicit def apply(value: Buffer): message = value.asInstanceOf[message]
  @scala.inline
  implicit def apply(value: js.typedarray.DataView): message = value.asInstanceOf[message]
  @scala.inline
  implicit def apply(value: String): message = value.asInstanceOf[message]
  @scala.inline
  implicit def apply(value: TypedArray): message = value.asInstanceOf[message]
}

