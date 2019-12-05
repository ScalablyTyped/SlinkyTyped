package typingsSlinky.graphqlDashBinding

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLInputObjectType
import typingsSlinky.graphql.graphqlMod.GraphQLInterfaceType
import typingsSlinky.graphql.graphqlMod.GraphQLObjectType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldMap
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputField
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLOutputType
import typingsSlinky.graphqlDashBinding.distCodegenGeneratorMod.Generator
import typingsSlinky.graphqlDashBinding.distCodegenTypesMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/codegen/TypescriptGenerator", JSImport.Namespace)
@js.native
object distCodegenTypescriptGeneratorMod extends js.Object {
  @js.native
  class TypescriptGenerator protected () extends Generator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: Anon_InputSchemaPath) = this()
    var graphqlRenderers: Anon_GraphQLEnumType = js.native
    var scalarMapping: Anon_BooleanDateTime = js.native
    def getPayloadType(operation: String, nonNullType: Boolean): String = js.native
    def getTypeNames(): js.Array[String] = js.native
    def renderDescription(description: Maybe[String]): String = js.native
    def renderFieldName(field: GraphQLField[_, _, StringDictionary[_]]): String = js.native
    def renderFieldName(field: GraphQLInputField): String = js.native
    def renderFieldType(`type`: GraphQLInputType | GraphQLOutputType): String = js.native
    def renderInputFieldType(`type`: GraphQLInputType | GraphQLOutputType): String = js.native
    def renderInterfaceOrObject(`type`: GraphQLInputObjectType): String = js.native
    def renderInterfaceOrObject(`type`: GraphQLInterfaceType): String = js.native
    def renderInterfaceOrObject(`type`: GraphQLObjectType[_, _, StringDictionary[_]]): String = js.native
    def renderInterfaceWrapper(
      typeName: String,
      typeDescription: Maybe[String],
      interfaces: js.Array[GraphQLInterfaceType],
      fieldDefinition: String
    ): String = js.native
    def renderMainMethodFields(operation: String, fields: GraphQLFieldMap[_, _, StringDictionary[_]]): String = js.native
    def renderMutations(): String = js.native
    def renderQueries(): String = js.native
    def renderSubscriptions(): String = js.native
    def renderTypeWrapper(typeName: String, typeDescription: Maybe[String], fieldDefinition: String): String = js.native
    def renderTypes(): String = js.native
  }
  
}

