package typingsSlinky.mochaSugarFree.mod

import typingsSlinky.mochaSugarFree.mochaSugarFreeBooleans.`false`
import typingsSlinky.mochaSugarFree.mochaSugarFreeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region Test context
@js.native
trait SuiteContext extends js.Object {
  var isHook: `false` = js.native
  var isSuite: `true` = js.native
  var isTest: `false` = js.native
}

object SuiteContext {
  @scala.inline
  def apply(isHook: `false`, isSuite: `true`, isTest: `false`): SuiteContext = {
    val __obj = js.Dynamic.literal(isHook = isHook.asInstanceOf[js.Any], isSuite = isSuite.asInstanceOf[js.Any], isTest = isTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteContext]
  }
  @scala.inline
  implicit class SuiteContextOps[Self <: SuiteContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsHook(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSuite(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTest(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

