package typingsSlinky.reactstrap.collapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UncontrolledCollapseProps extends CollapseProps {
  var defaultOpen: js.UndefOr[Boolean] = js.native
  var toggleEvents: js.UndefOr[js.Array[String]] = js.native
  var toggler: String = js.native
}

object UncontrolledCollapseProps {
  @scala.inline
  def apply(toggler: String): UncontrolledCollapseProps = {
    val __obj = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncontrolledCollapseProps]
  }
  @scala.inline
  implicit class UncontrolledCollapsePropsOps[Self <: UncontrolledCollapseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToggler(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleEvents")(js.undefined)
        ret
    }
  }
  
}

