package typingsSlinky.fabric.anon

import typingsSlinky.fabric.fabricImplMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ml extends js.Object {
  var bl: Point = js.native
  var br: Point = js.native
  var mb: Point = js.native
  var ml: Point = js.native
  var mr: Point = js.native
  var mt: Point = js.native
  var mtr: Point = js.native
  var tl: Point = js.native
  var tr: Point = js.native
}

object Ml {
  @scala.inline
  def apply(bl: Point, br: Point, mb: Point, ml: Point, mr: Point, mt: Point, mtr: Point, tl: Point, tr: Point): Ml = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], mb = mb.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], mr = mr.asInstanceOf[js.Any], mt = mt.asInstanceOf[js.Any], mtr = mtr.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ml]
  }
  @scala.inline
  implicit class MlOps[Self <: Ml] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBl(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBr(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMb(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMl(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMr(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMt(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtr(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTl(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTr(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

