package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonReviewId
import typingsSlinky.gapiClientAndroidpublisher.AnonToken
import typingsSlinky.gapiClientAndroidpublisher.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsResource extends js.Object {
  /** Returns a single review. */
  def get(request: AnonReviewId): Request_[Review]
  /** Returns a list of reviews. Only reviews from last week will be returned. */
  def list(request: AnonToken): Request_[ReviewsListResponse]
  /** Reply to a single review, or update an existing reply. */
  def reply(request: AnonUserIp): Request_[ReviewsReplyResponse]
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
}

