package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingModifiedValues extends js.Object {
  /**
    * The auth token status
    */
  var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus] = js.native
  /**
    * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.native
  /**
    * The cache node type that this cluster or replication group is scaled to.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * The new cache engine version that the cluster runs.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The new number of cache nodes for the cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.native
}

object PendingModifiedValues {
  @scala.inline
  def apply(): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedValues]
  }
  @scala.inline
  implicit class PendingModifiedValuesOps[Self <: PendingModifiedValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthTokenStatus(value: AuthTokenUpdateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthTokenStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthTokenStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthTokenStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNodeIdsToRemove(value: CacheNodeIdsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeIdsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeIdsToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeIdsToRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheNodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withNumCacheNodes(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumCacheNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumCacheNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumCacheNodes")(js.undefined)
        ret
    }
  }
  
}

