package typingsSlinky.reactDatagrid.mod.ReactDataGrid

import typingsSlinky.reactDatagrid.AnonDisabledStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationToolbarProps extends js.Object {
  var iconProps: AnonDisabledStyle = js.native
  var iconSize: Double = js.native
  /**
    * Available page sizes.
    */
  var pageSizes: js.Array[Double] = js.native
  /**
    * Hide/show page sizes.
    */
  var showPageSize: Boolean = js.native
  /**
    * Customize icons.
    */
  var showRefreshIcon: Boolean = js.native
}

object PaginationToolbarProps {
  @scala.inline
  def apply(
    iconProps: AnonDisabledStyle,
    iconSize: Double,
    pageSizes: js.Array[Double],
    showPageSize: Boolean,
    showRefreshIcon: Boolean
  ): PaginationToolbarProps = {
    val __obj = js.Dynamic.literal(iconProps = iconProps.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], pageSizes = pageSizes.asInstanceOf[js.Any], showPageSize = showPageSize.asInstanceOf[js.Any], showRefreshIcon = showRefreshIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationToolbarProps]
  }
  @scala.inline
  implicit class PaginationToolbarPropsOps[Self <: PaginationToolbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconProps(value: AnonDisabledStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPageSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRefreshIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRefreshIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

