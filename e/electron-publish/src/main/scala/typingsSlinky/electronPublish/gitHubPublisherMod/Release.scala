package typingsSlinky.electronPublish.gitHubPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Release extends js.Object {
  var draft: Boolean = js.native
  var id: Double = js.native
  var prerelease: Boolean = js.native
  var published_at: String = js.native
  var tag_name: String = js.native
  var upload_url: String = js.native
}

object Release {
  @scala.inline
  def apply(
    draft: Boolean,
    id: Double,
    prerelease: Boolean,
    published_at: String,
    tag_name: String,
    upload_url: String
  ): Release = {
    val __obj = js.Dynamic.literal(draft = draft.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Release]
  }
  @scala.inline
  implicit class ReleaseOps[Self <: Release] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrerelease(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublished_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

