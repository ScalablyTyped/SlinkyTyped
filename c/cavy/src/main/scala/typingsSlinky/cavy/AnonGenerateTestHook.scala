package typingsSlinky.cavy

import typingsSlinky.cavy.mod.TestHookGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGenerateTestHook extends js.Object {
  var generateTestHook: TestHookGenerator = js.native
}

object AnonGenerateTestHook {
  @scala.inline
  def apply(generateTestHook: TestHookGenerator): AnonGenerateTestHook = {
    val __obj = js.Dynamic.literal(generateTestHook = generateTestHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGenerateTestHook]
  }
  @scala.inline
  implicit class AnonGenerateTestHookOps[Self <: AnonGenerateTestHook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerateTestHook(value: TestHookGenerator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateTestHook")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

