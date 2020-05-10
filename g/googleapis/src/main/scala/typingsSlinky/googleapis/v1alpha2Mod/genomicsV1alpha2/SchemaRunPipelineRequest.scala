package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to run a pipeline. If `pipelineId` is specified, it refers to a
  * saved pipeline created with CreatePipeline and set as the `pipelineId` of
  * the returned Pipeline object. If `ephemeralPipeline` is specified, that
  * pipeline is run once with the given args and not saved. It is an error to
  * specify both `pipelineId` and `ephemeralPipeline`. `pipelineArgs` must be
  * specified.
  */
@js.native
trait SchemaRunPipelineRequest extends js.Object {
  /**
    * A new pipeline object to run once and then delete.
    */
  var ephemeralPipeline: js.UndefOr[SchemaPipeline] = js.native
  /**
    * The arguments to use when running this pipeline.
    */
  var pipelineArgs: js.UndefOr[SchemaRunPipelineArgs] = js.native
  /**
    * The already created pipeline to run.
    */
  var pipelineId: js.UndefOr[String] = js.native
}

object SchemaRunPipelineRequest {
  @scala.inline
  def apply(): SchemaRunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunPipelineRequest]
  }
  @scala.inline
  implicit class SchemaRunPipelineRequestOps[Self <: SchemaRunPipelineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEphemeralPipeline(value: SchemaPipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralPipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemeralPipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralPipeline")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineArgs(value: SchemaRunPipelineArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineId")(js.undefined)
        ret
    }
  }
  
}

