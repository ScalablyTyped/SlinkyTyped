package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceShareAssociationsRequest extends js.Object {
  /**
    * The association status.
    */
  var associationStatus: js.UndefOr[ResourceShareAssociationStatus] = js.native
  /**
    * The association type. Specify PRINCIPAL to list the principals that are associated with the specified resource share. Specify RESOURCE to list the resources that are associated with the specified resource share.
    */
  var associationType: ResourceShareAssociationType = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The principal. You cannot specify this parameter if the association type is RESOURCE.
    */
  var principal: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource. You cannot specify this parameter if the association type is PRINCIPAL.
    */
  var resourceArn: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.native
}

object GetResourceShareAssociationsRequest {
  @scala.inline
  def apply(associationType: ResourceShareAssociationType): GetResourceShareAssociationsRequest = {
    val __obj = js.Dynamic.literal(associationType = associationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareAssociationsRequest]
  }
  @scala.inline
  implicit class GetResourceShareAssociationsRequestOps[Self <: GetResourceShareAssociationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationType(value: ResourceShareAssociationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociationStatus(value: ResourceShareAssociationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
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
    def withPrincipal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceShareArns(value: ResourceShareArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShareArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareArns")(js.undefined)
        ret
    }
  }
  
}

