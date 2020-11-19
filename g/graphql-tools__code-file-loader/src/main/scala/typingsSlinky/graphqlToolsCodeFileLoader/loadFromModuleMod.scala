package typingsSlinky.graphqlToolsCodeFileLoader

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/code-file-loader/load-from-module", JSImport.Namespace)
@js.native
object loadFromModuleMod extends js.Object {
  
  def tryToLoadFromExport(rawFilePath: String): js.Promise[GraphQLSchema | DocumentNode] = js.native
  
  def tryToLoadFromExportSync(rawFilePath: String): GraphQLSchema | DocumentNode = js.native
}
