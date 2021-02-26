package typingsSlinky.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCaseGroup
  extends /* key */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var testCases: js.UndefOr[js.Array[TestCase]] = js.native
}
object TestCaseGroup {
  
  @scala.inline
  def apply(): TestCaseGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseGroup]
  }
  
  @scala.inline
  implicit class TestCaseGroupMutableBuilder[Self <: TestCaseGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setTestCases(value: js.Array[TestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    @scala.inline
    def setTestCasesVarargs(value: TestCase*): Self = StObject.set(x, "testCases", js.Array(value :_*))
  }
}
