package typingsSlinky.mathjs

import typingsSlinky.mathjs.mathjsMod.MathArray
import typingsSlinky.mathjs.mathjsMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Q extends js.Object {
  var Q: MathArray | Matrix
  var R: MathArray | Matrix
}

object Anon_Q {
  @scala.inline
  def apply(Q: MathArray | Matrix, R: MathArray | Matrix): Anon_Q = {
    val __obj = js.Dynamic.literal(Q = Q.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Q]
  }
}

