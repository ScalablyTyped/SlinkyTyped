package typingsSlinky.inboxsdk.mod.Widgets

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.inboxsdk.mod.Compose.ComposeView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerOptions extends js.Object {
  var chrome: js.UndefOr[Boolean] = js.native
  var closeWithCompose: js.UndefOr[Boolean] = js.native
  var composeView: js.UndefOr[ComposeView] = js.native
  var el: HTMLElement = js.native
  var title: js.UndefOr[String] = js.native
}

object DrawerOptions {
  @scala.inline
  def apply(el: HTMLElement): DrawerOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOptions]
  }
  @scala.inline
  implicit class DrawerOptionsOps[Self <: DrawerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseWithCompose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWithCompose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseWithCompose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWithCompose")(js.undefined)
        ret
    }
    @scala.inline
    def withComposeView(value: ComposeView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composeView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposeView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composeView")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

