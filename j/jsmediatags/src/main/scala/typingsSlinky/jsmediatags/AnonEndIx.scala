package typingsSlinky.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndIx extends js.Object {
  var endIx: Double = js.native
  var insertIx: js.UndefOr[Double] = js.native
  var startIx: Double = js.native
}

object AnonEndIx {
  @scala.inline
  def apply(endIx: Double, startIx: Double): AnonEndIx = {
    val __obj = js.Dynamic.literal(endIx = endIx.asInstanceOf[js.Any], startIx = startIx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndIx]
  }
  @scala.inline
  implicit class AnonEndIxOps[Self <: AnonEndIx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndIx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertIx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertIx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertIx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertIx")(js.undefined)
        ret
    }
  }
  
}

