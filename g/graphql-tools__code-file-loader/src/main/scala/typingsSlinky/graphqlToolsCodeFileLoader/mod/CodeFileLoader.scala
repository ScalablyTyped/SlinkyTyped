package typingsSlinky.graphqlToolsCodeFileLoader.mod

import typingsSlinky.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.Loader
import typingsSlinky.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/code-file-loader", "CodeFileLoader")
@js.native
class CodeFileLoader () extends Loader[SchemaPointerSingle | DocumentPointerSingle, CodeFileLoaderOptions] {
  
  @JSName("canLoadSync")
  def canLoadSync_MCodeFileLoader(pointer: DocumentPointerSingle | SchemaPointerSingle, options: CodeFileLoaderOptions): Boolean = js.native
  
  @JSName("loadSync")
  def loadSync_MCodeFileLoader(pointer: DocumentPointerSingle | SchemaPointerSingle, options: CodeFileLoaderOptions): Source = js.native
}
