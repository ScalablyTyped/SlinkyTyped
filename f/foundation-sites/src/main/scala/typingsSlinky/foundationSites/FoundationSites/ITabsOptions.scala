package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabsOptions extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var linkClass: js.UndefOr[String] = js.native
  var matchHeight: js.UndefOr[Boolean] = js.native
  var panelClass: js.UndefOr[String] = js.native
  var wrapOnKeys: js.UndefOr[Boolean] = js.native
}

object ITabsOptions {
  @scala.inline
  def apply(): ITabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabsOptions]
  }
  @scala.inline
  implicit class ITabsOptionsOps[Self <: ITabsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelClass")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapOnKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapOnKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapOnKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapOnKeys")(js.undefined)
        ret
    }
  }
  
}

