package typingsSlinky.hapiHawk.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BewitOptions extends js.Object {
  var credentials: Credentials = js.native
  /** Application specific data sent via the ext attribute */
  var ext: js.UndefOr[String] = js.native
  /** Time offset to sync with server time */
  var localtimeOffsetMsec: Double = js.native
  /** TTL in seconds */
  var ttlSec: Double = js.native
}

object BewitOptions {
  @scala.inline
  def apply(credentials: Credentials, localtimeOffsetMsec: Double, ttlSec: Double): BewitOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], localtimeOffsetMsec = localtimeOffsetMsec.asInstanceOf[js.Any], ttlSec = ttlSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[BewitOptions]
  }
  @scala.inline
  implicit class BewitOptionsOps[Self <: BewitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: Credentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocaltimeOffsetMsec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localtimeOffsetMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtlSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttlSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
  }
  
}

