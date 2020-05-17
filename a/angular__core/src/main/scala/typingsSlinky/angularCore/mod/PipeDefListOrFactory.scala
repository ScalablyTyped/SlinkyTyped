package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type used for PipeDefs on component definition.
  *
  * The function is necessary to be able to support forward declarations.
  */
/* Rewritten from type alias, can be one of: 
  - js.Function0[typingsSlinky.angularCore.mod.PipeDefList]
  - typingsSlinky.angularCore.mod.PipeDefList
*/
trait PipeDefListOrFactory extends js.Object

object PipeDefListOrFactory {
  @scala.inline
  implicit def apply(value: js.Function0[PipeDefList]): PipeDefListOrFactory = value.asInstanceOf[PipeDefListOrFactory]
  @scala.inline
  implicit def apply(value: PipeDefList): PipeDefListOrFactory = value.asInstanceOf[PipeDefListOrFactory]
}

