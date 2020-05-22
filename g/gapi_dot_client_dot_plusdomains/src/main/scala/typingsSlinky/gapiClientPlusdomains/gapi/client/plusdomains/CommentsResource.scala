package typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPlusdomains.anon.ActivityId
import typingsSlinky.gapiClientPlusdomains.anon.CommentId
import typingsSlinky.gapiClientPlusdomains.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: CommentId): Request[Comment]
  /** Create a new comment in reply to an activity. */
  def insert(request: ActivityId): Request[Comment]
  /** List all of the comments for an activity. */
  def list(request: MaxResults): Request[CommentFeed]
}

object CommentsResource {
  @scala.inline
  def apply(
    get: CommentId => Request[Comment],
    insert: ActivityId => Request[Comment],
    list: MaxResults => Request[CommentFeed]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CommentsResource]
  }
}

