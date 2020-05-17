package typingsSlinky.graphqlBinding

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLFieldMap
import typingsSlinky.graphql.definitionMod.GraphQLInputField
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphqlBinding.anon.Boolean
import typingsSlinky.graphqlBinding.anon.GraphQLEnumType
import typingsSlinky.graphqlBinding.anon.InputSchemaPath
import typingsSlinky.graphqlBinding.generatorMod.Generator
import typingsSlinky.graphqlBinding.typesMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/codegen/FlowGenerator", JSImport.Namespace)
@js.native
object flowGeneratorMod extends js.Object {
  @js.native
  class FlowGenerator protected () extends Generator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: InputSchemaPath) = this()
    var graphqlRenderers: GraphQLEnumType = js.native
    var scalarMapping: Boolean = js.native
    def getPayloadType(operation: String, `type`: String): String = js.native
    def getTypeNames(): js.Array[String] = js.native
    def renderDescription(description: Maybe[String]): String = js.native
    def renderFieldName(field: GraphQLField[_, _, StringDictionary[_]]): String = js.native
    def renderFieldName(field: GraphQLInputField): String = js.native
    def renderFieldType(`type`: GraphQLInputType): String = js.native
    def renderFieldType(`type`: GraphQLOutputType): String = js.native
    def renderInputFieldType(`type`: GraphQLInputType): js.Any = js.native
    def renderInputFieldType(`type`: GraphQLOutputType): js.Any = js.native
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
    def renderObjectWrapper(
      typeName: String,
      typeDescription: Maybe[String],
      objects: js.Array[GraphQLObjectType[_, _, StringDictionary[_]]],
      fieldDefinition: String
    ): String = js.native
    def renderQueries(): String = js.native
    def renderSubscriptions(): String = js.native
    def renderTypeWrapper(typeName: String, typeDescription: Maybe[String], fieldDefinition: String): String = js.native
    def renderTypes(): String = js.native
  }
  
}

