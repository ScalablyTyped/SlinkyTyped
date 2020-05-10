package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionContentDetails extends js.Object {
  /** The type of activity this subscription is for (only uploads, everything). */
  var activityType: js.UndefOr[String] = js.native
  /** The number of new items in the subscription since its content was last read. */
  var newItemCount: js.UndefOr[Double] = js.native
  /** The approximate number of items that the subscription points to. */
  var totalItemCount: js.UndefOr[Double] = js.native
}

object SubscriptionContentDetails {
  @scala.inline
  def apply(): SubscriptionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionContentDetails]
  }
  @scala.inline
  implicit class SubscriptionContentDetailsOps[Self <: SubscriptionContentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(js.undefined)
        ret
    }
    @scala.inline
    def withNewItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemCount")(js.undefined)
        ret
    }
  }
  
}

