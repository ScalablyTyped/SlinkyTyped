package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetReleaseResponse extends js.Object {
  var assets: js.Array[ReposGetReleaseResponseAssetsItem] = js.native
  var assets_url: String = js.native
  var author: ReposGetReleaseResponseAuthor = js.native
  var body: String = js.native
  var created_at: String = js.native
  var draft: Boolean = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var node_id: String = js.native
  var prerelease: Boolean = js.native
  var published_at: String = js.native
  var tag_name: String = js.native
  var tarball_url: String = js.native
  var target_commitish: String = js.native
  var upload_url: String = js.native
  var url: String = js.native
  var zipball_url: String = js.native
}

object ReposGetReleaseResponse {
  @scala.inline
  def apply(
    assets: js.Array[ReposGetReleaseResponseAssetsItem],
    assets_url: String,
    author: ReposGetReleaseResponseAuthor,
    body: String,
    created_at: String,
    draft: Boolean,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    prerelease: Boolean,
    published_at: String,
    tag_name: String,
    tarball_url: String,
    target_commitish: String,
    upload_url: String,
    url: String,
    zipball_url: String
  ): ReposGetReleaseResponse = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], assets_url = assets_url.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], zipball_url = zipball_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetReleaseResponse]
  }
  @scala.inline
  implicit class ReposGetReleaseResponseOps[Self <: ReposGetReleaseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: js.Array[ReposGetReleaseResponseAssetsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssets_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: ReposGetReleaseResponseAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
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
    def withTarball_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tarball_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_commitish(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_commitish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipball_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipball_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

