package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountStatusStatistics extends js.Object {
  /**
    * Number of active offers.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Number of disapproved offers.
    */
  var disapproved: js.UndefOr[String] = js.native
  /**
    * Number of expiring offers.
    */
  var expiring: js.UndefOr[String] = js.native
  /**
    * Number of pending offers.
    */
  var pending: js.UndefOr[String] = js.native
}

object SchemaAccountStatusStatistics {
  @scala.inline
  def apply(): SchemaAccountStatusStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusStatistics]
  }
  @scala.inline
  implicit class SchemaAccountStatusStatisticsOps[Self <: SchemaAccountStatusStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withDisapproved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disapproved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisapproved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disapproved")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiring")(js.undefined)
        ret
    }
    @scala.inline
    def withPending(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(js.undefined)
        ret
    }
  }
  
}

