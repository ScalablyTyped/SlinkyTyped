package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.Add
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.Remove
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.Replace
*/
trait NxPatchOpType extends js.Object

object NxPatchOpType {
  @scala.inline
  def Add: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.Add = this.cast("Add")
  @scala.inline
  def Remove: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.Remove = this.cast("Remove")
  @scala.inline
  def Replace: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.Replace = this.cast("Replace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

