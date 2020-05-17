package typingsSlinky.ionicCore.rangeInterfaceMod

import typingsSlinky.ionicCore.anon.Lower
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.ionicCore.anon.Lower
*/
trait RangeValue extends js.Object

object RangeValue {
  @scala.inline
  implicit def apply(value: Double): RangeValue = value.asInstanceOf[RangeValue]
  @scala.inline
  implicit def apply(value: Lower): RangeValue = value.asInstanceOf[RangeValue]
}

