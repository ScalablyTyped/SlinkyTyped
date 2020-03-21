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

trait HookContext extends js.Object {
  var hook: before | after | beforeEach | afterEach
  var isHook: `true`
  var isSuite: `false`
  var isTest: `false`
}

object HookContext {
  @scala.inline
  def apply(hook: before | after | beforeEach | afterEach, isHook: `true`, isSuite: `false`, isTest: `false`): HookContext = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], isHook = isHook.asInstanceOf[js.Any], isSuite = isSuite.asInstanceOf[js.Any], isTest = isTest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookContext]
  }
}

