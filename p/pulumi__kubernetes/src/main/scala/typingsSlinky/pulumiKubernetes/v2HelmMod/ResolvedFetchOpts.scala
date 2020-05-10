package typingsSlinky.pulumiKubernetes.v2HelmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedFetchOpts extends js.Object {
  var caFile: js.UndefOr[String] = js.native
  var certFile: js.UndefOr[String] = js.native
  var destination: js.UndefOr[String] = js.native
  var devel: js.UndefOr[Boolean] = js.native
  var home: js.UndefOr[String] = js.native
  var keyFile: js.UndefOr[String] = js.native
  var keyring: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var prov: js.UndefOr[Boolean] = js.native
  var repo: js.UndefOr[String] = js.native
  var untar: js.UndefOr[Boolean] = js.native
  var untardir: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
  var verify: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
}

object ResolvedFetchOpts {
  @scala.inline
  def apply(): ResolvedFetchOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedFetchOpts]
  }
  @scala.inline
  implicit class ResolvedFetchOptsOps[Self <: ResolvedFetchOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caFile")(js.undefined)
        ret
    }
    @scala.inline
    def withCertFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certFile")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withDevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devel")(js.undefined)
        ret
    }
    @scala.inline
    def withHome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("home")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("home")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFile")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyring")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withProv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prov")(js.undefined)
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(js.undefined)
        ret
    }
    @scala.inline
    def withUntar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUntar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untar")(js.undefined)
        ret
    }
    @scala.inline
    def withUntardir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untardir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUntardir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untardir")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withVerify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

