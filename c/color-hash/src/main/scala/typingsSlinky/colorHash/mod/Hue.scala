package typingsSlinky.colorHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.colorHash.mod.HueObject
  - js.Array[typingsSlinky.colorHash.mod.HueObject]
*/
trait Hue extends js.Object

object Hue {
  @scala.inline
  implicit def apply(value: js.Array[HueObject]): Hue = value.asInstanceOf[Hue]
  @scala.inline
  implicit def apply(value: Double): Hue = value.asInstanceOf[Hue]
  @scala.inline
  implicit def apply(value: HueObject): Hue = value.asInstanceOf[Hue]
}

