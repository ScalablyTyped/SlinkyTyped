package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.coreMod.Target
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/ArchiveTarget", JSImport.Namespace)
@js.native
object archiveTargetMod extends js.Object {
  
  @js.native
  class ArchiveTarget protected () extends Target {
    def this(name: String, outDir: String, packager: PlatformPackager[_]) = this()
    def this(name: String, outDir: String, packager: PlatformPackager[_], isWriteUpdateInfo: Boolean) = this()
    
    val isWriteUpdateInfo: js.Any = js.native
    
    @JSName("options")
    val options_ArchiveTarget: TargetSpecificOptions = js.native
    
    val packager: js.Any = js.native
  }
}
