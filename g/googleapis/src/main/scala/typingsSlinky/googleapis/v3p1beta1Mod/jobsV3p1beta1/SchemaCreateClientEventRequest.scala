package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The report event request.
  */
@js.native
trait SchemaCreateClientEventRequest extends js.Object {
  /**
    * Required.  Events issued when end user interacts with customer&#39;s
    * application that uses Cloud Talent Solution.
    */
  var clientEvent: js.UndefOr[SchemaClientEvent] = js.native
}

object SchemaCreateClientEventRequest {
  @scala.inline
  def apply(): SchemaCreateClientEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateClientEventRequest]
  }
  @scala.inline
  implicit class SchemaCreateClientEventRequestOps[Self <: SchemaCreateClientEventRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientEvent(value: SchemaClientEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientEvent")(js.undefined)
        ret
    }
  }
  
}

