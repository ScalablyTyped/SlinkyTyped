package typingsSlinky.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineMetadata extends js.Object {
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.native
  /**
    * The date and time the pipeline was last updated, in timestamp format.
    */
  var updated: js.UndefOr[js.Date] = js.native
}

object PipelineMetadata {
  @scala.inline
  def apply(created: js.Date = null, pipelineArn: PipelineArn = null, updated: js.Date = null): PipelineMetadata = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (pipelineArn != null) __obj.updateDynamic("pipelineArn")(pipelineArn.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineMetadata]
  }
}

