package typingsSlinky.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECCurveFp extends js.Object {
  var a: ECFieldElementFp = js.native
  var b: ECFieldElementFp = js.native
  var infinity: ECPointFp = js.native
  var q: BigInteger = js.native
  def decodePointHex(): ECPointFp | Null = js.native
  def equals(): Boolean = js.native
  def fromBigInteger(): ECFieldElementFp = js.native
  def getA(): ECFieldElementFp = js.native
  def getB(): ECFieldElementFp = js.native
  def getInfinity(): ECPointFp = js.native
  def getQ(): BigInteger = js.native
}

object ECCurveFp {
  @scala.inline
  def apply(
    a: ECFieldElementFp,
    b: ECFieldElementFp,
    decodePointHex: () => ECPointFp | Null,
    equals: () => Boolean,
    fromBigInteger: () => ECFieldElementFp,
    getA: () => ECFieldElementFp,
    getB: () => ECFieldElementFp,
    getInfinity: () => ECPointFp,
    getQ: () => BigInteger,
    infinity: ECPointFp,
    q: BigInteger
  ): ECCurveFp = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], decodePointHex = js.Any.fromFunction0(decodePointHex), equals = js.Any.fromFunction0(equals), fromBigInteger = js.Any.fromFunction0(fromBigInteger), getA = js.Any.fromFunction0(getA), getB = js.Any.fromFunction0(getB), getInfinity = js.Any.fromFunction0(getInfinity), getQ = js.Any.fromFunction0(getQ), infinity = infinity.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECCurveFp]
  }
  @scala.inline
  implicit class ECCurveFpOps[Self <: ECCurveFp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: ECFieldElementFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: ECFieldElementFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecodePointHex(value: () => ECPointFp | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodePointHex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEquals(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFromBigInteger(value: () => ECFieldElementFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBigInteger")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetA(value: () => ECFieldElementFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetB(value: () => ECFieldElementFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInfinity(value: () => ECPointFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfinity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetQ(value: () => BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQ")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInfinity(value: ECPointFp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ(value: BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

