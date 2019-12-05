package typingsSlinky.atJestTypes

import typingsSlinky.atJestTypes.atJestTypesStrings.hook_failure
import typingsSlinky.atJestTypes.buildCircusMod.DescribeBlock
import typingsSlinky.atJestTypes.buildCircusMod.Event
import typingsSlinky.atJestTypes.buildCircusMod.Exception
import typingsSlinky.atJestTypes.buildCircusMod.Hook
import typingsSlinky.atJestTypes.buildCircusMod.TestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescribeBlockError extends Event {
  var describeBlock: js.UndefOr[DescribeBlock] = js.undefined
  var error: String | Exception
  var hook: Hook
  var name: hook_failure
  var test: js.UndefOr[TestEntry] = js.undefined
}

object Anon_DescribeBlockError {
  @scala.inline
  def apply(
    error: String | Exception,
    hook: Hook,
    name: hook_failure,
    describeBlock: DescribeBlock = null,
    test: TestEntry = null
  ): Anon_DescribeBlockError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (describeBlock != null) __obj.updateDynamic("describeBlock")(describeBlock.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescribeBlockError]
  }
}

