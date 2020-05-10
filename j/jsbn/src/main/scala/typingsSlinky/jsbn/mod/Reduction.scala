package typingsSlinky.jsbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reduction extends js.Object {
  def convert(x: BigInteger): BigInteger = js.native
  def mulTo(x: BigInteger, y: BigInteger, r: BigInteger): Unit = js.native
  def reduce(x: BigInteger): Unit = js.native
  def revert(x: BigInteger): BigInteger = js.native
  def sqrTo(x: BigInteger, r: BigInteger): Unit = js.native
}

object Reduction {
  @scala.inline
  def apply(
    convert: BigInteger => BigInteger,
    mulTo: (BigInteger, BigInteger, BigInteger) => Unit,
    reduce: BigInteger => Unit,
    revert: BigInteger => BigInteger,
    sqrTo: (BigInteger, BigInteger) => Unit
  ): Reduction = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), mulTo = js.Any.fromFunction3(mulTo), reduce = js.Any.fromFunction1(reduce), revert = js.Any.fromFunction1(revert), sqrTo = js.Any.fromFunction2(sqrTo))
    __obj.asInstanceOf[Reduction]
  }
  @scala.inline
  implicit class ReductionOps[Self <: Reduction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvert(value: BigInteger => BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMulTo(value: (BigInteger, BigInteger, BigInteger) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mulTo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReduce(value: BigInteger => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: BigInteger => BigInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSqrTo(value: (BigInteger, BigInteger) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqrTo")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

