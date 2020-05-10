package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDescription extends js.Object {
  /**
    * The Unix timestamp for the date and time that the project was created.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ProjectArn] = js.native
  /**
    * The current status of the project.
    */
  var Status: js.UndefOr[ProjectStatus] = js.native
}

object ProjectDescription {
  @scala.inline
  def apply(): ProjectDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDescription]
  }
  @scala.inline
  implicit class ProjectDescriptionOps[Self <: ProjectDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectArn(value: ProjectArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ProjectStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

