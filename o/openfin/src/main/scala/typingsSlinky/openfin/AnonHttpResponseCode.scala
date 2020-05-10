package typingsSlinky.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHttpResponseCode extends js.Object {
  var httpResponseCode: Double = js.native
}

object AnonHttpResponseCode {
  @scala.inline
  def apply(httpResponseCode: Double): AnonHttpResponseCode = {
    val __obj = js.Dynamic.literal(httpResponseCode = httpResponseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHttpResponseCode]
  }
  @scala.inline
  implicit class AnonHttpResponseCodeOps[Self <: AnonHttpResponseCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpResponseCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpResponseCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

