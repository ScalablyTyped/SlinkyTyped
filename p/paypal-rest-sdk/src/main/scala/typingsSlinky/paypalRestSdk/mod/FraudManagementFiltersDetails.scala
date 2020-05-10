package typingsSlinky.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FraudManagementFiltersDetails extends js.Object {
  var description: String = js.native
  var filter_id: String = js.native
  var filter_type: String = js.native
  var name: String = js.native
}

object FraudManagementFiltersDetails {
  @scala.inline
  def apply(description: String, filter_id: String, filter_type: String, name: String): FraudManagementFiltersDetails = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], filter_id = filter_id.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FraudManagementFiltersDetails]
  }
  @scala.inline
  implicit class FraudManagementFiltersDetailsOps[Self <: FraudManagementFiltersDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

