package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicensesGetResponse extends js.Object {
  var body: String = js.native
  var conditions: js.Array[String] = js.native
  var description: String = js.native
  var featured: Boolean = js.native
  var html_url: String = js.native
  var implementation: String = js.native
  var key: String = js.native
  var limitations: js.Array[String] = js.native
  var name: String = js.native
  var node_id: String = js.native
  var permissions: js.Array[String] = js.native
  var spdx_id: String = js.native
  var url: String = js.native
}

object LicensesGetResponse {
  @scala.inline
  def apply(
    body: String,
    conditions: js.Array[String],
    description: String,
    featured: Boolean,
    html_url: String,
    implementation: String,
    key: String,
    limitations: js.Array[String],
    name: String,
    node_id: String,
    permissions: js.Array[String],
    spdx_id: String,
    url: String
  ): LicensesGetResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], limitations = limitations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], spdx_id = spdx_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensesGetResponse]
  }
  @scala.inline
  implicit class LicensesGetResponseOps[Self <: LicensesGetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplementation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimitations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitations")(value.asInstanceOf[js.Any])
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
    def withPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpdx_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spdx_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

