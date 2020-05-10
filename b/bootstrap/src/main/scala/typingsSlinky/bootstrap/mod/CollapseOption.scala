package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.bootstrap.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseOption extends js.Object {
  /**
    * If parent is provided, then all collapsible elements under the specified parent will be closed when
    * this collapsible item is shown. (similar to traditional accordion behavior - this is dependent on the card class).
    * The attribute has to be set on the target collapsible area.
    *
    * @default ""
    */
  var parent: js.UndefOr[String | JQuery[HTMLElement] | Element] = js.native
  /**
    * Toggles the collapsible element on invocation.
    *
    * @default true
    */
  var toggle: js.UndefOr[Boolean] = js.native
}

object CollapseOption {
  @scala.inline
  def apply(): CollapseOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseOption]
  }
  @scala.inline
  implicit class CollapseOptionOps[Self <: CollapseOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: String | JQuery[HTMLElement] | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
  }
  
}

