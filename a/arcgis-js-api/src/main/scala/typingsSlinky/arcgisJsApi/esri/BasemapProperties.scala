package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The spatial reference of the Basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * The URL pointing to an image that represents the basemap.
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
  implicit class BasemapPropertiesMutableBuilder[Self <: BasemapProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseLayers(value: CollectionProperties[LayerProperties]): Self = StObject.set(x, "baseLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseLayersUndefined: Self = StObject.set(x, "baseLayers", js.undefined)
    
    @scala.inline
    def setBaseLayersVarargs(value: LayerProperties*): Self = StObject.set(x, "baseLayers", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
    
    @scala.inline
    def setReferenceLayers(value: CollectionProperties[LayerProperties]): Self = StObject.set(x, "referenceLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceLayersUndefined: Self = StObject.set(x, "referenceLayers", js.undefined)
    
    @scala.inline
    def setReferenceLayersVarargs(value: LayerProperties*): Self = StObject.set(x, "referenceLayers", js.Array(value :_*))
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
