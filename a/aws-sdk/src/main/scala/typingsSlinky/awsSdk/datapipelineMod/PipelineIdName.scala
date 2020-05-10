package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineIdName extends js.Object {
  /**
    * The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form df-297EG78HU43EEXAMPLE.
    */
  var id: js.UndefOr[typingsSlinky.awsSdk.datapipelineMod.id] = js.native
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[id] = js.native
}

object PipelineIdName {
  @scala.inline
  def apply(): PipelineIdName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineIdName]
  }
  @scala.inline
  implicit class PipelineIdNameOps[Self <: PipelineIdName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

