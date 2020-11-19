package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.extractorMod.ExtractorHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "Extractor")
@js.native
class Extractor protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    messageBundle: typingsSlinky.angularCompiler.messageBundleMod.MessageBundle,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ) = this()
}
/* static members */
@JSImport("@angular/compiler/compiler", "Extractor")
@js.native
object Extractor extends js.Object {
  
  def create(host: ExtractorHost): typingsSlinky.angularCompiler.anon.Extractor = js.native
  def create(host: ExtractorHost, locale: String): typingsSlinky.angularCompiler.anon.Extractor = js.native
}
