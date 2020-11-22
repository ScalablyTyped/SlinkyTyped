package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.AsyncEvent
import typingsSlinky.jestTypes.circusMod.Exception
import typingsSlinky.jestTypes.circusMod.TestEntry
import typingsSlinky.jestTypes.jestTypesStrings.test_fn_failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorName extends AsyncEvent {
  
  var error: Exception = js.native
  
  var name: test_fn_failure = js.native
  
  var test: TestEntry = js.native
}
object ErrorName {
  
  @scala.inline
  def apply(error: Exception, name: test_fn_failure, test: TestEntry): ErrorName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorName]
  }
  
  @scala.inline
  implicit class ErrorNameOps[Self <: ErrorName] (val x: Self) extends AnyVal {
    
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
    def setError(value: Exception): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: test_fn_failure): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: TestEntry): Self = this.set("test", value.asInstanceOf[js.Any])
  }
}
