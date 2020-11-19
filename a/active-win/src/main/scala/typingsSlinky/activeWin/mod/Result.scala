package typingsSlinky.activeWin.mod

import typingsSlinky.activeWin.activeWinStrings.linux
import typingsSlinky.activeWin.activeWinStrings.macos
import typingsSlinky.activeWin.activeWinStrings.windows
import typingsSlinky.activeWin.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activeWin.mod.MacOSResult
  - typingsSlinky.activeWin.mod.LinuxResult
  - typingsSlinky.activeWin.mod.WindowsResult
*/
trait Result extends js.Object
object Result {
  
  @scala.inline
  def MacOSResult(bounds: Height, id: Double, memoryUsage: Double, owner: MacOSOwner, platform: macos, title: String): Result = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  def LinuxResult(bounds: Height, id: Double, memoryUsage: Double, owner: BaseOwner, platform: linux, title: String): Result = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  def WindowsResult(
    bounds: Height,
    id: Double,
    memoryUsage: Double,
    owner: BaseOwner,
    platform: windows,
    title: String
  ): Result = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}
