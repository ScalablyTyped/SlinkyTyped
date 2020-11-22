package typingsSlinky.reactEllipsisWithTooltip.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`auto-end`
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`auto-start`
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`bottom-end`
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`bottom-start`
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`left-end`
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`left-start`
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`right-end`
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`right-start`
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`top-end`
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`top-start`
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.auto
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.bottom
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.left
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.right
import typingsSlinky.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EllipsisWithTooltipProps extends js.Object {
  
  var children: ReactElement = js.native
  
  var delayHide: js.UndefOr[Double] = js.native
  
  var delayShow: js.UndefOr[Double] = js.native
  
  var placement: js.UndefOr[
    `auto-start` | auto | `auto-end` | `top-start` | top | `top-end` | `right-start` | right | `right-end` | `bottom-end` | bottom | `bottom-start` | `left-end` | left | `left-start`
  ] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object EllipsisWithTooltipProps {
  
  @scala.inline
  def apply(): EllipsisWithTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipsisWithTooltipProps]
  }
  
  @scala.inline
  implicit class EllipsisWithTooltipPropsOps[Self <: EllipsisWithTooltipProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDelayHide(value: Double): Self = this.set("delayHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayHide: Self = this.set("delayHide", js.undefined)
    
    @scala.inline
    def setDelayShow(value: Double): Self = this.set("delayShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayShow: Self = this.set("delayShow", js.undefined)
    
    @scala.inline
    def setPlacement(
      value: `auto-start` | auto | `auto-end` | `top-start` | top | `top-end` | `right-start` | right | `right-end` | `bottom-end` | bottom | `bottom-start` | `left-end` | left | `left-start`
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
