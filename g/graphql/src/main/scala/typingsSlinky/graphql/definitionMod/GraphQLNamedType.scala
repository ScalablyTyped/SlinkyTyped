package typingsSlinky.graphql.definitionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.definitionMod.GraphQLScalarType
  - typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  - typingsSlinky.graphql.definitionMod.GraphQLInterfaceType
  - typingsSlinky.graphql.definitionMod.GraphQLUnionType
  - typingsSlinky.graphql.definitionMod.GraphQLEnumType
  - typingsSlinky.graphql.definitionMod.GraphQLInputObjectType
*/
trait GraphQLNamedType extends js.Object

object GraphQLNamedType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
  @scala.inline
  implicit def apply(value: GraphQLInputObjectType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLNamedType = value.asInstanceOf[GraphQLNamedType]
}

