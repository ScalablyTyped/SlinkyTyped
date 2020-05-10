package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResponsetype extends js.Object {
  var response_type: js.UndefOr[String] = js.native
}

object AnonResponsetype {
  @scala.inline
  def apply(): AnonResponsetype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonResponsetype]
  }
  @scala.inline
  implicit class AnonResponsetypeOps[Self <: AnonResponsetype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponse_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(js.undefined)
        ret
    }
  }
  
}

