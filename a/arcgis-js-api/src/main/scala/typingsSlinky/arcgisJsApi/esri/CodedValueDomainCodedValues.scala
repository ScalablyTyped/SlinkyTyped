package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodedValueDomainCodedValues extends Object {
  
  /**
    * The value of the code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var code: String | Double = js.native
  
  /**
    * The name of the coded value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var name: String = js.native
}
object CodedValueDomainCodedValues {
  
  @scala.inline
  def apply(
    code: String | Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CodedValueDomainCodedValues = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[CodedValueDomainCodedValues]
  }
  
  @scala.inline
  implicit class CodedValueDomainCodedValuesMutableBuilder[Self <: CodedValueDomainCodedValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
