package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrailResponse extends js.Object {
  var Trail: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.Trail] = js.native
}

object GetTrailResponse {
  @scala.inline
  def apply(): GetTrailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTrailResponse]
  }
  @scala.inline
  implicit class GetTrailResponseOps[Self <: GetTrailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrail(value: Trail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trail")(js.undefined)
        ret
    }
  }
  
}

