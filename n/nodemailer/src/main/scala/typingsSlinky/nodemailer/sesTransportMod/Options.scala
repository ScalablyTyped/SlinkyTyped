package typingsSlinky.nodemailer.sesTransportMod

import typingsSlinky.nodemailer.mod.TransportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends MailOptions
     with TransportOptions {
  /** is an option that expects an instantiated aws.SES object */
  var SES: js.Any = js.native
   // aws-sdk.SES object
  /** How many messages per second is allowed to be delivered to SES */
  var maxConnections: js.UndefOr[Double] = js.native
  /** How many parallel connections to allow towards SES */
  var sendingRate: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(SES: js.Any): Options = {
    val __obj = js.Dynamic.literal(SES = SES.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSES(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withSendingRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendingRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendingRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendingRate")(js.undefined)
        ret
    }
  }
  
}

