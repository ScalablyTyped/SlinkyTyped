package typingsSlinky.appBuilderLib.platformPackagerMod

import typingsSlinky.appBuilderLib.appInfoMod.AppInfo
import typingsSlinky.appBuilderLib.configurationMod.AfterPackContext
import typingsSlinky.appBuilderLib.configurationMod.Configuration
import typingsSlinky.appBuilderLib.coreMod.CompressionLevel
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import typingsSlinky.appBuilderLib.electronFrameworkMod.ElectronPlatformName
import typingsSlinky.appBuilderLib.fileAssociationMod.FileAssociation
import typingsSlinky.appBuilderLib.fileMatcherMod.GetFileMatchersOptions
import typingsSlinky.appBuilderLib.mod.Packager
import typingsSlinky.appBuilderLib.mod.Platform
import typingsSlinky.appBuilderLib.mod.Target
import typingsSlinky.appBuilderLib.packagerApiMod.PackagerOptions
import typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.builderUtil.fsMod.FileTransformer
import typingsSlinky.builderUtil.mod.AsyncTaskManager
import typingsSlinky.builderUtil.mod.DebugLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/platformPackager", "PlatformPackager")
@js.native
abstract class PlatformPackager[DC /* <: PlatformSpecificBuildOptions */] protected () extends js.Object {
  protected def this(info: Packager, platform: Platform) = this()
  
  val _resourceList: js.Any = js.native
  
  val appInfo: AppInfo = js.native
  
  def buildResourcesDir: String = js.native
  
  var checkFileInPackage: js.Any = js.native
  
  def compression: CompressionLevel = js.native
  
  /* protected */ def computeAppOutDir(outDir: String, arch: Arch): String = js.native
  
  var computeArtifactName: js.Any = js.native
  
  var computeAsarOptions: js.Any = js.native
  
