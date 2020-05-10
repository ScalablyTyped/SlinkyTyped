package typingsSlinky.figma.mod._Global_

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod._Global_.SolidPaint
  - typingsSlinky.figma.mod._Global_.GradientPaint
  - typingsSlinky.figma.mod._Global_.ImagePaint
*/
trait Paint extends js.Object

object Paint {
  @scala.inline
  def SolidPaint(color: RGB, `type`: SOLID): Paint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paint]
  }
  @scala.inline
  def GradientPaint(
    gradientStops: js.Array[ColorStop],
    gradientTransform: Transform,
    `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND
  ): Paint = {
    val __obj = js.Dynamic.literal(gradientStops = gradientStops.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paint]
  }
  @scala.inline
  def ImagePaint(scaleMode: FILL | FIT | CROP | TILE, `type`: IMAGE): Paint = {
    val __obj = js.Dynamic.literal(scaleMode = scaleMode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paint]
  }
}

