package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.mod.AppInfo
import typingsSlinky.appBuilderLib.mod.Target
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/targetUtil", JSImport.Namespace)
@js.native
object targetUtilMod extends js.Object {
  
  def createStageDir(target: Target, packager: PlatformPackager[_], arch: Arch): js.Promise[StageDir] = js.native
  
  def createStageDirPath(target: Target, packager: PlatformPackager[_], arch: Arch): js.Promise[String] = js.native
  
  def getWindowsInstallationDirName(appInfo: AppInfo, isTryToUseProductName: Boolean): String = js.native
  
  @js.native
  class StageDir protected () extends js.Object {
    def this(dir: String) = this()
    
    def cleanup(): js.Promise[Unit] = js.native
    
    val dir: String = js.native
    
    def getTempFile(name: String): String = js.native
  }
}
