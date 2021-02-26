package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.NONE
import typingsSlinky.figma.figmaStrings.SOLID_COLOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.anon.`2`
  - typingsSlinky.figma.anon.Color
*/
trait OverlayBackground extends StObject
object OverlayBackground {
  
  @scala.inline
  def `2`(`type`: NONE): typingsSlinky.figma.anon.`2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.anon.`2`]
  }
  
  @scala.inline
  def Color(color: RGBA, `type`: SOLID_COLOR): typingsSlinky.figma.anon.Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.anon.Color]
  }
}
