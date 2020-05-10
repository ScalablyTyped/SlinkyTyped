package typingsSlinky.onionoo.mod.Onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelaySummary extends js.Object {
  /**
    * Array of IPv4 or IPv6 addresses where the relay accepts onion-routing connections or which the relay
    * used to exit to the Internet in the past 24 hours. The first address is the primary onion-routing address
    * that the relay used to register in the network, subsequent addresses are in arbitrary order. IPv6 hex
    * characters are all lower-case.
    */
  var a: js.Array[String] = js.native
  /**
    * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var f: String = js.native
  /**
    * Relay nickname consisting of 1–19 alphanumerical characters.
    */
  var n: String = js.native
  /**
    * Boolean field saying whether this relay was listed as running in the last relay network status consensus.
    */
  var r: Boolean = js.native
}

object RelaySummary {
  @scala.inline
  def apply(a: js.Array[String], f: String, n: String, r: Boolean): RelaySummary = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelaySummary]
  }
  @scala.inline
  implicit class RelaySummaryOps[Self <: RelaySummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

