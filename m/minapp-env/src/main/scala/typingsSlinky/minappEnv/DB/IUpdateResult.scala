package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.IAPISuccessParam
import typingsSlinky.minappEnv.anon.Updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUpdateResult extends IAPISuccessParam {
  
  var stats: Updated = js.native
}
object IUpdateResult {
  
  @scala.inline
  def apply(errMsg: String, stats: Updated): IUpdateResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateResult]
  }
  
  @scala.inline
  implicit class IUpdateResultOps[Self <: IUpdateResult] (val x: Self) extends AnyVal {
    
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
    def setStats(value: Updated): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
}
