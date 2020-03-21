package typingsSlinky.javascriptObfuscator.javascriptObfuscatorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.javascriptObfuscator.tstringarrayencodingMod.TStringArrayEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined javascript-obfuscator.javascript-obfuscator/src/types/options/TInputOptions.TInputOptions */
trait ObfuscatorOptions
  extends /* key */ StringDictionary[js.Any] {
  var compact: js.UndefOr[Boolean] = js.undefined
  var controlFlowFlattening: js.UndefOr[Boolean] = js.undefined
  var controlFlowFlatteningThreshold: js.UndefOr[Double] = js.undefined
  var deadCodeInjection: js.UndefOr[Boolean] = js.undefined
  var deadCodeInjectionThreshold: js.UndefOr[Double] = js.undefined
  var debugProtection: js.UndefOr[Boolean] = js.undefined
  var debugProtectionInterval: js.UndefOr[Boolean] = js.undefined
  var disableConsoleOutput: js.UndefOr[Boolean] = js.undefined
  var domainLock: js.UndefOr[js.Array[String]] = js.undefined
  var identifierNamesGenerator: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdentifierNamesGenerator */ js.Any
  ] = js.undefined
  var identifiersPrefix: js.UndefOr[String] = js.undefined
  var inputFileName: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var renameGlobals: js.UndefOr[Boolean] = js.undefined
  var reservedNames: js.UndefOr[js.Array[String]] = js.undefined
  var reservedStrings: js.UndefOr[js.Array[String]] = js.undefined
  var rotateStringArray: js.UndefOr[Boolean] = js.undefined
  var seed: js.UndefOr[Double] = js.undefined
  var selfDefending: js.UndefOr[Boolean] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  var sourceMapBaseUrl: js.UndefOr[String] = js.undefined
  var sourceMapFileName: js.UndefOr[String] = js.undefined
  var sourceMapMode: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SourceMapMode */ js.Any
  ] = js.undefined
  var stringArray: js.UndefOr[Boolean] = js.undefined
  var stringArrayEncoding: js.UndefOr[TStringArrayEncoding] = js.undefined
  var stringArrayThreshold: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationTarget */ js.Any
  ] = js.undefined
  var transformObjectKeys: js.UndefOr[Boolean] = js.undefined
  var unicodeEscapeSequence: js.UndefOr[Boolean] = js.undefined
}

object ObfuscatorOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    controlFlowFlattening: js.UndefOr[Boolean] = js.undefined,
    controlFlowFlatteningThreshold: Int | Double = null,
    deadCodeInjection: js.UndefOr[Boolean] = js.undefined,
    deadCodeInjectionThreshold: Int | Double = null,
    debugProtection: js.UndefOr[Boolean] = js.undefined,
    debugProtectionInterval: js.UndefOr[Boolean] = js.undefined,
    disableConsoleOutput: js.UndefOr[Boolean] = js.undefined,
    domainLock: js.Array[String] = null,
    identifierNamesGenerator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdentifierNamesGenerator */ js.Any = null,
    identifiersPrefix: String = null,
    inputFileName: String = null,
    log: js.UndefOr[Boolean] = js.undefined,
    renameGlobals: js.UndefOr[Boolean] = js.undefined,
    reservedNames: js.Array[String] = null,
    reservedStrings: js.Array[String] = null,
    rotateStringArray: js.UndefOr[Boolean] = js.undefined,
    seed: Int | Double = null,
    selfDefending: js.UndefOr[Boolean] = js.undefined,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    sourceMapBaseUrl: String = null,
    sourceMapFileName: String = null,
    sourceMapMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SourceMapMode */ js.Any = null,
    stringArray: js.UndefOr[Boolean] = js.undefined,
    stringArrayEncoding: TStringArrayEncoding = null,
    stringArrayThreshold: Int | Double = null,
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationTarget */ js.Any = null,
    transformObjectKeys: js.UndefOr[Boolean] = js.undefined,
    unicodeEscapeSequence: js.UndefOr[Boolean] = js.undefined
  ): ObfuscatorOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(controlFlowFlattening)) __obj.updateDynamic("controlFlowFlattening")(controlFlowFlattening.asInstanceOf[js.Any])
    if (controlFlowFlatteningThreshold != null) __obj.updateDynamic("controlFlowFlatteningThreshold")(controlFlowFlatteningThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(deadCodeInjection)) __obj.updateDynamic("deadCodeInjection")(deadCodeInjection.asInstanceOf[js.Any])
    if (deadCodeInjectionThreshold != null) __obj.updateDynamic("deadCodeInjectionThreshold")(deadCodeInjectionThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(debugProtection)) __obj.updateDynamic("debugProtection")(debugProtection.asInstanceOf[js.Any])
    if (!js.isUndefined(debugProtectionInterval)) __obj.updateDynamic("debugProtectionInterval")(debugProtectionInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(disableConsoleOutput)) __obj.updateDynamic("disableConsoleOutput")(disableConsoleOutput.asInstanceOf[js.Any])
    if (domainLock != null) __obj.updateDynamic("domainLock")(domainLock.asInstanceOf[js.Any])
    if (identifierNamesGenerator != null) __obj.updateDynamic("identifierNamesGenerator")(identifierNamesGenerator.asInstanceOf[js.Any])
    if (identifiersPrefix != null) __obj.updateDynamic("identifiersPrefix")(identifiersPrefix.asInstanceOf[js.Any])
    if (inputFileName != null) __obj.updateDynamic("inputFileName")(inputFileName.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (!js.isUndefined(renameGlobals)) __obj.updateDynamic("renameGlobals")(renameGlobals.asInstanceOf[js.Any])
    if (reservedNames != null) __obj.updateDynamic("reservedNames")(reservedNames.asInstanceOf[js.Any])
    if (reservedStrings != null) __obj.updateDynamic("reservedStrings")(reservedStrings.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateStringArray)) __obj.updateDynamic("rotateStringArray")(rotateStringArray.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (!js.isUndefined(selfDefending)) __obj.updateDynamic("selfDefending")(selfDefending.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (sourceMapBaseUrl != null) __obj.updateDynamic("sourceMapBaseUrl")(sourceMapBaseUrl.asInstanceOf[js.Any])
    if (sourceMapFileName != null) __obj.updateDynamic("sourceMapFileName")(sourceMapFileName.asInstanceOf[js.Any])
    if (sourceMapMode != null) __obj.updateDynamic("sourceMapMode")(sourceMapMode.asInstanceOf[js.Any])
    if (!js.isUndefined(stringArray)) __obj.updateDynamic("stringArray")(stringArray.asInstanceOf[js.Any])
    if (stringArrayEncoding != null) __obj.updateDynamic("stringArrayEncoding")(stringArrayEncoding.asInstanceOf[js.Any])
    if (stringArrayThreshold != null) __obj.updateDynamic("stringArrayThreshold")(stringArrayThreshold.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(transformObjectKeys)) __obj.updateDynamic("transformObjectKeys")(transformObjectKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(unicodeEscapeSequence)) __obj.updateDynamic("unicodeEscapeSequence")(unicodeEscapeSequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObfuscatorOptions]
  }
}

