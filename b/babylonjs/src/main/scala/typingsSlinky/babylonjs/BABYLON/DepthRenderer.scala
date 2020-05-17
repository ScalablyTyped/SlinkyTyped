package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepthRenderer extends js.Object {
  var _cachedDefines: js.Any = js.native
  var _camera: js.Any = js.native
  val _clearColor: js.Any = js.native
  var _depthMap: js.Any = js.native
  var _effect: js.Any = js.native
  var _scene: js.Any = js.native
  val _storeNonLinearDepth: js.Any = js.native
  /** Enable or disable the depth renderer. When disabled, the depth texture is not updated */
  var enabled: Boolean = js.native
  /** Get if the depth renderer is using packed depth or not */
  val isPacked: Boolean = js.native
  /**
    * Specifiess that the depth renderer will only be used within
    * the camera it is created for.
    * This can help forcing its rendering during the camera processing.
    */
  var useOnlyInActiveCamera: Boolean = js.native
  /**
    * Disposes of the depth renderer.
    */
  def dispose(): Unit = js.native
  /**
    * Gets the texture which the depth map will be written to.
    * @returns The depth map texture
    */
  def getDepthMap(): RenderTargetTexture = js.native
  /**
    * Creates the depth rendering effect and checks if the effect is ready.
    * @param subMesh The submesh to be used to render the depth map of
    * @param useInstances If multiple world instances should be used
    * @returns if the depth renderer is ready to render the depth map
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
}

object DepthRenderer {
  @scala.inline
  def apply(
    _cachedDefines: js.Any,
    _camera: js.Any,
    _clearColor: js.Any,
    _depthMap: js.Any,
    _effect: js.Any,
    _scene: js.Any,
    _storeNonLinearDepth: js.Any,
    dispose: () => Unit,
    enabled: Boolean,
    getDepthMap: () => RenderTargetTexture,
    isPacked: Boolean,
    isReady: (SubMesh, Boolean) => Boolean,
    useOnlyInActiveCamera: Boolean
  ): DepthRenderer = {
    val __obj = js.Dynamic.literal(_cachedDefines = _cachedDefines.asInstanceOf[js.Any], _camera = _camera.asInstanceOf[js.Any], _clearColor = _clearColor.asInstanceOf[js.Any], _depthMap = _depthMap.asInstanceOf[js.Any], _effect = _effect.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _storeNonLinearDepth = _storeNonLinearDepth.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enabled = enabled.asInstanceOf[js.Any], getDepthMap = js.Any.fromFunction0(getDepthMap), isPacked = isPacked.asInstanceOf[js.Any], isReady = js.Any.fromFunction2(isReady), useOnlyInActiveCamera = useOnlyInActiveCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthRenderer]
  }
  @scala.inline
  implicit class DepthRendererOps[Self <: DepthRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_cachedDefines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cachedDefines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_camera(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_clearColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clearColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_depthMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_depthMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_effect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scene(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_storeNonLinearDepth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_storeNonLinearDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDepthMap(value: () => RenderTargetTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDepthMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPacked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReady(value: (SubMesh, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUseOnlyInActiveCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOnlyInActiveCamera")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

