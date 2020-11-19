package typingsSlinky.appBuilderLib.windowsCodeSignMod

import typingsSlinky.appBuilderLib.vmMod.VmManager
import typingsSlinky.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/codeSign/windowsCodeSign", "getCertificateFromStoreInfo")
@js.native
object getCertificateFromStoreInfo extends js.Object {
  
  def apply(options: WindowsConfiguration, vm: VmManager): js.Promise[CertificateFromStoreInfo] = js.native
}
