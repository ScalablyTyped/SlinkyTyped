package typingsSlinky.atAngularCompiler.atAngularCompilerMod

import typingsSlinky.atAngularCompiler.Anon_Extractor
import typingsSlinky.atAngularCompiler.srcI18nExtractorMod.ExtractorHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Extractor")
@js.native
class Extractor protected ()
  extends typingsSlinky.atAngularCompiler.publicUnderscoreApiMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: typingsSlinky.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    messageBundle: typingsSlinky.atAngularCompiler.srcI18nMessageUnderscoreBundleMod.MessageBundle,
    metadataResolver: typingsSlinky.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ) = this()
}

/* static members */
@JSImport("@angular/compiler", "Extractor")
@js.native
object Extractor extends js.Object {
  def create(host: ExtractorHost): Anon_Extractor = js.native
  def create(host: ExtractorHost, locale: String): Anon_Extractor = js.native
}

