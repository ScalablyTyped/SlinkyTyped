package typingsSlinky.javascriptObfuscator.tinputoptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.javascriptObfuscator.tstringarrayencodingMod.TStringArrayEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<javascript-obfuscator.javascript-obfuscator/src/interfaces/options/IOptions.IOptions, keyof javascript-obfuscator.javascript-obfuscator/src/interfaces/options/IOptions.IOptions>> & javascript-obfuscator.javascript-obfuscator/src/types/TObject.TObject<unknown> */
@js.native
trait TInputOptions
  extends /* key */ StringDictionary[js.Any] {
  var compact: js.UndefOr[Boolean] = js.native
  var controlFlowFlattening: js.UndefOr[Boolean] = js.native
  var controlFlowFlatteningThreshold: js.UndefOr[Double] = js.native
  var deadCodeInjection: js.UndefOr[Boolean] = js.native
  var deadCodeInjectionThreshold: js.UndefOr[Double] = js.native
  var debugProtection: js.UndefOr[Boolean] = js.native
  var debugProtectionInterval: js.UndefOr[Boolean] = js.native
  var disableConsoleOutput: js.UndefOr[Boolean] = js.native
  var domainLock: js.UndefOr[js.Array[String]] = js.native
  var identifierNamesGenerator: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdentifierNamesGenerator */ js.Any
  ] = js.native
  var identifiersPrefix: js.UndefOr[String] = js.native
  var inputFileName: js.UndefOr[String] = js.native
  var log: js.UndefOr[Boolean] = js.native
  var renameGlobals: js.UndefOr[Boolean] = js.native
  var reservedNames: js.UndefOr[js.Array[String]] = js.native
  var reservedStrings: js.UndefOr[js.Array[String]] = js.native
  var rotateStringArray: js.UndefOr[Boolean] = js.native
  var seed: js.UndefOr[Double] = js.native
  var selfDefending: js.UndefOr[Boolean] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
  var sourceMapBaseUrl: js.UndefOr[String] = js.native
  var sourceMapFileName: js.UndefOr[String] = js.native
  var sourceMapMode: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SourceMapMode */ js.Any
  ] = js.native
  var stringArray: js.UndefOr[Boolean] = js.native
  var stringArrayEncoding: js.UndefOr[TStringArrayEncoding] = js.native
  var stringArrayThreshold: js.UndefOr[Double] = js.native
  var target: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationTarget */ js.Any
  ] = js.native
  var transformObjectKeys: js.UndefOr[Boolean] = js.native
  var unicodeEscapeSequence: js.UndefOr[Boolean] = js.native
}

object TInputOptions {
  @scala.inline
  def apply(): TInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TInputOptions]
  }
  @scala.inline
  implicit class TInputOptionsOps[Self <: TInputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withControlFlowFlattening(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlFlowFlattening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlFlowFlattening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlFlowFlattening")(js.undefined)
        ret
    }
    @scala.inline
    def withControlFlowFlatteningThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlFlowFlatteningThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlFlowFlatteningThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlFlowFlatteningThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadCodeInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadCodeInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadCodeInjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadCodeInjection")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadCodeInjectionThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadCodeInjectionThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadCodeInjectionThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadCodeInjectionThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugProtection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugProtectionInterval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugProtectionInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugProtectionInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugProtectionInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableConsoleOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableConsoleOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableConsoleOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableConsoleOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainLock(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainLock")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifierNamesGenerator(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdentifierNamesGenerator */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierNamesGenerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifierNamesGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierNamesGenerator")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifiersPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifiersPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifiersPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifiersPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameGlobals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameGlobals")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedNames")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedStrings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateStringArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateStringArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateStringArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateStringArray")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfDefending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfDefending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfDefending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfDefending")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapMode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SourceMapMode */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStringArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringArray")(js.undefined)
        ret
    }
    @scala.inline
    def withStringArrayEncoding(value: TStringArrayEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringArrayEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringArrayEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringArrayEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withStringArrayThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringArrayThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringArrayThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringArrayThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationTarget */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformObjectKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformObjectKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformObjectKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformObjectKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeEscapeSequence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeEscapeSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicodeEscapeSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeEscapeSequence")(js.undefined)
        ret
    }
  }
  
}

