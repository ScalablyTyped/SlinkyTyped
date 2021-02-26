package typingsSlinky.cosmiconfig

import typingsSlinky.cosmiconfig.mod.Loader
import typingsSlinky.cosmiconfig.typesMod.Cache
import typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult
import typingsSlinky.cosmiconfig.typesMod.ExplorerOptions
import typingsSlinky.cosmiconfig.typesMod.ExplorerOptionsSync
import typingsSlinky.cosmiconfig.typesMod.LoadedFileContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object explorerBaseMod {
  
  @JSImport("cosmiconfig/dist/ExplorerBase", "ExplorerBase")
  @js.native
  class ExplorerBase[T /* <: ExplorerOptions | ExplorerOptionsSync */] protected () extends StObject {
    def this(options: T) = this()
    
    def clearCaches(): Unit = js.native
    
    def clearLoadCache(): Unit = js.native
    
    def clearSearchCache(): Unit = js.native
    
    val config: T = js.native
    
    /* protected */ def getLoaderEntryForFile(filepath: String): Loader = js.native
    
    val loadCache: js.UndefOr[Cache] = js.native
    
    var loadPackageProp: js.Any = js.native
    
    /* protected */ def loadedContentToCosmiconfigResult(filepath: String, loadedContent: LoadedFileContent): CosmiconfigResult = js.native
    
    /* protected */ def nextDirectoryToSearch(currentDir: String, currentResult: CosmiconfigResult): String | Null = js.native
    
    val searchCache: js.UndefOr[Cache] = js.native
    
    /* protected */ def shouldSearchStopWithResult(result: CosmiconfigResult): Boolean = js.native
    
    var validateConfig: js.Any = js.native
    
    /* protected */ def validateFilePath(filepath: String): Unit = js.native
  }
  
  @JSImport("cosmiconfig/dist/ExplorerBase", "getExtensionDescription")
  @js.native
  def getExtensionDescription(filepath: String): String = js.native
}
