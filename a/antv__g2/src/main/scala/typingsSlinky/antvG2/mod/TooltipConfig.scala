package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Booleans.`false`
import typingsSlinky.antvG2.antvG2Strings.mini
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antvG2.mod.HtmlTooltipConfig
  - typingsSlinky.antvG2.mod.CanvasTooltipConfig
  - typingsSlinky.antvG2.mod.MiniTooltipConfig
*/
trait TooltipConfig extends js.Object
object TooltipConfig {
  
  @scala.inline
  def HtmlTooltipConfig(): TooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipConfig]
  }
  
  @scala.inline
  def CanvasTooltipConfig(useHtml: `false`): TooltipConfig = {
    val __obj = js.Dynamic.literal(useHtml = useHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipConfig]
  }
  
  @scala.inline
  def MiniTooltipConfig(`type`: mini): TooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipConfig]
  }
}
