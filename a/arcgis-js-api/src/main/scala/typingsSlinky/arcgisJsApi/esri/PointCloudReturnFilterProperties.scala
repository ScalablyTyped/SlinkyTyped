package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.firstOfMany
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.last
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.lastOfMany
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudReturnFilterProperties extends PointCloudFilterProperties {
  
  /**
    * An array of return types used to filter points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html#includedReturns)
    */
  var includedReturns: js.UndefOr[js.Array[firstOfMany | last | lastOfMany | single]] = js.native
}
object PointCloudReturnFilterProperties {
  
  @scala.inline
  def apply(): PointCloudReturnFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudReturnFilterProperties]
  }
  
  @scala.inline
  implicit class PointCloudReturnFilterPropertiesMutableBuilder[Self <: PointCloudReturnFilterProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludedReturns(value: js.Array[firstOfMany | last | lastOfMany | single]): Self = StObject.set(x, "includedReturns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedReturnsUndefined: Self = StObject.set(x, "includedReturns", js.undefined)
    
    @scala.inline
    def setIncludedReturnsVarargs(value: (firstOfMany | last | lastOfMany | single)*): Self = StObject.set(x, "includedReturns", js.Array(value :_*))
  }
}
