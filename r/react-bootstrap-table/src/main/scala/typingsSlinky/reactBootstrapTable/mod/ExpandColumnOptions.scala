package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandColumnOptions extends js.Object {
  /**
  	 * set the width of indicator column.
  	 */
  var columnWidth: js.UndefOr[Double | String] = js.native
  /**
  	 * If both an indicator column and a selection column are displaying, this specifies whether the indicator column
  	 * should be shown first. Default is true, false will move the expand indicator column after selection column.
  	 */
  var expandColumnBeforeSelectColumn: js.UndefOr[Boolean] = js.native
  /**
  	 * a callback function to customize the appearance of the indicator column.
  	 */
  var expandColumnComponent: js.UndefOr[js.Function1[/* props */ ExpandColumnComponentProps, String | ReactElement]] = js.native
  /**
  	 * Will enable an indicator column at first column if true. Default is false.
  	 */
  var expandColumnVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * a callback function to customise the header column
  	 */
  var expandedColumnHeaderComponent: js.UndefOr[js.Function1[/* props */ ExpandedColumnHeaderProps, String | ReactElement]] = js.native
}

object ExpandColumnOptions {
  @scala.inline
  def apply(): ExpandColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandColumnOptions]
  }
  @scala.inline
  implicit class ExpandColumnOptionsOps[Self <: ExpandColumnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandColumnBeforeSelectColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColumnBeforeSelectColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandColumnBeforeSelectColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColumnBeforeSelectColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandColumnComponent(value: /* props */ ExpandColumnComponentProps => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColumnComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpandColumnComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColumnComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandColumnVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColumnVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandColumnVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColumnVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedColumnHeaderComponent(value: /* props */ ExpandedColumnHeaderProps => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedColumnHeaderComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpandedColumnHeaderComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedColumnHeaderComponent")(js.undefined)
        ret
    }
  }
  
}

