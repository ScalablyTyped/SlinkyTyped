package typingsSlinky.jestTypes

import typingsSlinky.jestTypes.circusMod.DescribeBlock
import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.Exception
import typingsSlinky.jestTypes.circusMod.Hook
import typingsSlinky.jestTypes.circusMod.TestEntry
import typingsSlinky.jestTypes.jestTypesStrings.hook_failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonError extends Event {
  var describeBlock: js.UndefOr[DescribeBlock] = js.native
  var error: String | Exception = js.native
  var hook: Hook = js.native
  var name: hook_failure = js.native
  var test: js.UndefOr[TestEntry] = js.native
}

object AnonError {
  @scala.inline
  def apply(error: String | Exception, hook: Hook, name: hook_failure): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
  @scala.inline
  implicit class AnonErrorOps[Self <: AnonError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String | Exception): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHook(value: Hook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: hook_failure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescribeBlock(value: DescribeBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describeBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribeBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describeBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: TestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
  }
  
}

