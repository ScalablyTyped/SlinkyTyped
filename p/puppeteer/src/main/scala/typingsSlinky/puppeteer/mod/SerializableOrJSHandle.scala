package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.puppeteer.mod.Serializable
  - typingsSlinky.puppeteer.mod.JSHandle[js.Any]
*/
trait SerializableOrJSHandle extends js.Object

object SerializableOrJSHandle {
  @scala.inline
  implicit def apply(value: JSHandle[js.Any]): SerializableOrJSHandle = value.asInstanceOf[SerializableOrJSHandle]
  @scala.inline
  implicit def apply(value: Serializable): SerializableOrJSHandle = value.asInstanceOf[SerializableOrJSHandle]
}

