package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIntegrationsResponse extends js.Object {
  // list of integration objects
  var data: js.UndefOr[js.Array[Integration]] = js.native
}

object ListIntegrationsResponse {
  @scala.inline
  def apply(): ListIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIntegrationsResponse]
  }
  @scala.inline
  implicit class ListIntegrationsResponseOps[Self <: ListIntegrationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[Integration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