  def computeSafeArtifactName(suggestedName: String, ext: String): String | Null = js.native
  def computeSafeArtifactName(
    suggestedName: String,
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    skipArchIfX64: js.UndefOr[scala.Nothing],
    safePattern: String
  ): String | Null = js.native
  def computeSafeArtifactName(suggestedName: String, ext: String, arch: js.UndefOr[scala.Nothing], skipArchIfX64: Boolean): String | Null = js.native
  def computeSafeArtifactName(
    suggestedName: String,
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean,
    safePattern: String
  ): String | Null = js.native
  def computeSafeArtifactName(
    suggestedName: String,
    ext: String,
    arch: Null,
    skipArchIfX64: js.UndefOr[scala.Nothing],
    safePattern: String
  ): String | Null = js.native
  def computeSafeArtifactName(suggestedName: String, ext: String, arch: Null, skipArchIfX64: Boolean): String | Null = js.native
  def computeSafeArtifactName(suggestedName: String, ext: String, arch: Null, skipArchIfX64: Boolean, safePattern: String): String | Null = js.native
  def computeSafeArtifactName(suggestedName: String, ext: String, arch: Arch): String | Null = js.native
  def computeSafeArtifactName(
    suggestedName: String,
    ext: String,
    arch: Arch,
    skipArchIfX64: js.UndefOr[scala.Nothing],
    safePattern: String
  ): String | Null = js.native
  def computeSafeArtifactName(suggestedName: String, ext: String, arch: Arch, skipArchIfX64: Boolean): String | Null = js.native
  def computeSafeArtifactName(suggestedName: String, ext: String, arch: Arch, skipArchIfX64: Boolean, safePattern: String): String | Null = js.native
  def computeSafeArtifactName(suggestedName: Null, ext: String): String | Null = js.native
  def computeSafeArtifactName(
    suggestedName: Null,
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    skipArchIfX64: js.UndefOr[scala.Nothing],
    safePattern: String
  ): String | Null = js.native
  def computeSafeArtifactName(suggestedName: Null, ext: String, arch: js.UndefOr[scala.Nothing], skipArchIfX64: Boolean): String | Null = js.native
  def computeSafeArtifactName(
    suggestedName: Null,
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean,
    safePattern: String
  ): String | Null = js.native
  def computeSafeArtifactName(
    suggestedName: Null,
    ext: String,
    arch: Null,
    skipArchIfX64: js.UndefOr[scala.Nothing],
    safePattern: String
  ): String | Null = js.native
  def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Null, skipArchIfX64: Boolean): String | Null = js.native
  def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Null, skipArchIfX64: Boolean, safePattern: String): String | Null = js.native
  def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Arch): String | Null = js.native
  def computeSafeArtifactName(
    suggestedName: Null,
    ext: String,
    arch: Arch,
    skipArchIfX64: js.UndefOr[scala.Nothing],
    safePattern: String
  ): String | Null = js.native
  def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Arch, skipArchIfX64: Boolean): String | Null = js.native
  def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Arch, skipArchIfX64: Boolean, safePattern: String): String | Null = js.native
  
  def config: Configuration = js.native
  
  var copyAppFiles: js.Any = js.native
  
  def createGetFileMatchersOptions(outDir: String, arch: Arch, customBuildOptions: PlatformSpecificBuildOptions): GetFileMatchersOptions = js.native
  
  def createTargets(
    targets: js.Array[String],
    mapper: js.Function2[/* name */ String, /* factory */ js.Function1[/* outDir */ String, Target], Unit]
  ): Unit = js.native
  
  /* protected */ def createTransformerForExtraFiles(packContext: AfterPackContext): FileTransformer | Null = js.native
  
  def debugLogger: DebugLogger = js.native
  
  def defaultTarget: js.Array[String] = js.native
  
  def dispatchArtifactCreated(file: String): js.Promise[Unit] = js.native
  def dispatchArtifactCreated(file: String, target: Null, arch: Null, safeArtifactName: String): js.Promise[Unit] = js.native
  def dispatchArtifactCreated(file: String, target: Null, arch: Arch): js.Promise[Unit] = js.native
  def dispatchArtifactCreated(file: String, target: Null, arch: Arch, safeArtifactName: String): js.Promise[Unit] = js.native
  def dispatchArtifactCreated(file: String, target: Target): js.Promise[Unit] = js.native
  def dispatchArtifactCreated(file: String, target: Target, arch: Null, safeArtifactName: String): js.Promise[Unit] = js.native
  def dispatchArtifactCreated(file: String, target: Target, arch: Arch): js.Promise[Unit] = js.native
  def dispatchArtifactCreated(file: String, target: Target, arch: Arch, safeArtifactName: String): js.Promise[Unit] = js.native
  
  /* protected */ def doGetCscPassword(): js.UndefOr[String | Null] = js.native
  
  /* protected */ def doPack(
    outDir: String,
    appOutDir: String,
    platformName: ElectronPlatformName,
    arch: Arch,
    platformSpecificBuildOptions: DC,
    targets: js.Array[Target]
  ): js.Promise[Unit] = js.native
  
  def expandArtifactBeautyNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String): String = js.native
  def expandArtifactBeautyNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String, arch: Arch): String = js.native
  def expandArtifactBeautyNamePattern(targetSpecificOptions: Null, ext: String): String = js.native
  def expandArtifactBeautyNamePattern(targetSpecificOptions: Null, ext: String, arch: Arch): String = js.native
  def expandArtifactBeautyNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String): String = js.native
  def expandArtifactBeautyNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String, arch: Arch): String = js.native
  
  def expandArtifactNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    defaultPattern: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    defaultPattern: String
  ): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    defaultPattern: String,
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: String,
    arch: Null,
    defaultPattern: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String, arch: Null, defaultPattern: String): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: String,
    arch: Null,
    defaultPattern: String,
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String, arch: Arch): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: String,
    arch: Arch,
    defaultPattern: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String, arch: Arch, defaultPattern: String): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: String,
    arch: Arch,
    defaultPattern: String,
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: Null, ext: String): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: Null,
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    defaultPattern: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: Null, ext: String, arch: js.UndefOr[scala.Nothing], defaultPattern: String): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: Null,
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    defaultPattern: String,
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: Null,
    ext: String,
    arch: Null,
    defaultPattern: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: Null, ext: String, arch: Null, defaultPattern: String): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: Null,
    ext: String,
    arch: Null,
    defaultPattern: String,
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: Null, ext: String, arch: Arch): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: Null,
    ext: String,
    arch: Arch,
    defaultPattern: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: Null, ext: String, arch: Arch, defaultPattern: String): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: Null,
    ext: String,
    arch: Arch,
    defaultPattern: String,
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: TargetSpecificOptions,
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    defaultPattern: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: TargetSpecificOptions,
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    defaultPattern: String
  ): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: TargetSpecificOptions,
    ext: String,
    arch: js.UndefOr[scala.Nothing],
    defaultPattern: String,
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: TargetSpecificOptions,
    ext: String,
    arch: Null,
    defaultPattern: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String, arch: Null, defaultPattern: String): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: TargetSpecificOptions,
    ext: String,
    arch: Null,
    defaultPattern: String,
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String, arch: Arch): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: TargetSpecificOptions,
    ext: String,
    arch: Arch,
    defaultPattern: js.UndefOr[scala.Nothing],
    skipArchIfX64: Boolean
  ): String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String, arch: Arch, defaultPattern: String): String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: TargetSpecificOptions,
    ext: String,
    arch: Arch,
    defaultPattern: String,
    skipArchIfX64: Boolean
  ): String = js.native
  
  def expandMacro(pattern: String): String = js.native
  def expandMacro(
    pattern: String,
    arch: js.UndefOr[scala.Nothing],
    extra: js.UndefOr[scala.Nothing],
    isProductNameSanitized: Boolean
  ): String = js.native
  def expandMacro(pattern: String, arch: js.UndefOr[scala.Nothing], extra: js.Any): String = js.native
  def expandMacro(pattern: String, arch: js.UndefOr[scala.Nothing], extra: js.Any, isProductNameSanitized: Boolean): String = js.native
  def expandMacro(pattern: String, arch: String): String = js.native
  def expandMacro(pattern: String, arch: String, extra: js.UndefOr[scala.Nothing], isProductNameSanitized: Boolean): String = js.native
  def expandMacro(pattern: String, arch: String, extra: js.Any): String = js.native
  def expandMacro(pattern: String, arch: String, extra: js.Any, isProductNameSanitized: Boolean): String = js.native
  def expandMacro(pattern: String, arch: Null, extra: js.UndefOr[scala.Nothing], isProductNameSanitized: Boolean): String = js.native
  def expandMacro(pattern: String, arch: Null, extra: js.Any): String = js.native
  def expandMacro(pattern: String, arch: Null, extra: js.Any, isProductNameSanitized: Boolean): String = js.native
  
  def fileAssociations: js.Array[FileAssociation] = js.native
  
  def forceCodeSigning: Boolean = js.native
  
  def generateName2(ext: String, classifier: js.UndefOr[scala.Nothing], deployment: Boolean): String = js.native
  def generateName2(ext: String, classifier: String, deployment: Boolean): String = js.native
  def generateName2(ext: String, classifier: Null, deployment: Boolean): String = js.native
  def generateName2(ext: Null, classifier: js.UndefOr[scala.Nothing], deployment: Boolean): String = js.native
  def generateName2(ext: Null, classifier: String, deployment: Boolean): String = js.native
  def generateName2(ext: Null, classifier: Null, deployment: Boolean): String = js.native
  
  /* protected */ def getCscLink(): js.UndefOr[String | Null] = js.native
  /* protected */ def getCscLink(extraEnvName: String): js.UndefOr[String | Null] = js.native
  
  /* protected */ def getCscPassword(): String = js.native
  
  def getDefaultFrameworkIcon(): String | Null = js.native
  
  def getElectronDestinationDir(appOutDir: String): String = js.native
  
  def getElectronSrcDir(dist: String): String = js.native
  
  var getExtraFileMatchers: js.Any = js.native
  
  def getIconPath(): js.Promise[String | Null] = js.native
  
  def getMacOsResourcesDir(appOutDir: String): String = js.native
  
  /* protected */ def getOrConvertIcon(format: IconFormat): js.Promise[String | Null] = js.native
  
  def getResource(custom: js.UndefOr[scala.Nothing], names: String*): js.Promise[String | Null] = js.native
  def getResource(custom: String, names: String*): js.Promise[String | Null] = js.native
  def getResource(custom: Null, names: String*): js.Promise[String | Null] = js.native
  
  def getResourcesDir(appOutDir: String): String = js.native
  
  def getTempFile(suffix: String): js.Promise[String] = js.native
  
  val info: Packager = js.native
  
  def pack(outDir: String, arch: Arch, targets: js.Array[Target], taskManager: AsyncTaskManager): js.Promise[_] = js.native
  
  /* protected */ def packageInDistributableFormat(appOutDir: String, arch: Arch, targets: js.Array[Target], taskManager: AsyncTaskManager): Unit = js.native
  
  def packagerOptions: PackagerOptions = js.native
  
  val platform: Platform = js.native
  
  val platformSpecificBuildOptions: DC = js.native
  
  /* protected */ def prepareAppInfo(appInfo: AppInfo): AppInfo = js.native
  
  def projectDir: String = js.native
  
  def resolveIcon(sources: js.Array[String], fallbackSources: js.Array[String], outputFormat: IconFormat): js.Promise[js.Array[IconInfo]] = js.native
  
  def resourceList: js.Promise[js.Array[String]] = js.native
  
  var sanityCheckPackage: js.Any = js.native
  
  /* protected */ def signApp(packContext: AfterPackContext, isAsar: Boolean): js.Promise[_] = js.native
}
/* static members */
@JSImport("app-builder-lib/out/platformPackager", "PlatformPackager")
@js.native
object PlatformPackager extends js.Object {
  
  var buildAsyncTargets: js.Any = js.native
  
  var normalizePlatformSpecificBuildOptions: js.Any = js.native
}
