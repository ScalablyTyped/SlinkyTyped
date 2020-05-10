package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing proposals.
  */
@js.native
trait SchemaListProposalsResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of proposals.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.native
}

object SchemaListProposalsResponse {
  @scala.inline
  def apply(): SchemaListProposalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProposalsResponse]
  }
  @scala.inline
  implicit class SchemaListProposalsResponseOps[Self <: SchemaListProposalsResponse] (val x: Self) extends AnyVal {
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
    def withProposals(value: js.Array[SchemaProposal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposals")(js.undefined)
        ret
    }
  }
  
}

