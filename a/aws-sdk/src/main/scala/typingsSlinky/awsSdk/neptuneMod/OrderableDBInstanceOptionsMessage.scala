package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableDBInstanceOptionsMessage extends js.Object {
  /**
    *  An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * An OrderableDBInstanceOption structure containing information about orderable options for the DB instance.
    */
  var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.native
}

object OrderableDBInstanceOptionsMessage {
  @scala.inline
  def apply(): OrderableDBInstanceOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableDBInstanceOptionsMessage]
  }
  @scala.inline
  implicit class OrderableDBInstanceOptionsMessageOps[Self <: OrderableDBInstanceOptionsMessage] (val x: Self) extends AnyVal {
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
    def withOrderableDBInstanceOptions(value: OrderableDBInstanceOptionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderableDBInstanceOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderableDBInstanceOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderableDBInstanceOptions")(js.undefined)
        ret
    }
  }
  
}

