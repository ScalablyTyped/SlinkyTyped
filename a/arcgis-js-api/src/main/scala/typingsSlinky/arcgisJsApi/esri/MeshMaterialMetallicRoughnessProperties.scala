package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshMaterialMetallicRoughnessProperties extends MeshMaterialProperties {
  
  /**
    * Specifies a single, uniform emissive color for the [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveColor)
    */
  var emissiveColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * Specifies a texture from which to get emissive color information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveTexture)
    */
  var emissiveTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
  
  /**
    * Specifies how much the material behaves like a metal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallic)
    */
  var metallic: js.UndefOr[Double] = js.native
  
  /**
    * Specifies a texture from which to get the combined metallic/roughness information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallicRoughnessTexture)
    */
  var metallicRoughnessTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
  
  /**
    * Allows to specify a texture to get the occlusion information from.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#occlusionTexture)
    */
  var occlusionTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
  
  /**
    * Indicates how rough the surface of the material is.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#roughness)
    */
  var roughness: js.UndefOr[Double] = js.native
}
object MeshMaterialMetallicRoughnessProperties {
  
  @scala.inline
  def apply(): MeshMaterialMetallicRoughnessProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshMaterialMetallicRoughnessProperties]
  }
  
  @scala.inline
  implicit class MeshMaterialMetallicRoughnessPropertiesMutableBuilder[Self <: MeshMaterialMetallicRoughnessProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmissiveColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "emissiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmissiveColorUndefined: Self = StObject.set(x, "emissiveColor", js.undefined)
    
    @scala.inline
    def setEmissiveColorVarargs(value: Double*): Self = StObject.set(x, "emissiveColor", js.Array(value :_*))
    
    @scala.inline
    def setEmissiveTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = StObject.set(x, "emissiveTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmissiveTextureHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "emissiveTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmissiveTextureHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "emissiveTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmissiveTextureImageData(value: ImageData): Self = StObject.set(x, "emissiveTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmissiveTextureUndefined: Self = StObject.set(x, "emissiveTexture", js.undefined)
    
    @scala.inline
    def setMetallic(value: Double): Self = StObject.set(x, "metallic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetallicRoughnessTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = StObject.set(x, "metallicRoughnessTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetallicRoughnessTextureHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "metallicRoughnessTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetallicRoughnessTextureHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "metallicRoughnessTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetallicRoughnessTextureImageData(value: ImageData): Self = StObject.set(x, "metallicRoughnessTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetallicRoughnessTextureUndefined: Self = StObject.set(x, "metallicRoughnessTexture", js.undefined)
    
    @scala.inline
    def setMetallicUndefined: Self = StObject.set(x, "metallic", js.undefined)
    
    @scala.inline
    def setOcclusionTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = StObject.set(x, "occlusionTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionTextureHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "occlusionTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionTextureHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "occlusionTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionTextureImageData(value: ImageData): Self = StObject.set(x, "occlusionTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcclusionTextureUndefined: Self = StObject.set(x, "occlusionTexture", js.undefined)
    
    @scala.inline
    def setRoughness(value: Double): Self = StObject.set(x, "roughness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoughnessUndefined: Self = StObject.set(x, "roughness", js.undefined)
  }
}
