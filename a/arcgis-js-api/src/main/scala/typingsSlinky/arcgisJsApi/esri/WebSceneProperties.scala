package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSceneProperties extends MapProperties {
  /**
    * Configuration of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#applicationProperties)
    */
  var applicationProperties: js.UndefOr[websceneApplicationPropertiesProperties] = js.native
  /**
    * The name of the application that authored the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#authoringApp)
    */
  var authoringApp: js.UndefOr[String] = js.native
  /**
    * The version of the application that authored the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#authoringAppVersion)
    */
  var authoringAppVersion: js.UndefOr[String] = js.native
  /**
    * *This property only applies to local scenes.* Represents an optional clipping area used to define the bounds or [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene. If defined, only data (including the basemap) within the area will be displayed.  Set the [clippingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingEnabled) property to `true` to apply the specified clippingArea to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea)
    */
  var clippingArea: js.UndefOr[ExtentProperties] = js.native
  /**
    * *This property only applies to local scenes.* Determines whether clipping using the [clippingArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingArea) is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#clippingEnabled)
    *
    * @default false
    */
  var clippingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The height model info of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html). This object defines the characteristics of the vertical coordinate system used by the scene. In a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), the height model info is used to avoid combining layers that have incompatible vertical coordinate systems.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#heightModelInfo)
    */
  var heightModelInfo: js.UndefOr[HeightModelInfoProperties] = js.native
  /**
    * The initial view of the WebScene. This object contains properties such as [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewpoint), [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#spatialReference), [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewingMode), and [environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#environment) that should be applied to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) when the scene loads.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#initialViewProperties)
    */
  var initialViewProperties: js.UndefOr[websceneInitialViewPropertiesProperties] = js.native
  /**
    * The portal item from which the WebScene is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.native
  /**
    * Provides a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of slides that act as bookmarks for saving predefined [viewpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) and visible layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#presentation)
    */
  var presentation: js.UndefOr[PresentationProperties] = js.native
  /**
    * The URL to the thumbnail used for the web scene. The thumbnail will by default be the thumbnail URL from the portal item associated to the web scene. The thumbnail of the web scene may be updated by changing the thumbnail URL and saving the web scene. Use [updateFrom](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom) to update the thumbnail automatically from a specified view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#thumbnailUrl)
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
}

object WebSceneProperties {
  @scala.inline
  def apply(): WebSceneProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSceneProperties]
  }
  @scala.inline
  implicit class WebScenePropertiesOps[Self <: WebSceneProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationProperties(value: websceneApplicationPropertiesProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthoringApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthoringApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringApp")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthoringAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringAppVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthoringAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoringAppVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withClippingArea(value: ExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClippingArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingArea")(js.undefined)
        ret
    }
    @scala.inline
    def withClippingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClippingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clippingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightModelInfo(value: HeightModelInfoProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightModelInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightModelInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightModelInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialViewProperties(value: websceneInitialViewPropertiesProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialViewProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialViewProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialViewProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withPortalItem(value: PortalItemProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalItem")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentation(value: PresentationProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentation")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(js.undefined)
        ret
    }
  }
  
}

