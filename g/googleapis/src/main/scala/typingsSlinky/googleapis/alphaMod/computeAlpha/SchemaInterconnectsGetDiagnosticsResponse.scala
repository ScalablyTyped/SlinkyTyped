package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the InterconnectsGetDiagnosticsRequest.
  */
@js.native
trait SchemaInterconnectsGetDiagnosticsResponse extends js.Object {
  var result: js.UndefOr[SchemaInterconnectDiagnostics] = js.native
}

object SchemaInterconnectsGetDiagnosticsResponse {
  @scala.inline
  def apply(): SchemaInterconnectsGetDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectsGetDiagnosticsResponse]
  }
  @scala.inline
  implicit class SchemaInterconnectsGetDiagnosticsResponseOps[Self <: SchemaInterconnectsGetDiagnosticsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: SchemaInterconnectDiagnostics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

