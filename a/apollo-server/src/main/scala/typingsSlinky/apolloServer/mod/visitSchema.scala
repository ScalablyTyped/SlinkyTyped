package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.SchemaVisitorMap
import typingsSlinky.graphqlToolsUtils.interfacesMod.VisitorSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "visitSchema")
@js.native
object visitSchema extends js.Object {
  
  def apply(
    schema: GraphQLSchema,
    visitorOrVisitorSelector: js.Array[
      typingsSlinky.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor | SchemaVisitorMap
    ]
  ): GraphQLSchema = js.native
  def apply(schema: GraphQLSchema, visitorOrVisitorSelector: SchemaVisitorMap): GraphQLSchema = js.native
  def apply(schema: GraphQLSchema, visitorOrVisitorSelector: VisitorSelector): GraphQLSchema = js.native
  def apply(
    schema: GraphQLSchema,
    visitorOrVisitorSelector: typingsSlinky.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor
  ): GraphQLSchema = js.native
}
