package typingsSlinky.lyricist.mod

import typingsSlinky.lyricist.AnonInteractions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotation extends js.Object {
  var api_path: String = js.native
  var authors: js.Array[Author] = js.native
  var body: Description = js.native
  var comment_count: Double = js.native
  var community: Boolean = js.native
  var cosigned_by: js.Array[_] = js.native
  var current_user_metadata: AnonInteractions = js.native
  var custom_preview: js.UndefOr[js.Any] = js.native
  var has_voters: Boolean = js.native
  var id: Double = js.native
  var pinned: Boolean = js.native
  var rejection_comment: js.UndefOr[js.Any] = js.native
  var share_url: String = js.native
  var source: js.UndefOr[js.Any] = js.native
  var state: String = js.native
  var url: String = js.native
  var verified: Boolean = js.native
  var verified_by: js.UndefOr[js.Any] = js.native
  var votes_total: Double = js.native
}

object Annotation {
  @scala.inline
  def apply(
    api_path: String,
    authors: js.Array[Author],
    body: Description,
    comment_count: Double,
    community: Boolean,
    cosigned_by: js.Array[_],
    current_user_metadata: AnonInteractions,
    has_voters: Boolean,
    id: Double,
    pinned: Boolean,
    share_url: String,
    state: String,
    url: String,
    verified: Boolean,
    votes_total: Double
  ): Annotation = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], community = community.asInstanceOf[js.Any], cosigned_by = cosigned_by.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], has_voters = has_voters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], share_url = share_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], votes_total = votes_total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthors(value: js.Array[Author]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommunity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("community")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCosigned_by(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosigned_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_metadata(value: AnonInteractions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_voters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_voters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShare_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("share_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVotes_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("votes_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_preview(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_preview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_preview")(js.undefined)
        ret
    }
    @scala.inline
    def withRejection_comment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejection_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejection_comment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejection_comment")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withVerified_by(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerified_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_by")(js.undefined)
        ret
    }
  }
  
}

