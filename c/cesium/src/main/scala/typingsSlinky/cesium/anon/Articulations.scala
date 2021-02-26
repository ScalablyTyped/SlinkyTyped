package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian2
import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.ClippingPlaneCollection
import typingsSlinky.cesium.mod.ColorBlendMode
import typingsSlinky.cesium.mod.HeightReference
import typingsSlinky.cesium.mod.Property
import typingsSlinky.cesium.mod.PropertyBag
import typingsSlinky.cesium.mod.ShadowMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Articulations extends StObject {
  
  var articulations: js.UndefOr[PropertyBag] = js.native
  
  var clampAnimations: js.UndefOr[Property | Boolean] = js.native
  
  var clippingPlanes: js.UndefOr[Property | ClippingPlaneCollection] = js.native
  
  var color: js.UndefOr[Property | typingsSlinky.cesium.mod.Color] = js.native
  
  var colorBlendAmount: js.UndefOr[Property | Double] = js.native
  
  var colorBlendMode: js.UndefOr[Property | ColorBlendMode] = js.native
  
  var distanceDisplayCondition: js.UndefOr[Property | typingsSlinky.cesium.mod.DistanceDisplayCondition] = js.native
  
  var heightReference: js.UndefOr[Property | HeightReference] = js.native
  
  var imageBasedLightingFactor: js.UndefOr[Property | Cartesian2] = js.native
  
  var incrementallyLoadTextures: js.UndefOr[Property | Boolean] = js.native
  
  var lightColor: js.UndefOr[Property | Cartesian3] = js.native
  
  var maximumScale: js.UndefOr[Property | Double] = js.native
  
  var minimumPixelSize: js.UndefOr[Property | Double] = js.native
  
  var nodeTransformations: js.UndefOr[PropertyBag] = js.native
  
  var runAnimations: js.UndefOr[Property | Boolean] = js.native
  
  var scale: js.UndefOr[Property | Double] = js.native
  
  var shadows: js.UndefOr[Property | ShadowMode] = js.native
  
  var show: js.UndefOr[Property | Boolean] = js.native
  
  var silhouetteColor: js.UndefOr[Property | typingsSlinky.cesium.mod.Color] = js.native
  
  var silhouetteSize: js.UndefOr[Property | Double] = js.native
  
  var uri: js.UndefOr[Property | String] = js.native
}
object Articulations {
  
  @scala.inline
  def apply(): Articulations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Articulations]
  }
  
  @scala.inline
  implicit class ArticulationsMutableBuilder[Self <: Articulations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArticulations(value: PropertyBag): Self = StObject.set(x, "articulations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArticulationsUndefined: Self = StObject.set(x, "articulations", js.undefined)
    
    @scala.inline
    def setClampAnimations(value: Property | Boolean): Self = StObject.set(x, "clampAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClampAnimationsUndefined: Self = StObject.set(x, "clampAnimations", js.undefined)
    
    @scala.inline
    def setClippingPlanes(value: Property | ClippingPlaneCollection): Self = StObject.set(x, "clippingPlanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingPlanesUndefined: Self = StObject.set(x, "clippingPlanes", js.undefined)
    
    @scala.inline
    def setColor(value: Property | typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBlendAmount(value: Property | Double): Self = StObject.set(x, "colorBlendAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBlendAmountUndefined: Self = StObject.set(x, "colorBlendAmount", js.undefined)
    
    @scala.inline
    def setColorBlendMode(value: Property | ColorBlendMode): Self = StObject.set(x, "colorBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBlendModeUndefined: Self = StObject.set(x, "colorBlendMode", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: Property | typingsSlinky.cesium.mod.DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setHeightReference(value: Property | HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    @scala.inline
    def setImageBasedLightingFactor(value: Property | Cartesian2): Self = StObject.set(x, "imageBasedLightingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageBasedLightingFactorUndefined: Self = StObject.set(x, "imageBasedLightingFactor", js.undefined)
    
    @scala.inline
    def setIncrementallyLoadTextures(value: Property | Boolean): Self = StObject.set(x, "incrementallyLoadTextures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementallyLoadTexturesUndefined: Self = StObject.set(x, "incrementallyLoadTextures", js.undefined)
    
    @scala.inline
    def setLightColor(value: Property | Cartesian3): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    
    @scala.inline
    def setMaximumScale(value: Property | Double): Self = StObject.set(x, "maximumScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumScaleUndefined: Self = StObject.set(x, "maximumScale", js.undefined)
    
    @scala.inline
    def setMinimumPixelSize(value: Property | Double): Self = StObject.set(x, "minimumPixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumPixelSizeUndefined: Self = StObject.set(x, "minimumPixelSize", js.undefined)
    
    @scala.inline
    def setNodeTransformations(value: PropertyBag): Self = StObject.set(x, "nodeTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTransformationsUndefined: Self = StObject.set(x, "nodeTransformations", js.undefined)
    
    @scala.inline
    def setRunAnimations(value: Property | Boolean): Self = StObject.set(x, "runAnimations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAnimationsUndefined: Self = StObject.set(x, "runAnimations", js.undefined)
    
    @scala.inline
    def setScale(value: Property | Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSilhouetteColor(value: Property | typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "silhouetteColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilhouetteColorUndefined: Self = StObject.set(x, "silhouetteColor", js.undefined)
    
    @scala.inline
    def setSilhouetteSize(value: Property | Double): Self = StObject.set(x, "silhouetteSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilhouetteSizeUndefined: Self = StObject.set(x, "silhouetteSize", js.undefined)
    
    @scala.inline
    def setUri(value: Property | String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
