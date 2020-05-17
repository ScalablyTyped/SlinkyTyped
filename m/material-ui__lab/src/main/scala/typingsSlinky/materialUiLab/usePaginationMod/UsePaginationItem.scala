package typingsSlinky.materialUiLab.usePaginationMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.materialUiLab.materialUiLabStrings.`end-ellipsis`
import typingsSlinky.materialUiLab.materialUiLabStrings.`start-ellipsis`
import typingsSlinky.materialUiLab.materialUiLabStrings.first
import typingsSlinky.materialUiLab.materialUiLabStrings.last
import typingsSlinky.materialUiLab.materialUiLabStrings.next
import typingsSlinky.materialUiLab.materialUiLabStrings.page
import typingsSlinky.materialUiLab.materialUiLabStrings.previous
import typingsSlinky.react.mod.ReactEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsePaginationItem extends js.Object {
  var disabled: Boolean = js.native
  var onClick: ReactEventHandler[Element] = js.native
  var page: Double = js.native
  var selected: Boolean = js.native
  var `type`: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis` = js.native
}

object UsePaginationItem {
  @scala.inline
  def apply(
    disabled: Boolean,
    onClick: SyntheticEvent[Event, Element] => Unit,
    page: Double,
    selected: Boolean,
    `type`: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`
  ): UsePaginationItem = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), page = page.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePaginationItem]
  }
  @scala.inline
  implicit class UsePaginationItemOps[Self <: UsePaginationItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: SyntheticEvent[Event, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

