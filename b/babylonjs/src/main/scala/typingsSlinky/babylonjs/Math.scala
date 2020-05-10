package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Math extends js.Object {
  def fround(x: Double): Double = js.native
  def imul(a: Double, b: Double): Double = js.native
}

object Math {
  @scala.inline
  def apply(fround: Double => Double, imul: (Double, Double) => Double): Math = {
    val __obj = js.Dynamic.literal(fround = js.Any.fromFunction1(fround), imul = js.Any.fromFunction2(imul))
    __obj.asInstanceOf[Math]
  }
  @scala.inline
  implicit class MathOps[Self <: Math] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFround(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fround")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImul(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imul")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

