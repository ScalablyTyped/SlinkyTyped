package typingsSlinky.ionicCore.rangeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCore.ionicCoreStrings.A
  - typingsSlinky.ionicCore.ionicCoreStrings.B
  - js.UndefOr[scala.Nothing]
*/
trait KnobName extends js.Object

object KnobName {
  @scala.inline
  def A: typingsSlinky.ionicCore.ionicCoreStrings.A = "A".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.A]
  @scala.inline
  def B: typingsSlinky.ionicCore.ionicCoreStrings.B = "B".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.B]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => KnobName): KnobName = value.asInstanceOf[KnobName]
}

