package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadRequest extends js.Object {
  /** File types that will be returned. */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The IDs of the specified filter type. This is used to filter entities to fetch. At least one ID must be specified. Only one ID is allowed for the
    * ADVERTISER_ID filter type. For INSERTION_ORDER_ID or LINE_ITEM_ID filter types, all IDs must be from the same Advertiser.
    */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  /** Filter type used to filter line items to fetch. */
  var filterType: js.UndefOr[String] = js.native
  /** SDF Version (column names, types, order) in which the entities will be returned. Default to 3. */
  var version: js.UndefOr[String] = js.native
}

object DownloadRequest {
  @scala.inline
  def apply(): DownloadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadRequest]
  }
  @scala.inline
  implicit class DownloadRequestOps[Self <: DownloadRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIds")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

