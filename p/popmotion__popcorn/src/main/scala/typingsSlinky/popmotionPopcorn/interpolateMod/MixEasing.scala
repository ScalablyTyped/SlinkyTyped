package typingsSlinky.popmotionPopcorn.interpolateMod

import typingsSlinky.popmotionEasing.mod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.popmotionEasing.mod.Easing
  - js.Array[typingsSlinky.popmotionEasing.mod.Easing]
*/
trait MixEasing extends js.Object

object MixEasing {
  @scala.inline
  implicit def apply(value: js.Array[Easing]): MixEasing = value.asInstanceOf[MixEasing]
  @scala.inline
  implicit def apply(value: Easing): MixEasing = value.asInstanceOf[MixEasing]
}

