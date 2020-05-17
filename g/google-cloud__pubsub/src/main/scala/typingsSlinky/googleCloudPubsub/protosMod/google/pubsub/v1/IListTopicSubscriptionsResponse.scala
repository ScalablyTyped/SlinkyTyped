package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListTopicSubscriptionsResponse. */
@js.native
trait IListTopicSubscriptionsResponse extends js.Object {
  /** ListTopicSubscriptionsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
  /** ListTopicSubscriptionsResponse subscriptions */
  var subscriptions: js.UndefOr[js.Array[String] | Null] = js.native
}

object IListTopicSubscriptionsResponse {
  @scala.inline
  def apply(): IListTopicSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicSubscriptionsResponse]
  }
  @scala.inline
  implicit class IListTopicSubscriptionsResponseOps[Self <: IListTopicSubscriptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(null)
        ret
    }
    @scala.inline
    def withSubscriptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(null)
        ret
    }
  }
  
}

