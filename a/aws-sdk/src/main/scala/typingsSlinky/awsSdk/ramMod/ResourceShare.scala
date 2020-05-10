package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShare extends js.Object {
  /**
    * Indicates whether principals outside your AWS organization can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.native
  /**
    * The time when the resource share was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  /**
    * Indicates how the resource share was created. Possible values include:    CREATED_FROM_POLICY - Indicates that the resource share was created from an AWS Identity and Access Management (AWS IAM) policy attached to a resource. These resource shares are visible only to the AWS account that created it. They cannot be modified in AWS RAM.    PROMOTING_TO_STANDARD - The resource share is in the process of being promoted. For more information, see PromoteResourceShareCreatedFromPolicy.    STANDARD - Indicates that the resource share was created in AWS RAM using the console or APIs. These resource shares are visible to all principals. They can be modified in AWS RAM.  
    */
  var featureSet: js.UndefOr[ResourceShareFeatureSet] = js.native
  /**
    * The time when the resource share was last updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the resource share.
    */
  var owningAccountId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.native
  /**
    * The status of the resource share.
    */
  var status: js.UndefOr[ResourceShareStatus] = js.native
  /**
    * A message about the status of the resource share.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The tags for the resource share.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object ResourceShare {
  @scala.inline
  def apply(): ResourceShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShare]
  }
  @scala.inline
  implicit class ResourceShareOps[Self <: ResourceShare] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowExternalPrincipals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExternalPrincipals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExternalPrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExternalPrincipals")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureSet(value: ResourceShareFeatureSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureSet")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwningAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owningAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwningAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owningAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceShareArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShareArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ResourceShareStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

