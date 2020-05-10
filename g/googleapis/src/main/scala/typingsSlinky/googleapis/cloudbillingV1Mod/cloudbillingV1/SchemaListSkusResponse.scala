package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for `ListSkus`.
  */
@js.native
trait SchemaListSkusResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListSkus` again with the `page_token` field set to this value. This
    * field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of public SKUs of the given service.
    */
  var skus: js.UndefOr[js.Array[SchemaSku]] = js.native
}

object SchemaListSkusResponse {
  @scala.inline
  def apply(): SchemaListSkusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSkusResponse]
  }
  @scala.inline
  implicit class SchemaListSkusResponseOps[Self <: SchemaListSkusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSkus(value: js.Array[SchemaSku]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skus")(js.undefined)
        ret
    }
  }
  
}

