package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaGetResponse extends js.Object {
  var api: js.Array[String] = js.native
  var git: js.Array[String] = js.native
  var hooks: js.Array[String] = js.native
  var importer: js.Array[String] = js.native
  var pages: js.Array[String] = js.native
  var ssh_key_fingerprints: MetaGetResponseSshKeyFingerprints = js.native
  var verifiable_password_authentication: Boolean = js.native
  var web: js.Array[String] = js.native
}

object MetaGetResponse {
  @scala.inline
  def apply(
    api: js.Array[String],
    git: js.Array[String],
    hooks: js.Array[String],
    importer: js.Array[String],
    pages: js.Array[String],
    ssh_key_fingerprints: MetaGetResponseSshKeyFingerprints,
    verifiable_password_authentication: Boolean,
    web: js.Array[String]
  ): MetaGetResponse = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], importer = importer.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], ssh_key_fingerprints = ssh_key_fingerprints.asInstanceOf[js.Any], verifiable_password_authentication = verifiable_password_authentication.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaGetResponse]
  }
  @scala.inline
  implicit class MetaGetResponseOps[Self <: MetaGetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGit(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHooks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImporter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsh_key_fingerprints(value: MetaGetResponseSshKeyFingerprints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssh_key_fingerprints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerifiable_password_authentication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifiable_password_authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeb(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

