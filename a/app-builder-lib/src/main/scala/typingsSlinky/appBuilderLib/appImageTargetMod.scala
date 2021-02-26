package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.coreMod.Target
import typingsSlinky.appBuilderLib.linuxOptionsMod.AppImageOptions
import typingsSlinky.appBuilderLib.linuxPackagerMod.LinuxPackager
import typingsSlinky.appBuilderLib.linuxTargetHelperMod.LinuxTargetHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appImageTargetMod {
  
  @JSImport("app-builder-lib/out/targets/AppImageTarget", JSImport.Default)
  @js.native
  class default protected () extends AppImageTarget {
    def this(ignored: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
  @js.native
  trait AppImageTarget extends Target {
    
    val desktopEntry: js.Any = js.native
    
    val helper: js.Any = js.native
    
    @JSName("options")
    val options_AppImageTarget: AppImageOptions = js.native
    
    val packager: js.Any = js.native
  }
}
