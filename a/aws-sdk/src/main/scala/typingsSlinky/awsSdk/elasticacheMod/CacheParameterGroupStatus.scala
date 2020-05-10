package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheParameterGroupStatus extends js.Object {
  /**
    * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeIdsToReboot: js.UndefOr[CacheNodeIdsList] = js.native
  /**
    * The name of the cache parameter group.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
}

object CacheParameterGroupStatus {
  @scala.inline
  def apply(): CacheParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroupStatus]
  }
  @scala.inline
  implicit class CacheParameterGroupStatusOps[Self <: CacheParameterGroupStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheNodeIdsToReboot(value: CacheNodeIdsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeIdsToReboot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeIdsToReboot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeIdsToReboot")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheParameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterApplyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterApplyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterApplyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterApplyStatus")(js.undefined)
        ret
    }
  }
  
}

