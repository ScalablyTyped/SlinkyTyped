package typingsSlinky.awsSdk.codepipelineMod

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
  def apply(): PipelineMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineMetadata]
  }
  @scala.inline
  implicit class PipelineMetadataOps[Self <: PipelineMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineArn(value: PipelineArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineArn")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
  }
  
}

