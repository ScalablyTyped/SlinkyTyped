package typingsSlinky.atJestTypes

import typingsSlinky.atJestTypes.atJestTypesStrings.hook_success
import typingsSlinky.atJestTypes.buildCircusMod.DescribeBlock
import typingsSlinky.atJestTypes.buildCircusMod.Event
import typingsSlinky.atJestTypes.buildCircusMod.Hook
import typingsSlinky.atJestTypes.buildCircusMod.TestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescribeBlock extends Event {
  var describeBlock: js.UndefOr[DescribeBlock] = js.undefined
  var hook: Hook
  var name: hook_success
  var test: js.UndefOr[TestEntry] = js.undefined
}

object Anon_DescribeBlock {
  @scala.inline
  def apply(hook: Hook, name: hook_success, describeBlock: DescribeBlock = null, test: TestEntry = null): Anon_DescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (describeBlock != null) __obj.updateDynamic("describeBlock")(describeBlock.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescribeBlock]
  }
}

