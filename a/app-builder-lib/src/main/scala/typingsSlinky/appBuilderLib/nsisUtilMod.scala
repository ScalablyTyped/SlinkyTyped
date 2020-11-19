package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.nsisTargetMod.NsisTarget
import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.builderUtilRuntime.updateInfoMod.PackageFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/nsis/nsisUtil", JSImport.Namespace)
@js.native
object nsisUtilMod extends js.Object {
  
  def NSIS_PATH(): js.Promise[String] = js.native
  
  val nsisTemplatesDir: String = js.native
  
  @js.native
  class AppPackageHelper protected () extends js.Object {
    def this(elevateHelper: CopyElevateHelper) = this()
    
    val archToFileInfo: js.Any = js.native
    
    val elevateHelper: js.Any = js.native
    
    def finishBuild(): js.Promise[_] = js.native
    
    val infoToIsDelete: js.Any = js.native
    
    def packArch(arch: Arch, target: NsisTarget): js.Promise[PackageFileInfo] = js.native
    
    /** @private */
    var refCount: Double = js.native
  }
  
  @js.native
  class CopyElevateHelper () extends js.Object {
    
    val copied: js.Any = js.native
    
    def copy(appOutDir: String, target: NsisTarget): js.Promise[_] = js.native
  }
  
  @js.native
  class UninstallerReader () extends js.Object
  /* static members */
  @js.native
  object UninstallerReader extends js.Object {
    
    def exec(installerPath: String, uninstallerPath: String): Unit = js.native
  }
}
