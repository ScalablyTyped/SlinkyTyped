package typingsSlinky.graphqlToolsModuleLoader

import typingsSlinky.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.Loader
import typingsSlinky.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.SingleFileOptions
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/module-loader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ModuleLoader () extends Loader[SchemaPointerSingle | DocumentPointerSingle, SingleFileOptions] {
    var extractFromModule: js.Any = js.native
    var importModule: js.Any = js.native
    var importModuleSync: js.Any = js.native
    var parse: js.Any = js.native
    def canLoad(pointer: String): js.Promise[Boolean] = js.native
    @JSName("canLoadSync")
    def canLoadSync_MModuleLoader(pointer: String): Boolean = js.native
    def load(pointer: String, options: SingleFileOptions): js.Promise[Source] = js.native
    @JSName("loadSync")
    def loadSync_MModuleLoader(pointer: String, options: SingleFileOptions): Source = js.native
  }
  
}

