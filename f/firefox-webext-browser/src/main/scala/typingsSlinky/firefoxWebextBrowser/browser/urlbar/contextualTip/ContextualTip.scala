package typingsSlinky.firefoxWebextBrowser.browser.urlbar.contextualTip

import typingsSlinky.firefoxWebextBrowser.AnonDefaultIcon_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* urlbar.contextualTip types */
/**
  * An object containing the path to an icon, the title, button title, and link title to set on the contextual tip.
  */
@js.native
trait ContextualTip extends js.Object {
  /** A string to be used as the contextual tip's button's title. */
  var buttonTitle: js.UndefOr[String] = js.native
  /** Specifies the default icon and theme icons */
  var icon: js.UndefOr[AnonDefaultIcon_] = js.native
  /** A string to be used as the contextual tip's link's title. */
  var linkTitle: js.UndefOr[String] = js.native
  /** A string to be used as the contextual tip's title. */
  var title: String = js.native
}

object ContextualTip {
  @scala.inline
  def apply(title: String): ContextualTip = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextualTip]
  }
  @scala.inline
  implicit class ContextualTipOps[Self <: ContextualTip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: AnonDefaultIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTitle")(js.undefined)
        ret
    }
  }
  
}

