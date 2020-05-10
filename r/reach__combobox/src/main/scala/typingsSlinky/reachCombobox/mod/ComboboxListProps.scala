package typingsSlinky.reachCombobox.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComboboxListProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var persistSelection: js.UndefOr[Boolean] = js.native
}

object ComboboxListProps {
  @scala.inline
  def apply(): ComboboxListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboboxListProps]
  }
  @scala.inline
  implicit class ComboboxListPropsOps[Self <: ComboboxListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersistSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistSelection")(js.undefined)
        ret
    }
  }
  
}

