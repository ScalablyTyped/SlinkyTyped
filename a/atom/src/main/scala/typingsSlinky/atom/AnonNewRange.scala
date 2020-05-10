package typingsSlinky.atom

import typingsSlinky.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewRange extends js.Object {
  /** The Range of the inserted text in the current contents of the buffer. */
  var newRange: Range = js.native
  /**
    *  The Range of the deleted text in the contents of the buffer as it existed
    *  before the batch of changes reported by this event.
    */
  var oldRange: Range = js.native
}

object AnonNewRange {
  @scala.inline
  def apply(newRange: Range, oldRange: Range): AnonNewRange = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewRange]
  }
  @scala.inline
  implicit class AnonNewRangeOps[Self <: AnonNewRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

