package typingsSlinky.graphqlTools.schemaVisitorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLArgument
import typingsSlinky.graphql.definitionMod.GraphQLEnumValue
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLInputField
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLEnumType
import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLScalarType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.GraphQLUnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.mod.GraphQLSchema
  - typingsSlinky.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  - typingsSlinky.graphql.mod.GraphQLInterfaceType
  - typingsSlinky.graphql.mod.GraphQLInputObjectType
  - typingsSlinky.graphql.definitionMod.GraphQLNamedType
  - typingsSlinky.graphql.mod.GraphQLScalarType
  - typingsSlinky.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  - typingsSlinky.graphql.definitionMod.GraphQLArgument
  - typingsSlinky.graphql.mod.GraphQLUnionType
  - typingsSlinky.graphql.mod.GraphQLEnumType
  - typingsSlinky.graphql.definitionMod.GraphQLEnumValue
  - typingsSlinky.graphql.definitionMod.GraphQLInputField
*/
trait VisitableSchemaType extends js.Object

object VisitableSchemaType {
  @scala.inline
  implicit def apply(value: GraphQLArgument): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLEnumType): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLEnumValue): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]]): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLInputField): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLInputObjectType): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLInterfaceType): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLNamedType): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLScalarType): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLSchema): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
  @scala.inline
  implicit def apply(value: GraphQLUnionType): VisitableSchemaType = value.asInstanceOf[VisitableSchemaType]
}

