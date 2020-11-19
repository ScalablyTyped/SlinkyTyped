package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.SchemaVisitorMap
import typingsSlinky.graphqlToolsUtils.interfacesMod.VisitorSelector
import typingsSlinky.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/utils/visitSchema", JSImport.Namespace)
@js.native
object visitSchemaMod extends js.Object {
  
  def visitSchema(schema: GraphQLSchema, visitorOrVisitorSelector: js.Array[SchemaVisitor | SchemaVisitorMap]): GraphQLSchema = js.native
  def visitSchema(schema: GraphQLSchema, visitorOrVisitorSelector: SchemaVisitorMap): GraphQLSchema = js.native
  def visitSchema(schema: GraphQLSchema, visitorOrVisitorSelector: VisitorSelector): GraphQLSchema = js.native
  def visitSchema(schema: GraphQLSchema, visitorOrVisitorSelector: SchemaVisitor): GraphQLSchema = js.native
}
