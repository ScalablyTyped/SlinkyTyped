package typingsSlinky.getos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.getos.mod.OtherOs
  - typingsSlinky.getos.mod.LinuxOs
*/
trait Os extends js.Object

object Os {
  @scala.inline
  implicit def apply(value: LinuxOs): Os = value.asInstanceOf[Os]
  @scala.inline
  implicit def apply(value: OtherOs): Os = value.asInstanceOf[Os]
}

