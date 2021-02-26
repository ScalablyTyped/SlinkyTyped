package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schemes extends Object {
  
  /**
    * Includes the primary labeling scheme suggested for the input layer's clusters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Schemes)
    */
  var primaryScheme: Scheme = js.native
  
  /**
    * Includes secondary labeling schemes suggested for the input layer's clusters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Schemes)
    */
  var secondarySchemes: js.Array[Scheme] = js.native
}
object Schemes {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryScheme: Scheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondarySchemes: js.Array[Scheme]
  ): Schemes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schemes]
  }
  
  @scala.inline
  implicit class SchemesMutableBuilder[Self <: Schemes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimaryScheme(value: Scheme): Self = StObject.set(x, "primaryScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondarySchemes(value: js.Array[Scheme]): Self = StObject.set(x, "secondarySchemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondarySchemesVarargs(value: Scheme*): Self = StObject.set(x, "secondarySchemes", js.Array(value :_*))
  }
}
