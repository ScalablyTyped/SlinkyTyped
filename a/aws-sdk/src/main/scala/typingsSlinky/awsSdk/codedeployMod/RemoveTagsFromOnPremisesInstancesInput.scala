package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromOnPremisesInstancesInput extends js.Object {
  /**
    * The names of the on-premises instances from which to remove tags.
    */
  var instanceNames: InstanceNameList = js.native
  /**
    * The tag key-value pairs to remove from the on-premises instances.
    */
  var tags: TagList = js.native
}

object RemoveTagsFromOnPremisesInstancesInput {
  @scala.inline
  def apply(instanceNames: InstanceNameList, tags: TagList): RemoveTagsFromOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromOnPremisesInstancesInput]
  }
  @scala.inline
  implicit class RemoveTagsFromOnPremisesInstancesInputOps[Self <: RemoveTagsFromOnPremisesInstancesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceNames(value: InstanceNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

