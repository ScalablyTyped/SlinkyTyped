package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeCapacity extends js.Object {
  /**
    * The desired number of streaming instances.
    */
  var DesiredInstances: Integer = js.native
}

object ComputeCapacity {
  @scala.inline
  def apply(DesiredInstances: Integer): ComputeCapacity = {
    val __obj = js.Dynamic.literal(DesiredInstances = DesiredInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeCapacity]
  }
  @scala.inline
  implicit class ComputeCapacityOps[Self <: ComputeCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredInstances(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredInstances")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

