package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryRetrievalJobDescription extends js.Object {
  /**
    * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
    */
  var EndDate: js.UndefOr[DateTime] = js.native
  /**
    * The output format for the vault inventory list, which is set by the InitiateJob request when initiating a job to retrieve a vault inventory. Valid values are CSV and JSON.
    */
  var Format: js.UndefOr[String] = js.native
  /**
    * The maximum number of inventory items returned per vault inventory retrieval request. This limit is set when initiating the job with the a InitiateJob request. 
    */
  var Limit: js.UndefOr[String] = js.native
  /**
    * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new InitiateJob request to obtain additional inventory items. If there are no more inventory items, this value is null. For more information, see  Range Inventory Retrieval.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
    */
  var StartDate: js.UndefOr[DateTime] = js.native
}

object InventoryRetrievalJobDescription {
  @scala.inline
  def apply(): InventoryRetrievalJobDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryRetrievalJobDescription]
  }
  @scala.inline
  implicit class InventoryRetrievalJobDescriptionOps[Self <: InventoryRetrievalJobDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(js.undefined)
        ret
    }
  }
  
}

