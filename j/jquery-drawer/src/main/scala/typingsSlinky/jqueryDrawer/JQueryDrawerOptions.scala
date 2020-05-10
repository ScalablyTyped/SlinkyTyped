package typingsSlinky.jqueryDrawer

import typingsSlinky.iscroll.IScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryDrawerOptions extends js.Object {
  var `class`: js.UndefOr[JQueryDrawerClassOptions] = js.native
  var iscroll: js.UndefOr[IScrollOptions] = js.native
  var showOverlay: js.UndefOr[Boolean] = js.native
}

object JQueryDrawerOptions {
  @scala.inline
  def apply(): JQueryDrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryDrawerOptions]
  }
  @scala.inline
  implicit class JQueryDrawerOptionsOps[Self <: JQueryDrawerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: JQueryDrawerClassOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withIscroll(value: IScrollOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverlay")(js.undefined)
        ret
    }
  }
  
}

