package typingsSlinky.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPossibleBreakpointsParameterType extends js.Object {
  /**
    * End of range to search possible breakpoint locations in (excluding). When not specified, end of scripts is used as end of range.
    */
  var end: js.UndefOr[Location] = js.native
  /**
    * Only consider locations which are in the same (non-nested) function as start.
    */
  var restrictToFunction: js.UndefOr[Boolean] = js.native
  /**
    * Start of range to search possible breakpoint locations in.
    */
  var start: Location = js.native
}

object GetPossibleBreakpointsParameterType {
  @scala.inline
  def apply(start: Location): GetPossibleBreakpointsParameterType = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPossibleBreakpointsParameterType]
  }
  @scala.inline
  implicit class GetPossibleBreakpointsParameterTypeOps[Self <: GetPossibleBreakpointsParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStart(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictToFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictToFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictToFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictToFunction")(js.undefined)
        ret
    }
  }
  
}

