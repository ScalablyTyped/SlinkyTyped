package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Booleans.`false`
import typingsSlinky.antvG2.antvG2Strings.mini
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antvG2.mod.HtmlTooltipConfig
  - typingsSlinky.antvG2.mod.CanvasTooltipConfig
  - typingsSlinky.antvG2.mod.MiniTooltipConfig
*/
trait TooltipConfig extends StObject
object TooltipConfig {
  
  @scala.inline
  def CanvasTooltipConfig(useHtml: `false`): typingsSlinky.antvG2.mod.CanvasTooltipConfig = {
    val __obj = js.Dynamic.literal(useHtml = useHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.antvG2.mod.CanvasTooltipConfig]
  }
  
  @scala.inline
  def HtmlTooltipConfig(): typingsSlinky.antvG2.mod.HtmlTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.antvG2.mod.HtmlTooltipConfig]
  }
  
  @scala.inline
  def MiniTooltipConfig(`type`: mini): typingsSlinky.antvG2.mod.MiniTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.antvG2.mod.MiniTooltipConfig]
  }
}
