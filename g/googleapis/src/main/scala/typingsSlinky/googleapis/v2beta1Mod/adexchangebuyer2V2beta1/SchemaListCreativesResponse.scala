package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response for listing creatives.
  */
@js.native
trait SchemaListCreativesResponse extends js.Object {
  /**
    * The list of creatives.
    */
  var creatives: js.UndefOr[js.Array[SchemaCreative]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativesRequest.page_token field in the subsequent call to
    * `ListCreatives` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCreativesResponse {
  @scala.inline
  def apply(): SchemaListCreativesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCreativesResponse]
  }
  @scala.inline
  implicit class SchemaListCreativesResponseOps[Self <: SchemaListCreativesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatives(value: js.Array[SchemaCreative]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatives")(js.undefined)
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

