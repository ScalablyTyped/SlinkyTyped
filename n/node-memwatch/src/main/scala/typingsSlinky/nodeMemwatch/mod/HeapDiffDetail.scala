package typingsSlinky.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeapDiffDetail extends js.Object {
  @JSName("+")
  var Plussign: Double = js.native
  @JSName("-")
  var _dash: Double = js.native
  var size: String = js.native
  var size_bytes: Double = js.native
  var what: String = js.native
}

object HeapDiffDetail {
  @scala.inline
  def apply(Plussign: Double, _dash: Double, size: String, size_bytes: Double, what: String): HeapDiffDetail = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
    __obj.updateDynamic("+")(Plussign.asInstanceOf[js.Any])
    __obj.updateDynamic("-")(_dash.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapDiffDetail]
  }
  @scala.inline
  implicit class HeapDiffDetailOps[Self <: HeapDiffDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlussign(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("+")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_dash(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize_bytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size_bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("what")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

