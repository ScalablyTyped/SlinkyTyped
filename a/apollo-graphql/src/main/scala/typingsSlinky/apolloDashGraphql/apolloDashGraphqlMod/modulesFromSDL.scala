package typingsSlinky.apolloDashGraphql.apolloDashGraphqlMod

import typingsSlinky.apolloDashGraphql.libSchemaBuildSchemaFromSDLMod.GraphQLSchemaModule
import typingsSlinky.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql", "modulesFromSDL")
@js.native
object modulesFromSDL extends js.Object {
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): js.Array[GraphQLSchemaModule] = js.native
  def apply(modulesOrSDL: DocumentNode): js.Array[GraphQLSchemaModule] = js.native
}

