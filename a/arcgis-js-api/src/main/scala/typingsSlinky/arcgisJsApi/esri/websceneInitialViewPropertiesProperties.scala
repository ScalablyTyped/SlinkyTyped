package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.global
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withEnvironment(value: EnvironmentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withViewingMode(value: global | local): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withViewpoint(value: ViewpointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewpoint")(js.undefined)
        ret
    }
  }
  
}

