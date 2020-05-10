package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionGroup extends js.Object {
  /**
    * This field is true if this group is collapsed. A collapsed group remains
    * collapsed if an overlapping group at a shallower depth is expanded.
    *
    * A true value does not imply that all dimensions within the group are
    * hidden, since a dimension's visibility can change independently from this
    * group property. However, when this property is updated, all dimensions
    * within it are set to hidden if this field is true, or set to visible if
    * this field is false.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * The depth of the group, representing how many groups have a range that
    * wholly contains the range of this group.
    */
  var depth: js.UndefOr[Double] = js.native
  /** The range over which this group exists. */
  var range: js.UndefOr[DimensionRange] = js.native
}

object DimensionGroup {
  @scala.inline
  def apply(): DimensionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionGroup]
  }
  @scala.inline
  implicit class DimensionGroupOps[Self <: DimensionGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: DimensionRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

