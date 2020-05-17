package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.ShadowEffect
  - typingsSlinky.figma.mod.global.BlurEffect
*/
trait Effect extends js.Object

object Effect {
  @scala.inline
  implicit def apply(value: BlurEffect): Effect = value.asInstanceOf[Effect]
  @scala.inline
  implicit def apply(value: ShadowEffect): Effect = value.asInstanceOf[Effect]
}

