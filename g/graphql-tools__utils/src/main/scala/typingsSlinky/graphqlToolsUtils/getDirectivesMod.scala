package typingsSlinky.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLEnumTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLEnumValue
import typingsSlinky.graphql.definitionMod.GraphQLEnumValueConfig
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLInputField
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLInputObjectTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLInterfaceTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLObjectTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLScalarTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLUnionTypeConfig
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.schemaMod.GraphQLSchemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/utils/get-directives", JSImport.Namespace)
@js.native
object getDirectivesMod extends js.Object {
  
  def getDirectives(schema: GraphQLSchema, node: DirectableGraphQLObject): DirectiveUseMap = js.native
  
  type DirectableGraphQLObject = GraphQLSchema | GraphQLSchemaConfig | GraphQLNamedType | (GraphQLObjectTypeConfig[js.Any, js.Any]) | (GraphQLInterfaceTypeConfig[js.Any, js.Any]) | (GraphQLUnionTypeConfig[js.Any, js.Any]) | (GraphQLScalarTypeConfig[js.Any, js.Any]) | GraphQLEnumTypeConfig | GraphQLEnumValue | GraphQLEnumValueConfig | GraphQLInputObjectTypeConfig | (GraphQLField[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInputField | (GraphQLFieldConfig[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInputFieldConfig
  
  type DirectiveUseMap = StringDictionary[js.Any]
}
