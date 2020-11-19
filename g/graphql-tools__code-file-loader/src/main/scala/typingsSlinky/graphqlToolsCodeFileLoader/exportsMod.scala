package typingsSlinky.graphqlToolsCodeFileLoader

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsCodeFileLoader.anon.Filepath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/code-file-loader/exports", JSImport.Namespace)
@js.native
object exportsMod extends js.Object {
  
  def pickExportFromModule(hasModuleFilepath: Filepath): js.Promise[DocumentNode | GraphQLSchema] = js.native
  
  def pickExportFromModuleSync(hasModuleFilepath: Filepath): DocumentNode | GraphQLSchema = js.native
}
