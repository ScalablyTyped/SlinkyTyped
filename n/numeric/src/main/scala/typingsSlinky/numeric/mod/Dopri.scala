package typingsSlinky.numeric.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dopri extends js.Object {
  var events: js.UndefOr[Boolean | VectorBoolean] = js.native
  var f: Vector = js.native
  var iterations: Double = js.native
  var msg: String = js.native
  var x: Vector = js.native
  var y: Vector = js.native
  var ymid: Vector = js.native
  def at(x: Vector): Vector | Matrix = js.native
}

object Dopri {
  @scala.inline
  def apply(
    at: Vector => Vector | Matrix,
    f: Vector,
    iterations: Double,
    msg: String,
    x: Vector,
    y: Vector,
    ymid: Vector
  ): Dopri = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), f = f.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], ymid = ymid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dopri]
  }
  @scala.inline
  implicit class DopriOps[Self <: Dopri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAt(value: Vector => Vector | Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withF(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYmid(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: Boolean | VectorBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
  }
  
}

