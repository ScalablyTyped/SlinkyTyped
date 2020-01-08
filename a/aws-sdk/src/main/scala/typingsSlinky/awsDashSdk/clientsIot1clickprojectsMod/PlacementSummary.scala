package typingsSlinky.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementSummary extends js.Object {
  /**
    * The date when the placement was originally created, in UNIX epoch time format.
    */
  var createdDate: js.Date = js.native
  /**
    * The name of the placement being summarized.
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

object PlacementSummary {
  @scala.inline
  def apply(createdDate: js.Date, placementName: PlacementName, projectName: ProjectName, updatedDate: js.Date): PlacementSummary = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlacementSummary]
  }
}

