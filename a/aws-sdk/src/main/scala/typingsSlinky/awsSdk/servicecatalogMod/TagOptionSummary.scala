package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagOptionSummary extends StObject {
  
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.native
  
  /**
    * The TagOption value.
    */
  var Values: js.UndefOr[TagOptionValues] = js.native
}
object TagOptionSummary {
  
  @scala.inline
  def apply(): TagOptionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOptionSummary]
  }
  
  @scala.inline
  implicit class TagOptionSummaryMutableBuilder[Self <: TagOptionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TagOptionKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValues(value: TagOptionValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: TagOptionValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
