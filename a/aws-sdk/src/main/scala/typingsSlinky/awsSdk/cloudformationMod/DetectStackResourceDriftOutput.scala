package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectStackResourceDriftOutput extends js.Object {
  /**
    * Information about whether the resource's actual configuration has drifted from its expected template configuration, including actual and expected property values and any differences detected.
    */
  var StackResourceDrift: typingsSlinky.awsSdk.cloudformationMod.StackResourceDrift = js.native
}

object DetectStackResourceDriftOutput {
  @scala.inline
  def apply(StackResourceDrift: StackResourceDrift): DetectStackResourceDriftOutput = {
    val __obj = js.Dynamic.literal(StackResourceDrift = StackResourceDrift.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackResourceDriftOutput]
  }
  @scala.inline
  implicit class DetectStackResourceDriftOutputOps[Self <: DetectStackResourceDriftOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackResourceDrift(value: StackResourceDrift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackResourceDrift")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

