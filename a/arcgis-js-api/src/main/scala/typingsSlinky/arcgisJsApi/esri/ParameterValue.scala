package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`data-file`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`feature-record-set-layer`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`linear-unit`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`multi-value`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`raster-data-layer`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`raster-data`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`record-set`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.boolean
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.date
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.double
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.field
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.long
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterValue
  extends Accessor
     with JSONSupport {
  
  /**
    * Specifies the parameter's data type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#dataType)
    */
  var dataType: boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string | `multi-value` = js.native
  
  /**
    * The value of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ParameterValue.html#value)
    */
  var value: js.Any = js.native
}
