package typingsSlinky.javascriptObfuscator.iclioptionsMod

import typingsSlinky.javascriptObfuscator.ioptionsMod.IOptions
import typingsSlinky.javascriptObfuscator.tstringarrayencodingMod.TStringArrayEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICLIOptions extends IOptions {
  val config: String = js.native
  val exclude: js.Array[String] = js.native
  val output: String = js.native
  val version: String = js.native
}

object ICLIOptions {
  @scala.inline
  def apply(
    compact: Boolean,
    config: String,
    controlFlowFlattening: Boolean,
    controlFlowFlatteningThreshold: Double,
    deadCodeInjection: Boolean,
    deadCodeInjectionThreshold: Double,
    debugProtection: Boolean,
    debugProtectionInterval: Boolean,
    disableConsoleOutput: Boolean,
    domainLock: js.Array[String],
    exclude: js.Array[String],
    identifierNamesGenerator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdentifierNamesGenerator */ js.Any,
    identifiersPrefix: String,
    inputFileName: String,
    log: Boolean,
    output: String,
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
    unicodeEscapeSequence: Boolean,
    version: String
  ): ICLIOptions = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], controlFlowFlattening = controlFlowFlattening.asInstanceOf[js.Any], controlFlowFlatteningThreshold = controlFlowFlatteningThreshold.asInstanceOf[js.Any], deadCodeInjection = deadCodeInjection.asInstanceOf[js.Any], deadCodeInjectionThreshold = deadCodeInjectionThreshold.asInstanceOf[js.Any], debugProtection = debugProtection.asInstanceOf[js.Any], debugProtectionInterval = debugProtectionInterval.asInstanceOf[js.Any], disableConsoleOutput = disableConsoleOutput.asInstanceOf[js.Any], domainLock = domainLock.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], identifierNamesGenerator = identifierNamesGenerator.asInstanceOf[js.Any], identifiersPrefix = identifiersPrefix.asInstanceOf[js.Any], inputFileName = inputFileName.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], renameGlobals = renameGlobals.asInstanceOf[js.Any], reservedNames = reservedNames.asInstanceOf[js.Any], reservedStrings = reservedStrings.asInstanceOf[js.Any], rotateStringArray = rotateStringArray.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], selfDefending = selfDefending.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], sourceMapBaseUrl = sourceMapBaseUrl.asInstanceOf[js.Any], sourceMapFileName = sourceMapFileName.asInstanceOf[js.Any], sourceMapMode = sourceMapMode.asInstanceOf[js.Any], stringArray = stringArray.asInstanceOf[js.Any], stringArrayEncoding = stringArrayEncoding.asInstanceOf[js.Any], stringArrayThreshold = stringArrayThreshold.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transformObjectKeys = transformObjectKeys.asInstanceOf[js.Any], unicodeEscapeSequence = unicodeEscapeSequence.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICLIOptions]
  }
  @scala.inline
  implicit class ICLIOptionsOps[Self <: ICLIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

