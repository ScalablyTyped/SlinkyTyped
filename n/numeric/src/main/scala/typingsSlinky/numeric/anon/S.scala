package typingsSlinky.numeric.anon

import typingsSlinky.numeric.mod.Matrix
import typingsSlinky.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S extends js.Object {
  var S: Vector = js.native
  var U: Matrix = js.native
  var V: Matrix = js.native
}

object S {
  @scala.inline
  def apply(S: Vector, U: Matrix, V: Matrix): S = {
    val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
    __obj.asInstanceOf[S]
  }
  @scala.inline
  implicit class SOps[Self <: S] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("U")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("V")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

