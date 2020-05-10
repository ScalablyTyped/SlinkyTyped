package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReservationsResizeRequest extends js.Object {
  /**
    * Number of allocated resources can be resized with minimum = 1 and maximum
    * = 1000.
    */
  var specificSkuCount: js.UndefOr[String] = js.native
}

object SchemaReservationsResizeRequest {
  @scala.inline
  def apply(): SchemaReservationsResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationsResizeRequest]
  }
  @scala.inline
  implicit class SchemaReservationsResizeRequestOps[Self <: SchemaReservationsResizeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpecificSkuCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specificSkuCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecificSkuCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specificSkuCount")(js.undefined)
        ret
    }
  }
  
}

