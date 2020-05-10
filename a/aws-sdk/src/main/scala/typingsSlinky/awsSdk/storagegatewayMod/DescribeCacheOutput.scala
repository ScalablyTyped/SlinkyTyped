package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCacheOutput extends js.Object {
  /**
    * The amount of cache in bytes allocated to the a gateway.
    */
  var CacheAllocatedInBytes: js.UndefOr[long] = js.native
  /**
    * The file share's contribution to the overall percentage of the gateway's cache that has not been persisted to AWS. The sample is taken at the end of the reporting period.
    */
  var CacheDirtyPercentage: js.UndefOr[double] = js.native
  /**
    * Percent of application read operations from the file shares that are served from cache. The sample is taken at the end of the reporting period.
    */
  var CacheHitPercentage: js.UndefOr[double] = js.native
  /**
    * Percent of application read operations from the file shares that are not served from cache. The sample is taken at the end of the reporting period.
    */
  var CacheMissPercentage: js.UndefOr[double] = js.native
  /**
    * Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup. The sample is taken at the end of the reporting period.
    */
  var CacheUsedPercentage: js.UndefOr[double] = js.native
  /**
    * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
    */
  var DiskIds: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DiskIds] = js.native
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object DescribeCacheOutput {
  @scala.inline
  def apply(): DescribeCacheOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCacheOutput]
  }
  @scala.inline
  implicit class DescribeCacheOutputOps[Self <: DescribeCacheOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheAllocatedInBytes(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheAllocatedInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheAllocatedInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheAllocatedInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheDirtyPercentage(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheDirtyPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheDirtyPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheDirtyPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheHitPercentage(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheHitPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheHitPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheHitPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheMissPercentage(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheMissPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheMissPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheMissPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheUsedPercentage(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheUsedPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheUsedPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheUsedPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskIds(value: DiskIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskIds")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(js.undefined)
        ret
    }
  }
  
}

