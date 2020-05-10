package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withCacheSecurityGroup(value: CacheSecurityGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheSecurityGroup")(js.undefined)
        ret
    }
  }
  
}

