package typingsSlinky.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Panel/Panel.PanelFiltersProps> */
@js.native
trait PartialPanelFiltersProps extends js.Object {
  var className: js.UndefOr[String] = js.native
}

object PartialPanelFiltersProps {
  @scala.inline
  def apply(): PartialPanelFiltersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPanelFiltersProps]
  }
  @scala.inline
  implicit class PartialPanelFiltersPropsOps[Self <: PartialPanelFiltersProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
  }
  
}

