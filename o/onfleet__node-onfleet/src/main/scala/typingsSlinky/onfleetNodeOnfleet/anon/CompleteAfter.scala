package typingsSlinky.onfleetNodeOnfleet.anon

import typingsSlinky.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps
import typingsSlinky.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typingsSlinky.onfleetNodeOnfleet.recipientsMod.OnfleetRecipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteAfter extends js.Object {
  var completeAfter: js.UndefOr[Double] = js.native
  var completeBefore: js.UndefOr[Double] = js.native
  var destination: js.UndefOr[String | CreateDestinationProps] = js.native
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.native
  var notes: js.UndefOr[String] = js.native
  var pickupTask: js.UndefOr[Boolean] = js.native
  var recipients: js.UndefOr[OnfleetRecipient | js.Array[OnfleetRecipient]] = js.native
  var serviceTime: js.UndefOr[Double] = js.native
}

object CompleteAfter {
  @scala.inline
  def apply(): CompleteAfter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteAfter]
  }
  @scala.inline
  implicit class CompleteAfterOps[Self <: CompleteAfter] (val x: Self) extends AnyVal {
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
    def withDestination(value: String | CreateDestinationProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
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
    def withRecipients(value: OnfleetRecipient | js.Array[OnfleetRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceTime")(js.undefined)
        ret
    }
  }
  
}

