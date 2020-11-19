package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTableViewModelConstructor
  extends Instantiable0[FeatureTableViewModel]
     with Instantiable1[/* properties */ js.Any, FeatureTableViewModel] {
  
  /**
    * Returns a field value given the specified row (feature) `ObjectId` and an associated `fieldName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#getValue)
    *
    * @param objectId The `ObjectId` field of the specified row (feature).
    * @param fieldName The name of the field in which to get the associated `ObjectId`'s row (feature) value.
    *
    */
  def getValue(objectId: Double, fieldName: String): String | Double | js.Any = js.native
}
