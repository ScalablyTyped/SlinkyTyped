package typingsSlinky.graphql.definitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.definitionMod.GraphQLScalarType
  - typingsSlinky.graphql.definitionMod.GraphQLEnumType
*/
trait GraphQLLeafType extends js.Object

object GraphQLLeafType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLLeafType = value.asInstanceOf[GraphQLLeafType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLLeafType = value.asInstanceOf[GraphQLLeafType]
}

