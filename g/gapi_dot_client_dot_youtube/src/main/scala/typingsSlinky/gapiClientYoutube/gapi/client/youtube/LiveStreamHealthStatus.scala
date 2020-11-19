package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveStreamHealthStatus extends js.Object {
  
  /** The configurations issues on this stream */
  var configurationIssues: js.UndefOr[js.Array[LiveStreamConfigurationIssue]] = js.native
  
  /** The last time this status was updated (in seconds) */
  var lastUpdateTimeSeconds: js.UndefOr[String] = js.native
  
  /** The status code of this stream */
  var status: js.UndefOr[String] = js.native
}
object LiveStreamHealthStatus {
  
  @scala.inline
  def apply(): LiveStreamHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStreamHealthStatus]
  }
  
  @scala.inline
  implicit class LiveStreamHealthStatusOps[Self <: LiveStreamHealthStatus] (val x: Self) extends AnyVal {
    
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
    def setConfigurationIssuesVarargs(value: LiveStreamConfigurationIssue*): Self = this.set("configurationIssues", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationIssues(value: js.Array[LiveStreamConfigurationIssue]): Self = this.set("configurationIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationIssues: Self = this.set("configurationIssues", js.undefined)
    
    @scala.inline
    def setLastUpdateTimeSeconds(value: String): Self = this.set("lastUpdateTimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTimeSeconds: Self = this.set("lastUpdateTimeSeconds", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
