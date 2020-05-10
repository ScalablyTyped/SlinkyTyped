package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the created project.
    */
  var arn: ProjectArn = js.native
  /**
    * A user- or system-generated token that identifies the entity that requested project creation.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The ID of the project.
    */
  var id: ProjectId = js.native
  /**
    * Reserved for future use.
    */
  var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.native
}

object CreateProjectResult {
  @scala.inline
  def apply(arn: ProjectArn, id: ProjectId): CreateProjectResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResult]
  }
  @scala.inline
  implicit class CreateProjectResultOps[Self <: CreateProjectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: ProjectArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: ProjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectTemplateId(value: ProjectTemplateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectTemplateId")(js.undefined)
        ret
    }
  }
  
}

