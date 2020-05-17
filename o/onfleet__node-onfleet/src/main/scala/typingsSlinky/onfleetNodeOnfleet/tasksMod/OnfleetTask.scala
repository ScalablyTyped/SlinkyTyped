package typingsSlinky.onfleetNodeOnfleet.tasksMod

import typingsSlinky.onfleetNodeOnfleet.anon.Actions
import typingsSlinky.onfleetNodeOnfleet.anon.Checksum
import typingsSlinky.onfleetNodeOnfleet.anon.Organization
import typingsSlinky.onfleetNodeOnfleet.anon.RecipientName
import typingsSlinky.onfleetNodeOnfleet.destinationsMod.OnfleetDestination
import typingsSlinky.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typingsSlinky.onfleetNodeOnfleet.recipientsMod.OnfleetRecipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetTask extends js.Object {
  var completeAfter: Double = js.native
  var completeBefore: Double = js.native
  var completionDetails: Actions = js.native
  var container: Organization = js.native
  var creator: String = js.native
  var dependencies: js.Array[String] = js.native
  var destination: OnfleetDestination = js.native
  var didAutoAssign: Boolean = js.native
  var executor: String = js.native
  var feedback: js.Array[_] = js.native
  var id: String = js.native
  var identity: Checksum = js.native
  var merchant: String = js.native
  var metadata: js.Array[OnfleetMetadata] = js.native
  var notes: String = js.native
  var organization: String = js.native
  var overrides: RecipientName = js.native
  var pickupTask: Boolean = js.native
  var quantity: Double = js.native
  var recipients: js.Array[OnfleetRecipient] = js.native
  var serviceTime: Double = js.native
  var shortId: String = js.native
  var state: Double = js.native
  var timeCreated: Double = js.native
  var timeLastModified: Double = js.native
  var trackingURL: String = js.native
  var trackingViewed: Boolean = js.native
  var worker: String | Null = js.native
}

object OnfleetTask {
  @scala.inline
  def apply(
    completeAfter: Double,
    completeBefore: Double,
    completionDetails: Actions,
    container: Organization,
    creator: String,
    dependencies: js.Array[String],
    destination: OnfleetDestination,
    didAutoAssign: Boolean,
    executor: String,
    feedback: js.Array[_],
    id: String,
    identity: Checksum,
    merchant: String,
    metadata: js.Array[OnfleetMetadata],
    notes: String,
    organization: String,
    overrides: RecipientName,
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
  ): OnfleetTask = {
    val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetTask]
  }
  @scala.inline
  implicit class OnfleetTaskOps[Self <: OnfleetTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleteAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleteBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletionDetails(value: Actions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: Organization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: OnfleetDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDidAutoAssign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didAutoAssign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedback(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: Checksum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Array[OnfleetMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrides(value: RecipientName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickupTask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickupTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipients(value: js.Array[OnfleetRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLastModified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackingURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackingViewed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingViewed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(null)
        ret
    }
  }
  
}

