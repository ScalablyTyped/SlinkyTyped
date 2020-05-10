package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response for listing creative and deal associations
  */
@js.native
trait SchemaListDealAssociationsResponse extends js.Object {
  /**
    * The list of associations.
    */
  var associations: js.UndefOr[js.Array[SchemaCreativeDealAssociation]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListDealAssociationsRequest.page_token field in the subsequent call to
    * &#39;ListDealAssociation&#39; method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDealAssociationsResponse {
  @scala.inline
  def apply(): SchemaListDealAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDealAssociationsResponse]
  }
  @scala.inline
  implicit class SchemaListDealAssociationsResponseOps[Self <: SchemaListDealAssociationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociations(value: js.Array[SchemaCreativeDealAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(js.undefined)
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

