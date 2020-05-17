package typingsSlinky.graphql.definitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.definitionMod.GraphQLScalarType
  - typingsSlinky.graphql.definitionMod.GraphQLEnumType
  - typingsSlinky.graphql.definitionMod.GraphQLInputObjectType
  - typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
  - typingsSlinky.graphql.definitionMod.GraphQLNonNull[
typingsSlinky.graphql.definitionMod.GraphQLScalarType | typingsSlinky.graphql.definitionMod.GraphQLEnumType | typingsSlinky.graphql.definitionMod.GraphQLInputObjectType | typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]]
*/
trait GraphQLInputType extends js.Object

object GraphQLInputType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLInputType = value.asInstanceOf[GraphQLInputType]
  @scala.inline
  implicit def apply(value: GraphQLInputObjectType): GraphQLInputType = value.asInstanceOf[GraphQLInputType]
  @scala.inline
  implicit def apply(value: GraphQLList[js.Any]): GraphQLInputType = value.asInstanceOf[GraphQLInputType]
  @scala.inline
  implicit def apply(
    value: GraphQLNonNull[
      GraphQLScalarType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList[js.Any]
    ]
  ): GraphQLInputType = value.asInstanceOf[GraphQLInputType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLInputType = value.asInstanceOf[GraphQLInputType]
}

