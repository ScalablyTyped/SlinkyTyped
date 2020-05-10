package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonReviewId
import typingsSlinky.gapiClientAndroidpublisher.AnonToken
import typingsSlinky.gapiClientAndroidpublisher.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewsResource extends js.Object {
  /** Returns a single review. */
  def get(request: AnonReviewId): Request_[Review] = js.native
  /** Returns a list of reviews. Only reviews from last week will be returned. */
  def list(request: AnonToken): Request_[ReviewsListResponse] = js.native
  /** Reply to a single review, or update an existing reply. */
  def reply(request: AnonUserIp): Request_[ReviewsReplyResponse] = js.native
}

object ReviewsResource {
  @scala.inline
  def apply(
    get: AnonReviewId => Request_[Review],
    list: AnonToken => Request_[ReviewsListResponse],
    reply: AnonUserIp => Request_[ReviewsReplyResponse]
  ): ReviewsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reply = js.Any.fromFunction1(reply))
    __obj.asInstanceOf[ReviewsResource]
  }
  @scala.inline
  implicit class ReviewsResourceOps[Self <: ReviewsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonReviewId => Request_[Review]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonToken => Request_[ReviewsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReply(value: AnonUserIp => Request_[ReviewsReplyResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

