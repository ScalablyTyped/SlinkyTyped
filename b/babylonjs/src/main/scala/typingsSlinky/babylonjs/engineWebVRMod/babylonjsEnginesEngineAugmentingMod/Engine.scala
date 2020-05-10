package typingsSlinky.babylonjs.engineWebVRMod.babylonjsEnginesEngineAugmentingMod

import typingsSlinky.babylonjs.engineMod.IDisplayChangedEventArgs
import typingsSlinky.babylonjs.engineWebVRMod.IVRPresentationAttributes
import typingsSlinky.babylonjs.mathSizeMod.Size
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.webVRCameraMod.WebVROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Engine extends js.Object {
  /** @hidden */
  var _oldHardwareScaleFactor: Double = js.native
  /** @hidden */
  var _oldSize: Size = js.native
  /** @hidden */
  var _onVrDisplayConnect: Nullable[js.Function1[/* display */ _, Unit]] = js.native
  /** @hidden */
  var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
  /** @hidden */
  var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
  /** @hidden */
  var _vrDisplay: js.Any = js.native
  /** @hidden */
  var _vrExclusivePointerMode: Boolean = js.native
  /** @hidden */
  var _vrSupported: Boolean = js.native
  /** @hidden */
  var _webVRInitPromise: js.Promise[IDisplayChangedEventArgs] = js.native
  /**
    * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
    * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
    */
  var isInVRExclusivePointerMode: Boolean = js.native
  /**
    * Observable signaled when VR display mode changes
    */
  var onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs] = js.native
  /**
    * Observable signaled when VR request present is complete
    */
  var onVRRequestPresentComplete: Observable[Boolean] = js.native
  /**
    * Observable signaled when VR request present starts
    */
  var onVRRequestPresentStart: Observable[Engine] = js.native
  /**
    * Gets or sets the presentation attributes used to configure VR rendering
    */
  var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.native
  /** @hidden */
  def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
  /** @hidden */
  def _onVRDisplayPointerRestricted(): Unit = js.native
  /** @hidden */
  def _onVRDisplayPointerUnrestricted(): Unit = js.native
  /** @hidden */
  def _onVRFullScreenTriggered(): Unit = js.native
  /**
    * Call this function to switch to webVR mode
    * Will do nothing if webVR is not supported or if there is no webVR device
    * @param options the webvr options provided to the camera. mainly used for multiview
    * @see http://doc.babylonjs.com/how_to/webvr_camera
    */
  def enableVR(options: WebVROptions): Unit = js.native
  /**
    * Gets the current webVR device
    * @returns the current webVR device (or null)
    */
  def getVRDevice(): js.Any = js.native
  /**
    * Initializes a webVR display and starts listening to display change events
    * The onVRDisplayChangedObservable will be notified upon these changes
    * @returns A promise containing a VRDisplay and if vr is supported
    */
  def initWebVRAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
  /**
    * Gets a boolean indicating if a webVR device was detected
    * @returns true if a webVR device was detected
    */
  def isVRDevicePresent(): Boolean = js.native
}

object Engine {
  @scala.inline
  def apply(
    _getVRDisplaysAsync: () => js.Promise[IDisplayChangedEventArgs],
    _oldHardwareScaleFactor: Double,
    _oldSize: Size,
    _onVRDisplayPointerRestricted: () => Unit,
    _onVRDisplayPointerUnrestricted: () => Unit,
    _onVRFullScreenTriggered: () => Unit,
    _vrDisplay: js.Any,
    _vrExclusivePointerMode: Boolean,
    _vrSupported: Boolean,
    _webVRInitPromise: js.Promise[IDisplayChangedEventArgs],
    enableVR: WebVROptions => Unit,
    getVRDevice: () => js.Any,
    initWebVRAsync: () => js.Promise[IDisplayChangedEventArgs],
    isInVRExclusivePointerMode: Boolean,
    isVRDevicePresent: () => Boolean,
    onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs],
    onVRRequestPresentComplete: Observable[Boolean],
    onVRRequestPresentStart: Observable[Engine]
  ): Engine = {
    val __obj = js.Dynamic.literal(_getVRDisplaysAsync = js.Any.fromFunction0(_getVRDisplaysAsync), _oldHardwareScaleFactor = _oldHardwareScaleFactor.asInstanceOf[js.Any], _oldSize = _oldSize.asInstanceOf[js.Any], _onVRDisplayPointerRestricted = js.Any.fromFunction0(_onVRDisplayPointerRestricted), _onVRDisplayPointerUnrestricted = js.Any.fromFunction0(_onVRDisplayPointerUnrestricted), _onVRFullScreenTriggered = js.Any.fromFunction0(_onVRFullScreenTriggered), _vrDisplay = _vrDisplay.asInstanceOf[js.Any], _vrExclusivePointerMode = _vrExclusivePointerMode.asInstanceOf[js.Any], _vrSupported = _vrSupported.asInstanceOf[js.Any], _webVRInitPromise = _webVRInitPromise.asInstanceOf[js.Any], enableVR = js.Any.fromFunction1(enableVR), getVRDevice = js.Any.fromFunction0(getVRDevice), initWebVRAsync = js.Any.fromFunction0(initWebVRAsync), isInVRExclusivePointerMode = isInVRExclusivePointerMode.asInstanceOf[js.Any], isVRDevicePresent = js.Any.fromFunction0(isVRDevicePresent), onVRDisplayChangedObservable = onVRDisplayChangedObservable.asInstanceOf[js.Any], onVRRequestPresentComplete = onVRRequestPresentComplete.asInstanceOf[js.Any], onVRRequestPresentStart = onVRRequestPresentStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_getVRDisplaysAsync(value: () => js.Promise[IDisplayChangedEventArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getVRDisplaysAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_oldHardwareScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_oldHardwareScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_oldSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_oldSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onVRDisplayPointerRestricted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onVRDisplayPointerRestricted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_onVRDisplayPointerUnrestricted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onVRDisplayPointerUnrestricted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_onVRFullScreenTriggered(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onVRFullScreenTriggered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_vrDisplay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vrDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_vrExclusivePointerMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vrExclusivePointerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_vrSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vrSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_webVRInitPromise(value: js.Promise[IDisplayChangedEventArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_webVRInitPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableVR(value: WebVROptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVR")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVRDevice(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVRDevice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitWebVRAsync(value: () => js.Promise[IDisplayChangedEventArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initWebVRAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInVRExclusivePointerMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInVRExclusivePointerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVRDevicePresent(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVRDevicePresent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnVRDisplayChangedObservable(value: Observable[IDisplayChangedEventArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVRDisplayChangedObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnVRRequestPresentComplete(value: Observable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVRRequestPresentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnVRRequestPresentStart(value: Observable[Engine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVRRequestPresentStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onVrDisplayConnect(value: /* display */ _ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onVrDisplayConnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_onVrDisplayConnectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onVrDisplayConnect")(null)
        ret
    }
    @scala.inline
    def with_onVrDisplayDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onVrDisplayDisconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_onVrDisplayDisconnectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onVrDisplayDisconnect")(null)
        ret
    }
    @scala.inline
    def with_onVrDisplayPresentChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onVrDisplayPresentChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_onVrDisplayPresentChangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onVrDisplayPresentChange")(null)
        ret
    }
    @scala.inline
    def withVrPresentationAttributes(value: IVRPresentationAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrPresentationAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVrPresentationAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrPresentationAttributes")(js.undefined)
        ret
    }
  }
  
}

