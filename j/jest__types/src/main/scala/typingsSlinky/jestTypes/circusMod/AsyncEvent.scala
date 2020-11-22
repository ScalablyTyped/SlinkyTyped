package typingsSlinky.jestTypes.circusMod

import typingsSlinky.jestTypes.jestTypesStrings.hook_failure
import typingsSlinky.jestTypes.jestTypesStrings.hook_start
import typingsSlinky.jestTypes.jestTypesStrings.hook_success
import typingsSlinky.jestTypes.jestTypesStrings.include_test_location_in_result
import typingsSlinky.jestTypes.jestTypesStrings.run_describe_finish
import typingsSlinky.jestTypes.jestTypesStrings.run_describe_start
import typingsSlinky.jestTypes.jestTypesStrings.run_finish
import typingsSlinky.jestTypes.jestTypesStrings.run_start
import typingsSlinky.jestTypes.jestTypesStrings.setup
import typingsSlinky.jestTypes.jestTypesStrings.teardown
import typingsSlinky.jestTypes.jestTypesStrings.test_done
import typingsSlinky.jestTypes.jestTypesStrings.test_fn_failure
import typingsSlinky.jestTypes.jestTypesStrings.test_fn_start
import typingsSlinky.jestTypes.jestTypesStrings.test_fn_success
import typingsSlinky.jestTypes.jestTypesStrings.test_retry
import typingsSlinky.jestTypes.jestTypesStrings.test_skip
import typingsSlinky.jestTypes.jestTypesStrings.test_start
import typingsSlinky.jestTypes.jestTypesStrings.test_todo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestTypes.anon.Name
  - typingsSlinky.jestTypes.anon.`0`
  - typingsSlinky.jestTypes.anon.Hook
  - typingsSlinky.jestTypes.anon.DescribeBlock
  - typingsSlinky.jestTypes.anon.Test
  - typingsSlinky.jestTypes.anon.NameTest
  - typingsSlinky.jestTypes.anon.TestTestEntry
  - typingsSlinky.jestTypes.anon.ErrorName
  - typingsSlinky.jestTypes.anon.NameTestTestEntry
  - typingsSlinky.jestTypes.anon.`1`
  - typingsSlinky.jestTypes.anon.`2`
  - typingsSlinky.jestTypes.anon.`3`
  - typingsSlinky.jestTypes.anon.`4`
  - typingsSlinky.jestTypes.anon.DescribeBlockName
  - typingsSlinky.jestTypes.anon.DescribeBlockDescribeBlock
  - typingsSlinky.jestTypes.anon.`5`
  - typingsSlinky.jestTypes.anon.`6`
  - typingsSlinky.jestTypes.anon.`7`
*/
trait AsyncEvent extends Event
object AsyncEvent {
  
  @scala.inline
  def NameTestTestEntry(name: test_retry, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def Hook(hook: typingsSlinky.jestTypes.circusMod.Hook, name: hook_start): AsyncEvent = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def ErrorName(error: Exception, name: test_fn_failure, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def DescribeBlockDescribeBlock(describeBlock: DescribeBlock, name: run_describe_finish): AsyncEvent = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `5`(name: run_start): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `1`(name: test_start, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def DescribeBlock(hook: Hook, name: hook_success): AsyncEvent = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `7`(name: teardown): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def DescribeBlockName(describeBlock: DescribeBlock, name: run_describe_start): AsyncEvent = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `4`(name: test_done, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def NameTest(name: test_fn_start, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `3`(name: test_todo, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def TestTestEntry(name: test_fn_success, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def Name(name: setup, parentProcess: Process, runtimeGlobals: JestGlobals): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentProcess = parentProcess.asInstanceOf[js.Any], runtimeGlobals = runtimeGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `0`(name: include_test_location_in_result): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def Test(error: String | Exception, hook: Hook, name: hook_failure): AsyncEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `2`(name: test_skip, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `6`(name: run_finish): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
}
