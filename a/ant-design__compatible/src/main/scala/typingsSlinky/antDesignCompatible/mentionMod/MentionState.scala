package typingsSlinky.antDesignCompatible.mentionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MentionState extends js.Object {
  var filteredSuggestions: js.UndefOr[js.Array[_]] = js.native
  var focus: js.UndefOr[Boolean] = js.native
}

object MentionState {
  @scala.inline
  def apply(): MentionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MentionState]
  }
  @scala.inline
  implicit class MentionStateOps[Self <: MentionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilteredSuggestions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
  }
  
}

