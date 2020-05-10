package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionInstanceGroupManagersSetTargetPoolsRequest extends js.Object {
  /**
    * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool
    * entries. This field is optional.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the
    * instances in the managed instance group.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.native
}

object RegionInstanceGroupManagersSetTargetPoolsRequest {
  @scala.inline
  def apply(): RegionInstanceGroupManagersSetTargetPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersSetTargetPoolsRequest]
  }
  @scala.inline
  implicit class RegionInstanceGroupManagersSetTargetPoolsRequestOps[Self <: RegionInstanceGroupManagersSetTargetPoolsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPools(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPools")(js.undefined)
        ret
    }
  }
  
}

