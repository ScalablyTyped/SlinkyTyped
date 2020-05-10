package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchUsersLegacyResponseUsersItem extends js.Object {
  var created: String = js.native
  var created_at: String = js.native
  var followers: Double = js.native
  var followers_count: Double = js.native
  var fullname: String = js.native
  var gravatar_id: String = js.native
  var id: String = js.native
  var language: String = js.native
  var location: String = js.native
  var login: String = js.native
  var name: String = js.native
  var public_repo_count: Double = js.native
  var repos: Double = js.native
  var score: Double = js.native
  var `type`: String = js.native
  var username: String = js.native
}

object SearchUsersLegacyResponseUsersItem {
  @scala.inline
  def apply(
    created: String,
    created_at: String,
    followers: Double,
    followers_count: Double,
    fullname: String,
    gravatar_id: String,
    id: String,
    language: String,
    location: String,
    login: String,
    name: String,
    public_repo_count: Double,
    repos: Double,
    score: Double,
    `type`: String,
    username: String
  ): SearchUsersLegacyResponseUsersItem = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], fullname = fullname.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_repo_count = public_repo_count.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUsersLegacyResponseUsersItem]
  }
  @scala.inline
  implicit class SearchUsersLegacyResponseUsersItemOps[Self <: SearchUsersLegacyResponseUsersItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowers_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGravatar_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravatar_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic_repo_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_repo_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

