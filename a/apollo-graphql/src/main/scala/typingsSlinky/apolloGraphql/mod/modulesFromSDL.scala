package typingsSlinky.apolloGraphql.mod

import typingsSlinky.apolloGraphql.buildSchemaFromSDLMod.GraphQLSchemaModule
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-graphql", "modulesFromSDL")
@js.native
object modulesFromSDL extends js.Object {
  
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): js.Array[GraphQLSchemaModule] = js.native
  def apply(modulesOrSDL: DocumentNode): js.Array[GraphQLSchemaModule] = js.native
}
