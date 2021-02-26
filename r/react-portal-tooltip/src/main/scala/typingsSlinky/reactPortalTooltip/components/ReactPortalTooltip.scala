package typingsSlinky.reactPortalTooltip.components

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.reactPortalTooltip.mod.default
import typingsSlinky.reactPortalTooltip.toolTipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPortalTooltip {
  
  @scala.inline
  def apply(parent: String | ReactElement | ReactRef[_]): SharedBuilder_TooltipProps1931880444[default] = {
    val __props = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    new SharedBuilder_TooltipProps1931880444[default](js.Array(this.component, __props.asInstanceOf[TooltipProps]))
  }
  
  @JSImport("react-portal-tooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TooltipProps): SharedBuilder_TooltipProps1931880444[default] = new SharedBuilder_TooltipProps1931880444[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
