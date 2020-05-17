package typingsSlinky.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECPointFp extends js.Object {
  var curve: ECFieldElementFp = js.native
  var x: ECFieldElementFp = js.native
  var y: ECFieldElementFp = js.native
  var z: BigInteger = js.native
  var zinv: BigInteger | Null = js.native
}

object ECPointFp {
  @scala.inline
  def apply(curve: ECFieldElementFp, x: ECFieldElementFp, y: ECFieldElementFp, z: BigInteger): ECPointFp = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECPointFp]
  }
  @scala.inline
  implicit class ECPointFpOps[Self <: ECPointFp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurve(value: ECFieldElementFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: ECFieldElementFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: ECFieldElementFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZinv(value: BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zinv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZinvNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zinv")(null)
        ret
    }
  }
  
}

