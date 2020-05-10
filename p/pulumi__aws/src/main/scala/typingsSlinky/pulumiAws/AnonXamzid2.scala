package typingsSlinky.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXamzid2 extends js.Object {
  var `x-amz-id-2`: String = js.native
  var `x-amz-request-id`: String = js.native
}

object AnonXamzid2 {
  @scala.inline
  def apply(`x-amz-id-2`: String, `x-amz-request-id`: String): AnonXamzid2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-amz-id-2")(`x-amz-id-2`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-amz-request-id")(`x-amz-request-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXamzid2]
  }
  @scala.inline
  implicit class AnonXamzid2Ops[Self <: AnonXamzid2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-amz-id-2`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-amz-id-2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-amz-request-id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-amz-request-id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

