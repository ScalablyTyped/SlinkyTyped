package typingsSlinky.graphqlCompose.scalarTypeComposerMod

import typingsSlinky.graphql.definitionMod.GraphQLList
import typingsSlinky.graphql.definitionMod.GraphQLNonNull
import typingsSlinky.graphql.definitionMod.GraphQLScalarLiteralParser
import typingsSlinky.graphql.definitionMod.GraphQLScalarSerializer
import typingsSlinky.graphql.definitionMod.GraphQLScalarValueParser
import typingsSlinky.graphqlCompose.definitionsMod.DirectiveArgs
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.graphqlCompose.definitionsMod.ExtensionsDirective
import typingsSlinky.graphqlCompose.graphqlMod.GraphQLScalarType
import typingsSlinky.graphqlCompose.objectTypeComposerMod._ComposeOutputType
import typingsSlinky.graphqlCompose.schemaComposerMod.SchemaComposer
import typingsSlinky.graphqlCompose.schemaComposerMod._AnyComposeType
import typingsSlinky.graphqlCompose.schemaComposerMod._AnyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/ScalarTypeComposer", "ScalarTypeComposer")
@js.native
class ScalarTypeComposer[TContext] protected ()
  extends _AnyComposeType[TContext]
     with _AnyType[TContext]
     with _ComposeOutputType[js.Any, TContext] {
  def this(gqType: GraphQLScalarType, schemaComposer: SchemaComposer[TContext]) = this()
  
  def clearExtensions(): this.type = js.native
  
  def clone(newTypeName: String): ScalarTypeComposer[TContext] = js.native
  
  def extendExtensions(extensions: Extensions): this.type = js.native
  
  def getDescription(): String = js.native
  
  def getDirectiveById(idx: Double): DirectiveArgs | Unit = js.native
  
  def getDirectiveByName(directiveName: String): DirectiveArgs | Unit = js.native
  
  def getDirectiveNames(): js.Array[String] = js.native
  
  /**
    * -----------------------------------------------
    * Directive methods
    * -----------------------------------------------
    */
  def getDirectives(): js.Array[ExtensionsDirective] = js.native
  
  def getExtension(extensionName: String): js.Any = js.native
  
  /**
    *  -----------------------------------------------
    * Extensions methods
    * -----------------------------------------------
    */
  def getExtensions(): Extensions = js.native
  
  def getParseLiteral(): GraphQLScalarLiteralParser[_] = js.native
  
  def getParseValue(): GraphQLScalarValueParser[_] = js.native
  
  def getSerialize(): GraphQLScalarSerializer[_] = js.native
  
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def getType(): GraphQLScalarType = js.native
  
  def getTypeName(): String = js.native
  
  def getTypeNonNull(): GraphQLNonNull[GraphQLScalarType] = js.native
  
  def getTypePlural(): GraphQLList[GraphQLScalarType] = js.native
  
  var gqType: GraphQLScalarTypeExtended = js.native
  
  def hasExtension(extensionName: String): Boolean = js.native
  
  def merge(`type`: GraphQLScalarType): this.type = js.native
  def merge(`type`: ScalarTypeComposer[_]): this.type = js.native
  
  def removeExtension(extensionName: String): this.type = js.native
  
  var schemaComposer: SchemaComposer[TContext] = js.native
  
  def setDescription(description: String): this.type = js.native
  
  def setExtension(extensionName: String, value: js.Any): this.type = js.native
  
  def setExtensions(extensions: Extensions): this.type = js.native
  
  def setParseLiteral(fn: Unit): Unit = js.native
  def setParseLiteral(fn: GraphQLScalarLiteralParser[_]): Unit = js.native
  
  def setParseValue(fn: Unit): Unit = js.native
  def setParseValue(fn: GraphQLScalarValueParser[_]): Unit = js.native
  
  /**
    *  -----------------------------------------------
    * Serialize methods
    * -----------------------------------------------
    */
  def setSerialize(fn: GraphQLScalarSerializer[_]): Unit = js.native
  
  def setTypeName(name: String): this.type = js.native
}
/* static members */
@JSImport("graphql-compose/lib/ScalarTypeComposer", "ScalarTypeComposer")
@js.native
object ScalarTypeComposer extends js.Object {
  
  /**
    * Create `ScalarTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](typeDef: ScalarTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): ScalarTypeComposer[TCtx] = js.native
  
  /**
    * Create `ScalarTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: ScalarTypeComposeDefinition): ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: ScalarTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): ScalarTypeComposer[TCtx] = js.native
}
