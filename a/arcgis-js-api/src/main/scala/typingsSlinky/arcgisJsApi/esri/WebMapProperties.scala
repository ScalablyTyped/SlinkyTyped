package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMapProperties extends MapProperties {
  /**
    * The applicationProperties contains the viewing properties of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#applicationProperties)
    */
  var applicationProperties: js.UndefOr[ApplicationPropertiesProperties] = js.native
  /**
    * The name of the application that authored the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#authoringApp)
    */
  var authoringApp: js.UndefOr[String] = js.native
  /**
    * The version of the application that authored the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#authoringAppVersion)
    */
  var authoringAppVersion: js.UndefOr[String] = js.native
  /**
    * An array of saved geographic extents that allow end users to quickly navigate to a particular area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#bookmarks)
    */
  var bookmarks: js.UndefOr[CollectionProperties[BookmarkProperties]] = js.native
  /**
    * The initial view of the WebMap. This object contains properties such as [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint), [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#spatialReference), that should be applied to the view when the WebMap loads.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#initialViewProperties)
    */
  var initialViewProperties: js.UndefOr[InitialViewPropertiesProperties] = js.native
  /**
    * The portal item from which the WebMap is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.native
  /**
    * Provides multiple slides. Each slide has a different "title", "extent", "basemap", "layers" etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#presentation)
    */
  var presentation: js.UndefOr[js.Any] = js.native
  /**
    * An array of table objects in the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#tables)
    */
  var tables: js.UndefOr[js.Array[_]] = js.native
  /**
    * The URL to the thumbnail used for the webmap. The `thumbnailUrl` will default to the thumbnail URL from the portal item associated to the webmap. The thumbnail of the webmap may be updated by changing the thumbnail URL and saving the webmap. Use [updateFrom](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom) to update the thumbnail automatically from a specified view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#thumbnailUrl)
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  /**
    * The widgets object contains widgets that should be exposed to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#widgets)
    */
  var widgets: js.UndefOr[js.Any] = js.native
}

object WebMapProperties {
  @scala.inline
  def apply(): WebMapProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebMapProperties]
  }
  @scala.inline
  implicit class WebMapPropertiesOps[Self <: WebMapProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationProperties(value: ApplicationPropertiesProperties): Self = {
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
    def withBookmarks(value: CollectionProperties[BookmarkProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialViewProperties(value: InitialViewPropertiesProperties): Self = {
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
    def withPresentation(value: js.Any): Self = {
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
    def withTables(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
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
    @scala.inline
    def withWidgets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidgets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(js.undefined)
        ret
    }
  }
  
}

