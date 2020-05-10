package typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Export asset request.
  */
@js.native
trait SchemaExportAssetsRequest extends js.Object {
  /**
    * A list of asset types of which to take a snapshot for. For example:
    * &quot;google.compute.Disk&quot;. If specified, only matching assets will
    * be returned. See [Introduction to Cloud Asset
    * Inventory](https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/overview)
    * for all supported asset types.
    */
  var assetTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Asset content type. If not specified, no content but the asset name will
    * be returned.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Required. Output configuration indicating where the results will be
    * output to. All results will be in newline delimited JSON format.
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.native
  /**
    * Timestamp to take an asset snapshot. This can only be set to a timestamp
    * between 2018-10-02 UTC (inclusive) and the current time. If not
    * specified, the current time will be used. Due to delays in resource data
    * collection and indexing, there is a volatile window during which running
    * the same query may get different results.
    */
  var readTime: js.UndefOr[String] = js.native
}

object SchemaExportAssetsRequest {
  @scala.inline
  def apply(): SchemaExportAssetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportAssetsRequest]
  }
  @scala.inline
  implicit class SchemaExportAssetsRequestOps[Self <: SchemaExportAssetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputConfig(value: SchemaOutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(js.undefined)
        ret
    }
  }
  
}

