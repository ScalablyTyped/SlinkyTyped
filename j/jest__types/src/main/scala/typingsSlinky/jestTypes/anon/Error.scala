package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.Exception
import typingsSlinky.jestTypes.circusMod.TestEntry
import typingsSlinky.jestTypes.jestTypesStrings.hook_failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends Event {
  var describeBlock: js.UndefOr[typingsSlinky.jestTypes.circusMod.DescribeBlock] = js.undefined
  var error: String | Exception
  var hook: typingsSlinky.jestTypes.circusMod.Hook
  var name: hook_failure
  var test: js.UndefOr[TestEntry] = js.undefined
}

object Error {
  @scala.inline
  def apply(
    error: String | Exception,
    hook: typingsSlinky.jestTypes.circusMod.Hook,
    name: hook_failure,
    describeBlock: typingsSlinky.jestTypes.circusMod.DescribeBlock = null,
    test: TestEntry = null
  ): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (describeBlock != null) __obj.updateDynamic("describeBlock")(describeBlock.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

