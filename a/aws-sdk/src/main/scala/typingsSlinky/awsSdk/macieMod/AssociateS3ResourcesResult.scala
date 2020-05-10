package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateS3ResourcesResult extends js.Object {
  /**
    * S3 resources that couldn't be associated with Amazon Macie. An error code and an error message are provided for each failed item. 
    */
  var failedS3Resources: js.UndefOr[FailedS3Resources] = js.native
}

object AssociateS3ResourcesResult {
  @scala.inline
  def apply(): AssociateS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateS3ResourcesResult]
  }
  @scala.inline
  implicit class AssociateS3ResourcesResultOps[Self <: AssociateS3ResourcesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedS3Resources(value: FailedS3Resources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedS3Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedS3Resources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedS3Resources")(js.undefined)
        ret
    }
  }
  
}

