package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderCamera extends Object {
  
  /**
    * The camera target ("look at") position in the internal Cartesian rendering coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var center: ArrayLike[Double] = js.native
  
  /**
    * The position of the camera in the internal Cartesian rendering coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var eye: ArrayLike[Double] = js.native
  
  /**
    * The distance to the far plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var far: Double = js.native
  
  /**
    * The horizontal field of view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var fovX: Double = js.native
  
  /**
    * The vertical field of view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var fovY: Double = js.native
  
  /**
    * The distance to the near plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var near: Double = js.native
  
  /**
    * The render pixel ratio.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var pixelRatio: Double = js.native
  
  /**
    * A 4x4 matrix that defines the perspective projection transformation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var projectionMatrix: ArrayLike[Double] = js.native
  
  /**
    * The camera up vector.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var up: ArrayLike[Double] = js.native
  
  /**
    * The inverse transpose of `viewMatrix`, used to transform normals from world space to camera space.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var viewInverseTransposeMatrix: ArrayLike[Double] = js.native
  
  /**
    * A 4x4 matrix that transforms coordinates from world space to camera space.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var viewMatrix: ArrayLike[Double] = js.native
  
  /**
    * The viewport (x, y, width, height).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderCamera)
    */
  var viewport: js.Any = js.native
}
object RenderCamera {
  
  @scala.inline
  def apply(
    center: ArrayLike[Double],
    constructor: js.Function,
    eye: ArrayLike[Double],
    far: Double,
    fovX: Double,
    fovY: Double,
    hasOwnProperty: PropertyKey => Boolean,
    near: Double,
    pixelRatio: Double,
    projectionMatrix: ArrayLike[Double],
    propertyIsEnumerable: PropertyKey => Boolean,
    up: ArrayLike[Double],
    viewInverseTransposeMatrix: ArrayLike[Double],
    viewMatrix: ArrayLike[Double],
    viewport: js.Any
  ): RenderCamera = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], fovX = fovX.asInstanceOf[js.Any], fovY = fovY.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), near = near.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], projectionMatrix = projectionMatrix.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), up = up.asInstanceOf[js.Any], viewInverseTransposeMatrix = viewInverseTransposeMatrix.asInstanceOf[js.Any], viewMatrix = viewMatrix.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderCamera]
  }
  
  @scala.inline
  implicit class RenderCameraMutableBuilder[Self <: RenderCamera] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: ArrayLike[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEye(value: ArrayLike[Double]): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFovX(value: Double): Self = StObject.set(x, "fovX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFovY(value: Double): Self = StObject.set(x, "fovY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionMatrix(value: ArrayLike[Double]): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: ArrayLike[Double]): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewInverseTransposeMatrix(value: ArrayLike[Double]): Self = StObject.set(x, "viewInverseTransposeMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMatrix(value: ArrayLike[Double]): Self = StObject.set(x, "viewMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: js.Any): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
