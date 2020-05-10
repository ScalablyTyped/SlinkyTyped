package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorDetails extends js.Object {
  var errorDetails: js.UndefOr[js.Any] = js.native
  var httpStatus: js.UndefOr[Double] = js.native
  var requestOptions: js.UndefOr[js.Any] = js.native
}

object AnonErrorDetails {
  @scala.inline
  def apply(): AnonErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonErrorDetails]
  }
  @scala.inline
  implicit class AnonErrorDetailsOps[Self <: AnonErrorDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDetails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(js.undefined)
        ret
    }
  }
  
}

