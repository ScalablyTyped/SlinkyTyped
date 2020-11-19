package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.coreMod.Target
import typingsSlinky.appBuilderLib.linuxPackagerMod.LinuxPackager
import typingsSlinky.appBuilderLib.linuxTargetHelperMod.LinuxTargetHelper
import typingsSlinky.appBuilderLib.snapOptionsMod.SnapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/snap", JSImport.Namespace)
@js.native
object snapMod extends js.Object {
  
  @js.native
  trait SnapTarget extends Target {
    
    var createDescriptor: js.Any = js.native
    
    val helper: js.Any = js.native
    
    var isElectronVersionGreaterOrEqualThen: js.Any = js.native
    
    var isUseTemplateApp: Boolean = js.native
    
    @JSName("options")
    val options_SnapTarget: SnapOptions = js.native
    
    val packager: js.Any = js.native
    
    var replaceDefault: js.Any = js.native
  }
  
  @js.native
  class default protected () extends SnapTarget {
    def this(name: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
}
