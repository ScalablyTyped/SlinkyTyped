package typingsSlinky.jsqubits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Array[scala.Double]
  - typingsSlinky.jsqubits.jsqubitsStrings.ALL
  - typingsSlinky.jsqubits.mod.BitsRange
*/
trait SingleQubitOperatorTargetQubits extends js.Object

object SingleQubitOperatorTargetQubits {
  @scala.inline
  def ALL: typingsSlinky.jsqubits.jsqubitsStrings.ALL = "ALL".asInstanceOf[typingsSlinky.jsqubits.jsqubitsStrings.ALL]
  @scala.inline
  implicit def apply(value: js.Array[Double]): SingleQubitOperatorTargetQubits = value.asInstanceOf[SingleQubitOperatorTargetQubits]
  @scala.inline
  implicit def apply(value: BitsRange): SingleQubitOperatorTargetQubits = value.asInstanceOf[SingleQubitOperatorTargetQubits]
  @scala.inline
  implicit def apply(value: Double): SingleQubitOperatorTargetQubits = value.asInstanceOf[SingleQubitOperatorTargetQubits]
}

