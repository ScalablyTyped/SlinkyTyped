package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragTooltip extends js.Object {
  /** Specifies whether to show tooltip while dragging a row.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Option to add field names whose corresponding values in the dragged row needs to be shown in the preview tooltip.
    * @Default {[]}
    */
  var tooltipItems: js.UndefOr[js.Array[_]] = js.native
  /** Custom template for that tooltip that is shown while dragging a row.
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

