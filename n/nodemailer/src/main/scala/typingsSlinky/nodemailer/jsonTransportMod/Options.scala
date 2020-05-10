package typingsSlinky.nodemailer.jsonTransportMod

import typingsSlinky.nodemailer.mod.TransportOptions
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.nodemailer.mailerMod.Options
     with TransportOptions {
  var jsonTransport: `true` = js.native
  var skipEncoding: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(jsonTransport: `true`): Options = {
    val __obj = js.Dynamic.literal(jsonTransport = jsonTransport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonTransport(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonTransport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipEncoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEncoding")(js.undefined)
        ret
    }
  }
  
}

