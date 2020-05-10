package typingsSlinky.jqueryBlockui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  /** block user activity for the page */
  var blockUI: js.UndefOr[JQBlockUIStatic] = js.native
  /** unblock the page */
  var unblockUI: js.UndefOr[JQBlockUIStatic] = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockUI(value: JQBlockUIStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockUI")(js.undefined)
        ret
    }
    @scala.inline
    def withUnblockUI(value: JQBlockUIStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unblockUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnblockUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unblockUI")(js.undefined)
        ret
    }
  }
  
}

