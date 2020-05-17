package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.Alt
import typingsSlinky.gapiClientYoutube.anon.BanAuthor
import typingsSlinky.gapiClientYoutube.anon.MaxResults
import typingsSlinky.gapiClientYoutube.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsResource extends js.Object {
  /** Deletes a comment. */
  def delete(request: QuotaUser): Request[Unit] = js.native
  /** Creates a reply to an existing comment. Note: To create a top-level comment, use the commentThreads.insert method. */
  def insert(request: Alt): Request[Comment] = js.native
  /** Returns a list of comments that match the API request parameters. */
  def list(request: MaxResults): Request[CommentListResponse] = js.native
  /** Expresses the caller's opinion that one or more comments should be flagged as spam. */
  def markAsSpam(request: QuotaUser): Request[Unit] = js.native
  /**
    * Sets the moderation status of one or more comments. The API request must be authorized by the owner of the channel or video associated with the
    * comments.
    */
  def setModerationStatus(request: BanAuthor): Request[Unit] = js.native
  /** Modifies a comment. */
  def update(request: Alt): Request[Comment] = js.native
}

object CommentsResource {
  @scala.inline
  def apply(
    delete: QuotaUser => Request[Unit],
    insert: Alt => Request[Comment],
    list: MaxResults => Request[CommentListResponse],
    markAsSpam: QuotaUser => Request[Unit],
    setModerationStatus: BanAuthor => Request[Unit],
    update: Alt => Request[Comment]
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
    def withDelete(value: QuotaUser => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Alt => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[CommentListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarkAsSpam(value: QuotaUser => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsSpam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetModerationStatus(value: BanAuthor => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModerationStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Alt => Request[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

