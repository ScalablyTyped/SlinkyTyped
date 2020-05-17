package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.TestEntry
import typingsSlinky.jestTypes.jestTypesStrings.hook_success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBlock extends Event {
  var describeBlock: js.UndefOr[typingsSlinky.jestTypes.circusMod.DescribeBlock] = js.native
  var hook: typingsSlinky.jestTypes.circusMod.Hook = js.native
  var name: hook_success = js.native
  var test: js.UndefOr[TestEntry] = js.native
}

object DescribeBlock {
  @scala.inline
  def apply(hook: typingsSlinky.jestTypes.circusMod.Hook, name: hook_success): DescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlock]
  }
  @scala.inline
  implicit class DescribeBlockOps[Self <: DescribeBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHook(value: typingsSlinky.jestTypes.circusMod.Hook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: hook_success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescribeBlock(value: typingsSlinky.jestTypes.circusMod.DescribeBlock): Self = {
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

