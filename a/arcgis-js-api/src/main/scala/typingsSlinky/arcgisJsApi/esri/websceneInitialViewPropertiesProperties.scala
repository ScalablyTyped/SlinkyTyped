package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.global
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait websceneInitialViewPropertiesProperties extends js.Object {
  
  /**
    * The initial environment settings of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#environment)
    */
  var environment: js.UndefOr[EnvironmentProperties] = js.native
  
  /**
    * The spatial reference of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html). This indicates the [Projected Coordinate System](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) or the [Geographic Coordinate System](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) used to locate geographic features in the map. In a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) the following [supported coordinate systems](esri-views-SceneView.html#supported-coordinate-systems) are available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * The viewing mode of the scene. Global scenes allow the user to navigate the globe. Local scenes allow for navigation and feature display in a particular "localized" area. Users may also navigate the view's camera below the surface of a basemap in local scenes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewingMode)
    *
    * @default global
    */
  var viewingMode: js.UndefOr[global | local] = js.native
  
  /**
    * The initial viewpoint of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.native
}
object websceneInitialViewPropertiesProperties {
  
  @scala.inline
  def apply(): websceneInitialViewPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[websceneInitialViewPropertiesProperties]
  }
  
  @scala.inline
  implicit class websceneInitialViewPropertiesPropertiesOps[Self <: websceneInitialViewPropertiesProperties] (val x: Self) extends AnyVal {
    
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
    def setEnvironment(value: EnvironmentProperties): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
    
    @scala.inline
    def setViewingMode(value: global | local): Self = this.set("viewingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewingMode: Self = this.set("viewingMode", js.undefined)
    
    @scala.inline
    def setViewpoint(value: ViewpointProperties): Self = this.set("viewpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewpoint: Self = this.set("viewpoint", js.undefined)
  }
}
