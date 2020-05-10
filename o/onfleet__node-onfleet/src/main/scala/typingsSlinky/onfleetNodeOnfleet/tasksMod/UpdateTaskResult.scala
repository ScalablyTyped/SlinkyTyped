package typingsSlinky.onfleetNodeOnfleet.tasksMod

import typingsSlinky.onfleetNodeOnfleet.AnonActions
import typingsSlinky.onfleetNodeOnfleet.AnonChecksum
import typingsSlinky.onfleetNodeOnfleet.AnonOrganization
import typingsSlinky.onfleetNodeOnfleet.AnonRecipientName
import typingsSlinky.onfleetNodeOnfleet.destinationsMod.OnfleetDestination
import typingsSlinky.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typingsSlinky.onfleetNodeOnfleet.recipientsMod.OnfleetRecipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTaskResult extends OnfleetTask {
  var estimatedArrivalTime: Double | Null = js.native
  var estimatedCompletionTime: Double | Null = js.native
  var eta: Double = js.native
}

object UpdateTaskResult {
  @scala.inline
  def apply(
    completeAfter: Double,
    completeBefore: Double,
    completionDetails: AnonActions,
    container: AnonOrganization,
    creator: String,
    dependencies: js.Array[String],
    destination: OnfleetDestination,
    didAutoAssign: Boolean,
    eta: Double,
    executor: String,
    feedback: js.Array[_],
    id: String,
    identity: AnonChecksum,
    merchant: String,
    metadata: js.Array[OnfleetMetadata],
    notes: String,
    organization: String,
    overrides: AnonRecipientName,
    pickupTask: Boolean,
    quantity: Double,
    recipients: js.Array[OnfleetRecipient],
    serviceTime: Double,
    shortId: String,
    state: Double,
    timeCreated: Double,
    timeLastModified: Double,
    trackingURL: String,
    trackingViewed: Boolean
  ): UpdateTaskResult = {
    val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskResult]
  }
  @scala.inline
  implicit class UpdateTaskResultOps[Self <: UpdateTaskResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedArrivalTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedArrivalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedArrivalTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedArrivalTime")(null)
        ret
    }
    @scala.inline
    def withEstimatedCompletionTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedCompletionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedCompletionTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedCompletionTime")(null)
        ret
    }
  }
  
}

