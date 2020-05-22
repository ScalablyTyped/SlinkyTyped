package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.TestEntry
import typingsSlinky.jestTypes.jestTypesStrings.hook_success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBlock extends Event {
  var describeBlock: js.UndefOr[typingsSlinky.jestTypes.circusMod.DescribeBlock] = js.undefined
  var hook: typingsSlinky.jestTypes.circusMod.Hook
  var name: hook_success
  var test: js.UndefOr[TestEntry] = js.undefined
}

object DescribeBlock {
  @scala.inline
  def apply(
    hook: typingsSlinky.jestTypes.circusMod.Hook,
    name: hook_success,
    describeBlock: typingsSlinky.jestTypes.circusMod.DescribeBlock = null,
    test: TestEntry = null
  ): DescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (describeBlock != null) __obj.updateDynamic("describeBlock")(describeBlock.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlock]
  }
}

