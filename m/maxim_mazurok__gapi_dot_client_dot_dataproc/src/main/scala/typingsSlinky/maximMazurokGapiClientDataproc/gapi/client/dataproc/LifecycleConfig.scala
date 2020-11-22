package typingsSlinky.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleConfig extends js.Object {
  
  /** Optional. The time when cluster will be auto-deleted (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)). */
  var autoDeleteTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON
    * representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
    */
  var autoDeleteTtl: js.UndefOr[String] = js.native
  
  /**
    * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes;
    * maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json).
    */
  var idleDeleteTtl: js.UndefOr[String] = js.native
  
  /**
    * Output only. The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of Timestamp
    * (https://developers.google.com/protocol-buffers/docs/proto3#json)).
    */
  var idleStartTime: js.UndefOr[String] = js.native
}
object LifecycleConfig {
  
  @scala.inline
  def apply(): LifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleConfig]
  }
  
  @scala.inline
  implicit class LifecycleConfigOps[Self <: LifecycleConfig] (val x: Self) extends AnyVal {
    
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
    def setAutoDeleteTime(value: String): Self = this.set("autoDeleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDeleteTime: Self = this.set("autoDeleteTime", js.undefined)
    
    @scala.inline
    def setAutoDeleteTtl(value: String): Self = this.set("autoDeleteTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDeleteTtl: Self = this.set("autoDeleteTtl", js.undefined)
    
    @scala.inline
    def setIdleDeleteTtl(value: String): Self = this.set("idleDeleteTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleDeleteTtl: Self = this.set("idleDeleteTtl", js.undefined)
    
    @scala.inline
    def setIdleStartTime(value: String): Self = this.set("idleStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleStartTime: Self = this.set("idleStartTime", js.undefined)
  }
}
