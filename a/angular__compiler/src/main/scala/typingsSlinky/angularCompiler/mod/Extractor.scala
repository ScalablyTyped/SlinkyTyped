package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.extractorMod.ExtractorHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "Extractor")
@js.native
class Extractor protected ()
  extends typingsSlinky.angularCompiler.compilerMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    messageBundle: typingsSlinky.angularCompiler.messageBundleMod.MessageBundle,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ) = this()
}
/* static members */
object Extractor {
  
  @JSImport("@angular/compiler", "Extractor.create")
  @js.native
  def create(host: ExtractorHost): typingsSlinky.angularCompiler.anon.Extractor = js.native
  @JSImport("@angular/compiler", "Extractor.create")
  @js.native
  def create(host: ExtractorHost, locale: String): typingsSlinky.angularCompiler.anon.Extractor = js.native
}
