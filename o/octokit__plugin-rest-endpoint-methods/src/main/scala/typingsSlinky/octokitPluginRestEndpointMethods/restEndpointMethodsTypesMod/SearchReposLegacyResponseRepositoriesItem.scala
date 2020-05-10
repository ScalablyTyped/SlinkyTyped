package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchReposLegacyResponseRepositoriesItem extends js.Object {
  var created: String = js.native
  var created_at: String = js.native
  var description: String = js.native
  var followers: Double = js.native
  var fork: Boolean = js.native
  var forks: Double = js.native
  var has_downloads: Boolean = js.native
  var has_issues: Boolean = js.native
  var has_wiki: Boolean = js.native
  var homepage: String = js.native
  var language: String = js.native
  var name: String = js.native
  var open_issues: Double = js.native
  var owner: String = js.native
  var `private`: Boolean = js.native
  var pushed: String = js.native
  var pushed_at: String = js.native
  var score: Double = js.native
  var size: Double = js.native
  var `type`: String = js.native
  var url: String = js.native
  var username: String = js.native
  var watchers: Double = js.native
}

object SearchReposLegacyResponseRepositoriesItem {
  @scala.inline
  def apply(
    created: String,
    created_at: String,
    description: String,
    followers: Double,
    fork: Boolean,
    forks: Double,
    has_downloads: Boolean,
    has_issues: Boolean,
    has_wiki: Boolean,
    homepage: String,
    language: String,
    name: String,
    open_issues: Double,
    owner: String,
    `private`: Boolean,
    pushed: String,
    pushed_at: String,
    score: Double,
    size: Double,
    `type`: String,
    url: String,
    username: String,
    watchers: Double
  ): SearchReposLegacyResponseRepositoriesItem = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], has_downloads = has_downloads.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], open_issues = open_issues.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], pushed_at = pushed_at.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], watchers = watchers.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReposLegacyResponseRepositoriesItem]
  }
  @scala.inline
  implicit class SearchReposLegacyResponseRepositoriesItemOps[Self <: SearchReposLegacyResponseRepositoriesItem] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_downloads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_downloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_issues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_wiki(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_wiki")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomepage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen_issues(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushed_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

