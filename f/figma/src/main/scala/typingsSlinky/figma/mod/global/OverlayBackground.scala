package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.NONE
import typingsSlinky.figma.figmaStrings.SOLID_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.anon.`2`
  - typingsSlinky.figma.anon.Color
*/
trait OverlayBackground extends js.Object

object OverlayBackground {
  @scala.inline
  def `2`(`type`: NONE): OverlayBackground = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayBackground]
  }
  @scala.inline
  def Color(color: RGBA, `type`: SOLID_COLOR): OverlayBackground = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayBackground]
  }
}

