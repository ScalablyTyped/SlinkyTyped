package typingsSlinky.reactPortalTooltip.statefulToolTipMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.reactPortalTooltip.toolTipMod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulToolTipProps extends TooltipProps {
  
  var className: js.UndefOr[String] = js.native
}
object StatefulToolTipProps {
  
  @scala.inline
  def apply(parent: String | ReactElement | ReactRef[_]): StatefulToolTipProps = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulToolTipProps]
  }
  
  @scala.inline
  implicit class StatefulToolTipPropsOps[Self <: StatefulToolTipProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
}
