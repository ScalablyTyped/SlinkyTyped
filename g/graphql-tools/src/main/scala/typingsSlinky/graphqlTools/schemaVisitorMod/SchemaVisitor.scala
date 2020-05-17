package typingsSlinky.graphqlTools.schemaVisitorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLArgument
import typingsSlinky.graphql.definitionMod.GraphQLEnumValue
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLInputField
import typingsSlinky.graphql.mod.GraphQLEnumType
import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLScalarType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.GraphQLUnionType
import typingsSlinky.graphqlTools.anon.EnumType
import typingsSlinky.graphqlTools.anon.FieldObjectType
import typingsSlinky.graphqlTools.anon.ObjectType
import typingsSlinky.graphqlTools.anon.ObjectTypeGraphQLInputObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", "SchemaVisitor")
@js.native
abstract class SchemaVisitor () extends js.Object {
  var schema: GraphQLSchema = js.native
  def visitArgumentDefinition(argument: GraphQLArgument, details: FieldObjectType): GraphQLArgument | Unit | Null = js.native
  def visitEnum(`type`: GraphQLEnumType): GraphQLEnumType | Unit | Null = js.native
  def visitEnumValue(value: GraphQLEnumValue, details: EnumType): GraphQLEnumValue | Unit | Null = js.native
  def visitFieldDefinition(field: GraphQLField[_, _, StringDictionary[_]], details: ObjectType): (GraphQLField[_, _, StringDictionary[_]]) | Unit | Null = js.native
  def visitInputFieldDefinition(field: GraphQLInputField, details: ObjectTypeGraphQLInputObjectType): GraphQLInputField | Unit | Null = js.native
  def visitInputObject(`object`: GraphQLInputObjectType): GraphQLInputObjectType | Unit | Null = js.native
  def visitInterface(iface: GraphQLInterfaceType): GraphQLInterfaceType | Unit | Null = js.native
  def visitObject(`object`: GraphQLObjectType[_, _, StringDictionary[_]]): (GraphQLObjectType[_, _, StringDictionary[_]]) | Unit | Null = js.native
  def visitScalar(scalar: GraphQLScalarType): GraphQLScalarType | Unit | Null = js.native
  def visitSchema(schema: GraphQLSchema): Unit = js.native
  def visitUnion(union: GraphQLUnionType): GraphQLUnionType | Unit | Null = js.native
}

/* static members */
@JSImport("graphql-tools/dist/schemaVisitor", "SchemaVisitor")
@js.native
object SchemaVisitor extends js.Object {
  def implementsVisitorMethod(methodName: String): Boolean = js.native
}

