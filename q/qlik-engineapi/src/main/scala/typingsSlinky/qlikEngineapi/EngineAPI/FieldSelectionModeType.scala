package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NORMAL
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.AND
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NOT
*/
trait FieldSelectionModeType extends js.Object

object FieldSelectionModeType {
  @scala.inline
  def AND: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.AND = this.cast("AND")
  @scala.inline
  def NORMAL: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NORMAL = this.cast("NORMAL")
  @scala.inline
  def NOT: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NOT = this.cast("NOT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

