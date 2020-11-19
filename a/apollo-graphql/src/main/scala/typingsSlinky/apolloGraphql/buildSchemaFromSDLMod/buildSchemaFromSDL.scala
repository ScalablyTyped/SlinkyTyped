package typingsSlinky.apolloGraphql.buildSchemaFromSDLMod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-graphql/lib/schema/buildSchemaFromSDL", "buildSchemaFromSDL")
@js.native
object buildSchemaFromSDL extends js.Object {
  
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): GraphQLSchema = js.native
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode], schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
  def apply(modulesOrSDL: DocumentNode): GraphQLSchema = js.native
  def apply(modulesOrSDL: DocumentNode, schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
}
