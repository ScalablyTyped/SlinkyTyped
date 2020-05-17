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
  - typingsSlinky.graphql.definitionMod.GraphQLNonNull[js.Any]
*/
trait GraphQLType extends js.Object

object GraphQLType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLInputObjectType): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLList[js.Any]): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLNonNull[js.Any]): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLType = value.asInstanceOf[GraphQLType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLType = value.asInstanceOf[GraphQLType]
}

