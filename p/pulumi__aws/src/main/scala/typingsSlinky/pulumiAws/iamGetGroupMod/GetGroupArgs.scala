package typingsSlinky.pulumiAws.iamGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupArgs extends js.Object {
  /**
    * The friendly IAM group name to match.
    */
  val groupName: String = js.native
}

object GetGroupArgs {
  @scala.inline
  def apply(groupName: String): GetGroupArgs = {
    val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupArgs]
  }
  @scala.inline
  implicit class GetGroupArgsOps[Self <: GetGroupArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

