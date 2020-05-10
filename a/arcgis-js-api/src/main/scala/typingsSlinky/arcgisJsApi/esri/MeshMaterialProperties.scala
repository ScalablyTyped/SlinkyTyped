package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.auto
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blend
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mask
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.opaque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshMaterialProperties extends js.Object {
  /**
    * Specifies how transparency on the object is handled. If [alphaMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode) is set to either `mask` or `auto` this property specifies the cutoff value below which masking happens (that is, the coresponding part of the Mesh is rendered fully transparent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff)
    *
    * @default 0.5
    */
  var alphaCutoff: js.UndefOr[Double] = js.native
  /**
    * Specifies how transparency on the object is handled. See also [alphaCutoff](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff).
    *
    * | Type | Description |
    * |------|-------------|
    * | opaque | Alpha is ignored, and the object is rendered fully opaque. |
    * | blend | Alpha values are used for gradual transparency, blending between the object and its background. |
    * | mask | Alpha values are used for binary transparency, either displaying the object, or its background. See also [alphaCutoff](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff). |
    * | auto | The implementation mixes the `mask` and `blend` settings, masking below `alphaCutoff` and blending above it. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode)
    *
    * @default "auto"
    */
  var alphaMode: js.UndefOr[auto | blend | opaque | mask] = js.native
  /**
    * Specifies a single, uniform color for the mesh component. This can be autocast with a named string, hex string, array of rgb or rgba values, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * Specifies a texture from which to get color information. The texture is accessed using the uv coordinate specified for each vertex in the [Mesh.vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture)
    */
  var colorTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
  /**
    * Specifies whether both sides of each triangle are displayed, or only the front sides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#doubleSided)
    *
    * @default true
    */
  var doubleSided: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a texture from which to get normal information. The texture is accessed using the uv coordinate specified for each vertex in the [Mesh.vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture)
    */
  var normalTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
}

object MeshMaterialProperties {
  @scala.inline
  def apply(): MeshMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshMaterialProperties]
  }
  @scala.inline
  implicit class MeshMaterialPropertiesOps[Self <: MeshMaterialProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaCutoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaCutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaCutoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaCutoff")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphaMode(value: auto | blend | opaque | mask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMode")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: Color_ | js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorTextureImageData(value: ImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorTextureHTMLImageElement(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorTextureHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTexture")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleSided(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleSided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleSided: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleSided")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalTextureImageData(value: ImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalTextureHTMLImageElement(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalTextureHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalTexture")(js.undefined)
        ret
    }
  }
  
}

