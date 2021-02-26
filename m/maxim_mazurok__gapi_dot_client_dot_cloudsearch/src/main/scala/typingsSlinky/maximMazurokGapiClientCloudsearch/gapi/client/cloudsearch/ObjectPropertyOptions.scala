package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPropertyOptions extends StObject {
  
  /**
    * The properties of the sub-object. These properties represent a nested object. For example, if this property represents a postal address, the subobjectProperties might be named
    * *street*, *city*, and *state*. The maximum number of elements is 1000.
    */
  var subobjectProperties: js.UndefOr[js.Array[PropertyDefinition]] = js.native
}
object ObjectPropertyOptions {
  
  @scala.inline
  def apply(): ObjectPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectPropertyOptions]
  }
  
  @scala.inline
  implicit class ObjectPropertyOptionsMutableBuilder[Self <: ObjectPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubobjectProperties(value: js.Array[PropertyDefinition]): Self = StObject.set(x, "subobjectProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubobjectPropertiesUndefined: Self = StObject.set(x, "subobjectProperties", js.undefined)
    
    @scala.inline
    def setSubobjectPropertiesVarargs(value: PropertyDefinition*): Self = StObject.set(x, "subobjectProperties", js.Array(value :_*))
  }
}
