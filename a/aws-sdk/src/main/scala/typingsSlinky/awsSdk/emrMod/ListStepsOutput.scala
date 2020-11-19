package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStepsOutput extends js.Object {
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.emrMod.Marker] = js.native
  
  /**
    * The filtered list of steps for the cluster.
    */
  var Steps: js.UndefOr[StepSummaryList] = js.native
}
object ListStepsOutput {
  
  @scala.inline
  def apply(): ListStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStepsOutput]
  }
  
  @scala.inline
  implicit class ListStepsOutputOps[Self <: ListStepsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: StepSummary*): Self = this.set("Steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: StepSummaryList): Self = this.set("Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("Steps", js.undefined)
  }
}
