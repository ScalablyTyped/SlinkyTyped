package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.inside
import typingsSlinky.atom.atomStrings.never
import typingsSlinky.atom.atomStrings.overlap
import typingsSlinky.atom.atomStrings.surround
import typingsSlinky.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintainHistory extends js.Object {
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
  var maintainHistory: js.UndefOr[Boolean] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
}

object MaintainHistory {
  @scala.inline
  def apply(): MaintainHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintainHistory]
  }
  @scala.inline
  implicit class MaintainHistoryOps[Self <: MaintainHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidate(value: never | surround | overlap | inside | touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
  }
  
}

