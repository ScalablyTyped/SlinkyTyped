package typingsSlinky.karmaBrowserstackLauncher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserStackOptions extends js.Object {
  /**  BS access key, you can also use BROWSERSTACK_ACCESS_KEY env variable */
  var accessKey: String = js.native
  /** the BS worker build name */
  var build: js.UndefOr[String] = js.native
  /** the browser capture timeout */
  var captureTimeout: js.UndefOr[Double] = js.native
  /** force traffic through the local BrowserStack tunnel, passes flag through to BrowserStackTunnel */
  var forcelocal: js.UndefOr[Boolean] = js.native
  /** the BS worker name  */
  var name: js.UndefOr[String] = js.native
  /** the BS worker project name */
  var project: js.UndefOr[String] = js.native
  /** the host of your proxy for communicating with BrowserStack REST API and BrowserStackLocal */
  var proxyHost: js.UndefOr[String] = js.native
  /** the password used for authentication with your proxy */
  var proxyPass: js.UndefOr[String] = js.native
  /** the port of your proxy */
  var proxyPort: js.UndefOr[Double] = js.native
  /** the protocol of your proxy (optional. default: http. valid: http or https) */
  var proxyProtocol: js.UndefOr[String] = js.native
  /** the username used for authentication with your proxy */
  var proxyUser: js.UndefOr[String] = js.native
  /** how many times do you want to retry to capture the browser */
  var retryLimit: js.UndefOr[Double] = js.native
  /** do you wanna establish the BrowserStack tunnel */
  var startTunnel: js.UndefOr[Boolean] = js.native
  /** the BS worker timeout */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * in case you want to start the BrowserStack tunnel outside karma
    * by setting `startTunnel` to `false`,
    * set the identifier passed to the -localIdentifier option here (optional)
    */
  var tunnelIdentifier: js.UndefOr[String] = js.native
  /** BS username, you can also use BROWSERSTACK_USERNAME env variable */
  var username: String = js.native
  /** enable video recording of session on BrowserStack */
  var video: js.UndefOr[Boolean] = js.native
}

object BrowserStackOptions {
  @scala.inline
  def apply(accessKey: String, username: String): BrowserStackOptions = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserStackOptions]
  }
  @scala.inline
  implicit class BrowserStackOptionsOps[Self <: BrowserStackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuild(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withForcelocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcelocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcelocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcelocal")(js.undefined)
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
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyHost")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyPass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyPass")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyPort")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUser")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTunnel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTunnel")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnelIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnelIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
  }
  
}

