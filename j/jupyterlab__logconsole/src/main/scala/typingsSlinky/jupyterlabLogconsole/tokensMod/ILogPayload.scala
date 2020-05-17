package typingsSlinky.jupyterlabLogconsole.tokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabLogconsole.tokensMod.ITextLog
  - typingsSlinky.jupyterlabLogconsole.tokensMod.IHtmlLog
  - typingsSlinky.jupyterlabLogconsole.tokensMod.IOutputLog
*/
trait ILogPayload extends js.Object

object ILogPayload {
  @scala.inline
  implicit def apply(value: IHtmlLog): ILogPayload = value.asInstanceOf[ILogPayload]
  @scala.inline
  implicit def apply(value: IOutputLog): ILogPayload = value.asInstanceOf[ILogPayload]
  @scala.inline
  implicit def apply(value: ITextLog): ILogPayload = value.asInstanceOf[ILogPayload]
}

