package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestsResult extends StObject {
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Information about the tests.
    */
  var tests: js.UndefOr[Tests] = js.native
}
object ListTestsResult {
  
  @scala.inline
  def apply(): ListTestsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestsResult]
  }
  
  @scala.inline
  implicit class ListTestsResultMutableBuilder[Self <: ListTestsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTests(value: Tests): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
    
    @scala.inline
    def setTestsVarargs(value: Test*): Self = StObject.set(x, "tests", js.Array(value :_*))
  }
}
