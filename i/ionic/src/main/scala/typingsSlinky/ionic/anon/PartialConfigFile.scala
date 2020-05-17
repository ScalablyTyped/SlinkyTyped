package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.NpmClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/definitions.ConfigFile> */
@js.native
trait PartialConfigFile extends js.Object {
  @JSName("features.ssl-commands")
  var `featuresDotssl-commands`: js.UndefOr[Boolean] = js.native
  @JSName("git.host")
  var gitDothost: js.UndefOr[String] = js.native
  @JSName("git.port")
  var gitDotport: js.UndefOr[Double] = js.native
  @JSName("git.setup")
  var gitDotsetup: js.UndefOr[Boolean] = js.native
  var interactive: js.UndefOr[Boolean] = js.native
  var npmClient: js.UndefOr[NpmClient] = js.native
  @JSName("org.id")
  var orgDotid: js.UndefOr[String] = js.native
  var proxy: js.UndefOr[String] = js.native
  @JSName("ssl.cafile")
  var sslDotcafile: js.UndefOr[String | js.Array[String]] = js.native
  @JSName("ssl.certfile")
  var sslDotcertfile: js.UndefOr[String | js.Array[String]] = js.native
  @JSName("ssl.keyfile")
  var sslDotkeyfile: js.UndefOr[String | js.Array[String]] = js.native
  var telemetry: js.UndefOr[Boolean] = js.native
  @JSName("tokens.telemetry")
  var tokensDottelemetry: js.UndefOr[String] = js.native
  @JSName("tokens.user")
  var tokensDotuser: js.UndefOr[String] = js.native
  @JSName("urls.api")
  var urlsDotapi: js.UndefOr[String] = js.native
  @JSName("urls.dash")
  var urlsDotdash: js.UndefOr[String] = js.native
  @JSName("user.email")
  var userDotemail: js.UndefOr[String] = js.native
  @JSName("user.id")
  var userDotid: js.UndefOr[Double] = js.native
  var version: js.UndefOr[String] = js.native
}

object PartialConfigFile {
  @scala.inline
  def apply(): PartialConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfigFile]
  }
  @scala.inline
  implicit class PartialConfigFileOps[Self <: PartialConfigFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFeaturesDotssl-commands`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features.ssl-commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFeaturesDotssl-commands`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features.ssl-commands")(js.undefined)
        ret
    }
    @scala.inline
    def withGitDothost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git.host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitDothost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git.host")(js.undefined)
        ret
    }
    @scala.inline
    def withGitDotport(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git.port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitDotport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git.port")(js.undefined)
        ret
    }
    @scala.inline
    def withGitDotsetup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git.setup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitDotsetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git.setup")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withNpmClient(value: NpmClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npmClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNpmClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npmClient")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgDotid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org.id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgDotid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org.id")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSslDotcafile(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl.cafile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslDotcafile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl.cafile")(js.undefined)
        ret
    }
    @scala.inline
    def withSslDotcertfile(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl.certfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslDotcertfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl.certfile")(js.undefined)
        ret
    }
    @scala.inline
    def withSslDotkeyfile(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl.keyfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslDotkeyfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl.keyfile")(js.undefined)
        ret
    }
    @scala.inline
    def withTelemetry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelemetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetry")(js.undefined)
        ret
    }
    @scala.inline
    def withTokensDottelemetry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens.telemetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokensDottelemetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens.telemetry")(js.undefined)
        ret
    }
    @scala.inline
    def withTokensDotuser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens.user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokensDotuser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens.user")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlsDotapi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls.api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlsDotapi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls.api")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlsDotdash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls.dash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlsDotdash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls.dash")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDotemail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDotemail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user.email")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDotid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user.id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDotid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user.id")(js.undefined)
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

