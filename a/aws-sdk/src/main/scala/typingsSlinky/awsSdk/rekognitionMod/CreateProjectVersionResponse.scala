package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectVersionResponse extends js.Object {
  /**
    * The ARN of the model version that was created. Use DescribeProjectVersion to get the current status of the training operation.
    */
  var ProjectVersionArn: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ProjectVersionArn] = js.native
}

object CreateProjectVersionResponse {
  @scala.inline
  def apply(): CreateProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectVersionResponse]
  }
  @scala.inline
  implicit class CreateProjectVersionResponseOps[Self <: CreateProjectVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectVersionArn(value: ProjectVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectVersionArn")(js.undefined)
        ret
    }
  }
  
}

