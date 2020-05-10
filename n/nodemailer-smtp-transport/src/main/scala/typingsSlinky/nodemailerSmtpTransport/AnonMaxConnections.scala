package typingsSlinky.nodemailerSmtpTransport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxConnections extends js.Object {
  /**
    * is the count of maximum simultaneous connections to make against the SMTP server (defaults to 5)
    */
  var maxConnections: js.UndefOr[Boolean] = js.native
  /**
    * limits the message count to be sent using a single connection (defaults to 100). After maxMessages is reached the connection is dropped and a new one is created for the following messages
    */
  var maxMessages: js.UndefOr[Boolean] = js.native
  /**
    * set to true to use pooled connections (defaults to false) instead of creating a new connection for every email
    */
  var pool: js.UndefOr[Boolean] = js.native
  /**
    * defines the time measuring period in milliseconds (defaults to 1000, ie. to 1 second) for rate limiting
    */
  var rateDelta: js.UndefOr[Boolean] = js.native
  /**
    * limits the message count to be sent in rateDelta time. Once rateLimit is reached, sending is paused until the end of the measuring period.
    */
  var rateLimit: js.UndefOr[Boolean] = js.native
}

object AnonMaxConnections {
  @scala.inline
  def apply(): AnonMaxConnections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxConnections]
  }
  @scala.inline
  implicit class AnonMaxConnectionsOps[Self <: AnonMaxConnections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxConnections(value: Boolean): Self = {
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
    def withMaxMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withPool(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
        ret
    }
    @scala.inline
    def withRateDelta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withRateLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimit")(js.undefined)
        ret
    }
  }
  
}

