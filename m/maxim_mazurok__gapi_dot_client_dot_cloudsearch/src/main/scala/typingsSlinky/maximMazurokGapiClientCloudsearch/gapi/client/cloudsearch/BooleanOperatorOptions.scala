package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanOperatorOptions extends StObject {
  
  /**
    * Indicates the operator name required in the query in order to isolate the boolean property. For example, if operatorName is *closed* and the property's name is *isClosed*, then
    * queries like *closed:<value>* show results only where the value of the property named *isClosed* matches *<value>*. By contrast, a search that uses the same *<value>* without an
    * operator returns all items where *<value>* matches the value of any String properties or text within the content field for the item. The operator name can only contain lowercase
    * letters (a-z). The maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.native
}
object BooleanOperatorOptions {
  
  @scala.inline
  def apply(): BooleanOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanOperatorOptions]
  }
  
  @scala.inline
  implicit class BooleanOperatorOptionsMutableBuilder[Self <: BooleanOperatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
  }
}
