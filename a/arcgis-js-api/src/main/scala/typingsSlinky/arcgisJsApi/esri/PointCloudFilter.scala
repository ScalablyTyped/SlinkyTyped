package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`return`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.bitfield
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudFilter
  extends Accessor
     with JSONSupport {
  /**
    * The field used for applying the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html#field)
    */
  var field: String = js.native
  /**
    * The type of filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html#type)
    */
  val `type`: value | bitfield | `return` = js.native
}

@JSGlobal("__esri.PointCloudFilter")
@js.native
object PointCloudFilter extends TopLevel[PointCloudFilterConstructor]

