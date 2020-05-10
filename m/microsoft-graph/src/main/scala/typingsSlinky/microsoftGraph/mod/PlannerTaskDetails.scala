package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerTaskDetails extends Entity {
  // The collection of checklist items on the task.
  var checklist: js.UndefOr[PlannerChecklistItems] = js.native
  // Description of the task
  var description: js.UndefOr[String] = js.native
  /**
    * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist,
    * description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
    */
  var previewType: js.UndefOr[PlannerPreviewType] = js.native
  // The collection of references on the task.
  var references: js.UndefOr[PlannerExternalReferences] = js.native
}

object PlannerTaskDetails {
  @scala.inline
  def apply(): PlannerTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerTaskDetails]
  }
  @scala.inline
  implicit class PlannerTaskDetailsOps[Self <: PlannerTaskDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecklist(value: PlannerChecklistItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checklist")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
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
    def withPreviewType(value: PlannerPreviewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewType")(js.undefined)
        ret
    }
    @scala.inline
    def withReferences(value: PlannerExternalReferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(js.undefined)
        ret
    }
  }
  
}

