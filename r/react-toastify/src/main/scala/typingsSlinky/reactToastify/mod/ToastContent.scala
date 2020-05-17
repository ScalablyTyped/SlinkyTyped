package typingsSlinky.reactToastify.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactNode
  - js.Function0[scala.Unit]
*/
trait ToastContent extends js.Object

object ToastContent {
  @scala.inline
  implicit def apply(value: js.Function0[Unit]): ToastContent = value.asInstanceOf[ToastContent]
  @scala.inline
  implicit def apply(value: TagMod[Any]): ToastContent = value.asInstanceOf[ToastContent]
}

