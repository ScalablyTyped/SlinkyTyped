package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapGalleryViewModelProperties extends js.Object {
  /**
    * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#activeBasemap)
    */
  var activeBasemap: js.UndefOr[BasemapProperties] = js.native
  /**
    * A collection of [BasemapGalleryItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html)s representing basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#items)
    */
  var items: js.UndefOr[CollectionProperties[BasemapGalleryItemProperties]] = js.native
  /**
    * The source for basemaps that the widget will display. This property can be autocast with an array or [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)s, a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html) instance or a URL to a portal instance. The default source is a [PortalBasemapsSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html) that points to the default portal instance set in [esriConfig.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#source)
    */
  var source: js.UndefOr[LocalBasemapsSourceProperties | PortalBasemapsSourceProperties] = js.native
  /**
    * The view from which the widget will operate. This view provides access to the active [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) via the view's [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object BasemapGalleryViewModelProperties {
  @scala.inline
  def apply(): BasemapGalleryViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapGalleryViewModelProperties]
  }
  @scala.inline
  implicit class BasemapGalleryViewModelPropertiesOps[Self <: BasemapGalleryViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveBasemap(value: BasemapProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBasemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveBasemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeBasemap")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: CollectionProperties[BasemapGalleryItemProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: LocalBasemapsSourceProperties | PortalBasemapsSourceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: MapViewProperties | SceneViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

