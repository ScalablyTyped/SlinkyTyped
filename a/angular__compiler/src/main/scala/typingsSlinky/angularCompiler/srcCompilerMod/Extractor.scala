package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.AnonExtractor
import typingsSlinky.angularCompiler.extractorMod.ExtractorHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "Extractor")
@js.native
class Extractor protected ()
  extends typingsSlinky.angularCompiler.i18nMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: typingsSlinky.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    messageBundle: typingsSlinky.angularCompiler.messageBundleMod.MessageBundle,
    metadataResolver: typingsSlinky.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/src/compiler", "Extractor")
@js.native
object Extractor extends js.Object {
  def create(host: ExtractorHost): AnonExtractor = js.native
  def create(host: ExtractorHost, locale: String): AnonExtractor = js.native
}

