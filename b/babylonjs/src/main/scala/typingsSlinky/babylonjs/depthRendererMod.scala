package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.subMeshMod.SubMesh
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/depthRenderer", JSImport.Namespace)
@js.native
object depthRendererMod extends js.Object {
  
  @js.native
  class DepthRenderer protected () extends js.Object {
    /**
      * Instantiates a depth renderer
      * @param scene The scene the renderer belongs to
      * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
      * @param camera The camera to be used to render the depth map (default: scene's active camera)
      * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, `type`: Double) = this()
    def this(scene: Scene, `type`: js.UndefOr[scala.Nothing], camera: Nullable[Camera]) = this()
    def this(scene: Scene, `type`: Double, camera: Nullable[Camera]) = this()
    def this(
      scene: Scene,
      `type`: js.UndefOr[scala.Nothing],
      camera: js.UndefOr[Nullable[Camera]],
      storeNonLinearDepth: Boolean
    ) = this()
    def this(scene: Scene, `type`: Double, camera: js.UndefOr[Nullable[Camera]], storeNonLinearDepth: Boolean) = this()
    
    var _cachedDefines: js.Any = js.native
    
    var _camera: js.Any = js.native
    
    val _clearColor: js.Any = js.native
    
    var _depthMap: js.Any = js.native
    
    var _effect: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    val _storeNonLinearDepth: js.Any = js.native
    
    /**
      * Disposes of the depth renderer.
      */
    def dispose(): Unit = js.native
    
    /** Enable or disable the depth renderer. When disabled, the depth texture is not updated */
    var enabled: Boolean = js.native
    
    /**
      * Gets the texture which the depth map will be written to.
      * @returns The depth map texture
      */
    def getDepthMap(): RenderTargetTexture = js.native
    
    /** Get if the depth renderer is using packed depth or not */
    val isPacked: Boolean = js.native
    
    /**
      * Creates the depth rendering effect and checks if the effect is ready.
      * @param subMesh The submesh to be used to render the depth map of
      * @param useInstances If multiple world instances should be used
      * @returns if the depth renderer is ready to render the depth map
      */
    def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
    
    /**
      * Specifiess that the depth renderer will only be used within
      * the camera it is created for.
      * This can help forcing its rendering during the camera processing.
      */
    var useOnlyInActiveCamera: Boolean = js.native
  }
  /* static members */
  @js.native
  object DepthRenderer extends js.Object {
    
    /** @hidden */
    def _SceneComponentInitialization(scene: Scene): Unit = js.native
  }
}
