package typingsSlinky.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdaptiveBinaryIndices extends js.Object {
  var adaptiveBinaryIndices: js.UndefOr[Boolean] = js.native
}

object AdaptiveBinaryIndices {
  @scala.inline
  def apply(): AdaptiveBinaryIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdaptiveBinaryIndices]
  }
  @scala.inline
  implicit class AdaptiveBinaryIndicesOps[Self <: AdaptiveBinaryIndices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveBinaryIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveBinaryIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveBinaryIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveBinaryIndices")(js.undefined)
        ret
    }
  }
  
}

