package typingsSlinky.phosphorMessaging.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorMessaging.mod.IMessageHook
  - js.Function2[
/ * handler * / typingsSlinky.phosphorMessaging.mod.IMessageHandler, 
/ * msg * / typingsSlinky.phosphorMessaging.mod.Message, 
scala.Boolean]
*/
trait MessageHook extends js.Object

object MessageHook {
  @scala.inline
  implicit def apply(value: js.Function2[/* handler */ IMessageHandler, /* msg */ Message, Boolean]): MessageHook = value.asInstanceOf[MessageHook]
  @scala.inline
  implicit def apply(value: IMessageHook): MessageHook = value.asInstanceOf[MessageHook]
}

