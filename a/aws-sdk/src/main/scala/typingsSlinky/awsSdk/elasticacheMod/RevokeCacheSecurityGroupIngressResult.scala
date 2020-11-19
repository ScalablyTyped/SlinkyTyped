package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeCacheSecurityGroupIngressResult extends js.Object {
  
  var CacheSecurityGroup: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.CacheSecurityGroup] = js.native
}
object RevokeCacheSecurityGroupIngressResult {
  
  @scala.inline
  def apply(): RevokeCacheSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeCacheSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit class RevokeCacheSecurityGroupIngressResultOps[Self <: RevokeCacheSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheSecurityGroup(value: CacheSecurityGroup): Self = this.set("CacheSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSecurityGroup: Self = this.set("CacheSecurityGroup", js.undefined)
  }
}
