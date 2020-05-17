package typingsSlinky.overlayscrollbars.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xs extends js.Object {
  var x: Boolean = js.native
  var xs: Boolean = js.native
  var y: Boolean = js.native
  var ys: Boolean = js.native
}

object Xs {
  @scala.inline
  def apply(x: Boolean, xs: Boolean, y: Boolean, ys: Boolean): Xs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], ys = ys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xs]
  }
  @scala.inline
  implicit class XsOps[Self <: Xs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

