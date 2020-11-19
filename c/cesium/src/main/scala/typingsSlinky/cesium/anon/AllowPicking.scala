package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian2
import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.ClippingPlaneCollection
import typingsSlinky.cesium.mod.HeightReference
import typingsSlinky.cesium.mod.Matrix4
import typingsSlinky.cesium.mod.Property
import typingsSlinky.cesium.mod.ShadowMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowPicking extends js.Object {
  
  var allowPicking: js.UndefOr[Boolean] = js.native
  
  var asynchronous: js.UndefOr[Boolean] = js.native
  
  var basePath: js.UndefOr[String] = js.native
  
  var clampAnimations: js.UndefOr[Boolean] = js.native
  
  var clippingPlanes: js.UndefOr[ClippingPlaneCollection] = js.native
  
  var color: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  
  var colorBlendAmount: js.UndefOr[Double] = js.native
  
  var colorBlendMode: js.UndefOr[Property] = js.native
  
  var credit: js.UndefOr[typingsSlinky.cesium.mod.Credit | String] = js.native
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  
  var debugWireframe: js.UndefOr[Boolean] = js.native
  
  var dequantizeInShader: js.UndefOr[Boolean] = js.native
  
  var distanceDisplayCondition: js.UndefOr[typingsSlinky.cesium.mod.DistanceDisplayCondition] = js.native
  
  var gltf: js.UndefOr[js.Any] = js.native
  
  var heightReference: js.UndefOr[HeightReference] = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var imageBasedLightingFactor: js.UndefOr[Cartesian2] = js.native
  
  var incrementallyLoadTextures: js.UndefOr[Boolean] = js.native
  
  var lightColor: js.UndefOr[Cartesian3] = js.native
  
  var luminanceAtZenith: js.UndefOr[Double] = js.native
  
  var maximumScale: js.UndefOr[Double] = js.native
  
  var minimumPixelSize: js.UndefOr[Double] = js.native
  
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var scene: js.UndefOr[typingsSlinky.cesium.mod.Scene] = js.native
  
  var shadows: js.UndefOr[ShadowMode] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var silhouetteColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  
  var silhouetteSize: js.UndefOr[Double] = js.native
  
  var specularEnvironmentMaps: js.UndefOr[String] = js.native
  
  var sphericalHarmonicCoefficients: js.UndefOr[js.Array[Cartesian3]] = js.native
}
object AllowPicking {
  
  @scala.inline
  def apply(): AllowPicking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowPicking]
  }
  
  @scala.inline
  implicit class AllowPickingOps[Self <: AllowPicking] (val x: Self) extends AnyVal {
    
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
    def setAllowPicking(value: Boolean): Self = this.set("allowPicking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPicking: Self = this.set("allowPicking", js.undefined)
    
    @scala.inline
    def setAsynchronous(value: Boolean): Self = this.set("asynchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsynchronous: Self = this.set("asynchronous", js.undefined)
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setClampAnimations(value: Boolean): Self = this.set("clampAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClampAnimations: Self = this.set("clampAnimations", js.undefined)
    
    @scala.inline
    def setClippingPlanes(value: ClippingPlaneCollection): Self = this.set("clippingPlanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClippingPlanes: Self = this.set("clippingPlanes", js.undefined)
    
    @scala.inline
    def setColor(value: typingsSlinky.cesium.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorBlendAmount(value: Double): Self = this.set("colorBlendAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorBlendAmount: Self = this.set("colorBlendAmount", js.undefined)
    
    @scala.inline
    def setColorBlendMode(value: Property): Self = this.set("colorBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorBlendMode: Self = this.set("colorBlendMode", js.undefined)
    
    @scala.inline
    def setCredit(value: typingsSlinky.cesium.mod.Credit | String): Self = this.set("credit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredit: Self = this.set("credit", js.undefined)
    
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = this.set("debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugShowBoundingVolume: Self = this.set("debugShowBoundingVolume", js.undefined)
    
    @scala.inline
    def setDebugWireframe(value: Boolean): Self = this.set("debugWireframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugWireframe: Self = this.set("debugWireframe", js.undefined)
    
    @scala.inline
    def setDequantizeInShader(value: Boolean): Self = this.set("dequantizeInShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDequantizeInShader: Self = this.set("dequantizeInShader", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: typingsSlinky.cesium.mod.DistanceDisplayCondition): Self = this.set("distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceDisplayCondition: Self = this.set("distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setGltf(value: js.Any): Self = this.set("gltf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGltf: Self = this.set("gltf", js.undefined)
    
    @scala.inline
    def setHeightReference(value: HeightReference): Self = this.set("heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightReference: Self = this.set("heightReference", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImageBasedLightingFactor(value: Cartesian2): Self = this.set("imageBasedLightingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBasedLightingFactor: Self = this.set("imageBasedLightingFactor", js.undefined)
    
    @scala.inline
    def setIncrementallyLoadTextures(value: Boolean): Self = this.set("incrementallyLoadTextures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementallyLoadTextures: Self = this.set("incrementallyLoadTextures", js.undefined)
    
    @scala.inline
    def setLightColor(value: Cartesian3): Self = this.set("lightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightColor: Self = this.set("lightColor", js.undefined)
    
    @scala.inline
    def setLuminanceAtZenith(value: Double): Self = this.set("luminanceAtZenith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLuminanceAtZenith: Self = this.set("luminanceAtZenith", js.undefined)
    
    @scala.inline
    def setMaximumScale(value: Double): Self = this.set("maximumScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumScale: Self = this.set("maximumScale", js.undefined)
    
    @scala.inline
    def setMinimumPixelSize(value: Double): Self = this.set("minimumPixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumPixelSize: Self = this.set("minimumPixelSize", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = this.set("modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelMatrix: Self = this.set("modelMatrix", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScene(value: typingsSlinky.cesium.mod.Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScene: Self = this.set("scene", js.undefined)
    
    @scala.inline
    def setShadows(value: ShadowMode): Self = this.set("shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSilhouetteColor(value: typingsSlinky.cesium.mod.Color): Self = this.set("silhouetteColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilhouetteColor: Self = this.set("silhouetteColor", js.undefined)
    
    @scala.inline
    def setSilhouetteSize(value: Double): Self = this.set("silhouetteSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilhouetteSize: Self = this.set("silhouetteSize", js.undefined)
    
    @scala.inline
    def setSpecularEnvironmentMaps(value: String): Self = this.set("specularEnvironmentMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularEnvironmentMaps: Self = this.set("specularEnvironmentMaps", js.undefined)
    
    @scala.inline
    def setSphericalHarmonicCoefficientsVarargs(value: Cartesian3*): Self = this.set("sphericalHarmonicCoefficients", js.Array(value :_*))
    
    @scala.inline
    def setSphericalHarmonicCoefficients(value: js.Array[Cartesian3]): Self = this.set("sphericalHarmonicCoefficients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSphericalHarmonicCoefficients: Self = this.set("sphericalHarmonicCoefficients", js.undefined)
  }
}
