package typingsSlinky.activexPowerpoint.anon

import typingsSlinky.activexPowerpoint.PowerPoint.PpProtectedViewCloseReason
import typingsSlinky.activexPowerpoint.PowerPoint.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectedViewCloseReason extends js.Object {
  
  var Cancel: Boolean = js.native
  
  val ProtViewWindow: ProtectedViewWindow = js.native
  
  val ProtectedViewCloseReason: PpProtectedViewCloseReason = js.native
}
object ProtectedViewCloseReason {
  
  @scala.inline
  def apply(
    Cancel: Boolean,
    ProtViewWindow: ProtectedViewWindow,
    ProtectedViewCloseReason: PpProtectedViewCloseReason
  ): ProtectedViewCloseReason = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any], ProtectedViewCloseReason = ProtectedViewCloseReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedViewCloseReason]
  }
  
  @scala.inline
  implicit class ProtectedViewCloseReasonOps[Self <: ProtectedViewCloseReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtViewWindow(value: ProtectedViewWindow): Self = this.set("ProtViewWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedViewCloseReason(value: PpProtectedViewCloseReason): Self = this.set("ProtectedViewCloseReason", value.asInstanceOf[js.Any])
  }
}
