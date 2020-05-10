package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshMaterialMetallicRoughnessProperties extends MeshMaterialProperties {
  /**
    * Specifies a single, uniform emissive color for the [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html). The emissiveColor is added to the base color of the component. This can be autocast with a named string, hex string, array of rgb values, an object with `r`, `g`, `b` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object. Note that the alpha channel is ignored for emissive colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveColor)
    */
  var emissiveColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * Specifies a texture from which to get emissive color information. The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes. The colors in the texture are added to the base color of the component. When using both an `emissiveTexture` and an [emissiveColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveColor) their values are multiplied and then added to the base color of the component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveTexture)
    */
  var emissiveTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
  /**
    * Specifies how much the material behaves like a metal. Values must be in the range 0 (non metal material) to 1 (metal material). Physically accurate materials are usually either a metal (1) or a non-metal (0) and not something inbetween.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallic)
    *
    * @default 1
    */
  var metallic: js.UndefOr[Double] = js.native
  /**
    * Specifies a texture from which to get the combined metallic/roughness information. The metallic value should be stored in the `blue` channel, while the roughness value should be stored in the `green` channel. The `red` and `alpha` channels are ignored.  The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallicRoughnessTexture)
    */
  var metallicRoughnessTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
  /**
    * Allows to specify a texture to get the occlusion information from. This can be used to simulate the effect of ambient light on the object. The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes. The occlusion value should be encoded in the red channel of the texture.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#occlusionTexture)
    */
  var occlusionTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
  /**
    * Indicates how rough the surface of the material is. Values must be in the range 0 (fully smooth surface) to 1 (fully diffuse surface).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#roughness)
    *
    * @default 1
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
  implicit class MeshMaterialMetallicRoughnessPropertiesOps[Self <: MeshMaterialMetallicRoughnessProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmissiveColor(value: Color_ | js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmissiveColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEmissiveTextureImageData(value: ImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmissiveTextureHTMLImageElement(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmissiveTextureHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmissiveTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmissiveTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissiveTexture")(js.undefined)
        ret
    }
    @scala.inline
    def withMetallic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metallic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetallic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metallic")(js.undefined)
        ret
    }
    @scala.inline
    def withMetallicRoughnessTextureImageData(value: ImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metallicRoughnessTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetallicRoughnessTextureHTMLImageElement(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metallicRoughnessTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetallicRoughnessTextureHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metallicRoughnessTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetallicRoughnessTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metallicRoughnessTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetallicRoughnessTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metallicRoughnessTexture")(js.undefined)
        ret
    }
    @scala.inline
    def withOcclusionTextureImageData(value: ImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcclusionTextureHTMLImageElement(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcclusionTextureHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcclusionTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOcclusionTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionTexture")(js.undefined)
        ret
    }
    @scala.inline
    def withRoughness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roughness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoughness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roughness")(js.undefined)
        ret
    }
  }
  
}

