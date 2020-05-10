package typingsSlinky.openfin.runtimeInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeInfo extends js.Object {
  var architecture: String = js.native
  var args: js.Object = js.native
  var chromeVersion: String = js.native
  var fdc3AppUuid: js.UndefOr[String] = js.native
  var fdc3ChannelName: js.UndefOr[String] = js.native
  var manifestUrl: String = js.native
  var port: Double = js.native
  var securityRealm: js.UndefOr[String] = js.native
  var version: String = js.native
}

object RuntimeInfo {
  @scala.inline
  def apply(
    architecture: String,
    args: js.Object,
    chromeVersion: String,
    manifestUrl: String,
    port: Double,
    version: String
  ): RuntimeInfo = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], chromeVersion = chromeVersion.asInstanceOf[js.Any], manifestUrl = manifestUrl.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeInfo]
  }
  @scala.inline
  implicit class RuntimeInfoOps[Self <: RuntimeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChromeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifestUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFdc3AppUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fdc3AppUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFdc3AppUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fdc3AppUuid")(js.undefined)
        ret
    }
    @scala.inline
    def withFdc3ChannelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fdc3ChannelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFdc3ChannelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fdc3ChannelName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRealm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityRealm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRealm")(js.undefined)
        ret
    }
  }
  
}

