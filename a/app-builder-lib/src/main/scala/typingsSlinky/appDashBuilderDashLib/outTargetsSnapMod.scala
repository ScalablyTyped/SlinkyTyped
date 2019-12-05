package typingsSlinky.appDashBuilderDashLib

import typingsSlinky.appDashBuilderDashLib.outCoreMod.Target
import typingsSlinky.appDashBuilderDashLib.outLinuxPackagerMod.LinuxPackager
import typingsSlinky.appDashBuilderDashLib.outOptionsSnapOptionsMod.SnapOptions
import typingsSlinky.appDashBuilderDashLib.outTargetsLinuxTargetHelperMod.LinuxTargetHelper
import typingsSlinky.appDashBuilderDashLib.outTargetsSnapMod.SnapTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/snap", JSImport.Namespace)
@js.native
object outTargetsSnapMod extends js.Object {
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

