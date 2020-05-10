package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipAlignment extends js.Object {
  /** Defines the horizontal alignment of tooltip.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontal: js.UndefOr[HorizontalAlignment | String] = js.native
  /** Defines the vertical alignment of tooltip.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Bottom}
    */
  var vertical: js.UndefOr[VerticalAlignment | String] = js.native
}

object TooltipAlignment {
  @scala.inline
  def apply(): TooltipAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipAlignment]
  }
  @scala.inline
  implicit class TooltipAlignmentOps[Self <: TooltipAlignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: HorizontalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: VerticalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

