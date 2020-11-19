package typingsSlinky.graphql.visitorMod

import typingsSlinky.graphql.graphqlStrings.`type`
import typingsSlinky.graphql.graphqlStrings.alias
import typingsSlinky.graphql.graphqlStrings.arguments
import typingsSlinky.graphql.graphqlStrings.defaultValue
import typingsSlinky.graphql.graphqlStrings.definitions
import typingsSlinky.graphql.graphqlStrings.description
import typingsSlinky.graphql.graphqlStrings.directives
import typingsSlinky.graphql.graphqlStrings.fields
import typingsSlinky.graphql.graphqlStrings.interfaces
import typingsSlinky.graphql.graphqlStrings.locations
import typingsSlinky.graphql.graphqlStrings.name_
import typingsSlinky.graphql.graphqlStrings.operationTypes
import typingsSlinky.graphql.graphqlStrings.selectionSet_
import typingsSlinky.graphql.graphqlStrings.selections
import typingsSlinky.graphql.graphqlStrings.typeCondition
import typingsSlinky.graphql.graphqlStrings.types
import typingsSlinky.graphql.graphqlStrings.value
import typingsSlinky.graphql.graphqlStrings.values
import typingsSlinky.graphql.graphqlStrings.variableDefinitions
import typingsSlinky.graphql.graphqlStrings.variable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/language/visitor", "QueryDocumentKeys")
@js.native
object QueryDocumentKeys extends js.Object {
  
  var Argument: js.Tuple2[name_, value] = js.native
  
  var BooleanValue: EmptyTuple = js.native
  
  var Directive: js.Tuple2[name_, arguments] = js.native
  
  var DirectiveDefinition: js.Tuple4[description, name_, arguments, locations] = js.native
  
  var Document: js.Array[definitions] = js.native
  
  var EnumTypeDefinition: js.Tuple4[description, name_, directives, values] = js.native
  
  var EnumTypeExtension: js.Tuple3[name_, directives, values] = js.native
  
  var EnumValue: EmptyTuple = js.native
  
  var EnumValueDefinition: js.Tuple3[description, name_, directives] = js.native
  
  var Field: js.Tuple5[alias, name_, arguments, directives, selectionSet_] = js.native
  
  var FieldDefinition: js.Tuple5[description, name_, arguments, `type`, directives] = js.native
  
  var FloatValue: EmptyTuple = js.native
  
  // prettier-ignore
  var FragmentDefinition: js.Tuple5[name_, variableDefinitions, typeCondition, directives, selectionSet_] = js.native
  
  var FragmentSpread: js.Tuple2[name_, directives] = js.native
  
  var InlineFragment: js.Tuple3[typeCondition, directives, selectionSet_] = js.native
  
  var InputObjectTypeDefinition: js.Tuple4[description, name_, directives, fields] = js.native
  
  var InputObjectTypeExtension: js.Tuple3[name_, directives, fields] = js.native
  
  // prettier-ignore
  var InputValueDefinition: js.Tuple5[description, name_, `type`, defaultValue, directives] = js.native
  
  var IntValue: EmptyTuple = js.native
  
  // prettier-ignore
  var InterfaceTypeDefinition: js.Tuple5[description, name_, interfaces, directives, fields] = js.native
  
  var InterfaceTypeExtension: js.Tuple4[name_, interfaces, directives, fields] = js.native
  
  var ListType: js.Array[`type`] = js.native
  
  var ListValue: js.Array[values] = js.native
  
  var Name: EmptyTuple = js.native
  
  var NamedType: js.Array[name_] = js.native
  
  var NonNullType: js.Array[`type`] = js.native
  
  var NullValue: EmptyTuple = js.native
  
  var ObjectField: js.Tuple2[name_, value] = js.native
  
  // prettier-ignore
  var ObjectTypeDefinition: js.Tuple5[description, name_, interfaces, directives, fields] = js.native
  
  var ObjectTypeExtension: js.Tuple4[name_, interfaces, directives, fields] = js.native
  
  var ObjectValue: js.Array[fields] = js.native
  
  // Prettier forces trailing commas, but TS pre 3.2 doesn't allow them.
  // prettier-ignore
  var OperationDefinition: js.Tuple4[name_, variableDefinitions, directives, selectionSet_] = js.native
  
  var OperationTypeDefinition: js.Array[`type`] = js.native
  
  var ScalarTypeDefinition: js.Tuple3[description, name_, directives] = js.native
  
  var ScalarTypeExtension: js.Tuple2[name_, directives] = js.native
  
  var SchemaDefinition: js.Tuple3[description, directives, operationTypes] = js.native
  
  var SchemaExtension: js.Tuple2[directives, operationTypes] = js.native
  
  var SelectionSet: js.Array[selections] = js.native
  
  var StringValue: EmptyTuple = js.native
  
  var UnionTypeDefinition: js.Tuple4[description, name_, directives, types] = js.native
  
  var UnionTypeExtension: js.Tuple3[name_, directives, types] = js.native
  
  var Variable: js.Array[name_] = js.native
  
  var VariableDefinition: js.Tuple4[variable_, `type`, defaultValue, directives] = js.native
}
