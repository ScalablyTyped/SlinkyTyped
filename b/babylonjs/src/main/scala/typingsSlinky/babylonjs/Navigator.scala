package typingsSlinky.babylonjs

import org.scalajs.dom.experimental.mediastream.MediaStreamConstraints
import typingsSlinky.std.NavigatorUserMediaErrorCallback
import typingsSlinky.std.NavigatorUserMediaSuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  val activeVRDisplays: js.Array[VRDisplay] = js.native
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]] = js.native
  def mozGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit = js.native
  def mozGetVRDevices(any: js.Any): js.Any = js.native
  def msGetGamepads(): js.Array[Gamepad] = js.native
  def msGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit = js.native
  def webkitGamepads(): js.Array[Gamepad] = js.native
  def webkitGetGamepads(): js.Array[Gamepad] = js.native
  def webkitGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit = js.native
}

object Navigator {
  @scala.inline
  def apply(
    activeVRDisplays: js.Array[VRDisplay],
    getVRDisplays: () => js.Promise[js.Array[VRDisplay]],
    mozGetUserMedia: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit,
    mozGetVRDevices: js.Any => js.Any,
    msGetGamepads: () => js.Array[Gamepad],
    msGetUserMedia: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit,
    webkitGamepads: () => js.Array[Gamepad],
    webkitGetGamepads: () => js.Array[Gamepad],
    webkitGetUserMedia: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
  ): Navigator = {
    val __obj = js.Dynamic.literal(activeVRDisplays = activeVRDisplays.asInstanceOf[js.Any], getVRDisplays = js.Any.fromFunction0(getVRDisplays), mozGetUserMedia = js.Any.fromFunction3(mozGetUserMedia), mozGetVRDevices = js.Any.fromFunction1(mozGetVRDevices), msGetGamepads = js.Any.fromFunction0(msGetGamepads), msGetUserMedia = js.Any.fromFunction3(msGetUserMedia), webkitGamepads = js.Any.fromFunction0(webkitGamepads), webkitGetGamepads = js.Any.fromFunction0(webkitGetGamepads), webkitGetUserMedia = js.Any.fromFunction3(webkitGetUserMedia))
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveVRDisplays(value: js.Array[VRDisplay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeVRDisplays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetVRDisplays(value: () => js.Promise[js.Array[VRDisplay]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVRDisplays")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMozGetUserMedia(
      value: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozGetUserMedia")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMozGetVRDevices(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozGetVRDevices")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMsGetGamepads(value: () => js.Array[Gamepad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msGetGamepads")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMsGetUserMedia(
      value: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msGetUserMedia")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withWebkitGamepads(value: () => js.Array[Gamepad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitGamepads")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWebkitGetGamepads(value: () => js.Array[Gamepad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitGetGamepads")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWebkitGetUserMedia(
      value: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitGetUserMedia")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

