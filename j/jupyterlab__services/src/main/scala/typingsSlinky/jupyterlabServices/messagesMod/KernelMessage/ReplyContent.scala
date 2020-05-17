package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A convenience type for reply content.
  *
  * This automatically unions the necessary error and abort replies required in
  * the [message spec](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply).
  */
/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IReplyErrorContent
  - typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IReplyAbortContent
*/
trait ReplyContent[T] extends js.Object

object ReplyContent {
  @scala.inline
  implicit def apply[T](value: IReplyAbortContent): ReplyContent[T] = value.asInstanceOf[ReplyContent[T]]
  @scala.inline
  implicit def apply[T](value: IReplyErrorContent): ReplyContent[T] = value.asInstanceOf[ReplyContent[T]]
  @scala.inline
  implicit def apply[T](value: T): ReplyContent[T] = value.asInstanceOf[ReplyContent[T]]
}

