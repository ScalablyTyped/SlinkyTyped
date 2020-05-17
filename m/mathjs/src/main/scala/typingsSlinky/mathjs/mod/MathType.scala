package typingsSlinky.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.mathjs.mod.BigNumber
  - typingsSlinky.mathjs.mod.Fraction
  - typingsSlinky.mathjs.mod.Complex
  - typingsSlinky.mathjs.mod.Unit
  - typingsSlinky.mathjs.mod.MathArray
  - typingsSlinky.mathjs.mod.Matrix
*/
trait MathType extends js.Object

object MathType {
  @scala.inline
  implicit def apply(value: BigNumber): MathType = value.asInstanceOf[MathType]
  @scala.inline
  implicit def apply(value: Complex): MathType = value.asInstanceOf[MathType]
  @scala.inline
  implicit def apply(value: Double): MathType = value.asInstanceOf[MathType]
  @scala.inline
  implicit def apply(value: Fraction): MathType = value.asInstanceOf[MathType]
  @scala.inline
  implicit def apply(value: MathArray): MathType = value.asInstanceOf[MathType]
  @scala.inline
  implicit def apply(value: Matrix): MathType = value.asInstanceOf[MathType]
  @scala.inline
  implicit def apply(value: Unit): MathType = value.asInstanceOf[MathType]
}

