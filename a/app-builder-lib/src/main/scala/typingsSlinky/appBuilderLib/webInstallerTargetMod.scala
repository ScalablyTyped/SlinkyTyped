package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.nsisTargetMod.NsisTarget
import typingsSlinky.appBuilderLib.nsisUtilMod.AppPackageHelper
import typingsSlinky.appBuilderLib.winPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/nsis/WebInstallerTarget", JSImport.Namespace)
@js.native
object webInstallerTargetMod extends js.Object {
  
  @js.native
  class WebInstallerTarget protected () extends NsisTarget {
    def this(packager: WinPackager, outDir: String, targetName: String, packageHelper: AppPackageHelper) = this()
  }
}
