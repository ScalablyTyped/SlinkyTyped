package typingsSlinky.onfleetNodeOnfleet.tasksMod

import typingsSlinky.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps
import typingsSlinky.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typingsSlinky.onfleetNodeOnfleet.recipientsMod.CreateRecipientProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTaskProps extends js.Object {
  var autoAssign: js.UndefOr[TaskAutoAssign] = js.native
  var capacity: js.UndefOr[Double] = js.native
  var completeAfter: js.UndefOr[Double] = js.native
  var completeBefore: js.UndefOr[Double] = js.native
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  var destination: String | CreateDestinationProps = js.native
  var executor: js.UndefOr[String] = js.native
  var merchant: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.native
  var notes: js.UndefOr[String] = js.native
  var pickupTask: js.UndefOr[Boolean] = js.native
  var quantity: js.UndefOr[Double] = js.native
  var recipientName: js.UndefOr[String] = js.native
  var recipientNotes: js.UndefOr[String] = js.native
  var recipientSkipSMSNotifications: js.UndefOr[Boolean] = js.native
  var recipients: js.Array[CreateRecipientProps | String] = js.native
  var requirements: js.UndefOr[TaskCompletionRequirements] = js.native
}

object CreateTaskProps {
  @scala.inline
  def apply(destination: String | CreateDestinationProps, recipients: js.Array[CreateRecipientProps | String]): CreateTaskProps = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskProps]
  }
  @scala.inline
  implicit class CreateTaskPropsOps[Self <: CreateTaskProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: String | CreateDestinationProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipients(value: js.Array[CreateRecipientProps | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoAssign(value: TaskAutoAssign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAssign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAssign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAssign")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executor")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Array[OnfleetMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withPickupTask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickupTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickupTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickupTask")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientName")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientSkipSMSNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSkipSMSNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientSkipSMSNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSkipSMSNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirements(value: TaskCompletionRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(js.undefined)
        ret
    }
  }
  
}

