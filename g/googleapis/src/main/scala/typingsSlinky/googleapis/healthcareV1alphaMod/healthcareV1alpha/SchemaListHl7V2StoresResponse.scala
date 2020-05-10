package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the HL7v2 stores in the given dataset.
  */
@js.native
trait SchemaListHl7V2StoresResponse extends js.Object {
  /**
    * The returned HL7v2 stores. Won&#39;t be more HL7v2 stores than the value
    * of page_size in the request.
    */
  var hl7V2Stores: js.UndefOr[js.Array[SchemaHl7V2Store]] = js.native
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListHl7V2StoresResponse {
  @scala.inline
  def apply(): SchemaListHl7V2StoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHl7V2StoresResponse]
  }
  @scala.inline
  implicit class SchemaListHl7V2StoresResponseOps[Self <: SchemaListHl7V2StoresResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHl7V2Stores(value: js.Array[SchemaHl7V2Store]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl7V2Stores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHl7V2Stores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl7V2Stores")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

