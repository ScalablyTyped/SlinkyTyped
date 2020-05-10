package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectStackResourceDriftInput extends js.Object {
  /**
    * The logical name of the resource for which to return drift information.
    */
  var LogicalResourceId: typingsSlinky.awsSdk.cloudformationMod.LogicalResourceId = js.native
  /**
    * The name of the stack to which the resource belongs.
    */
  var StackName: StackNameOrId = js.native
}

object DetectStackResourceDriftInput {
  @scala.inline
  def apply(LogicalResourceId: LogicalResourceId, StackName: StackNameOrId): DetectStackResourceDriftInput = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackResourceDriftInput]
  }
  @scala.inline
  implicit class DetectStackResourceDriftInputOps[Self <: DetectStackResourceDriftInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogicalResourceId(value: LogicalResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackName(value: StackNameOrId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

