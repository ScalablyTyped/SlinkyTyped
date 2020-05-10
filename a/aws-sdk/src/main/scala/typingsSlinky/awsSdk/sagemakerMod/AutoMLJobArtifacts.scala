package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLJobArtifacts extends js.Object {
  /**
    * The URL to the notebook location.
    */
  var CandidateDefinitionNotebookLocation: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CandidateDefinitionNotebookLocation] = js.native
  /**
    * The URL to the notebook location.
    */
  var DataExplorationNotebookLocation: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DataExplorationNotebookLocation] = js.native
}

object AutoMLJobArtifacts {
  @scala.inline
  def apply(): AutoMLJobArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobArtifacts]
  }
  @scala.inline
  implicit class AutoMLJobArtifactsOps[Self <: AutoMLJobArtifacts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidateDefinitionNotebookLocation(value: CandidateDefinitionNotebookLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandidateDefinitionNotebookLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandidateDefinitionNotebookLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandidateDefinitionNotebookLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withDataExplorationNotebookLocation(value: DataExplorationNotebookLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataExplorationNotebookLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataExplorationNotebookLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataExplorationNotebookLocation")(js.undefined)
        ret
    }
  }
  
}

