package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type used for directiveDefs on component definition.
  *
  * The function is necessary to be able to support forward declarations.
  */
/* Rewritten from type alias, can be one of: 
  - js.Function0[typingsSlinky.angularCore.mod.DirectiveDefList]
  - typingsSlinky.angularCore.mod.DirectiveDefList
*/
trait DirectiveDefListOrFactory extends js.Object

object DirectiveDefListOrFactory {
  @scala.inline
  implicit def apply(value: DirectiveDefList): DirectiveDefListOrFactory = value.asInstanceOf[DirectiveDefListOrFactory]
  @scala.inline
  implicit def apply(value: js.Function0[DirectiveDefList]): DirectiveDefListOrFactory = value.asInstanceOf[DirectiveDefListOrFactory]
}

