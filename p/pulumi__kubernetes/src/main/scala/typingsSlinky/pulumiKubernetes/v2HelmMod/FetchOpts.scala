package typingsSlinky.pulumiKubernetes.v2HelmMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchOpts extends js.Object {
  /** Verify certificates of HTTPS-enabled servers using this CA bundle. */
  var caFile: js.UndefOr[Input[String]] = js.native
  /** Identify HTTPS client using this SSL certificate file. */
  var certFile: js.UndefOr[Input[String]] = js.native
  /**
    * Location to write the chart. If this and tardir are specified, tardir is appended to this
    * (default ".").
    */
  var destination: js.UndefOr[Input[String]] = js.native
  /**
    * Use development versions, too. Equivalent to version '>0.0.0-0'. If --version is set, this is
    * ignored.
    */
  var devel: js.UndefOr[Input[Boolean]] = js.native
  /** Location of your Helm config. Overrides $HELM_HOME (default "/Users/alex/.helm"). */
  var home: js.UndefOr[Input[String]] = js.native
  /** Identify HTTPS client using this SSL key file. */
  var keyFile: js.UndefOr[Input[String]] = js.native
  /** Keyring containing public keys (default "/Users/alex/.gnupg/pubring.gpg"). */
  var keyring: js.UndefOr[Input[String]] = js.native
  /** Chart repository password. */
  var password: js.UndefOr[Input[String]] = js.native
  /** Fetch the provenance file, but don't perform verification. */
  var prov: js.UndefOr[Input[Boolean]] = js.native
  /** Chart repository url where to locate the requested chart. */
  var repo: js.UndefOr[Input[String]] = js.native
  /** If set to false, will leave the chart as a tarball after downloading. */
  var untar: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If untar is specified, this flag specifies the name of the directory into which the chart is
    * expanded (default ".").
    */
  var untardir: js.UndefOr[Input[String]] = js.native
  /** Chart repository username. */
  var username: js.UndefOr[Input[String]] = js.native
  /** Verify the package against its signature. */
  var verify: js.UndefOr[Input[Boolean]] = js.native
  /** Specific version of a chart. Without this, the latest version is fetched. */
  var version: js.UndefOr[Input[String]] = js.native
}

object FetchOpts {
  @scala.inline
  def apply(): FetchOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOpts]
  }
  @scala.inline
  implicit class FetchOptsOps[Self <: FetchOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaFile(value: Input[String]): Self = {
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
    def withCertFile(value: Input[String]): Self = {
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
    def withDestination(value: Input[String]): Self = {
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
    def withDevel(value: Input[Boolean]): Self = {
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
    def withHome(value: Input[String]): Self = {
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
    def withKeyFile(value: Input[String]): Self = {
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
    def withKeyring(value: Input[String]): Self = {
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
    def withPassword(value: Input[String]): Self = {
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
    def withProv(value: Input[Boolean]): Self = {
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
    def withRepo(value: Input[String]): Self = {
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
    def withUntar(value: Input[Boolean]): Self = {
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
    def withUntardir(value: Input[String]): Self = {
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
    def withUsername(value: Input[String]): Self = {
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
    def withVerify(value: Input[Boolean]): Self = {
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
    def withVersion(value: Input[String]): Self = {
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

