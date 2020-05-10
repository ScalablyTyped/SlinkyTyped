package typingsSlinky.googleAuthLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXgoogiamauthorityselector extends js.Object {
  var `x-goog-iam-authority-selector`: String = js.native
  var `x-goog-iam-authorization-token`: String = js.native
}

object AnonXgoogiamauthorityselector {
  @scala.inline
  def apply(`x-goog-iam-authority-selector`: String, `x-goog-iam-authorization-token`: String): AnonXgoogiamauthorityselector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-goog-iam-authority-selector")(`x-goog-iam-authority-selector`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-goog-iam-authorization-token")(`x-goog-iam-authorization-token`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXgoogiamauthorityselector]
  }
  @scala.inline
  implicit class AnonXgoogiamauthorityselectorOps[Self <: AnonXgoogiamauthorityselector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-goog-iam-authority-selector`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-goog-iam-authority-selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-goog-iam-authorization-token`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-goog-iam-authorization-token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

