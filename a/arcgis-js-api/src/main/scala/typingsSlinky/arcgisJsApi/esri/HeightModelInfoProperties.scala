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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightModelInfoProperties extends js.Object {
  
  /**
    * The surface type or height model of the vertical coordinate system (VCS). A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) will only render layers containing data that is compatible with the HeightModelInfo of the scene.
    *
    * Value | Description
    * ------|------------
    * gravity-related-height | A gravity-related VCS may set its zero point through a local mean sea level or a benchmark, and is compatible with other gravity-related VCS for the purposes of rendering.
    * ellipsoidal | An ellipsoidal VCS defines heights that are referenced to an ellipsoid of a geographic coordinate system.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightModel)
    *
    * @default "gravity-related-height"
    */
  var heightModel: js.UndefOr[`gravity-related-height` | ellipsoidal] = js.native
  
  /**
    * The unit of the vertical coordinate system. A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) will use this property to check that the vertical data of layers that define a HeightModelInfo is compatible with the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightUnit)
    *
    * @default "meters"
    */
  var heightUnit: js.UndefOr[
    meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers`
  ] = js.native
  
  /**
    * The datum realization of the vertical coordinate system. A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) will only render layers that define a HeightModelInfo with an identical `vertCRS` to that of the scene, when using an `ellipsoidal` height model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#vertCRS)
    */
  var vertCRS: js.UndefOr[String] = js.native
}
object HeightModelInfoProperties {
  
  @scala.inline
  def apply(): HeightModelInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightModelInfoProperties]
  }
  
  @scala.inline
  implicit class HeightModelInfoPropertiesOps[Self <: HeightModelInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeightModel(value: `gravity-related-height` | ellipsoidal): Self = this.set("heightModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightModel: Self = this.set("heightModel", js.undefined)
    
    @scala.inline
    def setHeightUnit(
      value: meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers`
    ): Self = this.set("heightUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightUnit: Self = this.set("heightUnit", js.undefined)
    
    @scala.inline
    def setVertCRS(value: String): Self = this.set("vertCRS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertCRS: Self = this.set("vertCRS", js.undefined)
  }
}
