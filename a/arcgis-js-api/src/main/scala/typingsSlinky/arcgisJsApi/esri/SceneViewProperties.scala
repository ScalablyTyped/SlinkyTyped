package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.global
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.high
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.local
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.low
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewProperties
  extends ViewProperties
     with BreakpointsOwnerProperties {
  
  /**
    * Allows the view to be partially or fully transparent when composited with the webpage elements behind it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#alphaCompositingEnabled)
    */
  var alphaCompositingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The observation point from which the visible portion (or perspective) of the SceneView is determined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera)
    */
  var camera: js.UndefOr[CameraProperties] = js.native
  
  /**
    * Represents the view's center point; when setting the center you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing at longitude/latitude pair (`[-100.4593, 36.9014]`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center)
    */
  var center: js.UndefOr[PointProperties | js.Array[Double]] = js.native
  
  /**
    * Represents an optional clipping area used to define the visible [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#clippingArea)
    */
  var clippingArea: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * Specifies constraints for [Camera tilt](esri-Camera.html#tilt) and altitude that may be applied to the SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var constraints: js.UndefOr[SceneViewConstraintsProperties] = js.native
  
  /**
    * Specifies various properties of the environment's visualization in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var environment: js.UndefOr[SceneViewEnvironmentProperties] = js.native
  
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * Options for configuring the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var highlightOptions: js.UndefOr[SceneViewHighlightOptionsProperties] = js.native
  
  /**
    * SceneView can draw scenes in three different quality modes: `high`, `medium` and `low`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#qualityProfile)
    */
  var qualityProfile: js.UndefOr[low | medium | high] = js.native
  
  /**
    * Represents an approximation of the map scale at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * The viewing mode (`local` or `global`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode)
    */
  var viewingMode: js.UndefOr[global | local] = js.native
  
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.native
  
  /**
    * Represents the level of detail (LOD) at the center of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom)
    */
  var zoom: js.UndefOr[Double] = js.native
}
object SceneViewProperties {
  
  @scala.inline
  def apply(): SceneViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewProperties]
  }
  
  @scala.inline
  implicit class SceneViewPropertiesMutableBuilder[Self <: SceneViewProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaCompositingEnabled(value: Boolean): Self = StObject.set(x, "alphaCompositingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaCompositingEnabledUndefined: Self = StObject.set(x, "alphaCompositingEnabled", js.undefined)
    
    @scala.inline
    def setCamera(value: CameraProperties): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setCenter(value: PointProperties | js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value :_*))
    
    @scala.inline
    def setClippingArea(value: ExtentProperties): Self = StObject.set(x, "clippingArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingAreaUndefined: Self = StObject.set(x, "clippingArea", js.undefined)
    
    @scala.inline
    def setConstraints(value: SceneViewConstraintsProperties): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    @scala.inline
    def setEnvironment(value: SceneViewEnvironmentProperties): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setHighlightOptions(value: SceneViewHighlightOptionsProperties): Self = StObject.set(x, "highlightOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightOptionsUndefined: Self = StObject.set(x, "highlightOptions", js.undefined)
    
    @scala.inline
    def setQualityProfile(value: low | medium | high): Self = StObject.set(x, "qualityProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityProfileUndefined: Self = StObject.set(x, "qualityProfile", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setViewingMode(value: global | local): Self = StObject.set(x, "viewingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewingModeUndefined: Self = StObject.set(x, "viewingMode", js.undefined)
    
    @scala.inline
    def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
