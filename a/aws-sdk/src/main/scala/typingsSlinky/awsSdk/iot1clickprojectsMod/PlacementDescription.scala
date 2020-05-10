package typingsSlinky.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementDescription extends js.Object {
  /**
    * The user-defined attributes associated with the placement.
    */
  var attributes: PlacementAttributeMap = js.native
  /**
    * The date when the placement was initially created, in UNIX epoch time format.
    */
  var createdDate: js.Date = js.native
  /**
    * The name of the placement.
    */
  var placementName: PlacementName = js.native
  /**
    * The name of the project containing the placement.
    */
  var projectName: ProjectName = js.native
  /**
    * The date when the placement was last updated, in UNIX epoch time format. If the placement was not updated, then createdDate and updatedDate are the same.
    */
  var updatedDate: js.Date = js.native
}

object PlacementDescription {
  @scala.inline
  def apply(
    attributes: PlacementAttributeMap,
    createdDate: js.Date,
    placementName: PlacementName,
    projectName: ProjectName,
    updatedDate: js.Date
  ): PlacementDescription = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementDescription]
  }
  @scala.inline
  implicit class PlacementDescriptionOps[Self <: PlacementDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: PlacementAttributeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacementName(value: PlacementName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectName(value: ProjectName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

