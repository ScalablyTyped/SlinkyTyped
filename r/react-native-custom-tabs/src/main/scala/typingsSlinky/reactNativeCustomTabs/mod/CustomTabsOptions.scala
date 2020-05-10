package typingsSlinky.reactNativeCustomTabs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTabsOptions extends js.Object {
  var animations: js.UndefOr[Animations] = js.native
  var enableDefaultShare: js.UndefOr[Boolean] = js.native
  var enableUrlBarHiding: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var showPageTitle: js.UndefOr[Boolean] = js.native
  var toolbarColor: js.UndefOr[String] = js.native
}

object CustomTabsOptions {
  @scala.inline
  def apply(): CustomTabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTabsOptions]
  }
  @scala.inline
  implicit class CustomTabsOptionsOps[Self <: CustomTabsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimations(value: Animations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDefaultShare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDefaultShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDefaultShare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDefaultShare")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUrlBarHiding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUrlBarHiding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUrlBarHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUrlBarHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPageTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPageTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarColor")(js.undefined)
        ret
    }
  }
  
}

