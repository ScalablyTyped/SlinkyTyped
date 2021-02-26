package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.BACKGROUND_BLUR
import typingsSlinky.figma.figmaStrings.DROP_SHADOW
import typingsSlinky.figma.figmaStrings.INNER_SHADOW
import typingsSlinky.figma.figmaStrings.LAYER_BLUR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.ShadowEffect
  - typingsSlinky.figma.mod.global.BlurEffect
*/
trait Effect extends StObject
object Effect {
  
  @scala.inline
  def BlurEffect(radius: Double, `type`: LAYER_BLUR | BACKGROUND_BLUR, visible: Boolean): typingsSlinky.figma.mod.global.BlurEffect = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.mod.global.BlurEffect]
  }
  
  @scala.inline
  def ShadowEffect(
    blendMode: BlendMode,
    color: RGBA,
    offset: Vector,
    radius: Double,
    `type`: DROP_SHADOW | INNER_SHADOW,
    visible: Boolean
  ): typingsSlinky.figma.mod.global.ShadowEffect = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.mod.global.ShadowEffect]
  }
}
