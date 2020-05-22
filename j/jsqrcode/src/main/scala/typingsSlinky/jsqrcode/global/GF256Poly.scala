package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GF256Poly")
@js.native
class GF256Poly protected ()
  extends typingsSlinky.jsqrcode.GF256Poly {
  def this(field: typingsSlinky.jsqrcode.GF256, coefficients: js.Array[Double]) = this()
  /* CompleteClass */
  override val Coefficients: js.Array[Double] = js.native
  /* CompleteClass */
  override val Degree: Double = js.native
  /* CompleteClass */
  override val Zero: Boolean = js.native
  /* CompleteClass */
  override var coefficients: js.Array[Double] = js.native
  /* CompleteClass */
  override var field: typingsSlinky.jsqrcode.GF256 = js.native
  /* CompleteClass */
  override def addOrSubtract(other: typingsSlinky.jsqrcode.GF256Poly): typingsSlinky.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override def divide(other: typingsSlinky.jsqrcode.GF256Poly): js.Tuple2[typingsSlinky.jsqrcode.GF256Poly, typingsSlinky.jsqrcode.GF256Poly] = js.native
  /* CompleteClass */
  override def evaluateAt(a: Double): Double = js.native
  /* CompleteClass */
  override def getCoefficient(degree: Double): Double = js.native
  /* CompleteClass */
  override def multiply1(other: typingsSlinky.jsqrcode.GF256Poly): typingsSlinky.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override def multiply2(scalar: Double): typingsSlinky.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override def multiplyByMonomial(degree: Double, coefficient: Double): typingsSlinky.jsqrcode.GF256Poly = js.native
}

