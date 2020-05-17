package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRInput extends IDisposable {
  var _addAndRemoveControllers: js.Any = js.native
  var _frameObserver: js.Any = js.native
  var _onInputSourcesChange: js.Any = js.native
  var _sessionEndedObserver: js.Any = js.native
  var _sessionInitObserver: js.Any = js.native
  /**
    * XR controllers being tracked
    */
  var controllers: js.Array[WebXRInputSource] = js.native
  /**
    * Event when a controller has been connected/added
    */
  var onControllerAddedObservable: Observable[WebXRInputSource] = js.native
  /**
    * Event when a controller has been removed/disconnected
    */
  var onControllerRemovedObservable: Observable[WebXRInputSource] = js.native
  val options: js.Any = js.native
  /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  var xrCamera: WebXRCamera = js.native
  /**
    * the xr session manager for this session
    */
  var xrSessionManager: WebXRSessionManager = js.native
}

object WebXRInput {
  @scala.inline
  def apply(
    _addAndRemoveControllers: js.Any,
    _frameObserver: js.Any,
    _onInputSourcesChange: js.Any,
    _sessionEndedObserver: js.Any,
    _sessionInitObserver: js.Any,
    controllers: js.Array[WebXRInputSource],
    dispose: () => Unit,
    onControllerAddedObservable: Observable[WebXRInputSource],
    onControllerRemovedObservable: Observable[WebXRInputSource],
    options: js.Any,
    xrCamera: WebXRCamera,
    xrSessionManager: WebXRSessionManager
  ): WebXRInput = {
    val __obj = js.Dynamic.literal(_addAndRemoveControllers = _addAndRemoveControllers.asInstanceOf[js.Any], _frameObserver = _frameObserver.asInstanceOf[js.Any], _onInputSourcesChange = _onInputSourcesChange.asInstanceOf[js.Any], _sessionEndedObserver = _sessionEndedObserver.asInstanceOf[js.Any], _sessionInitObserver = _sessionInitObserver.asInstanceOf[js.Any], controllers = controllers.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), onControllerAddedObservable = onControllerAddedObservable.asInstanceOf[js.Any], onControllerRemovedObservable = onControllerRemovedObservable.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], xrCamera = xrCamera.asInstanceOf[js.Any], xrSessionManager = xrSessionManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRInput]
  }
  @scala.inline
  implicit class WebXRInputOps[Self <: WebXRInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_addAndRemoveControllers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_addAndRemoveControllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_frameObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_frameObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onInputSourcesChange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onInputSourcesChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sessionEndedObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sessionEndedObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sessionInitObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sessionInitObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControllers(value: js.Array[WebXRInputSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnControllerAddedObservable(value: Observable[WebXRInputSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onControllerAddedObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnControllerRemovedObservable(value: Observable[WebXRInputSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onControllerRemovedObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXrCamera(value: WebXRCamera): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXrSessionManager(value: WebXRSessionManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrSessionManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

