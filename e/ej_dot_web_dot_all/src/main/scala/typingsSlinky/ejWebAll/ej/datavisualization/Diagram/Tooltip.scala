package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip extends js.Object {
  /** Aligns the tooltip around nodes/connectors
    */
  var alignment: js.UndefOr[TooltipAlignment] = js.native
  /** Sets the margin of the tooltip
    * @Default {{ left: 5, right: 5, top: 5, bottom: 5 }}
    */
  var margin: js.UndefOr[js.Any] = js.native
  /** Defines whether the tooltip should be shown at the mouse position or around node.
    * @Default {ej.datavisualization.Diagram.RelativeMode.Object}
    */
  var relativeMode: js.UndefOr[RelativeMode | String] = js.native
  /** Sets the svg/html template to be bound with tooltip
    */
  var templateId: js.UndefOr[String] = js.native
}

object Tooltip {
  @scala.inline
  def apply(): Tooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tooltip]
  }
  @scala.inline
  implicit class TooltipOps[Self <: Tooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: TooltipAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeMode(value: RelativeMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(js.undefined)
        ret
    }
  }
  
}

