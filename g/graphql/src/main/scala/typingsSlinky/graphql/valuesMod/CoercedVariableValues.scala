package typingsSlinky.graphql.valuesMod

import typingsSlinky.graphql.anon.Coerced
import typingsSlinky.graphql.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.anon.Errors
  - typingsSlinky.graphql.anon.Coerced
*/
trait CoercedVariableValues extends js.Object

object CoercedVariableValues {
  @scala.inline
  implicit def apply(value: Coerced): CoercedVariableValues = value.asInstanceOf[CoercedVariableValues]
  @scala.inline
  implicit def apply(value: Errors): CoercedVariableValues = value.asInstanceOf[CoercedVariableValues]
}

