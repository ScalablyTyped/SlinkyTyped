package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingConstraints extends js.Object {
  /**
    * The upper boundary of EC2 instances in an instance group beyond which scaling activities are not allowed to grow. Scale-out activities will not add instances beyond this boundary.
    */
  var MaxCapacity: Integer = js.native
  /**
    * The lower boundary of EC2 instances in an instance group below which scaling activities are not allowed to shrink. Scale-in activities will not terminate instances below this boundary.
    */
  var MinCapacity: Integer = js.native
}

object ScalingConstraints {
  @scala.inline
  def apply(MaxCapacity: Integer, MinCapacity: Integer): ScalingConstraints = {
    val __obj = js.Dynamic.literal(MaxCapacity = MaxCapacity.asInstanceOf[js.Any], MinCapacity = MinCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingConstraints]
  }
  @scala.inline
  implicit class ScalingConstraintsOps[Self <: ScalingConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinCapacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

