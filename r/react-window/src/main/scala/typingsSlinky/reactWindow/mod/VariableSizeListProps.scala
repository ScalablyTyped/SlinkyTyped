package typingsSlinky.reactWindow.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableSizeListProps extends ListProps {
  /**
    * Estimated size of a item in the direction being windowed. For vertical lists, this is the row height. For horizontal lists, this is the column width.
    *
    * This value is used to calculated the estimated total size of a list before its items have all been measured. The total size impacts user scrolling behavior.
    * It is updated whenever new items are measured.
    */
  var estimatedItemSize: js.UndefOr[Double] = js.native
  /**
    * Returns the size of a item in the direction being windowed. For vertical lists, this is the row height. For horizontal lists, this is the column width.
    */
  def itemSize(index: Double): Double = js.native
}

object VariableSizeListProps {
  @scala.inline
  def apply(
    children: ReactComponentClass[ListChildComponentProps],
    height: Double | String,
    itemCount: Double,
    itemSize: Double => Double,
    width: Double | String
  ): VariableSizeListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemSize = js.Any.fromFunction1(itemSize), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableSizeListProps]
  }
  @scala.inline
  implicit class VariableSizeListPropsOps[Self <: VariableSizeListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemSize(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEstimatedItemSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedItemSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedItemSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedItemSize")(js.undefined)
        ret
    }
  }
  
}

