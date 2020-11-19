package typingsSlinky.graphqlToolsUtils

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
import typingsSlinky.graphqlToolsUtils.anon.EnumType
import typingsSlinky.graphqlToolsUtils.anon.Field
import typingsSlinky.graphqlToolsUtils.anon.ObjectType
import typingsSlinky.graphqlToolsUtils.anon.ObjectTypeGraphQLInputObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/utils/SchemaVisitor", JSImport.Namespace)
@js.native
object schemaVisitorMod extends js.Object {
  
  @js.native
  abstract class SchemaVisitor () extends js.Object {
    
    var schema: GraphQLSchema = js.native
    
    def visitArgumentDefinition(_argument: GraphQLArgument, _details: Field): GraphQLArgument | Unit | Null = js.native
    
    def visitEnum(_type: GraphQLEnumType): GraphQLEnumType | Unit | Null = js.native
    
    def visitEnumValue(_value: GraphQLEnumValue, _details: EnumType): GraphQLEnumValue | Unit | Null = js.native
    
    def visitFieldDefinition(_field: GraphQLField[_, _, StringDictionary[_]], _details: ObjectType): (GraphQLField[_, _, StringDictionary[_]]) | Unit | Null = js.native
    
    def visitInputFieldDefinition(_field: GraphQLInputField, _details: ObjectTypeGraphQLInputObjectType): GraphQLInputField | Unit | Null = js.native
    
    def visitInputObject(_object: GraphQLInputObjectType): GraphQLInputObjectType | Unit | Null = js.native
    
    def visitInterface(_iface: GraphQLInterfaceType): GraphQLInterfaceType | Unit | Null = js.native
    
    def visitObject(_object: GraphQLObjectType[_, _]): (GraphQLObjectType[_, _]) | Unit | Null = js.native
    
    def visitScalar(_scalar: GraphQLScalarType): GraphQLScalarType | Unit | Null = js.native
    
    def visitSchema(_schema: GraphQLSchema): Unit = js.native
    
    def visitUnion(_union: GraphQLUnionType): GraphQLUnionType | Unit | Null = js.native
  }
  /* static members */
  @js.native
  object SchemaVisitor extends js.Object {
    
    def implementsVisitorMethod(methodName: String): Boolean = js.native
  }
}
