package typingsSlinky.chrome.chrome.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisitItem extends js.Object {
  /** The unique identifier for the item. */
  var id: String = js.native
  /** The visit ID of the referrer. */
  var referringVisitId: String = js.native
  /** The transition type for this visit from its referrer. */
  var transition: String = js.native
  /** The unique identifier for this visit. */
  var visitId: String = js.native
  /** Optional. When this visit occurred, represented in milliseconds since the epoch. */
  var visitTime: js.UndefOr[Double] = js.native
}

object VisitItem {
  @scala.inline
  def apply(id: String, referringVisitId: String, transition: String, visitId: String): VisitItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referringVisitId = referringVisitId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visitId = visitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitItem]
  }
  @scala.inline
  implicit class VisitItemOps[Self <: VisitItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferringVisitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referringVisitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisitTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTime")(js.undefined)
        ret
    }
  }
  
}

