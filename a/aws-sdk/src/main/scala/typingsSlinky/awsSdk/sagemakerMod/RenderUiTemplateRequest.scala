package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderUiTemplateRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * A RenderableTask object containing a representative task to render.
    */
  var Task: RenderableTask = js.native
  /**
    * A Template object containing the worker UI template to render.
    */
  var UiTemplate: typingsSlinky.awsSdk.sagemakerMod.UiTemplate = js.native
}

object RenderUiTemplateRequest {
  @scala.inline
  def apply(RoleArn: RoleArn, Task: RenderableTask, UiTemplate: UiTemplate): RenderUiTemplateRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], Task = Task.asInstanceOf[js.Any], UiTemplate = UiTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderUiTemplateRequest]
  }
  @scala.inline
  implicit class RenderUiTemplateRequestOps[Self <: RenderUiTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: RenderableTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiTemplate(value: UiTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UiTemplate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

