package typingsSlinky.apolloGraphql.mod

import typingsSlinky.apolloGraphql.buildSchemaFromSDLMod.GraphQLSchemaModule
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-graphql", "buildSchemaFromSDL")
@js.native
object buildSchemaFromSDL extends js.Object {
  
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): GraphQLSchema = js.native
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode], schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
  def apply(modulesOrSDL: DocumentNode): GraphQLSchema = js.native
  def apply(modulesOrSDL: DocumentNode, schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
}
