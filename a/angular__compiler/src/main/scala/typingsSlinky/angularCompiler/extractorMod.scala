package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.messageBundleMod.MessageBundle
import typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolverHost
import typingsSlinky.angularCompiler.summaryResolverMod.AotSummaryResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/i18n/extractor", JSImport.Namespace)
@js.native
object extractorMod extends js.Object {
  
  @js.native
  class Extractor protected () extends js.Object {
    def this(
      host: ExtractorHost,
      staticSymbolResolver: StaticSymbolResolver,
      messageBundle: MessageBundle,
      metadataResolver: CompileMetadataResolver
    ) = this()
    
    def extract(rootFiles: js.Array[String]): js.Promise[MessageBundle] = js.native
    
    var host: ExtractorHost = js.native
    
    var messageBundle: js.Any = js.native
    
    var metadataResolver: js.Any = js.native
    
    var staticSymbolResolver: js.Any = js.native
  }
  /* static members */
  @js.native
  object Extractor extends js.Object {
    
    def create(host: ExtractorHost): typingsSlinky.angularCompiler.anon.Extractor = js.native
    def create(host: ExtractorHost, locale: String): typingsSlinky.angularCompiler.anon.Extractor = js.native
  }
  
  @js.native
  trait ExtractorHost
    extends StaticSymbolResolverHost
       with AotSummaryResolverHost {
    
    /**
      * Loads a resource (e.g. html / css)
      */
    def loadResource(path: String): js.Promise[String] | String = js.native
    
    /**
      * Converts a path that refers to a resource into an absolute filePath
      * that can be lateron used for loading the resource via `loadResource.
      */
    def resourceNameToFileName(path: String, containingFile: String): String | Null = js.native
  }
}
