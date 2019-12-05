package typingsSlinky.appDashBuilderDashLib

import typingsSlinky.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod.CertificateFromStoreInfo
import typingsSlinky.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod.CertificateInfo
import typingsSlinky.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod.FileCodeSigningInfo
import typingsSlinky.appDashBuilderDashLib.outOptionsWinOptionsMod.RequestedExecutionLevel
import typingsSlinky.appDashBuilderDashLib.outOptionsWinOptionsMod.WindowsConfiguration
import typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager
import typingsSlinky.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typingsSlinky.appDashBuilderDashLib.outVmVmMod.VmManager
import typingsSlinky.builderDashUtil.outArchMod.Arch
import typingsSlinky.lazyDashVal.lazyDashValMod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/winPackager", JSImport.Namespace)
@js.native
object outWinPackagerMod extends js.Object {
  @js.native
  class WinPackager protected () extends PlatformPackager[WindowsConfiguration] {
    def this(info: Packager) = this()
    var _iconPath: js.Any = js.native
    val computedPublisherName: Lazy[js.Array[String] | Null] = js.native
    val cscInfo: Lazy[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.native
    var doSign: js.Any = js.native
    val isForceCodeSigningVerification: Boolean = js.native
    var isSignDlls: js.Any = js.native
    val lazyCertInfo: Lazy[CertificateInfo | Null] = js.native
    val vm: Lazy[VmManager] = js.native
    def sign(file: String): js.Promise[Unit] = js.native
    def sign(file: String, logMessagePrefix: String): js.Promise[Unit] = js.native
    def signAndEditResources(file: String, arch: Arch, outDir: String): js.Promise[Unit] = js.native
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
  }
  
}

