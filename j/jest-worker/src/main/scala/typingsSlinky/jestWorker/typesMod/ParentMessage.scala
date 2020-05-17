package typingsSlinky.jestWorker.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestWorker.typesMod.ParentMessageOk
  - typingsSlinky.jestWorker.typesMod.ParentMessageError
*/
trait ParentMessage extends js.Object

object ParentMessage {
  @scala.inline
  implicit def apply(value: ParentMessageError): ParentMessage = value.asInstanceOf[ParentMessage]
  @scala.inline
  implicit def apply(value: ParentMessageOk): ParentMessage = value.asInstanceOf[ParentMessage]
}

