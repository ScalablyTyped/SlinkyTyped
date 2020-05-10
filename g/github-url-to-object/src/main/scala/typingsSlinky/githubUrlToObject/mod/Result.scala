package typingsSlinky.githubUrlToObject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var api_url: String = js.native
  var branch: String = js.native
  var clone_url: String = js.native
  var https_url: String = js.native
  var repo: String = js.native
  var tarball_url: String = js.native
  var travis_url: String = js.native
  var user: String = js.native
  var zip_url: String = js.native
}

object Result {
  @scala.inline
  def apply(
    api_url: String,
    branch: String,
    clone_url: String,
    https_url: String,
    repo: String,
    tarball_url: String,
    travis_url: String,
    user: String,
    zip_url: String
  ): Result = {
    val __obj = js.Dynamic.literal(api_url = api_url.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], clone_url = clone_url.asInstanceOf[js.Any], https_url = https_url.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], travis_url = travis_url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], zip_url = zip_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttps_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarball_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tarball_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTravis_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travis_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZip_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

