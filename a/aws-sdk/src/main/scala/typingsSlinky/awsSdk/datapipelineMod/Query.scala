package typingsSlinky.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  /**
    * List of selectors that define the query. An object must satisfy all of the selectors to match the query.
    */
  var selectors: js.UndefOr[SelectorList] = js.native
}
object Query {
  
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectors(value: SelectorList): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    @scala.inline
    def setSelectorsVarargs(value: Selector*): Self = StObject.set(x, "selectors", js.Array(value :_*))
  }
}
