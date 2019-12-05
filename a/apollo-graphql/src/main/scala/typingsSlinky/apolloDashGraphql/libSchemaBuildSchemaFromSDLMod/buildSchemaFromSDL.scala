package typingsSlinky.apolloDashGraphql.libSchemaBuildSchemaFromSDLMod

import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema/buildSchemaFromSDL", "buildSchemaFromSDL")
@js.native
object buildSchemaFromSDL extends js.Object {
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): GraphQLSchema = js.native
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode], schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
  def apply(modulesOrSDL: DocumentNode): GraphQLSchema = js.native
  def apply(modulesOrSDL: DocumentNode, schemaToExtend: GraphQLSchema): GraphQLSchema = js.native
}

