package typingsSlinky.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GhostOptions extends js.Object {
  var clicks: js.UndefOr[Boolean] = js.native
  var forms: js.UndefOr[FormsOptions | Boolean] = js.native
  var scroll: js.UndefOr[Boolean] = js.native
}

object GhostOptions {
  @scala.inline
  def apply(): GhostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GhostOptions]
  }
  @scala.inline
  implicit class GhostOptionsOps[Self <: GhostOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicks")(js.undefined)
        ret
    }
    @scala.inline
    def withForms(value: FormsOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forms")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
  }
  
}

