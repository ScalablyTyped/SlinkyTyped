package typingsSlinky.pulumiAws.outputMod.elasticloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancerAccessLogs extends js.Object {
  
  var bucket: String = js.native
  
  var bucketPrefix: String = js.native
  
  var enabled: Boolean = js.native
  
  var interval: Double = js.native
}
object GetLoadBalancerAccessLogs {
  
  @scala.inline
  def apply(bucket: String, bucketPrefix: String, enabled: Boolean, interval: Double): GetLoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], bucketPrefix = bucketPrefix.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerAccessLogs]
  }
  
  @scala.inline
  implicit class GetLoadBalancerAccessLogsOps[Self <: GetLoadBalancerAccessLogs] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefix(value: String): Self = this.set("bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
  }
}
