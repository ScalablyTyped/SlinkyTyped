package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProgressUpdateStreamRequest extends js.Object {
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.DryRun] = js.native
  /**
    * The name of the ProgressUpdateStream. Do not store personal data in this field. 
    */
  var ProgressUpdateStreamName: ProgressUpdateStream = js.native
}

object CreateProgressUpdateStreamRequest {
  @scala.inline
  def apply(ProgressUpdateStreamName: ProgressUpdateStream): CreateProgressUpdateStreamRequest = {
    val __obj = js.Dynamic.literal(ProgressUpdateStreamName = ProgressUpdateStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProgressUpdateStreamRequest]
  }
  @scala.inline
  implicit class CreateProgressUpdateStreamRequestOps[Self <: CreateProgressUpdateStreamRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgressUpdateStreamName(value: ProgressUpdateStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressUpdateStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: DryRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

