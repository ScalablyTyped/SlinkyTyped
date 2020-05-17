package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.StalkerCallEventBare
  - typingsSlinky.fridaGum.StalkerRetEventBare
  - typingsSlinky.fridaGum.StalkerExecEventBare
  - typingsSlinky.fridaGum.StalkerBlockEventBare
  - typingsSlinky.fridaGum.StalkerCompileEventBare
*/
trait StalkerEventBare extends js.Object

object StalkerEventBare {
  @scala.inline
  implicit def apply(
    value: StalkerBlockEventBare | StalkerCallEventBare | StalkerCompileEventBare | StalkerRetEventBare
  ): StalkerEventBare = value.asInstanceOf[StalkerEventBare]
  @scala.inline
  implicit def apply(value: StalkerExecEventBare): StalkerEventBare = value.asInstanceOf[StalkerEventBare]
}

