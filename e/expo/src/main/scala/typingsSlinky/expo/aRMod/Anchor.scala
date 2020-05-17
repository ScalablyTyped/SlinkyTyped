package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expo.aRMod.BaseAnchor
  - typingsSlinky.expo.aRMod.PlaneAnchor
  - typingsSlinky.expo.aRMod.ImageAnchor
  - typingsSlinky.expo.aRMod.FaceAnchor
*/
trait Anchor extends js.Object

object Anchor {
  @scala.inline
  implicit def apply(value: BaseAnchor): Anchor = value.asInstanceOf[Anchor]
  @scala.inline
  implicit def apply(value: FaceAnchor): Anchor = value.asInstanceOf[Anchor]
  @scala.inline
  implicit def apply(value: ImageAnchor): Anchor = value.asInstanceOf[Anchor]
  @scala.inline
  implicit def apply(value: PlaneAnchor): Anchor = value.asInstanceOf[Anchor]
}

