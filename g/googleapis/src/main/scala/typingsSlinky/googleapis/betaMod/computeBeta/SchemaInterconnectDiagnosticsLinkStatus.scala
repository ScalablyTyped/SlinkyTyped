package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInterconnectDiagnosticsLinkStatus extends js.Object {
  /**
    * A list of InterconnectDiagnostics.ARPEntry objects, describing the ARP
    * neighbor entries seen on this link. This will be empty if the link is
    * bundled
    */
  var arpCaches: js.UndefOr[js.Array[SchemaInterconnectDiagnosticsARPEntry]] = js.native
  /**
    * The unique ID for this link assigned during turn up by Google.
    */
  var circuitId: js.UndefOr[String] = js.native
  /**
    * The Demarc address assigned by Google and provided in the LoA.
    */
  var googleDemarc: js.UndefOr[String] = js.native
  var lacpStatus: js.UndefOr[SchemaInterconnectDiagnosticsLinkLACPStatus] = js.native
  /**
    * An InterconnectDiagnostics.LinkOpticalPower object, describing the
    * current value and status of the received light level.
    */
  var receivingOpticalPower: js.UndefOr[SchemaInterconnectDiagnosticsLinkOpticalPower] = js.native
  /**
    * An InterconnectDiagnostics.LinkOpticalPower object, describing the
    * current value and status of the transmitted light level.
    */
  var transmittingOpticalPower: js.UndefOr[SchemaInterconnectDiagnosticsLinkOpticalPower] = js.native
}

object SchemaInterconnectDiagnosticsLinkStatus {
  @scala.inline
  def apply(): SchemaInterconnectDiagnosticsLinkStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsLinkStatus]
  }
  @scala.inline
  implicit class SchemaInterconnectDiagnosticsLinkStatusOps[Self <: SchemaInterconnectDiagnosticsLinkStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArpCaches(value: js.Array[SchemaInterconnectDiagnosticsARPEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arpCaches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArpCaches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arpCaches")(js.undefined)
        ret
    }
    @scala.inline
    def withCircuitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircuitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitId")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleDemarc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleDemarc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleDemarc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleDemarc")(js.undefined)
        ret
    }
    @scala.inline
    def withLacpStatus(value: SchemaInterconnectDiagnosticsLinkLACPStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lacpStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLacpStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lacpStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withReceivingOpticalPower(value: SchemaInterconnectDiagnosticsLinkOpticalPower): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivingOpticalPower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceivingOpticalPower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivingOpticalPower")(js.undefined)
        ret
    }
    @scala.inline
    def withTransmittingOpticalPower(value: SchemaInterconnectDiagnosticsLinkOpticalPower): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmittingOpticalPower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransmittingOpticalPower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmittingOpticalPower")(js.undefined)
        ret
    }
  }
  
}

