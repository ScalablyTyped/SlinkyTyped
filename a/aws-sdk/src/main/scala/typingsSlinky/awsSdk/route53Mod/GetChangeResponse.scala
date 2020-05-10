package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChangeResponse extends js.Object {
  /**
    * A complex type that contains information about the specified change batch.
    */
  var ChangeInfo: typingsSlinky.awsSdk.route53Mod.ChangeInfo = js.native
}

object GetChangeResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): GetChangeResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeResponse]
  }
  @scala.inline
  implicit class GetChangeResponseOps[Self <: GetChangeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeInfo(value: ChangeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

