package typingsSlinky.appBuilderLib.packagerMod

import typingsSlinky.appBuilderLib.appInfoMod.AppInfo
import typingsSlinky.appBuilderLib.configurationMod.AfterPackContext
import typingsSlinky.appBuilderLib.configurationMod.Configuration
import typingsSlinky.appBuilderLib.coreMod.SourceRepositoryInfo
import typingsSlinky.appBuilderLib.frameworkMod.Framework
import typingsSlinky.appBuilderLib.metadataMod.Metadata
import typingsSlinky.appBuilderLib.mod.Platform
import typingsSlinky.appBuilderLib.mod.Target
import typingsSlinky.appBuilderLib.packageDependenciesMod.NodeModuleDirInfo
import typingsSlinky.appBuilderLib.packagerApiMod.ArtifactBuildStarted
import typingsSlinky.appBuilderLib.packagerApiMod.ArtifactCreated
import typingsSlinky.appBuilderLib.packagerApiMod.PackagerOptions
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.builderUtil.mod.DebugLogger
import typingsSlinky.builderUtil.mod.TmpDir
import typingsSlinky.builderUtilRuntime.mod.CancellationToken
import typingsSlinky.lazyVal.mod.Lazy
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/packager", "Packager")
@js.native
class Packager protected () extends js.Object {
  def this(options: PackagerOptions) = this()
  def this(options: PackagerOptions, cancellationToken: CancellationToken) = this()
  
  var _appDir: js.Any = js.native
  
  var _appInfo: AppInfo | Null = js.native
  
  def _build(configuration: Configuration, metadata: Metadata): js.Promise[BuildResult] = js.native
  def _build(
    configuration: Configuration,
    metadata: Metadata,
    devMetadata: Null,
    repositoryInfo: SourceRepositoryInfo
  ): js.Promise[BuildResult] = js.native
  def _build(configuration: Configuration, metadata: Metadata, devMetadata: Metadata): js.Promise[BuildResult] = js.native
  def _build(
    configuration: Configuration,
    metadata: Metadata,
    devMetadata: Metadata,
    repositoryInfo: SourceRepositoryInfo
  ): js.Promise[BuildResult] = js.native
  
  var _buildResourcesDir: js.Any = js.native
  
  var _configuration: js.Any = js.native
  
  var _devMetadata: js.Any = js.native
  
  var _framework: js.Any = js.native
  
  var _isPrepackedAppAsar: js.Any = js.native
  
  var _metadata: js.Any = js.native
  
  var _nodeModulesHandledExternally: js.Any = js.native
  
  var _repositoryInfo: js.Any = js.native
  
  def addAfterPackHandler(handler: js.Function1[/* context */ AfterPackContext, js.Promise[_] | Null]): Unit = js.native
  
  def afterPack(context: AfterPackContext): js.Promise[_] = js.native
  
  val afterPackHandlers: js.Any = js.native
  
  def appDir: String = js.native
  
  def appInfo: AppInfo = js.native
  
  def areNodeModulesHandledExternally: Boolean = js.native
  
  def artifactCreated(handler: js.Function1[/* event */ ArtifactCreated, Unit]): Packager = js.native
  
  def build(): js.Promise[BuildResult] = js.native
  
  def buildResourcesDir: String = js.native
  
  def callAppxManifestCreated(path: String): js.Promise[Unit] = js.native
  
  def callArtifactBuildCompleted(event: ArtifactCreated): js.Promise[Unit] = js.native
  
  def callArtifactBuildStarted(event: ArtifactBuildStarted): js.Promise[Unit] = js.native
  def callArtifactBuildStarted(event: ArtifactBuildStarted, logFields: js.Any): js.Promise[Unit] = js.native
  
  val cancellationToken: CancellationToken = js.native
  
  def config: Configuration = js.native
  
  var createHelper: js.Any = js.native
  
  val debugLogger: DebugLogger = js.native
  
  def devMetadata: Metadata | Null = js.native
  
  /**
    * Only for sub artifacts (update info), for main artifacts use `callArtifactBuildCompleted`.
    */
  def dispatchArtifactCreated(event: ArtifactCreated): Unit = js.native
  
  def disposeOnBuildFinish(disposer: js.Function0[js.Promise[Unit]]): Unit = js.native
  
  var doBuild: js.Any = js.native
  
  val eventEmitter: EventEmitter = js.native
  
  def framework: Framework = js.native
  
  def getNodeDependencyInfo(): Lazy[js.Array[NodeModuleDirInfo]] = js.native
  def getNodeDependencyInfo(platform: Platform): Lazy[js.Array[NodeModuleDirInfo]] = js.native
  
  var installAppDependencies: js.Any = js.native
  
  def isPrepackedAppAsar: Boolean = js.native
  
  var isTwoPackageJsonProjectLayoutUsed: Boolean = js.native
  
  def metadata: Metadata = js.native
  
  var nodeDependencyInfo: js.Any = js.native
  
  val options: PackagerOptions = js.native
  
  val projectDir: String = js.native
  
  var readProjectMetadataIfTwoPackageStructureOrPrepacked: js.Any = js.native
  
  def relativeBuildResourcesDirname: String = js.native
  
  def repositoryInfo: js.Promise[SourceRepositoryInfo | Null] = js.native
  
  def stageDirPathCustomizer(target: Target, packager: PlatformPackager[_], arch: Arch): String = js.native
  
  val tempDirManager: TmpDir = js.native
  
  val toDispose: js.Any = js.native
}
