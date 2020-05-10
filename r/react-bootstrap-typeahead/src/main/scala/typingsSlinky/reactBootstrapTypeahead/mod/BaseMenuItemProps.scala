package typingsSlinky.reactBootstrapTypeahead.mod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.li
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMenuItemProps
  extends AllHTMLAttributes[li]
     with ClassAttributes[li] {
  var active: js.UndefOr[Boolean] = js.native
}

object BaseMenuItemProps {
  @scala.inline
  def apply(): BaseMenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMenuItemProps]
  }
  @scala.inline
  implicit class BaseMenuItemPropsOps[Self <: BaseMenuItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
  }
  
}

