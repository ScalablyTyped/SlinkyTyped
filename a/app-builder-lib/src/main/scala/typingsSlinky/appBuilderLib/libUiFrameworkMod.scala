package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.configurationMod.AfterPackContext
import typingsSlinky.appBuilderLib.coreMod.Platform
import typingsSlinky.appBuilderLib.frameworkMod.Framework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/frameworks/LibUiFramework", JSImport.Namespace)
@js.native
object libUiFrameworkMod extends js.Object {
  
  @js.native
  class LibUiFramework protected () extends Framework {
    def this(version: String, distMacOsAppName: String, isUseLaunchUi: Boolean) = this()
    
    @JSName("afterPack")
    def afterPack_MLibUiFramework(context: AfterPackContext): js.Promise[Unit] = js.native
    
    @JSName("getExcludedDependencies")
    def getExcludedDependencies_MLibUiFramework(platform: Platform): js.Array[String] | Null = js.native
    
    @JSName("getMainFile")
    def getMainFile_MLibUiFramework(platform: Platform): String | Null = js.native
    
    val isUseLaunchUi: Boolean = js.native
    
    var isUseLaunchUiForPlatform: js.Any = js.native
    
    var prepareLinuxApplicationStageDirectory: js.Any = js.native
    
    var prepareMacosApplicationStageDirectory: js.Any = js.native
  }
}
