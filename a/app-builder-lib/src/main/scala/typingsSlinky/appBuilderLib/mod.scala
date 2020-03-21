package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.appBuilderLibStrings.default_
import typingsSlinky.appBuilderLib.appBuilderLibStrings.dir
import typingsSlinky.appBuilderLib.forgeMakerMod.ForgeOptions
import typingsSlinky.appBuilderLib.packagerApiMod.PackagerOptions
import typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.electronPublish.mod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AppInfo protected ()
    extends typingsSlinky.appBuilderLib.appInfoMod.AppInfo {
    def this(info: typingsSlinky.appBuilderLib.packagerMod.Packager) = this()
    def this(info: typingsSlinky.appBuilderLib.packagerMod.Packager, buildVersion: String) = this()
    def this(
      info: typingsSlinky.appBuilderLib.packagerMod.Packager,
      buildVersion: js.UndefOr[scala.Nothing],
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typingsSlinky.appBuilderLib.packagerMod.Packager,
      buildVersion: String,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typingsSlinky.appBuilderLib.packagerMod.Packager,
      buildVersion: Null,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
  }
  
  @js.native
  class CancellationToken ()
    extends typingsSlinky.builderUtilRuntime.mod.CancellationToken {
    def this(parent: typingsSlinky.builderUtilRuntime.cancellationTokenMod.CancellationToken) = this()
  }
  
  @js.native
  class Packager protected ()
    extends typingsSlinky.appBuilderLib.packagerMod.Packager {
    def this(options: PackagerOptions) = this()
    def this(
      options: PackagerOptions,
      cancellationToken: typingsSlinky.builderUtilRuntime.mod.CancellationToken
    ) = this()
  }
  
  @js.native
  class Platform protected ()
    extends typingsSlinky.appBuilderLib.coreMod.Platform {
    def this(name: String, buildConfigurationKey: String, nodeName: typingsSlinky.node.NodeJS.Platform) = this()
  }
  
  @js.native
  abstract class PlatformPackager[DC /* <: PlatformSpecificBuildOptions */] protected ()
    extends typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager[DC] {
    protected def this(info: Packager, platform: Platform) = this()
  }
  
  @js.native
  class PublishManager protected ()
    extends typingsSlinky.appBuilderLib.publishManagerMod.PublishManager {
    def this(packager: typingsSlinky.appBuilderLib.packagerMod.Packager, publishOptions: PublishOptions) = this()
    def this(
      packager: typingsSlinky.appBuilderLib.packagerMod.Packager,
      publishOptions: PublishOptions,
      cancellationToken: typingsSlinky.builderUtilRuntime.mod.CancellationToken
    ) = this()
  }
  
  @js.native
  abstract class Target protected ()
    extends typingsSlinky.appBuilderLib.coreMod.Target {
    protected def this(name: String) = this()
    protected def this(name: String, isAsyncSupported: Boolean) = this()
  }
  
  val DEFAULT_TARGET: default_ = js.native
  val DIR_TARGET: dir = js.native
  def archFromString(name: String): Arch = js.native
  def build(options: PackagerOptions with PublishOptions): js.Promise[js.Array[String]] = js.native
  def build(
    options: PackagerOptions with PublishOptions,
    packager: typingsSlinky.appBuilderLib.packagerMod.Packager
  ): js.Promise[js.Array[String]] = js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  def checkBuildRequestOptions(options: PackagerOptions with PublishOptions): Unit = js.native
  def getArchSuffix(arch: Arch): String = js.native
  @js.native
  object Arch extends js.Object {
    /* 3 */ val arm64: typingsSlinky.builderUtil.archMod.Arch.arm64 with Double = js.native
    /* 2 */ val armv7l: typingsSlinky.builderUtil.archMod.Arch.armv7l with Double = js.native
    /* 0 */ val ia32: typingsSlinky.builderUtil.archMod.Arch.ia32 with Double = js.native
    /* 1 */ val x64: typingsSlinky.builderUtil.archMod.Arch.x64 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.builderUtil.archMod.Arch with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Platform extends js.Object {
    var LINUX: typingsSlinky.appBuilderLib.coreMod.Platform = js.native
    var MAC: typingsSlinky.appBuilderLib.coreMod.Platform = js.native
    var WINDOWS: typingsSlinky.appBuilderLib.coreMod.Platform = js.native
    def current(): typingsSlinky.appBuilderLib.coreMod.Platform = js.native
    def fromString(name: String): typingsSlinky.appBuilderLib.coreMod.Platform = js.native
  }
  
  /* static members */
  @js.native
  object PlatformPackager extends js.Object {
    var buildAsyncTargets: js.Any = js.native
    var normalizePlatformSpecificBuildOptions: js.Any = js.native
  }
  
}

