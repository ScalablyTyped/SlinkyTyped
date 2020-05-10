package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedDBInstanceMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of reserved DB instances.
    */
  var ReservedDBInstances: js.UndefOr[ReservedDBInstanceList] = js.native
}

object ReservedDBInstanceMessage {
  @scala.inline
  def apply(): ReservedDBInstanceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedDBInstanceMessage]
  }
  @scala.inline
  implicit class ReservedDBInstanceMessageOps[Self <: ReservedDBInstanceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedDBInstances(value: ReservedDBInstanceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedDBInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedDBInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedDBInstances")(js.undefined)
        ret
    }
  }
  
}

