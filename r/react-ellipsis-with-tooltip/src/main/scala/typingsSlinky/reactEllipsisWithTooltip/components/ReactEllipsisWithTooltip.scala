package typingsSlinky.reactEllipsisWithTooltip.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactEllipsisWithTooltip.mod.EllipsisWithTooltipProps
import typingsSlinky.reactEllipsisWithTooltip.mod.default
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactEllipsisWithTooltip {
  
  @JSImport("react-ellipsis-with-tooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def delayHide(value: Double): this.type = set("delayHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayShow(value: Double): this.type = set("delayShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(
      value: `auto-start` | auto | `auto-end` | `top-start` | top | `top-end` | `right-start` | right | `right-end` | `bottom-end` | bottom | `bottom-start` | `left-end` | left | `left-start`
    ): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactEllipsisWithTooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EllipsisWithTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
