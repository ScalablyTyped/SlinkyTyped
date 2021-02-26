package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderingGroupInfo extends StObject {
  
  /**
    * The camera currently used for the rendering pass
    */
  var camera: Nullable[Camera] = js.native
  
  /**
    * The ID of the renderingGroup being processed
    */
  var renderingGroupId: Double = js.native
  
  /**
    * The Scene that being rendered
    */
  var scene: Scene = js.native
}
object RenderingGroupInfo {
  
  @scala.inline
  def apply(renderingGroupId: Double, scene: Scene): RenderingGroupInfo = {
    val __obj = js.Dynamic.literal(renderingGroupId = renderingGroupId.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingGroupInfo]
  }
  
  @scala.inline
  implicit class RenderingGroupInfoMutableBuilder[Self <: RenderingGroupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraNull: Self = StObject.set(x, "camera", null)
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
