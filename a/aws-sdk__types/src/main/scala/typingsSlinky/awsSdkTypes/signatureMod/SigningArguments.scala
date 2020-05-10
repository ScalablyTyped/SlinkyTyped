package typingsSlinky.awsSdkTypes.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningArguments extends js.Object {
  /**
    * The date and time to be used as signature metadata. This value should be
    * a Date object, a unix (epoch) timestamp, or a string that can be
    * understood by the JavaScript `Date` constructor.If not supplied, the
    * value returned by `new Date()` will be used.
    */
  var signingDate: js.UndefOr[DateInput] = js.native
}

object SigningArguments {
  @scala.inline
  def apply(): SigningArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningArguments]
  }
  @scala.inline
  implicit class SigningArgumentsOps[Self <: SigningArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSigningDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningDate(value: DateInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingDate")(js.undefined)
        ret
    }
  }
  
}

