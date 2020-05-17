package typingsSlinky.sat.SAT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var a: js.Any = js.native
  var aInB: Boolean = js.native
  var b: js.Any = js.native
  var bInA: Boolean = js.native
  var overlap: Double = js.native
  var overlapN: Vector = js.native
  var overlapV: Vector = js.native
  def clear(): Response = js.native
}

object Response {
  @scala.inline
  def apply(
    a: js.Any,
    aInB: Boolean,
    b: js.Any,
    bInA: Boolean,
    clear: () => Response,
    overlap: Double,
    overlapN: Vector,
    overlapV: Vector
  ): Response = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], aInB = aInB.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], bInA = bInA.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), overlap = overlap.asInstanceOf[js.Any], overlapN = overlapN.asInstanceOf[js.Any], overlapV = overlapV.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAInB(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aInB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBInA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bInA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOverlap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlapN(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlapV(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapV")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

