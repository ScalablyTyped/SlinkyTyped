package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragTooltip extends js.Object {
  /** Specifies option to enable/disable tooltip while drag and drop a row.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies the data source fields to be displayed in the drag tooltip.
    * @Default {[]}
    */
  var tooltipItems: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the custom template for drag tooltip.
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
}

object DragTooltip {
  @scala.inline
  def apply(): DragTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragTooltip]
  }
  @scala.inline
  implicit class DragTooltipOps[Self <: DragTooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipItems")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(js.undefined)
        ret
    }
  }
  
}

