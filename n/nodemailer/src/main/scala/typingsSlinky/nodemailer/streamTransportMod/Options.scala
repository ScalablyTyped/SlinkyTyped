package typingsSlinky.nodemailer.streamTransportMod

import typingsSlinky.nodemailer.mod.TransportOptions
import typingsSlinky.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.nodemailer.mailerMod.Options
     with TransportOptions {
  /** if true, then returns the message as a Buffer object instead of a stream */
  var buffer: js.UndefOr[Boolean] = js.native
  /** either ‘windows’ or ‘unix’ (default). Forces all newlines in the output to either use Windows syntax <CR><LF> or Unix syntax <LF> */
  var newline: js.UndefOr[String] = js.native
  var streamTransport: `true` = js.native
}

object Options {
  @scala.inline
  def apply(streamTransport: `true`): Options = {
    val __obj = js.Dynamic.literal(streamTransport = streamTransport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamTransport(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamTransport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withNewline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(js.undefined)
        ret
    }
  }
  
}

