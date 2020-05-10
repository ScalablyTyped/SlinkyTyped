package typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to start manual transfer runs.
  */
@js.native
trait SchemaStartManualTransferRunsResponse extends js.Object {
  /**
    * The transfer runs that were created.
    */
  var runs: js.UndefOr[js.Array[SchemaTransferRun]] = js.native
}

object SchemaStartManualTransferRunsResponse {
  @scala.inline
  def apply(): SchemaStartManualTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartManualTransferRunsResponse]
  }
  @scala.inline
  implicit class SchemaStartManualTransferRunsResponseOps[Self <: SchemaStartManualTransferRunsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuns(value: js.Array[SchemaTransferRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(js.undefined)
        ret
    }
  }
  
}

