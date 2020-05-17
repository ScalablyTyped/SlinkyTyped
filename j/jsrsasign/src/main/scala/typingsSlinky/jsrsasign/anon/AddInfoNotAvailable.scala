package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddInfoNotAvailable extends js.Object {
  var addInfoNotAvailable: Double = js.native
  var badAlg: Double = js.native
  var badDataFormat: Double = js.native
  var badRequest: Double = js.native
  var systemFailure: Double = js.native
  var timeNotAvailable: Double = js.native
  var unacceptedExtension: Double = js.native
  var unacceptedPolicy: Double = js.native
}

object AddInfoNotAvailable {
  @scala.inline
  def apply(
    addInfoNotAvailable: Double,
    badAlg: Double,
    badDataFormat: Double,
    badRequest: Double,
    systemFailure: Double,
    timeNotAvailable: Double,
    unacceptedExtension: Double,
    unacceptedPolicy: Double
  ): AddInfoNotAvailable = {
    val __obj = js.Dynamic.literal(addInfoNotAvailable = addInfoNotAvailable.asInstanceOf[js.Any], badAlg = badAlg.asInstanceOf[js.Any], badDataFormat = badDataFormat.asInstanceOf[js.Any], badRequest = badRequest.asInstanceOf[js.Any], systemFailure = systemFailure.asInstanceOf[js.Any], timeNotAvailable = timeNotAvailable.asInstanceOf[js.Any], unacceptedExtension = unacceptedExtension.asInstanceOf[js.Any], unacceptedPolicy = unacceptedPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInfoNotAvailable]
  }
  @scala.inline
  implicit class AddInfoNotAvailableOps[Self <: AddInfoNotAvailable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddInfoNotAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInfoNotAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadAlg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badAlg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadDataFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badDataFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemFailure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeNotAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeNotAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnacceptedExtension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unacceptedExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnacceptedPolicy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unacceptedPolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

