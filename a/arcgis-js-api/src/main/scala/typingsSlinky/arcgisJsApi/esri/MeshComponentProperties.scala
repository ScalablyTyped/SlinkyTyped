package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.flat
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.smooth
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshComponentProperties extends js.Object {
  
  /**
    * A flat array of indices that refer to vertices in the [vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes) of the mesh to which the component belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#faces)
    */
  var faces: js.UndefOr[js.typedarray.Uint32Array | js.Array[Double] | js.typedarray.Uint16Array] = js.native
  
  /**
    * The material determines how the component is visualized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material)
    */
  var material: js.UndefOr[MeshMaterialProperties | MeshMaterialMetallicRoughnessProperties] = js.native
  
  /**
    * Specifies the type of normals used for lighting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#shading)
    */
  var shading: js.UndefOr[source | flat | smooth] = js.native
}
object MeshComponentProperties {
  
  @scala.inline
  def apply(): MeshComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshComponentProperties]
  }
  
  @scala.inline
  implicit class MeshComponentPropertiesOps[Self <: MeshComponentProperties] (val x: Self) extends AnyVal {
    
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
    def setFacesVarargs(value: Double*): Self = this.set("faces", js.Array(value :_*))
    
    @scala.inline
    def setFacesUint32Array(value: js.typedarray.Uint32Array): Self = this.set("faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacesUint16Array(value: js.typedarray.Uint16Array): Self = this.set("faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaces(value: js.typedarray.Uint32Array | js.Array[Double] | js.typedarray.Uint16Array): Self = this.set("faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaces: Self = this.set("faces", js.undefined)
    
    @scala.inline
    def setMaterial(value: MeshMaterialProperties | MeshMaterialMetallicRoughnessProperties): Self = this.set("material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    
    @scala.inline
    def setShading(value: source | flat | smooth): Self = this.set("shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShading: Self = this.set("shading", js.undefined)
  }
}
