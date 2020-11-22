package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.AsyncEvent
import typingsSlinky.jestTypes.circusMod.Exception
import typingsSlinky.jestTypes.circusMod.TestEntry
import typingsSlinky.jestTypes.jestTypesStrings.hook_failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Test extends AsyncEvent {
  
  var describeBlock: js.UndefOr[typingsSlinky.jestTypes.circusMod.DescribeBlock] = js.native
  
  var error: String | Exception = js.native
  
  var hook: typingsSlinky.jestTypes.circusMod.Hook = js.native
  
  var name: hook_failure = js.native
  
  var test: js.UndefOr[TestEntry] = js.native
}
object Test {
  
  @scala.inline
  def apply(error: String | Exception, hook: typingsSlinky.jestTypes.circusMod.Hook, name: hook_failure): Test = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
  
  @scala.inline
  implicit class TestOps[Self <: Test] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: String | Exception): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHook(value: typingsSlinky.jestTypes.circusMod.Hook): Self = this.set("hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: hook_failure): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribeBlock(value: typingsSlinky.jestTypes.circusMod.DescribeBlock): Self = this.set("describeBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescribeBlock: Self = this.set("describeBlock", js.undefined)
    
    @scala.inline
    def setTest(value: TestEntry): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
