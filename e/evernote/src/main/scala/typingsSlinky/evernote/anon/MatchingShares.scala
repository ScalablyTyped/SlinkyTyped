package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.SharedNotebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchingShares extends js.Object {
  var matchingShares: js.UndefOr[js.Array[SharedNotebook]] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
}

object MatchingShares {
  @scala.inline
  def apply(): MatchingShares = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchingShares]
  }
  @scala.inline
  implicit class MatchingSharesOps[Self <: MatchingShares] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchingShares(value: js.Array[SharedNotebook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingShares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchingShares: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingShares")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateSequenceNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSequenceNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSequenceNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSequenceNum")(js.undefined)
        ret
    }
  }
  
}

