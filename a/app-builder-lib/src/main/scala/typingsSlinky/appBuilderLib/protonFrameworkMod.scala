package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.coreMod.Platform
import typingsSlinky.appBuilderLib.libUiFrameworkMod.LibUiFramework
import typingsSlinky.builderUtil.fsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/ProtonFramework", JSImport.Namespace)
@js.native
object protonFrameworkMod extends js.Object {
  
  @js.native
  class ProtonFramework protected () extends LibUiFramework {
    def this(version: String, distMacOsAppName: String, isUseLaunchUi: Boolean) = this()
    
    @JSName("createTransformer")
    def createTransformer_MProtonFramework(): FileTransformer | Null = js.native
    
    @JSName("getDefaultIcon")
    def getDefaultIcon_MProtonFramework(platform: Platform): String = js.native
  }
}
