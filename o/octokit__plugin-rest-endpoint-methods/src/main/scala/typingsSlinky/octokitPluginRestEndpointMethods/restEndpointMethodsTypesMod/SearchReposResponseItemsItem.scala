package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchReposResponseItemsItem extends js.Object {
  var created_at: String = js.native
  var default_branch: String = js.native
  var description: String = js.native
  var fork: Boolean = js.native
  var forks_count: Double = js.native
  var full_name: String = js.native
  var homepage: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var language: String = js.native
  var master_branch: String = js.native
  var name: String = js.native
  var node_id: String = js.native
  var open_issues_count: Double = js.native
  var owner: SearchReposResponseItemsItemOwner = js.native
  var `private`: Boolean = js.native
  var pushed_at: String = js.native
  var score: Double = js.native
  var size: Double = js.native
  var stargazers_count: Double = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var watchers_count: Double = js.native
}

object SearchReposResponseItemsItem {
  @scala.inline
  def apply(
    created_at: String,
    default_branch: String,
    description: String,
    fork: Boolean,
    forks_count: Double,
    full_name: String,
    homepage: String,
    html_url: String,
    id: Double,
    language: String,
    master_branch: String,
    name: String,
    node_id: String,
    open_issues_count: Double,
    owner: SearchReposResponseItemsItemOwner,
    `private`: Boolean,
    pushed_at: String,
    score: Double,
    size: Double,
    stargazers_count: Double,
    updated_at: String,
    url: String,
    watchers_count: Double
  ): SearchReposResponseItemsItem = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], default_branch = default_branch.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks_count = forks_count.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], master_branch = master_branch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], open_issues_count = open_issues_count.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pushed_at = pushed_at.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stargazers_count = stargazers_count.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], watchers_count = watchers_count.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReposResponseItemsItem]
  }
  @scala.inline
  implicit class SearchReposResponseItemsItemOps[Self <: SearchReposResponseItemsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_branch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForks_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forks_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomepage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(value.asInstanceOf[js.Any])
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
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaster_branch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_branch")(value.asInstanceOf[js.Any])
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
    def withOpen_issues_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_issues_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: SearchReposResponseItemsItemOwner): Self = {
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
    def withStargazers_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stargazers_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchers_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchers_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

