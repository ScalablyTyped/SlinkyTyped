package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStepsInput extends js.Object {
  /**
    * The identifier of the cluster for which to list the steps.
    */
  var ClusterId: typingsSlinky.awsSdk.emrMod.ClusterId = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.emrMod.Marker] = js.native
  /**
    * The filter to limit the step list based on the identifier of the steps. You can specify a maximum of ten Step IDs. The character constraint applies to the overall length of the array.
    */
  var StepIds: js.UndefOr[XmlStringList] = js.native
  /**
    * The filter to limit the step list based on certain states.
    */
  var StepStates: js.UndefOr[StepStateList] = js.native
}

object ListStepsInput {
  @scala.inline
  def apply(ClusterId: ClusterId): ListStepsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStepsInput]
  }
  @scala.inline
  implicit class ListStepsInputOps[Self <: ListStepsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withStepIds(value: XmlStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepIds")(js.undefined)
        ret
    }
    @scala.inline
    def withStepStates(value: StepStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepStates")(js.undefined)
        ret
    }
  }
  
}

