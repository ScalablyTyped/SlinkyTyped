package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.nsisTargetMod.NsisTarget
import typingsSlinky.appBuilderLib.nsisUtilMod.AppPackageHelper
import typingsSlinky.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webInstallerTargetMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/WebInstallerTarget", "WebInstallerTarget")
  @js.native
  class WebInstallerTarget protected () extends NsisTarget {
    def this(packager: WinPackager, outDir: String, targetName: String, packageHelper: AppPackageHelper) = this()
  }
}
