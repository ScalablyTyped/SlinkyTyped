package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultDebugInfo extends js.Object {
  
  /** General debug info formatted for display. */
  var formattedDebugInfo: js.UndefOr[String] = js.native
}
object ResultDebugInfo {
  
  @scala.inline
  def apply(): ResultDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultDebugInfo]
  }
  
  @scala.inline
  implicit class ResultDebugInfoOps[Self <: ResultDebugInfo] (val x: Self) extends AnyVal {
    
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
    def setFormattedDebugInfo(value: String): Self = this.set("formattedDebugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedDebugInfo: Self = this.set("formattedDebugInfo", js.undefined)
  }
}
