package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsymmetricMatcher[TValue] extends js.Object {
  var jasmineToString: js.UndefOr[js.Function0[String]] = js.native
  def asymmetricMatch(other: TValue, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
}

object AsymmetricMatcher {
  @scala.inline
  def apply[TValue](asymmetricMatch: (TValue, js.Array[CustomEqualityTester]) => Boolean): AsymmetricMatcher[TValue] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch))
    __obj.asInstanceOf[AsymmetricMatcher[TValue]]
  }
  @scala.inline
  implicit class AsymmetricMatcherOps[Self[tvalue] <: AsymmetricMatcher[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def withAsymmetricMatch(value: (TValue, js.Array[CustomEqualityTester]) => Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asymmetricMatch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withJasmineToString(value: () => String): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineToString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutJasmineToString: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineToString")(js.undefined)
        ret
    }
  }
  
}

