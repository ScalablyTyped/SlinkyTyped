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
  - typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]
  - typingsSlinky.graphql.definitionMod.GraphQLNonNull[
typingsSlinky.graphql.definitionMod.GraphQLScalarType | (typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsSlinky.graphql.definitionMod.GraphQLInterfaceType | typingsSlinky.graphql.definitionMod.GraphQLUnionType | typingsSlinky.graphql.definitionMod.GraphQLEnumType | typingsSlinky.graphql.definitionMod.GraphQLList[js.Any]]
*/
trait GraphQLOutputType extends js.Object

object GraphQLOutputType {
  @scala.inline
  implicit def apply(value: GraphQLEnumType): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLList[js.Any]): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(
    value: GraphQLNonNull[
      GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLList[js.Any]
    ]
  ): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): GraphQLOutputType = value.asInstanceOf[GraphQLOutputType]
}

