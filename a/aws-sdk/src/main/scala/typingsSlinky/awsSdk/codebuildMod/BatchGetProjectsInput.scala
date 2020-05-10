package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetProjectsInput extends js.Object {
  /**
    * The names or ARNs of the build projects. To get information about a project shared with your AWS account, its ARN must be specified. You cannot specify a shared project using its name.
    */
  var names: ProjectNames = js.native
}

object BatchGetProjectsInput {
  @scala.inline
  def apply(names: ProjectNames): BatchGetProjectsInput = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetProjectsInput]
  }
  @scala.inline
  implicit class BatchGetProjectsInputOps[Self <: BatchGetProjectsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNames(value: ProjectNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

