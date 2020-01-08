package typingsSlinky.appDashBuilderDashLib

import typingsSlinky.appDashBuilderDashLib.appDashBuilderDashLibStrings.default_
import typingsSlinky.appDashBuilderDashLib.appDashBuilderDashLibStrings.dir
import typingsSlinky.appDashBuilderDashLib.outForgeDashMakerMod.ForgeOptions
import typingsSlinky.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typingsSlinky.appDashBuilderDashLib.outPackagerApiMod.PackagerOptions
import typingsSlinky.builderDashUtil.outArchMod.Arch
import typingsSlinky.electronDashPublish.electronDashPublishMod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib", JSImport.Namespace)
@js.native
object appDashBuilderDashLibMod extends js.Object {
  @js.native
  class AppInfo protected ()
    extends typingsSlinky.appDashBuilderDashLib.outAppInfoMod.AppInfo {
    def this(info: typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager) = this()
    def this(info: typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager, buildVersion: String) = this()
    def this(
      info: typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager,
      buildVersion: js.UndefOr[scala.Nothing],
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager,
      buildVersion: String,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager,
      buildVersion: Null,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
  }
  
  @js.native
  class CancellationToken ()
    extends typingsSlinky.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken {
    def this(parent: typingsSlinky.builderDashUtilDashRuntime.outCancellationTokenMod.CancellationToken) = this()
  }
  
  @js.native
  class Packager protected ()
    extends typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager {
    def this(options: PackagerOptions) = this()
    def this(
      options: PackagerOptions,
      cancellationToken: typingsSlinky.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken
    ) = this()
  }
  
  @js.native
  class Platform protected ()
    extends typingsSlinky.appDashBuilderDashLib.outCoreMod.Platform {
    def this(name: String, buildConfigurationKey: String, nodeName: typingsSlinky.node.NodeJS.Platform) = this()
  }
  
  @js.native
  abstract class PlatformPackager[DC /* <: PlatformSpecificBuildOptions */] protected ()
    extends typingsSlinky.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager[DC] {
    protected def this(info: Packager, platform: Platform) = this()
  }
  
  @js.native
  class PublishManager protected ()
    extends typingsSlinky.appDashBuilderDashLib.outPublishPublishManagerMod.PublishManager {
    def this(
      packager: typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager,
      publishOptions: PublishOptions
    ) = this()
    def this(
      packager: typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager,
      publishOptions: PublishOptions,
      cancellationToken: typingsSlinky.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken
    ) = this()
  }
  
  @js.native
  abstract class Target protected ()
    extends typingsSlinky.appDashBuilderDashLib.outCoreMod.Target {
    protected def this(name: String) = this()
    protected def this(name: String, isAsyncSupported: Boolean) = this()
  }
  
  val DEFAULT_TARGET: default_ = js.native
  val DIR_TARGET: dir = js.native
  def archFromString(name: String): Arch = js.native
  def build(options: PackagerOptions with PublishOptions): js.Promise[js.Array[String]] = js.native
  def build(
    options: PackagerOptions with PublishOptions,
    packager: typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager
  ): js.Promise[js.Array[String]] = js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  def checkBuildRequestOptions(options: PackagerOptions with PublishOptions): Unit = js.native
  def getArchSuffix(arch: Arch): String = js.native
  @js.native
  object Arch extends js.Object {
    /* 3 */ val arm64: typingsSlinky.builderDashUtil.outArchMod.Arch.arm64 with Double = js.native
    /* 2 */ val armv7l: typingsSlinky.builderDashUtil.outArchMod.Arch.armv7l with Double = js.native
    /* 0 */ val ia32: typingsSlinky.builderDashUtil.outArchMod.Arch.ia32 with Double = js.native
    /* 1 */ val x64: typingsSlinky.builderDashUtil.outArchMod.Arch.x64 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.builderDashUtil.outArchMod.Arch with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Platform extends js.Object {
    var LINUX: typingsSlinky.appDashBuilderDashLib.outCoreMod.Platform = js.native
    var MAC: typingsSlinky.appDashBuilderDashLib.outCoreMod.Platform = js.native
    var WINDOWS: typingsSlinky.appDashBuilderDashLib.outCoreMod.Platform = js.native
    def current(): typingsSlinky.appDashBuilderDashLib.outCoreMod.Platform = js.native
    def fromString(name: String): typingsSlinky.appDashBuilderDashLib.outCoreMod.Platform = js.native
  }
  
  /* static members */
  @js.native
  object PlatformPackager extends js.Object {
    var buildAsyncTargets: js.Any = js.native
    var normalizePlatformSpecificBuildOptions: js.Any = js.native
  }
  
}

