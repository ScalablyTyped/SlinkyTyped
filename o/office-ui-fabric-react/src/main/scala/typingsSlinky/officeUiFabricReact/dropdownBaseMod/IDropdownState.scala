package typingsSlinky.officeUiFabricReact.dropdownBaseMod

import typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownState extends js.Object {
  var calloutRenderEdge: js.UndefOr[RectangleEdge] = js.native
  /** Whether the root dropdown element has focus. */
  var hasFocus: Boolean = js.native
  var isOpen: Boolean = js.native
  var selectedIndices: js.Array[Double] = js.native
}

object IDropdownState {
  @scala.inline
  def apply(hasFocus: Boolean, isOpen: Boolean, selectedIndices: js.Array[Double]): IDropdownState = {
    val __obj = js.Dynamic.literal(hasFocus = hasFocus.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectedIndices = selectedIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownState]
  }
  @scala.inline
  implicit class IDropdownStateOps[Self <: IDropdownState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalloutRenderEdge(value: RectangleEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutRenderEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutRenderEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutRenderEdge")(js.undefined)
        ret
    }
  }
  
}

