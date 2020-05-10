package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetApplicationsInput extends js.Object {
  /**
    * A list of application names separated by spaces. The maximum number of application names you can specify is 25.
    */
  var applicationNames: ApplicationsList = js.native
}

object BatchGetApplicationsInput {
  @scala.inline
  def apply(applicationNames: ApplicationsList): BatchGetApplicationsInput = {
    val __obj = js.Dynamic.literal(applicationNames = applicationNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetApplicationsInput]
  }
  @scala.inline
  implicit class BatchGetApplicationsInputOps[Self <: BatchGetApplicationsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationNames(value: ApplicationsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

