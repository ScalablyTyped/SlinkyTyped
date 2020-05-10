package typingsSlinky.mochaSugarFree.mod

import typingsSlinky.mochaSugarFree.mochaSugarFreeBooleans.`false`
import typingsSlinky.mochaSugarFree.mochaSugarFreeBooleans.`true`
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.after
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.afterEach
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.before
import typingsSlinky.mochaSugarFree.mochaSugarFreeStrings.beforeEach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookContext extends js.Object {
  var hook: before | after | beforeEach | afterEach = js.native
  var isHook: `true` = js.native
  var isSuite: `false` = js.native
  var isTest: `false` = js.native
}

object HookContext {
  @scala.inline
  def apply(hook: before | after | beforeEach | afterEach, isHook: `true`, isSuite: `false`, isTest: `false`): HookContext = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], isHook = isHook.asInstanceOf[js.Any], isSuite = isSuite.asInstanceOf[js.Any], isTest = isTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookContext]
  }
  @scala.inline
  implicit class HookContextOps[Self <: HookContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHook(value: before | after | beforeEach | afterEach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHook(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSuite(value: `false`): Self = {
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

