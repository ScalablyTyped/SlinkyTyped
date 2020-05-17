package typingsSlinky.ramda.toolsMod

import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <needs description>
  * @param V
  * @param E
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ramda.toolsMod.EvolveNestedValue[V, E]
  - typingsSlinky.std.ReturnType[E]
*/
trait EvolveValue[V, E] extends js.Object

object EvolveValue {
  @scala.inline
  implicit def apply[V, E](value: EvolveNestedValue[V, E]): EvolveValue[V, E] = value.asInstanceOf[EvolveValue[V, E]]
  @scala.inline
  implicit def apply[V, E](value: ReturnType[E]): EvolveValue[V, E] = value.asInstanceOf[EvolveValue[V, E]]
}

