package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRPose extends js.Object {
  var emulatedPosition: Boolean = js.native
  var transform: XRRigidTransform = js.native
}

object XRPose {
  @scala.inline
  def apply(emulatedPosition: Boolean, transform: XRRigidTransform): XRPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRPose]
  }
  @scala.inline
  implicit class XRPoseOps[Self <: XRPose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmulatedPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulatedPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: XRRigidTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

