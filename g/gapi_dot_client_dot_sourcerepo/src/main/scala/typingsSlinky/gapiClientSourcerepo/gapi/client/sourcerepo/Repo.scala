package typingsSlinky.gapiClientSourcerepo.gapi.client.sourcerepo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repo extends js.Object {
  /** How this repository mirrors a repository managed by another service. */
  var mirrorConfig: js.UndefOr[MirrorConfig] = js.native
  /**
    * Resource name of the repository, of the form
    * `projects/<project>/repos/<repo>`.  The repo name may contain slashes.
    * eg, `projects/myproject/repos/name/with/slash`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The disk usage of the repo, in bytes.
    * Only returned by GetRepo.
    */
  var size: js.UndefOr[String] = js.native
  /** URL to clone the repository from Google Cloud Source Repositories. */
  var url: js.UndefOr[String] = js.native
}

object Repo {
  @scala.inline
  def apply(): Repo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repo]
  }
  @scala.inline
  implicit class RepoOps[Self <: Repo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMirrorConfig(value: MirrorConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrorConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirrorConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirrorConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

