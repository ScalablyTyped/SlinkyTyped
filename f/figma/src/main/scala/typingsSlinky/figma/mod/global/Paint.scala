package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.CROP
import typingsSlinky.figma.figmaStrings.FILL
import typingsSlinky.figma.figmaStrings.FIT
import typingsSlinky.figma.figmaStrings.GRADIENT_ANGULAR
import typingsSlinky.figma.figmaStrings.GRADIENT_DIAMOND
import typingsSlinky.figma.figmaStrings.GRADIENT_LINEAR
import typingsSlinky.figma.figmaStrings.GRADIENT_RADIAL
import typingsSlinky.figma.figmaStrings.IMAGE
import typingsSlinky.figma.figmaStrings.SOLID
import typingsSlinky.figma.figmaStrings.TILE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.SolidPaint
  - typingsSlinky.figma.mod.global.GradientPaint
  - typingsSlinky.figma.mod.global.ImagePaint
*/
trait Paint extends StObject
object Paint {
  
  @scala.inline
  def GradientPaint(
    gradientStops: js.Array[ColorStop],
    gradientTransform: Transform,
    `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND
  ): typingsSlinky.figma.mod.global.GradientPaint = {
    val __obj = js.Dynamic.literal(gradientStops = gradientStops.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.mod.global.GradientPaint]
  }
  
  @scala.inline
  def ImagePaint(scaleMode: FILL | FIT | CROP | TILE, `type`: IMAGE): typingsSlinky.figma.mod.global.ImagePaint = {
    val __obj = js.Dynamic.literal(scaleMode = scaleMode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.mod.global.ImagePaint]
  }
  
  @scala.inline
  def SolidPaint(color: RGB, `type`: SOLID): typingsSlinky.figma.mod.global.SolidPaint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.mod.global.SolidPaint]
  }
}
