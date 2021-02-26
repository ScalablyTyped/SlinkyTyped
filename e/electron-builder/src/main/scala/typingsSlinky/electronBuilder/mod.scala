package typingsSlinky.electronBuilder

import typingsSlinky.appBuilderLib.forgeMakerMod.ForgeOptions
import typingsSlinky.appBuilderLib.packagerApiMod.PackagerOptions
import typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.electronBuilder.builderMod.CliOptions
import typingsSlinky.electronPublish.mod.PublishOptions
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-builder", "AppInfo")
  @js.native
  class AppInfo protected ()
    extends typingsSlinky.appBuilderLib.mod.AppInfo {
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
  
  @JSImport("electron-builder", "Arch")
  @js.native
  object Arch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.builderUtil.archMod.Arch with Double] = js.native
    
    /* 3 */ val arm64: typingsSlinky.builderUtil.archMod.Arch.arm64 with Double = js.native
    
    /* 2 */ val armv7l: typingsSlinky.builderUtil.archMod.Arch.armv7l with Double = js.native
    
    /* 0 */ val ia32: typingsSlinky.builderUtil.archMod.Arch.ia32 with Double = js.native
    
    /* 1 */ val x64: typingsSlinky.builderUtil.archMod.Arch.x64 with Double = js.native
  }
  
  @JSImport("electron-builder", "CancellationToken")
  @js.native
  class CancellationToken ()
    extends typingsSlinky.builderUtilRuntime.mod.CancellationToken {
    def this(parent: typingsSlinky.builderUtilRuntime.cancellationTokenMod.CancellationToken) = this()
  }
  
  @JSImport("electron-builder", "DEFAULT_TARGET")
  @js.native
  val DEFAULT_TARGET: /* "default" */ String = js.native
  
  @JSImport("electron-builder", "DIR_TARGET")
  @js.native
  val DIR_TARGET: /* "dir" */ String = js.native
  
  @JSImport("electron-builder", "Packager")
  @js.native
  class Packager protected ()
    extends typingsSlinky.appBuilderLib.mod.Packager {
    def this(options: PackagerOptions) = this()
    def this(
      options: PackagerOptions,
      cancellationToken: typingsSlinky.builderUtilRuntime.mod.CancellationToken
    ) = this()
  }
  
  @JSImport("electron-builder", "Platform")
  @js.native
  class Platform protected ()
    extends typingsSlinky.appBuilderLib.mod.Platform {
    def this(
      name: String,
      buildConfigurationKey: String,
      nodeName: typingsSlinky.node.processMod.global.NodeJS.Platform
    ) = this()
  }
  /* static members */
  object Platform {
    
    @JSImport("electron-builder", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("electron-builder", "Platform.LINUX")
    @js.native
    def LINUX: typingsSlinky.appBuilderLib.coreMod.Platform = js.native
    @scala.inline
    def LINUX_=(x: typingsSlinky.appBuilderLib.coreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSImport("electron-builder", "Platform.MAC")
    @js.native
    def MAC: typingsSlinky.appBuilderLib.coreMod.Platform = js.native
    @scala.inline
    def MAC_=(x: typingsSlinky.appBuilderLib.coreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAC")(x.asInstanceOf[js.Any])
    
    @JSImport("electron-builder", "Platform.WINDOWS")
    @js.native
    def WINDOWS: typingsSlinky.appBuilderLib.coreMod.Platform = js.native
    @scala.inline
    def WINDOWS_=(x: typingsSlinky.appBuilderLib.coreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS")(x.asInstanceOf[js.Any])
    
    @JSImport("electron-builder", "Platform.current")
    @js.native
    def current(): typingsSlinky.appBuilderLib.coreMod.Platform = js.native
    
    @JSImport("electron-builder", "Platform.fromString")
    @js.native
    def fromString(name: String): typingsSlinky.appBuilderLib.coreMod.Platform = js.native
  }
  
  @JSImport("electron-builder", "PublishManager")
  @js.native
  class PublishManager protected ()
    extends typingsSlinky.appBuilderLib.mod.PublishManager {
    def this(packager: typingsSlinky.appBuilderLib.packagerMod.Packager, publishOptions: PublishOptions) = this()
    def this(
      packager: typingsSlinky.appBuilderLib.packagerMod.Packager,
      publishOptions: PublishOptions,
      cancellationToken: typingsSlinky.builderUtilRuntime.mod.CancellationToken
    ) = this()
  }
  
  @JSImport("electron-builder", "Target")
  @js.native
  abstract class Target protected ()
    extends typingsSlinky.appBuilderLib.mod.Target {
    protected def this(name: String) = this()
    protected def this(name: String, isAsyncSupported: Boolean) = this()
  }
  
  @JSImport("electron-builder", "archFromString")
  @js.native
  def archFromString(name: String): Arch = js.native
  
  @JSImport("electron-builder", "build")
  @js.native
  def build(): js.Promise[js.Array[String]] = js.native
  @JSImport("electron-builder", "build")
  @js.native
  def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
  
  @JSImport("electron-builder", "buildForge")
  @js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  
  @JSImport("electron-builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[typingsSlinky.appBuilderLib.mod.Platform]): Map[typingsSlinky.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder", "createTargets")
  @js.native
  def createTargets(
    platforms: js.Array[typingsSlinky.appBuilderLib.mod.Platform],
    `type`: js.UndefOr[scala.Nothing],
    arch: String
  ): Map[typingsSlinky.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[typingsSlinky.appBuilderLib.mod.Platform], `type`: String): Map[typingsSlinky.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[typingsSlinky.appBuilderLib.mod.Platform], `type`: String, arch: String): Map[typingsSlinky.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  @JSImport("electron-builder", "createTargets")
  @js.native
  def createTargets(platforms: js.Array[typingsSlinky.appBuilderLib.mod.Platform], `type`: Null, arch: String): Map[typingsSlinky.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  
  @JSImport("electron-builder", "getArchSuffix")
  @js.native
  def getArchSuffix(arch: Arch): String = js.native
}
