package typingsSlinky.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Br extends js.Object {
  var bl: js.UndefOr[Boolean] = js.native
  var br: js.UndefOr[Boolean] = js.native
  var mb: js.UndefOr[Boolean] = js.native
  var ml: js.UndefOr[Boolean] = js.native
  var mr: js.UndefOr[Boolean] = js.native
  var mt: js.UndefOr[Boolean] = js.native
  var mtr: js.UndefOr[Boolean] = js.native
  var tl: js.UndefOr[Boolean] = js.native
  var tr: js.UndefOr[Boolean] = js.native
}

object Br {
  @scala.inline
  def apply(): Br = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Br]
  }
  @scala.inline
  implicit class BrOps[Self <: Br] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bl")(js.undefined)
        ret
    }
    @scala.inline
    def withBr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(js.undefined)
        ret
    }
    @scala.inline
    def withMb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(js.undefined)
        ret
    }
    @scala.inline
    def withMl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(js.undefined)
        ret
    }
    @scala.inline
    def withMr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(js.undefined)
        ret
    }
    @scala.inline
    def withMt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(js.undefined)
        ret
    }
    @scala.inline
    def withMtr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtr")(js.undefined)
        ret
    }
    @scala.inline
    def withTl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(js.undefined)
        ret
    }
    @scala.inline
    def withTr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(js.undefined)
        ret
    }
  }
  
}

