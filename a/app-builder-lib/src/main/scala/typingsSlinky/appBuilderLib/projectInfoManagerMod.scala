package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.packagerMod.Packager
import typingsSlinky.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectInfoManagerMod {
  
  @JSImport("app-builder-lib/out/remoteBuilder/ProjectInfoManager", "ProjectInfoManager")
  @js.native
  class ProjectInfoManager protected () extends StObject {
    def this(packager: Packager) = this()
    
    val infoFile: Lazy[String] = js.native
    
    val packager: Packager = js.native
    
    var saveConfigurationAndMetadata: js.Any = js.native
  }
}
