package typingsSlinky.javascriptObfuscator.ioptionsMod

import typingsSlinky.javascriptObfuscator.tstringarrayencodingMod.TStringArrayEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  val compact: Boolean = js.native
  val controlFlowFlattening: Boolean = js.native
  val controlFlowFlatteningThreshold: Double = js.native
  val deadCodeInjection: Boolean = js.native
  val deadCodeInjectionThreshold: Double = js.native
  val debugProtection: Boolean = js.native
  val debugProtectionInterval: Boolean = js.native
  val disableConsoleOutput: Boolean = js.native
  val domainLock: js.Array[String] = js.native
  val identifierNamesGenerator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdentifierNamesGenerator */ js.Any = js.native
  val identifiersPrefix: String = js.native
  val inputFileName: String = js.native
  val log: Boolean = js.native
  val renameGlobals: Boolean = js.native
  val reservedNames: js.Array[String] = js.native
  val reservedStrings: js.Array[String] = js.native
  val rotateStringArray: Boolean = js.native
  val seed: Double = js.native
  val selfDefending: Boolean = js.native
  val sourceMap: Boolean = js.native
  val sourceMapBaseUrl: String = js.native
  val sourceMapFileName: String = js.native
  val sourceMapMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SourceMapMode */ js.Any = js.native
  val stringArray: Boolean = js.native
  val stringArrayEncoding: TStringArrayEncoding = js.native
  val stringArrayThreshold: Double = js.native
  val target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationTarget */ js.Any = js.native
  val transformObjectKeys: Boolean = js.native
  val unicodeEscapeSequence: Boolean = js.native
}

object IOptions {
  @scala.inline
  def apply(
    compact: Boolean,
    controlFlowFlattening: Boolean,
    controlFlowFlatteningThreshold: Double,
    deadCodeInjection: Boolean,
    deadCodeInjectionThreshold: Double,
    debugProtection: Boolean,
    debugProtectionInterval: Boolean,
    disableConsoleOutput: Boolean,
    domainLock: js.Array[String],
    identifierNamesGenerator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdentifierNamesGenerator */ js.Any,
    identifiersPrefix: String,
    inputFileName: String,
    log: Boolean,
    renameGlobals: Boolean,
    reservedNames: js.Array[String],
    reservedStrings: js.Array[String],
    rotateStringArray: Boolean,
    seed: Double,
    selfDefending: Boolean,
    sourceMap: Boolean,
    sourceMapBaseUrl: String,
    sourceMapFileName: String,
    sourceMapMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SourceMapMode */ js.Any,
    stringArray: Boolean,
    stringArrayEncoding: TStringArrayEncoding,
    stringArrayThreshold: Double,
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationTarget */ js.Any,
    transformObjectKeys: Boolean,
    unicodeEscapeSequence: Boolean
  ): IOptions = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], controlFlowFlattening = controlFlowFlattening.asInstanceOf[js.Any], controlFlowFlatteningThreshold = controlFlowFlatteningThreshold.asInstanceOf[js.Any], deadCodeInjection = deadCodeInjection.asInstanceOf[js.Any], deadCodeInjectionThreshold = deadCodeInjectionThreshold.asInstanceOf[js.Any], debugProtection = debugProtection.asInstanceOf[js.Any], debugProtectionInterval = debugProtectionInterval.asInstanceOf[js.Any], disableConsoleOutput = disableConsoleOutput.asInstanceOf[js.Any], domainLock = domainLock.asInstanceOf[js.Any], identifierNamesGenerator = identifierNamesGenerator.asInstanceOf[js.Any], identifiersPrefix = identifiersPrefix.asInstanceOf[js.Any], inputFileName = inputFileName.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], renameGlobals = renameGlobals.asInstanceOf[js.Any], reservedNames = reservedNames.asInstanceOf[js.Any], reservedStrings = reservedStrings.asInstanceOf[js.Any], rotateStringArray = rotateStringArray.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], selfDefending = selfDefending.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], sourceMapBaseUrl = sourceMapBaseUrl.asInstanceOf[js.Any], sourceMapFileName = sourceMapFileName.asInstanceOf[js.Any], sourceMapMode = sourceMapMode.asInstanceOf[js.Any], stringArray = stringArray.asInstanceOf[js.Any], stringArrayEncoding = stringArrayEncoding.asInstanceOf[js.Any], stringArrayThreshold = stringArrayThreshold.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transformObjectKeys = transformObjectKeys.asInstanceOf[js.Any], unicodeEscapeSequence = unicodeEscapeSequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def withControlFlowFlattening(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlFlowFlattening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlFlowFlatteningThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlFlowFlatteningThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeadCodeInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadCodeInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeadCodeInjectionThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadCodeInjectionThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugProtection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugProtectionInterval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugProtectionInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableConsoleOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableConsoleOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainLock(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainLock")(value.asInstanceOf[js.Any])
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
    def withIdentifiersPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifiersPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameGlobals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReservedNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReservedStrings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateStringArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateStringArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfDefending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfDefending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMapBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMapFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapFileName")(value.asInstanceOf[js.Any])
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
    def withStringArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringArrayEncoding(value: TStringArrayEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringArrayEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringArrayThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringArrayThreshold")(value.asInstanceOf[js.Any])
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
    def withTransformObjectKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformObjectKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnicodeEscapeSequence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeEscapeSequence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

