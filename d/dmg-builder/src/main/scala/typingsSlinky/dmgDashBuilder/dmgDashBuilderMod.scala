package typingsSlinky.dmgDashBuilder

import typingsSlinky.appDashBuilderDashLib.appDashBuilderDashLibMod.Target
import typingsSlinky.appDashBuilderDashLib.outMacPackagerMod.default
import typingsSlinky.appDashBuilderDashLib.outOptionsMacOptionsMod.DmgOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dmg-builder", JSImport.Namespace)
@js.native
object dmgDashBuilderMod extends js.Object {
  @js.native
  class DmgTarget protected () extends Target {
    def this(packager: default, outDir: String) = this()
    @JSName("options")
    val options_DmgTarget: DmgOptions = js.native
    val packager: js.Any = js.native
    var signDmg: js.Any = js.native
    def computeDmgOptions(): js.Promise[DmgOptions] = js.native
    def computeVolumeName(): String = js.native
    def computeVolumeName(custom: String): String = js.native
  }
  
}

