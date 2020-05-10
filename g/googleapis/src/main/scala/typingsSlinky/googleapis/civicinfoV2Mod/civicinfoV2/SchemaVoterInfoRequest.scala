package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for information about a voter.
  */
@js.native
trait SchemaVoterInfoRequest extends js.Object {
  var contextParams: js.UndefOr[SchemaContextParams] = js.native
  var voterInfoSegmentResult: js.UndefOr[SchemaVoterInfoSegmentResult] = js.native
}

object SchemaVoterInfoRequest {
  @scala.inline
  def apply(): SchemaVoterInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoterInfoRequest]
  }
  @scala.inline
  implicit class SchemaVoterInfoRequestOps[Self <: SchemaVoterInfoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextParams(value: SchemaContextParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextParams")(js.undefined)
        ret
    }
    @scala.inline
    def withVoterInfoSegmentResult(value: SchemaVoterInfoSegmentResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voterInfoSegmentResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoterInfoSegmentResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voterInfoSegmentResult")(js.undefined)
        ret
    }
  }
  
}

