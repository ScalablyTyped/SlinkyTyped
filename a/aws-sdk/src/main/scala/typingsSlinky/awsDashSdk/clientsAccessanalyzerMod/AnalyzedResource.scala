package typingsSlinky.awsDashSdk.clientsAccessanalyzerMod

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
    updatedAt: js.Date,
    actions: ActionList = null,
    error: String = null,
    sharedVia: SharedViaList = null,
    status: FindingStatus = null
  ): AnalyzedResource = {
    val __obj = js.Dynamic.literal(analyzedAt = analyzedAt.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (sharedVia != null) __obj.updateDynamic("sharedVia")(sharedVia.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedResource]
  }
}

