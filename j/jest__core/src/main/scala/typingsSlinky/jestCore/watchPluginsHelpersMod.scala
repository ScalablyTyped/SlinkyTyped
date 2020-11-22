package typingsSlinky.jestCore

import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestWatcher.typesMod.UsageData
import typingsSlinky.jestWatcher.typesMod.WatchPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/lib/watchPluginsHelpers", JSImport.Namespace)
@js.native
object watchPluginsHelpersMod extends js.Object {
  
  def filterInteractivePlugins(watchPlugins: js.Array[WatchPlugin], globalConfig: GlobalConfig): js.Array[WatchPlugin] = js.native
  
  def getSortedUsageRows(watchPlugins: js.Array[WatchPlugin], globalConfig: GlobalConfig): js.Array[UsageData] = js.native
}
