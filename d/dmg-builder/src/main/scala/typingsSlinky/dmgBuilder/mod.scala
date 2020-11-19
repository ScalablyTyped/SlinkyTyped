package typingsSlinky.dmgBuilder

import typingsSlinky.appBuilderLib.macOptionsMod.DmgOptions
import typingsSlinky.appBuilderLib.macPackagerMod.default
import typingsSlinky.appBuilderLib.mod.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dmg-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class DmgTarget protected () extends Target {
    def this(packager: default, outDir: String) = this()
    
    def computeDmgOptions(): js.Promise[DmgOptions] = js.native
    
    def computeVolumeName(): String = js.native
    def computeVolumeName(custom: String): String = js.native
    
    @JSName("options")
    val options_DmgTarget: DmgOptions = js.native
    
    val packager: js.Any = js.native
    
    var signDmg: js.Any = js.native
  }
}
