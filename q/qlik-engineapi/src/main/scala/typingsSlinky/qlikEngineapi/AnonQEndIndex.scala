package typingsSlinky.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQEndIndex extends js.Object {
  var qEndIndex: Double = js.native
  var qStartIndex: Double = js.native
}

object AnonQEndIndex {
  @scala.inline
  def apply(qEndIndex: Double, qStartIndex: Double): AnonQEndIndex = {
    val __obj = js.Dynamic.literal(qEndIndex = qEndIndex.asInstanceOf[js.Any], qStartIndex = qStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQEndIndex]
  }
  @scala.inline
  implicit class AnonQEndIndexOps[Self <: AnonQEndIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQEndIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qEndIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

