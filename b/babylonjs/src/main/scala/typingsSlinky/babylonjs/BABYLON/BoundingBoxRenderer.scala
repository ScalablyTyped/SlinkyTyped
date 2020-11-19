package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingBoxRenderer extends ISceneComponent {
  
  var _activeMesh: js.Any = js.native
  
  var _colorShader: js.Any = js.native
  
  var _createIndexBuffer: js.Any = js.native
  
  var _evaluateSubMesh: js.Any = js.native
  
  var _fillIndexBuffer: js.Any = js.native
  
  var _fillIndexData: js.Any = js.native
  
  var _indexBuffer: js.Any = js.native
  
  var _prepareRessources: js.Any = js.native
  
  var _vertexBuffers: js.Any = js.native
  
  /**
    * Color of the bounding box lines placed behind an object
    */
  var backColor: Color3 = js.native
  
  /**
    * Color of the bounding box lines placed in front of an object
    */
  var frontColor: Color3 = js.native
  
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
    _activeMesh: js.Any,
    _colorShader: js.Any,
    _createIndexBuffer: js.Any,
    _evaluateSubMesh: js.Any,
    _fillIndexBuffer: js.Any,
    _fillIndexData: js.Any,
    _indexBuffer: js.Any,
    _prepareRessources: js.Any,
    _vertexBuffers: js.Any,
    backColor: Color3,
    dispose: () => Unit,
    frontColor: Color3,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    render: Double => Unit,
    renderList: SmartArray[BoundingBox],
    renderOcclusionBoundingBox: AbstractMesh => Unit,
    reset: () => Unit,
    scene: Scene,
    showBackLines: Boolean
  ): BoundingBoxRenderer = {
    val __obj = js.Dynamic.literal(_activeMesh = _activeMesh.asInstanceOf[js.Any], _colorShader = _colorShader.asInstanceOf[js.Any], _createIndexBuffer = _createIndexBuffer.asInstanceOf[js.Any], _evaluateSubMesh = _evaluateSubMesh.asInstanceOf[js.Any], _fillIndexBuffer = _fillIndexBuffer.asInstanceOf[js.Any], _fillIndexData = _fillIndexData.asInstanceOf[js.Any], _indexBuffer = _indexBuffer.asInstanceOf[js.Any], _prepareRessources = _prepareRessources.asInstanceOf[js.Any], _vertexBuffers = _vertexBuffers.asInstanceOf[js.Any], backColor = backColor.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), frontColor = frontColor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), render = js.Any.fromFunction1(render), renderList = renderList.asInstanceOf[js.Any], renderOcclusionBoundingBox = js.Any.fromFunction1(renderOcclusionBoundingBox), reset = js.Any.fromFunction0(reset), scene = scene.asInstanceOf[js.Any], showBackLines = showBackLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxRenderer]
  }
  
  @scala.inline
  implicit class BoundingBoxRendererOps[Self <: BoundingBoxRenderer] (val x: Self) extends AnyVal {
    
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
    def set_activeMesh(value: js.Any): Self = this.set("_activeMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_colorShader(value: js.Any): Self = this.set("_colorShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createIndexBuffer(value: js.Any): Self = this.set("_createIndexBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_evaluateSubMesh(value: js.Any): Self = this.set("_evaluateSubMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fillIndexBuffer(value: js.Any): Self = this.set("_fillIndexBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fillIndexData(value: js.Any): Self = this.set("_fillIndexData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_indexBuffer(value: js.Any): Self = this.set("_indexBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_prepareRessources(value: js.Any): Self = this.set("_prepareRessources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_vertexBuffers(value: js.Any): Self = this.set("_vertexBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: Color3): Self = this.set("backColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontColor(value: Color3): Self = this.set("frontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: Double => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderList(value: SmartArray[BoundingBox]): Self = this.set("renderList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOcclusionBoundingBox(value: AbstractMesh => Unit): Self = this.set("renderOcclusionBoundingBox", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowBackLines(value: Boolean): Self = this.set("showBackLines", value.asInstanceOf[js.Any])
  }
}
