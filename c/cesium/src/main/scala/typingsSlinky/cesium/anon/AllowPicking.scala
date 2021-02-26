package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian2
import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.ClippingPlaneCollection
import typingsSlinky.cesium.mod.HeightReference
import typingsSlinky.cesium.mod.Matrix4
import typingsSlinky.cesium.mod.Property
import typingsSlinky.cesium.mod.ShadowMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowPicking extends StObject {
  
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
  implicit class AllowPickingMutableBuilder[Self <: AllowPicking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPicking(value: Boolean): Self = StObject.set(x, "allowPicking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPickingUndefined: Self = StObject.set(x, "allowPicking", js.undefined)
    
    @scala.inline
    def setAsynchronous(value: Boolean): Self = StObject.set(x, "asynchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsynchronousUndefined: Self = StObject.set(x, "asynchronous", js.undefined)
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setClampAnimations(value: Boolean): Self = StObject.set(x, "clampAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClampAnimationsUndefined: Self = StObject.set(x, "clampAnimations", js.undefined)
    
    @scala.inline
    def setClippingPlanes(value: ClippingPlaneCollection): Self = StObject.set(x, "clippingPlanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingPlanesUndefined: Self = StObject.set(x, "clippingPlanes", js.undefined)
    
    @scala.inline
    def setColor(value: typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBlendAmount(value: Double): Self = StObject.set(x, "colorBlendAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBlendAmountUndefined: Self = StObject.set(x, "colorBlendAmount", js.undefined)
    
    @scala.inline
    def setColorBlendMode(value: Property): Self = StObject.set(x, "colorBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBlendModeUndefined: Self = StObject.set(x, "colorBlendMode", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCredit(value: typingsSlinky.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    @scala.inline
    def setDebugWireframe(value: Boolean): Self = StObject.set(x, "debugWireframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugWireframeUndefined: Self = StObject.set(x, "debugWireframe", js.undefined)
    
    @scala.inline
    def setDequantizeInShader(value: Boolean): Self = StObject.set(x, "dequantizeInShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDequantizeInShaderUndefined: Self = StObject.set(x, "dequantizeInShader", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: typingsSlinky.cesium.mod.DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setGltf(value: js.Any): Self = StObject.set(x, "gltf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGltfUndefined: Self = StObject.set(x, "gltf", js.undefined)
    
    @scala.inline
    def setHeightReference(value: HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImageBasedLightingFactor(value: Cartesian2): Self = StObject.set(x, "imageBasedLightingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBasedLightingFactorUndefined: Self = StObject.set(x, "imageBasedLightingFactor", js.undefined)
    
    @scala.inline
    def setIncrementallyLoadTextures(value: Boolean): Self = StObject.set(x, "incrementallyLoadTextures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementallyLoadTexturesUndefined: Self = StObject.set(x, "incrementallyLoadTextures", js.undefined)
    
    @scala.inline
    def setLightColor(value: Cartesian3): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    
    @scala.inline
    def setLuminanceAtZenith(value: Double): Self = StObject.set(x, "luminanceAtZenith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLuminanceAtZenithUndefined: Self = StObject.set(x, "luminanceAtZenith", js.undefined)
    
    @scala.inline
    def setMaximumScale(value: Double): Self = StObject.set(x, "maximumScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumScaleUndefined: Self = StObject.set(x, "maximumScale", js.undefined)
    
    @scala.inline
    def setMinimumPixelSize(value: Double): Self = StObject.set(x, "minimumPixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumPixelSizeUndefined: Self = StObject.set(x, "minimumPixelSize", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setScene(value: typingsSlinky.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    
    @scala.inline
    def setShadows(value: ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSilhouetteColor(value: typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "silhouetteColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilhouetteColorUndefined: Self = StObject.set(x, "silhouetteColor", js.undefined)
    
    @scala.inline
    def setSilhouetteSize(value: Double): Self = StObject.set(x, "silhouetteSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilhouetteSizeUndefined: Self = StObject.set(x, "silhouetteSize", js.undefined)
    
    @scala.inline
    def setSpecularEnvironmentMaps(value: String): Self = StObject.set(x, "specularEnvironmentMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularEnvironmentMapsUndefined: Self = StObject.set(x, "specularEnvironmentMaps", js.undefined)
    
    @scala.inline
    def setSphericalHarmonicCoefficients(value: js.Array[Cartesian3]): Self = StObject.set(x, "sphericalHarmonicCoefficients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSphericalHarmonicCoefficientsUndefined: Self = StObject.set(x, "sphericalHarmonicCoefficients", js.undefined)
    
    @scala.inline
    def setSphericalHarmonicCoefficientsVarargs(value: Cartesian3*): Self = StObject.set(x, "sphericalHarmonicCoefficients", js.Array(value :_*))
  }
}
