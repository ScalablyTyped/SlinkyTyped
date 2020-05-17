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
  - typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
*/
trait GraphQLNullableType extends js.Object

object GraphQLNullableType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLInputObjectType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLList[js.Any]): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLNullableType = value.asInstanceOf[GraphQLNullableType]
}

