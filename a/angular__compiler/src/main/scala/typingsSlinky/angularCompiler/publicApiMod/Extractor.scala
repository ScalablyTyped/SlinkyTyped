package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.extractorMod.ExtractorHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "Extractor")
@js.native
class Extractor protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    messageBundle: typingsSlinky.angularCompiler.messageBundleMod.MessageBundle,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ) = this()
}
/* static members */
object Extractor {
  
  @JSImport("@angular/compiler/public_api", "Extractor.create")
  @js.native
  def create(host: ExtractorHost): typingsSlinky.angularCompiler.anon.Extractor = js.native
  @JSImport("@angular/compiler/public_api", "Extractor.create")
  @js.native
  def create(host: ExtractorHost, locale: String): typingsSlinky.angularCompiler.anon.Extractor = js.native
}
