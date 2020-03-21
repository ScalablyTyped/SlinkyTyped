package typingsSlinky.inboxsdk.mod.Widgets

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.inboxsdk.mod.Compose.ComposeView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerOptions extends js.Object {
  var chrome: js.UndefOr[Boolean] = js.undefined
  var closeWithCompose: js.UndefOr[Boolean] = js.undefined
  var composeView: js.UndefOr[ComposeView] = js.undefined
  var el: HTMLElement
  var title: js.UndefOr[String] = js.undefined
}

object DrawerOptions {
  @scala.inline
  def apply(
    el: HTMLElement,
    chrome: js.UndefOr[Boolean] = js.undefined,
    closeWithCompose: js.UndefOr[Boolean] = js.undefined,
    composeView: ComposeView = null,
    title: String = null
  ): DrawerOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (!js.isUndefined(chrome)) __obj.updateDynamic("chrome")(chrome.asInstanceOf[js.Any])
    if (!js.isUndefined(closeWithCompose)) __obj.updateDynamic("closeWithCompose")(closeWithCompose.asInstanceOf[js.Any])
    if (composeView != null) __obj.updateDynamic("composeView")(composeView.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptions]
  }
}

