package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.coreMod.Target
import typingsSlinky.appBuilderLib.linuxOptionsMod.LinuxTargetSpecificOptions
import typingsSlinky.appBuilderLib.linuxPackagerMod.LinuxPackager
import typingsSlinky.appBuilderLib.linuxTargetHelperMod.LinuxTargetHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpmMod {
  
  @JSImport("app-builder-lib/out/targets/fpm", JSImport.Default)
  @js.native
  class default protected () extends FpmTarget {
    def this(name: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
  @js.native
  trait FpmTarget extends Target {
    
    var computeFpmMetaInfoOptions: js.Any = js.native
    
    var createScripts: js.Any = js.native
    
    val helper: js.Any = js.native
    
    @JSName("options")
    val options_FpmTarget: LinuxTargetSpecificOptions = js.native
    
    val packager: js.Any = js.native
    
    val scriptFiles: js.Any = js.native
  }
}
