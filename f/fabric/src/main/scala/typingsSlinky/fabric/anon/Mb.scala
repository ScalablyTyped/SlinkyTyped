package typingsSlinky.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mb extends js.Object {
  var bl: Boolean = js.native
  var br: Boolean = js.native
  var mb: Boolean = js.native
  var ml: Boolean = js.native
  var mr: Boolean = js.native
  var mt: Boolean = js.native
  var mtr: Boolean = js.native
  var tl: Boolean = js.native
  var tr: Boolean = js.native
}

object Mb {
  @scala.inline
  def apply(
    bl: Boolean,
    br: Boolean,
    mb: Boolean,
    ml: Boolean,
    mr: Boolean,
    mt: Boolean,
    mtr: Boolean,
    tl: Boolean,
    tr: Boolean
  ): Mb = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], mb = mb.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], mr = mr.asInstanceOf[js.Any], mt = mt.asInstanceOf[js.Any], mtr = mtr.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mb]
  }
  @scala.inline
  implicit class MbOps[Self <: Mb] (val x: Self) extends AnyVal {
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
    def withBr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

