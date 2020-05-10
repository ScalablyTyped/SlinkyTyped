package typingsSlinky.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasnextpage extends js.Object {
  var end_cursor: js.UndefOr[String] = js.native
  var has_next_page: Boolean = js.native
  var start_cursor: js.UndefOr[String] = js.native
}

object AnonHasnextpage {
  @scala.inline
  def apply(has_next_page: Boolean): AnonHasnextpage = {
    val __obj = js.Dynamic.literal(has_next_page = has_next_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasnextpage]
  }
  @scala.inline
  implicit class AnonHasnextpageOps[Self <: AnonHasnextpage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHas_next_page(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_next_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_cursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_cursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_cursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_cursor")(js.undefined)
        ret
    }
  }
  
}

