package typingsSlinky.jestReporters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Test extends js.Object {
  
  var test: typingsSlinky.jestReporters.typesMod.Test = js.native
  
  var testCaseResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any = js.native
}
object Test {
  
  @scala.inline
  def apply(
    test: typingsSlinky.jestReporters.typesMod.Test,
    testCaseResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any
  ): Test = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], testCaseResult = testCaseResult.asInstanceOf[js.Any])
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
    def setTest(value: typingsSlinky.jestReporters.typesMod.Test): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseResult(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestCaseResult */ js.Any
    ): Self = this.set("testCaseResult", value.asInstanceOf[js.Any])
  }
}
