package typingsSlinky.fabric.anon

import typingsSlinky.fabric.fabricImplMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tr extends js.Object {
  var bl: Point = js.native
  var br: Point = js.native
  var tl: Point = js.native
  var tr: Point = js.native
}

object Tr {
  @scala.inline
  def apply(bl: Point, br: Point, tl: Point, tr: Point): Tr = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tr]
  }
  @scala.inline
  implicit class TrOps[Self <: Tr] (val x: Self) extends AnyVal {
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

