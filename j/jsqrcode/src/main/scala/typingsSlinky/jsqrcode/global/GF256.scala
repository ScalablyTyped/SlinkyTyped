package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GF256")
@js.native
class GF256 protected ()
  extends typingsSlinky.jsqrcode.GF256 {
  def this(primitive: Double) = this()
  /* CompleteClass */
  override val One: typingsSlinky.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override val Zero: typingsSlinky.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override var expTable: js.Array[Double] = js.native
  /* CompleteClass */
  override var logTable: js.Array[Double] = js.native
  /* CompleteClass */
  override var one: typingsSlinky.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override var zero: typingsSlinky.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override def buildMonomial(degree: Double, coefficient: Double): typingsSlinky.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override def exp(a: Double): Double = js.native
  /* CompleteClass */
  override def inverse(a: Double): Double = js.native
  /* CompleteClass */
  override def log(a: Double): Double = js.native
  /* CompleteClass */
  override def multiply(a: Double, b: Double): Double = js.native
}

/* static members */
@JSGlobal("GF256")
@js.native
object GF256 extends js.Object {
  val DATA_MATRIX_FIELD: typingsSlinky.jsqrcode.GF256 = js.native
  val QR_CODE_FIELD: typingsSlinky.jsqrcode.GF256 = js.native
  def addOrSubtract(a: Double, b: Double): Double = js.native
}

