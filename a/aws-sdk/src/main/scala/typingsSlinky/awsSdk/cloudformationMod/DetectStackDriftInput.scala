package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectStackDriftInput extends js.Object {
  /**
    * The logical names of any resources you want to use as filters.
    */
  var LogicalResourceIds: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.LogicalResourceIds] = js.native
  /**
    * The name of the stack for which you want to detect drift. 
    */
  var StackName: StackNameOrId = js.native
}

object DetectStackDriftInput {
  @scala.inline
  def apply(StackName: StackNameOrId): DetectStackDriftInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackDriftInput]
  }
  @scala.inline
  implicit class DetectStackDriftInputOps[Self <: DetectStackDriftInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackName(value: StackNameOrId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalResourceIds(value: LogicalResourceIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalResourceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalResourceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalResourceIds")(js.undefined)
        ret
    }
  }
  
}

