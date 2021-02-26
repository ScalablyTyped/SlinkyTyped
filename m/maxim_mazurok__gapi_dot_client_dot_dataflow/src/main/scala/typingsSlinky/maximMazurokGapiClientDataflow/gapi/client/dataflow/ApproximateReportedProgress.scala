package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApproximateReportedProgress extends StObject {
  
  /**
    * Total amount of parallelism in the portion of input of this task that has already been consumed and is no longer active. In the first two examples above (see remaining_parallelism),
    * the value should be 29 or 2 respectively. The sum of remaining_parallelism and consumed_parallelism should equal the total amount of parallelism in this work item. If specified,
    * must be finite.
    */
  var consumedParallelism: js.UndefOr[ReportedParallelism] = js.native
  
  /** Completion as fraction of the input consumed, from 0.0 (beginning, nothing consumed), to 1.0 (end of the input, entire input consumed). */
  var fractionConsumed: js.UndefOr[Double] = js.native
  
  /** A Position within the work to represent a progress. */
  var position: js.UndefOr[Position] = js.native
  
  /**
    * Total amount of parallelism in the input of this task that remains, (i.e. can be delegated to this task and any new tasks via dynamic splitting). Always at least 1 for non-finished
    * work items and 0 for finished. "Amount of parallelism" refers to how many non-empty parts of the input can be read in parallel. This does not necessarily equal number of records. An
    * input that can be read in parallel down to the individual records is called "perfectly splittable". An example of non-perfectly parallelizable input is a block-compressed file
    * format where a block of records has to be read as a whole, but different blocks can be read in parallel. Examples: * If we are processing record #30 (starting at 1) out of 50 in a
    * perfectly splittable 50-record input, this value should be 21 (20 remaining + 1 current). * If we are reading through block 3 in a block-compressed file consisting of 5 blocks, this
    * value should be 3 (since blocks 4 and 5 can be processed in parallel by new tasks via dynamic splitting and the current task remains processing block 3). * If we are reading through
    * the last block in a block-compressed file, or reading or processing the last record in a perfectly splittable input, this value should be 1, because apart from the current task, no
    * additional remainder can be split off.
    */
  var remainingParallelism: js.UndefOr[ReportedParallelism] = js.native
}
object ApproximateReportedProgress {
  
  @scala.inline
  def apply(): ApproximateReportedProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApproximateReportedProgress]
  }
  
  @scala.inline
  implicit class ApproximateReportedProgressMutableBuilder[Self <: ApproximateReportedProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumedParallelism(value: ReportedParallelism): Self = StObject.set(x, "consumedParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedParallelismUndefined: Self = StObject.set(x, "consumedParallelism", js.undefined)
    
    @scala.inline
    def setFractionConsumed(value: Double): Self = StObject.set(x, "fractionConsumed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionConsumedUndefined: Self = StObject.set(x, "fractionConsumed", js.undefined)
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRemainingParallelism(value: ReportedParallelism): Self = StObject.set(x, "remainingParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingParallelismUndefined: Self = StObject.set(x, "remainingParallelism", js.undefined)
  }
}
