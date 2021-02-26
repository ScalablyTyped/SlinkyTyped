package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`150-kilometers`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`50-kilometers`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`benoit-1895-b-chains`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`clarke-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`clarke-links`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`clarke-yards`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`gold-coast-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`gravity-related-height`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`indian-1937-yards`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`indian-yards`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`sears-1922-truncated-chains`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`sears-chains`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`sears-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`sears-yards`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ellipsoidal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightModelInfo
  extends Accessor
     with JSONSupport {
  
  /**
    * The surface type or height model of the vertical coordinate system (VCS).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightModel)
    */
  val heightModel: `gravity-related-height` | ellipsoidal = js.native
  
  /**
    * The unit of the vertical coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightUnit)
    */
  val heightUnit: meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers` = js.native
  
  /**
    * The datum realization of the vertical coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#vertCRS)
    */
  val vertCRS: String = js.native
}
