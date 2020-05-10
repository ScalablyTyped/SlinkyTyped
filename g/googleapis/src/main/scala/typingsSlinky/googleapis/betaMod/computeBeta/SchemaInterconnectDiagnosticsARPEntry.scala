package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describing the ARP neighbor entries seen on this link
  */
@js.native
trait SchemaInterconnectDiagnosticsARPEntry extends js.Object {
  /**
    * The IP address of this ARP neighbor.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The MAC address of this ARP neighbor.
    */
  var macAddress: js.UndefOr[String] = js.native
}

object SchemaInterconnectDiagnosticsARPEntry {
  @scala.inline
  def apply(): SchemaInterconnectDiagnosticsARPEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsARPEntry]
  }
  @scala.inline
  implicit class SchemaInterconnectDiagnosticsARPEntryOps[Self <: SchemaInterconnectDiagnosticsARPEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macAddress")(js.undefined)
        ret
    }
  }
  
}

