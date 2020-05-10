package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutube.AnonAlt
import typingsSlinky.gapiClientYoutube.AnonBanAuthor
import typingsSlinky.gapiClientYoutube.AnonMaxResults
import typingsSlinky.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Deletes a comment. */
  def delete(request: AnonQuotaUser): Request_[Unit] = js.native
  /** Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method. */
  def insert(request: AnonAlt): Request_[Comment] = js.native
  /** Returns a list of comments that match the API request parameters. */
  def list(request: AnonMaxResults): Request_[CommentListResponse] = js.native
  /** Expresses the caller's opinion that one or more comments should be flagged as spam. */
  def markAsSpam(request: AnonQuotaUser): Request_[Unit] = js.native
  /**
    * Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the
    * comments.
    */
  def setModerationStatus(request: AnonBanAuthor): Request_[Unit] = js.native
  /** Modifies a comment. */
  def update(request: AnonAlt): Request_[Comment] = js.native
}

object CommentsResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => Request_[Unit],
    insert: AnonAlt => Request_[Comment],
    list: AnonMaxResults => Request_[CommentListResponse],
    markAsSpam: AnonQuotaUser => Request_[Unit],
    setModerationStatus: AnonBanAuthor => Request_[Unit],
    update: AnonAlt => Request_[Comment]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), markAsSpam = js.Any.fromFunction1(markAsSpam), setModerationStatus = js.Any.fromFunction1(setModerationStatus), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CommentsResource]
  }
  @scala.inline
  implicit class CommentsResourceOps[Self <: CommentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonQuotaUser => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAlt => Request_[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[CommentListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarkAsSpam(value: AnonQuotaUser => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsSpam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetModerationStatus(value: AnonBanAuthor => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModerationStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAlt => Request_[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

