package typingsSlinky.roxBrowser.mod

import typingsSlinky.roxBrowser.roxBrowserStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoxSetupOptions extends js.Object {
  // https://support.rollout.io/docs/javascript-browser-api#section-configurationfetchedhandler
  var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.native
  var debugLevel: js.UndefOr[verbose] = js.native
  var devModeSecret: js.UndefOr[String] = js.native
  var disableNetworkFetch: js.UndefOr[Boolean] = js.native
  var freeze: js.UndefOr[RoxFlagFreezeLevel] = js.native
  // https://support.rollout.io/docs/javascript-browser-api#section-using-the-impressionhandler-option
  var impressionHandler: js.UndefOr[
    js.Function3[
      /* reporting */ RoxReporting, 
      /* experiment */ RoxExperiment, 
      /* context */ js.Any, 
      Unit
    ]
  ] = js.native
  var platform: js.UndefOr[String] = js.native
  /**
    * Set Roxy's URL for automated tests or local development.
    *
    * https://support.rollout.io/docs/microservices-automated-testing-and-local-development
    */
  var roxy: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object RoxSetupOptions {
  @scala.inline
  def apply(): RoxSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoxSetupOptions]
  }
  @scala.inline
  implicit class RoxSetupOptionsOps[Self <: RoxSetupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationFetchedHandler(value: /* fetcherResult */ RoxFetcherResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationFetchedHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConfigurationFetchedHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationFetchedHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugLevel(value: verbose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDevModeSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devModeSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevModeSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devModeSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNetworkFetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNetworkFetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNetworkFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNetworkFetch")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeze(value: RoxFlagFreezeLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeze")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeze: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeze")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressionHandler(
      value: (/* reporting */ RoxReporting, /* experiment */ RoxExperiment, /* context */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutImpressionHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withRoxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roxy")(js.undefined)
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

