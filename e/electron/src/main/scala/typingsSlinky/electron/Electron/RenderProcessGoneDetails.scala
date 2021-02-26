package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.`abnormal-exit`
import typingsSlinky.electron.electronStrings.`clean-exit`
import typingsSlinky.electron.electronStrings.`integrity-failure`
import typingsSlinky.electron.electronStrings.`launch-failed`
import typingsSlinky.electron.electronStrings.crashed
import typingsSlinky.electron.electronStrings.killed
import typingsSlinky.electron.electronStrings.oom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderProcessGoneDetails extends StObject {
  
  /**
    * The reason the render process is gone.  Possible values:
    */
  var reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure` = js.native
}
object RenderProcessGoneDetails {
  
  @scala.inline
  def apply(
    reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
  ): RenderProcessGoneDetails = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProcessGoneDetails]
  }
  
  @scala.inline
  implicit class RenderProcessGoneDetailsMutableBuilder[Self <: RenderProcessGoneDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(
      value: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
