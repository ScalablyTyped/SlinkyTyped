package typingsSlinky.appDashBuilderDashLib

import typingsSlinky.appDashBuilderDashLib.outCoreMod.Target
import typingsSlinky.appDashBuilderDashLib.outLinuxPackagerMod.LinuxPackager
import typingsSlinky.appDashBuilderDashLib.outOptionsLinuxOptionsMod.AppImageOptions
import typingsSlinky.appDashBuilderDashLib.outTargetsLinuxTargetHelperMod.LinuxTargetHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/AppImageTarget", JSImport.Namespace)
@js.native
object outTargetsAppImageTargetMod extends js.Object {
  @js.native
  trait AppImageTarget extends Target {
    val desktopEntry: js.Any = js.native
    val helper: js.Any = js.native
    @JSName("options")
    val options_AppImageTarget: AppImageOptions = js.native
    val packager: js.Any = js.native
  }
  
  @js.native
  class default protected () extends AppImageTarget {
    def this(ignored: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
}

