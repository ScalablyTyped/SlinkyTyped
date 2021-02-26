package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingBoxRenderer extends ISceneComponent {
  
  var _colorShader: js.Any = js.native
  
  var _createIndexBuffer: js.Any = js.native
  
  var _evaluateSubMesh: js.Any = js.native
  
  var _fillIndexBuffer: js.Any = js.native
  
  var _fillIndexData: js.Any = js.native
  
  var _indexBuffer: js.Any = js.native
  
  var _preActiveMesh: js.Any = js.native
  
  var _prepareResources: js.Any = js.native
  
  var _vertexBuffers: js.Any = js.native
  
  /**
    * Color of the bounding box lines placed behind an object
    */
  var backColor: Color3 = js.native
  
  /**
    * When false, no bounding boxes will be rendered
    */
  var enabled: Boolean = js.native
  
  /**
    * Color of the bounding box lines placed in front of an object
    */
  var frontColor: Color3 = js.native
  
  /**
    * Observable raised after rendering a bounding box
    */
  var onAfterBoxRenderingObservable: Observable[BoundingBox] = js.native
  
  /**
    * Observable raised before rendering a bounding box
    */
  var onBeforeBoxRenderingObservable: Observable[BoundingBox] = js.native
  
  /**
    * Observable raised after resources are created
    */
  var onResourcesReadyObservable: Observable[BoundingBoxRenderer] = js.native
  
  /**
    * Render the bounding boxes of a specific rendering group
    * @param renderingGroupId defines the rendering group to render
    */
  def render(renderingGroupId: Double): Unit = js.native
  
  /**
    * @hidden
    */
  var renderList: SmartArray[BoundingBox] = js.native
  
  /**
    * In case of occlusion queries, we can render the occlusion bounding box through this method
    * @param mesh Define the mesh to render the occlusion bounding box for
    */
  def renderOcclusionBoundingBox(mesh: AbstractMesh): Unit = js.native
  
  /**
    * @hidden
    */
  def reset(): Unit = js.native
  
  /**
    * Defines if the renderer should show the back lines or not
    */
  var showBackLines: Boolean = js.native
}
object BoundingBoxRenderer {
  
  @scala.inline
  def apply(
    _colorShader: js.Any,
    _createIndexBuffer: js.Any,
    _evaluateSubMesh: js.Any,
    _fillIndexBuffer: js.Any,
    _fillIndexData: js.Any,
    _indexBuffer: js.Any,
    _preActiveMesh: js.Any,
    _prepareResources: js.Any,
    _vertexBuffers: js.Any,
    backColor: Color3,
    dispose: () => Unit,
    enabled: Boolean,
    frontColor: Color3,
    name: String,
    onAfterBoxRenderingObservable: Observable[BoundingBox],
    onBeforeBoxRenderingObservable: Observable[BoundingBox],
    onResourcesReadyObservable: Observable[BoundingBoxRenderer],
    rebuild: () => Unit,
    register: () => Unit,
    render: Double => Unit,
    renderList: SmartArray[BoundingBox],
    renderOcclusionBoundingBox: AbstractMesh => Unit,
    reset: () => Unit,
    scene: Scene,
    showBackLines: Boolean
  ): BoundingBoxRenderer = {
    val __obj = js.Dynamic.literal(_colorShader = _colorShader.asInstanceOf[js.Any], _createIndexBuffer = _createIndexBuffer.asInstanceOf[js.Any], _evaluateSubMesh = _evaluateSubMesh.asInstanceOf[js.Any], _fillIndexBuffer = _fillIndexBuffer.asInstanceOf[js.Any], _fillIndexData = _fillIndexData.asInstanceOf[js.Any], _indexBuffer = _indexBuffer.asInstanceOf[js.Any], _preActiveMesh = _preActiveMesh.asInstanceOf[js.Any], _prepareResources = _prepareResources.asInstanceOf[js.Any], _vertexBuffers = _vertexBuffers.asInstanceOf[js.Any], backColor = backColor.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enabled = enabled.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onAfterBoxRenderingObservable = onAfterBoxRenderingObservable.asInstanceOf[js.Any], onBeforeBoxRenderingObservable = onBeforeBoxRenderingObservable.asInstanceOf[js.Any], onResourcesReadyObservable = onResourcesReadyObservable.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), render = js.Any.fromFunction1(render), renderList = renderList.asInstanceOf[js.Any], renderOcclusionBoundingBox = js.Any.fromFunction1(renderOcclusionBoundingBox), reset = js.Any.fromFunction0(reset), scene = scene.asInstanceOf[js.Any], showBackLines = showBackLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxRenderer]
  }
  
  @scala.inline
  implicit class BoundingBoxRendererMutableBuilder[Self <: BoundingBoxRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackColor(value: Color3): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontColor(value: Color3): Self = StObject.set(x, "frontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAfterBoxRenderingObservable(value: Observable[BoundingBox]): Self = StObject.set(x, "onAfterBoxRenderingObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBeforeBoxRenderingObservable(value: Observable[BoundingBox]): Self = StObject.set(x, "onBeforeBoxRenderingObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResourcesReadyObservable(value: Observable[BoundingBoxRenderer]): Self = StObject.set(x, "onResourcesReadyObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: Double => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderList(value: SmartArray[BoundingBox]): Self = StObject.set(x, "renderList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOcclusionBoundingBox(value: AbstractMesh => Unit): Self = StObject.set(x, "renderOcclusionBoundingBox", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowBackLines(value: Boolean): Self = StObject.set(x, "showBackLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_colorShader(value: js.Any): Self = StObject.set(x, "_colorShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createIndexBuffer(value: js.Any): Self = StObject.set(x, "_createIndexBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_evaluateSubMesh(value: js.Any): Self = StObject.set(x, "_evaluateSubMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fillIndexBuffer(value: js.Any): Self = StObject.set(x, "_fillIndexBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fillIndexData(value: js.Any): Self = StObject.set(x, "_fillIndexData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_indexBuffer(value: js.Any): Self = StObject.set(x, "_indexBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_preActiveMesh(value: js.Any): Self = StObject.set(x, "_preActiveMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_prepareResources(value: js.Any): Self = StObject.set(x, "_prepareResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_vertexBuffers(value: js.Any): Self = StObject.set(x, "_vertexBuffers", value.asInstanceOf[js.Any])
  }
}
