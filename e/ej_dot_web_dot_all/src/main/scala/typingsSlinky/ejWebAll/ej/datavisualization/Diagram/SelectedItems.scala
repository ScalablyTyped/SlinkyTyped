package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedItems extends js.Object {
  /** A read only collection of the selected items
    * @Default {[]}
    */
  var children: js.UndefOr[js.Array[_]] = js.native
  /** Controls the visibility of selector.
    * @Default {ej.datavisualization.Diagram.SelectorConstraints.All}
    */
  var constraints: js.UndefOr[SelectorConstraints | String] = js.native
  /** Defines a method that dynamically enables/ disables the interaction with multiple selection.
    * @Default {null}
    */
  var getConstraints: js.UndefOr[js.Any] = js.native
  /** Sets the height of the selected items
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  /** Sets the x position of the selector
    * @Default {0}
    */
  var offsetX: js.UndefOr[Double] = js.native
  /** Sets the y position of the selector
    * @Default {0}
    */
  var offsetY: js.UndefOr[Double] = js.native
  /** Sets the angle to rotate the selected items
    * @Default {0}
    */
  var rotateAngle: js.UndefOr[Double] = js.native
  /** Sets the angle to rotate the selected items. For tooltip properties, refer Tooltip
    * @Default {ej.datavisualization.Diagram.Tooltip()}
    */
  var tooltip: js.UndefOr[js.Any] = js.native
  /** A collection of frequently used commands that will be added around the selector
    * @Default {[]}
    */
  var userHandles: js.UndefOr[js.Array[SelectedItemsUserHandle]] = js.native
  /** Sets the width of the selected items
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
}

object SelectedItems {
  @scala.inline
  def apply(): SelectedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItems]
  }
  @scala.inline
  implicit class SelectedItemsOps[Self <: SelectedItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraints(value: SelectorConstraints | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withGetConstraints(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withUserHandles(value: js.Array[SelectedItemsUserHandle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userHandles")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

