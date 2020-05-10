package typingsSlinky.aframe

import typingsSlinky.std.VRDisplay
import typingsSlinky.three.mod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckHasPositionalTracking extends js.Object {
  var isWebXRAvailable: Boolean = js.native
  def PolyfillControls(object3D: Object3D): Unit = js.native
  def checkHasPositionalTracking(): Boolean = js.native
  def checkHeadsetConnected(): Boolean = js.native
  def getVRDisplay(): js.Array[VRDisplay] = js.native
  def isBrowserEnvironment(): Boolean = js.native
  def isGearVR(): Boolean = js.native
  def isIOS(): Boolean = js.native
  def isLandscape(): Boolean = js.native
  def isMobile(): Boolean = js.native
  def isNodeEnvironment(): Boolean = js.native
  def isOculusGo(): Boolean = js.native
  def isR7(): Boolean = js.native
  def isTablet(): Boolean = js.native
}

object AnonCheckHasPositionalTracking {
  @scala.inline
  def apply(
    PolyfillControls: Object3D => Unit,
    checkHasPositionalTracking: () => Boolean,
    checkHeadsetConnected: () => Boolean,
    getVRDisplay: () => js.Array[VRDisplay],
    isBrowserEnvironment: () => Boolean,
    isGearVR: () => Boolean,
    isIOS: () => Boolean,
    isLandscape: () => Boolean,
    isMobile: () => Boolean,
    isNodeEnvironment: () => Boolean,
    isOculusGo: () => Boolean,
    isR7: () => Boolean,
    isTablet: () => Boolean,
    isWebXRAvailable: Boolean
  ): AnonCheckHasPositionalTracking = {
    val __obj = js.Dynamic.literal(PolyfillControls = js.Any.fromFunction1(PolyfillControls), checkHasPositionalTracking = js.Any.fromFunction0(checkHasPositionalTracking), checkHeadsetConnected = js.Any.fromFunction0(checkHeadsetConnected), getVRDisplay = js.Any.fromFunction0(getVRDisplay), isBrowserEnvironment = js.Any.fromFunction0(isBrowserEnvironment), isGearVR = js.Any.fromFunction0(isGearVR), isIOS = js.Any.fromFunction0(isIOS), isLandscape = js.Any.fromFunction0(isLandscape), isMobile = js.Any.fromFunction0(isMobile), isNodeEnvironment = js.Any.fromFunction0(isNodeEnvironment), isOculusGo = js.Any.fromFunction0(isOculusGo), isR7 = js.Any.fromFunction0(isR7), isTablet = js.Any.fromFunction0(isTablet), isWebXRAvailable = isWebXRAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckHasPositionalTracking]
  }
  @scala.inline
  implicit class AnonCheckHasPositionalTrackingOps[Self <: AnonCheckHasPositionalTracking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolyfillControls(value: Object3D => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolyfillControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCheckHasPositionalTracking(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkHasPositionalTracking")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckHeadsetConnected(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkHeadsetConnected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVRDisplay(value: () => js.Array[VRDisplay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVRDisplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBrowserEnvironment(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBrowserEnvironment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsGearVR(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGearVR")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsIOS(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIOS")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLandscape(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLandscape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMobile(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsNodeEnvironment(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNodeEnvironment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOculusGo(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOculusGo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsR7(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isR7")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTablet(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTablet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsWebXRAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWebXRAvailable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

