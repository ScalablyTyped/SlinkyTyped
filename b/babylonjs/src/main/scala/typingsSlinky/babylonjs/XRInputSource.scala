package typingsSlinky.babylonjs

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRInputSource extends js.Object {
  var gamepad: js.UndefOr[Gamepad] = js.undefined
  var gripSpace: js.UndefOr[EventTarget] = js.undefined
  var handedness: XRHandedness
  var profiles: js.Array[String]
  var targetRayMode: XRTargetRayMode
  var targetRaySpace: EventTarget
}

object XRInputSource {
  @scala.inline
  def apply(
    handedness: XRHandedness,
    profiles: js.Array[String],
    targetRayMode: XRTargetRayMode,
    targetRaySpace: EventTarget,
    gamepad: Gamepad = null,
    gripSpace: EventTarget = null
  ): XRInputSource = {
    val __obj = js.Dynamic.literal(handedness = handedness.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], targetRayMode = targetRayMode.asInstanceOf[js.Any], targetRaySpace = targetRaySpace.asInstanceOf[js.Any])
    if (gamepad != null) __obj.updateDynamic("gamepad")(gamepad.asInstanceOf[js.Any])
    if (gripSpace != null) __obj.updateDynamic("gripSpace")(gripSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRInputSource]
  }
}

