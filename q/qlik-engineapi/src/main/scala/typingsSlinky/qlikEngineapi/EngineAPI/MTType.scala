package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - N for NOT_META
  * - D for META_DOC_NAME
  * - R for META_RET_TYPE
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.N
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.D
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.R
*/
trait MTType extends js.Object

object MTType {
  @scala.inline
  def D: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.D = this.cast("D")
  @scala.inline
  def N: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.N = this.cast("N")
  @scala.inline
  def R: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.R = this.cast("R")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

