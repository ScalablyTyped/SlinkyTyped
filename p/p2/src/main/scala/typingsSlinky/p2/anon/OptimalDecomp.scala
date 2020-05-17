package typingsSlinky.p2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimalDecomp extends js.Object {
  var optimalDecomp: js.UndefOr[Boolean] = js.native
  var removeCollinearPoints: js.UndefOr[Boolean | Double] = js.native
  var skipSimpleCheck: js.UndefOr[Boolean] = js.native
}

object OptimalDecomp {
  @scala.inline
  def apply(): OptimalDecomp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimalDecomp]
  }
  @scala.inline
  implicit class OptimalDecompOps[Self <: OptimalDecomp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptimalDecomp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimalDecomp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimalDecomp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimalDecomp")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCollinearPoints(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCollinearPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveCollinearPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCollinearPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipSimpleCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSimpleCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipSimpleCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSimpleCheck")(js.undefined)
        ret
    }
  }
  
}

