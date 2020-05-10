package typingsSlinky.materialUiCore.unstableUseMediaQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiMediaQueryListEvent extends js.Object {
  var matches: Boolean = js.native
}

object MuiMediaQueryListEvent {
  @scala.inline
  def apply(matches: Boolean): MuiMediaQueryListEvent = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiMediaQueryListEvent]
  }
  @scala.inline
  implicit class MuiMediaQueryListEventOps[Self <: MuiMediaQueryListEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

