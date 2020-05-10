package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies the location of a streaming computation stage, for
  * stage-to-stage communication.
  */
@js.native
trait SchemaStreamingStageLocation extends js.Object {
  /**
    * Identifies the particular stream within the streaming Dataflow job.
    */
  var streamId: js.UndefOr[String] = js.native
}

object SchemaStreamingStageLocation {
  @scala.inline
  def apply(): SchemaStreamingStageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingStageLocation]
  }
  @scala.inline
  implicit class SchemaStreamingStageLocationOps[Self <: SchemaStreamingStageLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(js.undefined)
        ret
    }
  }
  
}

