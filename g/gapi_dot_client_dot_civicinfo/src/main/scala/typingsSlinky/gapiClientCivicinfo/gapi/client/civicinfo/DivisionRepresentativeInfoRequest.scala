package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivisionRepresentativeInfoRequest extends js.Object {
  var contextParams: js.UndefOr[ContextParams] = js.native
}

object DivisionRepresentativeInfoRequest {
  @scala.inline
  def apply(): DivisionRepresentativeInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivisionRepresentativeInfoRequest]
  }
  @scala.inline
  implicit class DivisionRepresentativeInfoRequestOps[Self <: DivisionRepresentativeInfoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextParams(value: ContextParams): Self = {
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
  }
  
}

