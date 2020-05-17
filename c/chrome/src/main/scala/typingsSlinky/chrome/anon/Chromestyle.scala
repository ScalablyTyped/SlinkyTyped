package typingsSlinky.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chromestyle extends js.Object {
  var chrome_style: js.UndefOr[Boolean] = js.native
  var open_in_tab: js.UndefOr[Boolean] = js.native
  var page: js.UndefOr[String] = js.native
}

object Chromestyle {
  @scala.inline
  def apply(): Chromestyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chromestyle]
  }
  @scala.inline
  implicit class ChromestyleOps[Self <: Chromestyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChrome_style(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome_style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_style")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_in_tab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_in_tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen_in_tab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_in_tab")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
  }
  
}

