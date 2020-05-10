package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPendingEventOrdering extends js.Object {
  // Optional. The token which a data store can use to remember the state of the room. What this means is dependent on the store implementation.
  var pendingEventOrdering: js.UndefOr[String] = js.native
  var storageToken: js.UndefOr[js.Any] = js.native
  // <optional> Controls where pending messages appear in a room's timeline. If "chronological", messages will appear in the timeline
  var timelineSupport: js.UndefOr[Boolean] = js.native
  // <optional> false Set to true to enable improved timeline support.
  var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.native
}

object AnonPendingEventOrdering {
  @scala.inline
  def apply(): AnonPendingEventOrdering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPendingEventOrdering]
  }
  @scala.inline
  implicit class AnonPendingEventOrderingOps[Self <: AnonPendingEventOrdering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPendingEventOrdering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingEventOrdering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingEventOrdering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingEventOrdering")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTimelineSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimelineSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withUnstableClientRelationAggregation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstableClientRelationAggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnstableClientRelationAggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstableClientRelationAggregation")(js.undefined)
        ret
    }
  }
  
}

