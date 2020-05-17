package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Itemsperpage extends js.Object {
  var items_per_page: String = js.native
  var jump_to: String = js.native
  var jump_to_confirm: String = js.native
  var next_3: String = js.native
  var next_5: String = js.native
  var next_page: String = js.native
  var page: String = js.native
  var prev_3: String = js.native
  var prev_5: String = js.native
  var prev_page: String = js.native
}

object Itemsperpage {
  @scala.inline
  def apply(
    items_per_page: String,
    jump_to: String,
    jump_to_confirm: String,
    next_3: String,
    next_5: String,
    next_page: String,
    page: String,
    prev_3: String,
    prev_5: String,
    prev_page: String
  ): Itemsperpage = {
    val __obj = js.Dynamic.literal(items_per_page = items_per_page.asInstanceOf[js.Any], jump_to = jump_to.asInstanceOf[js.Any], jump_to_confirm = jump_to_confirm.asInstanceOf[js.Any], next_3 = next_3.asInstanceOf[js.Any], next_5 = next_5.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], prev_3 = prev_3.asInstanceOf[js.Any], prev_5 = prev_5.asInstanceOf[js.Any], prev_page = prev_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itemsperpage]
  }
  @scala.inline
  implicit class ItemsperpageOps[Self <: Itemsperpage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems_per_page(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items_per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJump_to(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jump_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJump_to_confirm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jump_to_confirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_page(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev_3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev_3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev_5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev_5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev_page(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev_page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

