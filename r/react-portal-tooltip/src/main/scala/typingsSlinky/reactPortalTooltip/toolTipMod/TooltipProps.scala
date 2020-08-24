package typingsSlinky.reactPortalTooltip.toolTipMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.reactPortalTooltip.cardMod.Card.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipProps extends CardProps {
  var active: js.UndefOr[Boolean] = js.native
  var group: js.UndefOr[String] = js.native
  var parent: String | ReactElement | ReactRef[_] = js.native
  var tooltipTimeout: js.UndefOr[Double] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(parent: String | ReactElement | ReactRef[_]): TooltipProps = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParentReactElement(value: ReactElement): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentRefObject(value: ReactRef[_]): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: String | ReactElement | ReactRef[_]): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setTooltipTimeout(value: Double): Self = this.set("tooltipTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipTimeout: Self = this.set("tooltipTimeout", js.undefined)
  }
  
}

