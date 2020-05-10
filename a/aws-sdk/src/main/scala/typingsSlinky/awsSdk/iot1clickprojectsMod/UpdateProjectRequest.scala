package typingsSlinky.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectRequest extends js.Object {
  /**
    * An optional user-defined description for the project.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * An object defining the project update. Once a project has been created, you cannot add device template names to the project. However, for a given placementTemplate, you can update the associated callbackOverrides for the device definition using this API.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.native
  /**
    * The name of the project to be updated.
    */
  var projectName: ProjectName = js.native
}

object UpdateProjectRequest {
  @scala.inline
  def apply(projectName: ProjectName): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  @scala.inline
  implicit class UpdateProjectRequestOps[Self <: UpdateProjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectName(value: ProjectName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementTemplate(value: PlacementTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementTemplate")(js.undefined)
        ret
    }
  }
  
}

