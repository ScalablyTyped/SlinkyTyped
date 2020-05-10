package typingsSlinky.gapiYoutube.gapi.client.youtube

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiYoutube.AnonForChannelId
import typingsSlinky.gapiYoutube.AnonId
import typingsSlinky.gapiYoutube.AnonPartRequestBody
import typingsSlinky.gapiYoutube.GoogleApiYouTubePaginationInfo
import typingsSlinky.gapiYoutube.GoogleApiYouTubeSubscriptionResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait subscriptions extends js.Object {
  /**
    * Deletes a subscription.
    */
  def delete(`object`: AnonId): HttpRequest[GoogleApiYouTubeSubscriptionResource] = js.native
  /**
    * Adds a subscription for the authenticated user's channel.
    */
  def insert(`object`: AnonPartRequestBody): HttpRequest[GoogleApiYouTubeSubscriptionResource] = js.native
  /**
    * Returns subscription resources that match the API request criteria.
    */
  def list(`object`: AnonForChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]] = js.native
}

object subscriptions {
  @scala.inline
  def apply(
    delete: AnonId => HttpRequest[GoogleApiYouTubeSubscriptionResource],
    insert: AnonPartRequestBody => HttpRequest[GoogleApiYouTubeSubscriptionResource],
    list: AnonForChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
  ): subscriptions = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[subscriptions]
  }
  @scala.inline
  implicit class subscriptionsOps[Self <: subscriptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonId => HttpRequest[GoogleApiYouTubeSubscriptionResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPartRequestBody => HttpRequest[GoogleApiYouTubeSubscriptionResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(
      value: AnonForChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

