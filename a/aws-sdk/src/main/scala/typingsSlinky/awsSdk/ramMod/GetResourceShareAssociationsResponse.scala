package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceShareAssociationsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * Information about the associations.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.native
}

object GetResourceShareAssociationsResponse {
  @scala.inline
  def apply(): GetResourceShareAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceShareAssociationsResponse]
  }
  @scala.inline
  implicit class GetResourceShareAssociationsResponseOps[Self <: GetResourceShareAssociationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceShareAssociations(value: ResourceShareAssociationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShareAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareAssociations")(js.undefined)
        ret
    }
  }
  
}

