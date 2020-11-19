package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.packagerMod.Packager
import typingsSlinky.lazyVal.mod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/remoteBuilder/ProjectInfoManager", JSImport.Namespace)
@js.native
object projectInfoManagerMod extends js.Object {
  
  @js.native
  class ProjectInfoManager protected () extends js.Object {
    def this(packager: Packager) = this()
    
    val infoFile: Lazy[String] = js.native
    
    val packager: Packager = js.native
    
    var saveConfigurationAndMetadata: js.Any = js.native
  }
}
