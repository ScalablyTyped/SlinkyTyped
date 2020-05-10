package typingsSlinky.doublearray.doublearray

import typingsSlinky.doublearray.AnonAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoubleArray extends js.Object {
  var bc: BaseAndCheck = js.native
  def calc(): AnonAll = js.native
  def commonPrefixSearch(key: String): KeyValue = js.native
  def contain(key: String): Boolean = js.native
  def dump(): String = js.native
  def lookup(key: String): Double = js.native
  def size(): Double = js.native
  def traverse(parent: Double, code: Double): Double = js.native
}

object DoubleArray {
  @scala.inline
  def apply(
    bc: BaseAndCheck,
    calc: () => AnonAll,
    commonPrefixSearch: String => KeyValue,
    contain: String => Boolean,
    dump: () => String,
    lookup: String => Double,
    size: () => Double,
    traverse: (Double, Double) => Double
  ): DoubleArray = {
    val __obj = js.Dynamic.literal(bc = bc.asInstanceOf[js.Any], calc = js.Any.fromFunction0(calc), commonPrefixSearch = js.Any.fromFunction1(commonPrefixSearch), contain = js.Any.fromFunction1(contain), dump = js.Any.fromFunction0(dump), lookup = js.Any.fromFunction1(lookup), size = js.Any.fromFunction0(size), traverse = js.Any.fromFunction2(traverse))
    __obj.asInstanceOf[DoubleArray]
  }
  @scala.inline
  implicit class DoubleArrayOps[Self <: DoubleArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBc(value: BaseAndCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalc(value: () => AnonAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCommonPrefixSearch(value: String => KeyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonPrefixSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContain(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDump(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dump")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLookup(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTraverse(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverse")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

