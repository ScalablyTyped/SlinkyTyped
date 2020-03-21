package typingsSlinky.mathjs

import typingsSlinky.mathjs.mod.MathArray
import typingsSlinky.mathjs.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonL extends js.Object {
  var L: MathArray | Matrix
  var P: js.Array[Double]
  var U: MathArray | Matrix
}

object AnonL {
  @scala.inline
  def apply(L: MathArray | Matrix, P: js.Array[Double], U: MathArray | Matrix): AnonL = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonL]
  }
}

