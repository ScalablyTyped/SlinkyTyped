package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.AsyncEvent
import typingsSlinky.jestTypes.circusMod.TestEntry
import typingsSlinky.jestTypes.jestTypesStrings.test_fn_success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestTestEntry extends AsyncEvent {
  
  var name: test_fn_success = js.native
  
  var test: TestEntry = js.native
}
object TestTestEntry {
  
  @scala.inline
  def apply(name: test_fn_success, test: TestEntry): TestTestEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestTestEntry]
  }
  
  @scala.inline
  implicit class TestTestEntryOps[Self <: TestTestEntry] (val x: Self) extends AnyVal {
    
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
    def setName(value: test_fn_success): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: TestEntry): Self = this.set("test", value.asInstanceOf[js.Any])
  }
}
