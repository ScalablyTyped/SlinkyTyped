package typingsSlinky.kendoUi.kendo.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationOptions extends js.Object {
  var browserHistory: js.UndefOr[Boolean] = js.native
  var hideAddressBar: js.UndefOr[Boolean] = js.native
  var init: js.UndefOr[js.Function1[/* e */ ApplicationEvent, Unit]] = js.native
  var initial: js.UndefOr[String] = js.native
  var layout: js.UndefOr[String] = js.native
  var loading: js.UndefOr[String] = js.native
  var modelScope: js.UndefOr[js.Object] = js.native
  var platform: js.UndefOr[String] = js.native
  var retina: js.UndefOr[Boolean] = js.native
  var serverNavigation: js.UndefOr[Boolean] = js.native
  var skin: js.UndefOr[String] = js.native
  var statusBarStyle: js.UndefOr[String] = js.native
  var transition: js.UndefOr[String] = js.native
  var updateDocumentTitle: js.UndefOr[Boolean] = js.native
  var useNativeScrolling: js.UndefOr[Boolean] = js.native
}

object ApplicationOptions {
  @scala.inline
  def apply(): ApplicationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationOptions]
  }
  @scala.inline
  implicit class ApplicationOptionsOps[Self <: ApplicationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAddressBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAddressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAddressBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAddressBar")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* e */ ApplicationEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withModelScope(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelScope")(js.undefined)
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
    def withRetina(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retina")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetina: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retina")(js.undefined)
        ret
    }
    @scala.inline
    def withServerNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusBarStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDocumentTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDocumentTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDocumentTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDocumentTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeScrolling")(js.undefined)
        ret
    }
  }
  
}

