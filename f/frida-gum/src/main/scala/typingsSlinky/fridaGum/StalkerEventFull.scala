package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.StalkerCallEventFull
  - typingsSlinky.fridaGum.StalkerRetEventFull
  - typingsSlinky.fridaGum.StalkerExecEventFull
  - typingsSlinky.fridaGum.StalkerBlockEventFull
  - typingsSlinky.fridaGum.StalkerCompileEventFull
*/
trait StalkerEventFull extends js.Object

object StalkerEventFull {
  @scala.inline
  implicit def apply(
    value: StalkerBlockEventFull | StalkerCallEventFull | StalkerCompileEventFull | StalkerRetEventFull
  ): StalkerEventFull = value.asInstanceOf[StalkerEventFull]
  @scala.inline
  implicit def apply(value: StalkerExecEventFull): StalkerEventFull = value.asInstanceOf[StalkerEventFull]
}

