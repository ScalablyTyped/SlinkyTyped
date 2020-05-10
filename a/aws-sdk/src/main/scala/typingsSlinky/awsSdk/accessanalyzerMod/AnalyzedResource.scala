package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzedResource extends js.Object {
  /**
    * The actions that an external principal is granted permission to use by the policy that generated the finding.
    */
  var actions: js.UndefOr[ActionList] = js.native
  /**
    * The time at which the resource was analyzed.
    */
  var analyzedAt: js.Date = js.native
  /**
    * The time at which the finding was created.
    */
  var createdAt: js.Date = js.native
  /**
    * An error message.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Indicates whether the policy that generated the finding grants public access to the resource.
    */
  var isPublic: Boolean = js.native
  /**
    * The ARN of the resource that was analyzed.
    */
  var resourceArn: ResourceArn = js.native
  /**
    * The type of the resource that was analyzed.
    */
  var resourceType: ResourceType = js.native
  /**
    * Indicates how the access that generated the finding is granted.
    */
  var sharedVia: js.UndefOr[SharedViaList] = js.native
  /**
    * The current status of the finding generated from the analyzed resource.
    */
  var status: js.UndefOr[FindingStatus] = js.native
  /**
    * The time at which the finding was updated.
    */
  var updatedAt: js.Date = js.native
}

object AnalyzedResource {
  @scala.inline
  def apply(
    analyzedAt: js.Date,
    createdAt: js.Date,
    isPublic: Boolean,
    resourceArn: ResourceArn,
    resourceType: ResourceType,
    updatedAt: js.Date
  ): AnalyzedResource = {
    val __obj = js.Dynamic.literal(analyzedAt = analyzedAt.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedResource]
  }
  @scala.inline
  implicit class AnalyzedResourceOps[Self <: AnalyzedResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: ActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedVia(value: SharedViaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedVia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedVia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedVia")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: FindingStatus): Self = {
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
  }
  
}

