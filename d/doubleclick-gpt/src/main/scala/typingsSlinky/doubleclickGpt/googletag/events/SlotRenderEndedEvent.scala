package typingsSlinky.doubleclickGpt.googletag.events

import typingsSlinky.doubleclickGpt.googletag.Slot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotRenderEndedEvent extends Event {
  var advertiserId: js.UndefOr[Double] = js.native
  var creativeId: js.UndefOr[Double] = js.native
  var isEmpty: Boolean = js.native
  var lineItemId: js.UndefOr[Double] = js.native
  var size: js.Array[Double] | String = js.native
  var sourceAgnosticCreativeId: js.UndefOr[Double] = js.native
  var sourceAgnosticLineItemId: js.UndefOr[Double] = js.native
}

object SlotRenderEndedEvent {
  @scala.inline
  def apply(isEmpty: Boolean, serviceName: String, size: js.Array[Double] | String, slot: Slot): SlotRenderEndedEvent = {
    val __obj = js.Dynamic.literal(isEmpty = isEmpty.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotRenderEndedEvent]
  }
  @scala.inline
  implicit class SlotRenderEndedEventOps[Self <: SlotRenderEndedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvertiserId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAgnosticCreativeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAgnosticCreativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAgnosticCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAgnosticCreativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAgnosticLineItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAgnosticLineItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAgnosticLineItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAgnosticLineItemId")(js.undefined)
        ret
    }
  }
  
}

