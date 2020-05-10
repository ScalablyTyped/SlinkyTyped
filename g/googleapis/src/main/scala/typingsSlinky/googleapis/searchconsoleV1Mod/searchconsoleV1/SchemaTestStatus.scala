package typingsSlinky.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Final state of the test, including error details if necessary.
  */
@js.native
trait SchemaTestStatus extends js.Object {
  /**
    * Error details if applicable.
    */
  var details: js.UndefOr[String] = js.native
  /**
    * Status of the test.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaTestStatus {
  @scala.inline
  def apply(): SchemaTestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestStatus]
  }
  @scala.inline
  implicit class SchemaTestStatusOps[Self <: SchemaTestStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

