package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.packagerMod.Packager
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.appBuilderLib.vmMod.VmManager
import typingsSlinky.appBuilderLib.winOptionsMod.RequestedExecutionLevel
import typingsSlinky.appBuilderLib.winOptionsMod.WindowsConfiguration
import typingsSlinky.appBuilderLib.windowsCodeSignMod.CertificateFromStoreInfo
import typingsSlinky.appBuilderLib.windowsCodeSignMod.CertificateInfo
import typingsSlinky.appBuilderLib.windowsCodeSignMod.FileCodeSigningInfo
import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object winPackagerMod {
  
  @JSImport("app-builder-lib/out/winPackager", "WinPackager")
  @js.native
  class WinPackager protected () extends PlatformPackager[WindowsConfiguration] {
    def this(info: Packager) = this()
    
    var _iconPath: js.Any = js.native
    
    val computedPublisherName: Lazy[js.Array[String] | Null] = js.native
    
    val cscInfo: Lazy[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.native
    
    var doSign: js.Any = js.native
    
    def isForceCodeSigningVerification: Boolean = js.native
    
    var isSignDlls: js.Any = js.native
    
    val lazyCertInfo: Lazy[CertificateInfo | Null] = js.native
    
    def sign(file: String): js.Promise[Unit] = js.native
    def sign(file: String, logMessagePrefix: String): js.Promise[Unit] = js.native
    
    def signAndEditResources(file: String, arch: Arch, outDir: String): js.Promise[Unit] = js.native
    def signAndEditResources(
      file: String,
      arch: Arch,
      outDir: String,
      internalName: js.UndefOr[scala.Nothing],
      requestedExecutionLevel: RequestedExecutionLevel
    ): js.Promise[Unit] = js.native
    def signAndEditResources(file: String, arch: Arch, outDir: String, internalName: String): js.Promise[Unit] = js.native
    def signAndEditResources(
      file: String,
      arch: Arch,
      outDir: String,
      internalName: String,
      requestedExecutionLevel: RequestedExecutionLevel
    ): js.Promise[Unit] = js.native
    def signAndEditResources(
      file: String,
      arch: Arch,
      outDir: String,
      internalName: Null,
      requestedExecutionLevel: RequestedExecutionLevel
    ): js.Promise[Unit] = js.native
    
    val vm: Lazy[VmManager] = js.native
  }
}
