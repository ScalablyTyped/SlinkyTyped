package typingsSlinky.ibmMobilefirst.WL.Client

import typingsSlinky.ibmMobilefirst.WL.FailureResponse
import typingsSlinky.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends Options {
  var authenticator: js.UndefOr[js.Object] = js.native
  var autoHideSplash: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated. If you would like your application to connect to the Worklight Server, use WL.Client.connect().
    */
  var connectOnStartup: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated since version 6.2. Use WL.Logger.config function with an object specifying the level instead.
    */
  var enableLogger: js.UndefOr[Boolean] = js.native
  var heartBeatIntervalInSecs: js.UndefOr[Double] = js.native
  var messages: js.UndefOr[String] = js.native
  var onConnectionFailure: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  var onDisabledCookies: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  /**
    * @deprecated since version 5.0.6. Instead, use onErrorRemoteDisableDenial.
    */
  var onErrorAppVersionAccessDenial: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  var onErrorRemoteDisableDenial: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  var onRequestTimeout: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  var onUnsupportedBrowser: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  var onUnsupportedVersion: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  var onUserInstanceAccessViolation: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var validateArguments: js.UndefOr[Boolean] = js.native
  def onGetCustomDeviceProvisioningProperties(resumeDeviceProvisioningProcess: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
}

object InitOptions {
  @scala.inline
  def apply(onGetCustomDeviceProvisioningProperties: js.Function1[/* data */ js.Any, Unit] => Unit): InitOptions = {
    val __obj = js.Dynamic.literal(onGetCustomDeviceProvisioningProperties = js.Any.fromFunction1(onGetCustomDeviceProvisioningProperties))
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnGetCustomDeviceProvisioningProperties(value: js.Function1[/* data */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetCustomDeviceProvisioningProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAuthenticator(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticator")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHideSplash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideSplash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideSplash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideSplash")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectOnStartup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectOnStartup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectOnStartup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectOnStartup")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLogger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogger")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartBeatIntervalInSecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartBeatIntervalInSecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartBeatIntervalInSecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartBeatIntervalInSecs")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnectionFailure(value: /* response */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectionFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnConnectionFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectionFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisabledCookies(value: /* response */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisabledCookies")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDisabledCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisabledCookies")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorAppVersionAccessDenial(value: /* response */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorAppVersionAccessDenial")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnErrorAppVersionAccessDenial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorAppVersionAccessDenial")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorRemoteDisableDenial(value: /* response */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorRemoteDisableDenial")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnErrorRemoteDisableDenial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorRemoteDisableDenial")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRequestTimeout(value: /* response */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnsupportedBrowser(value: /* response */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsupportedBrowser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnsupportedBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsupportedBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnsupportedVersion(value: /* response */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsupportedVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnsupportedVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsupportedVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserInstanceAccessViolation(value: /* response */ FailureResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserInstanceAccessViolation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUserInstanceAccessViolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserInstanceAccessViolation")(js.undefined)
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
    def withValidateArguments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateArguments")(js.undefined)
        ret
    }
  }
  
}

