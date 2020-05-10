package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapProperties extends LoadableProperties {
  /**
    * A collection of tile layers that make up the basemap's features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers)
    */
  var baseLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.native
  /**
    * An identifier used to refer to the basemap when referencing it elsewhere.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#id)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.native
  /**
    * A collection of tiled reference layers for displaying labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#referenceLayers)
    */
  var referenceLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.native
  /**
    * The spatial reference of the Basemap. This indicates the [Projected Coordinate System](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) or the [Geographic Coordinate System](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) used to locate geographic features in the map.  When using an [Esri basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap), the default spatial reference is Web Mercator Auxiliary Sphere.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The URL pointing to an image that represents the basemap. When using a custom basemap in the [BasemapToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html) widget, the image specified here will display in the widget. When the user clicks the image, the map's basemap will update to the basemap associated with the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#thumbnailUrl)
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  /**
    * The title of the basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#title)
    */
  var title: js.UndefOr[String] = js.native
}

object BasemapProperties {
  @scala.inline
  def apply(): BasemapProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapProperties]
  }
  @scala.inline
  implicit class BasemapPropertiesOps[Self <: BasemapProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseLayers(value: CollectionProperties[LayerProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLayers")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withReferenceLayers(value: CollectionProperties[LayerProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceLayers")(js.undefined)
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

