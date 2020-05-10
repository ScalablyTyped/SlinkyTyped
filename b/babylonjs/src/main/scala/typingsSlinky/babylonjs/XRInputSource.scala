package typingsSlinky.babylonjs

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRInputSource extends js.Object {
  var gamepad: js.UndefOr[Gamepad] = js.native
  var gripSpace: js.UndefOr[EventTarget] = js.native
  var handedness: XRHandedness = js.native
  var profiles: js.Array[String] = js.native
  var targetRayMode: XRTargetRayMode = js.native
  var targetRaySpace: EventTarget = js.native
}

object XRInputSource {
  @scala.inline
  def apply(
    handedness: XRHandedness,
    profiles: js.Array[String],
    targetRayMode: XRTargetRayMode,
    targetRaySpace: EventTarget
  ): XRInputSource = {
    val __obj = js.Dynamic.literal(handedness = handedness.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], targetRayMode = targetRayMode.asInstanceOf[js.Any], targetRaySpace = targetRaySpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRInputSource]
  }
  @scala.inline
  implicit class XRInputSourceOps[Self <: XRInputSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandedness(value: XRHandedness): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handedness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRayMode(value: XRTargetRayMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRaySpace(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRaySpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGamepad(value: Gamepad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamepad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepad")(js.undefined)
        ret
    }
    @scala.inline
    def withGripSpace(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gripSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGripSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gripSpace")(js.undefined)
        ret
    }
  }
  
}

