package typingsSlinky.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reapop.mod.DEFAULT_STATUS
  - typingsSlinky.reapop.mod.INFO_STATUS
  - typingsSlinky.reapop.mod.SUCCESS_STATUS
  - typingsSlinky.reapop.mod.WARNING_STATUS
  - typingsSlinky.reapop.mod.ERROR_STATUS
*/
trait STATUSES extends js.Object

object STATUSES {
  @scala.inline
  implicit def apply(value: DEFAULT_STATUS | ERROR_STATUS | INFO_STATUS | SUCCESS_STATUS | WARNING_STATUS): STATUSES = value.asInstanceOf[STATUSES]
}

