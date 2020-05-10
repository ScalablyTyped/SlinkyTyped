package typingsSlinky.gapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportType extends js.Object {
  /** The date/time when this report type was/will be deprecated. */
  var deprecateTime: js.UndefOr[String] = js.native
  /** The ID of the report type (max. 100 characters). */
  var id: js.UndefOr[String] = js.native
  /** The name of the report type (max. 100 characters). */
  var name: js.UndefOr[String] = js.native
  /**
    * True if this a system-managed report type; otherwise false. Reporting jobs
    * for system-managed report types are created automatically and can thus not
    * be used in the `CreateJob` method.
    */
  var systemManaged: js.UndefOr[Boolean] = js.native
}

object ReportType {
  @scala.inline
  def apply(): ReportType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportType]
  }
  @scala.inline
  implicit class ReportTypeOps[Self <: ReportType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemManaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemManaged")(js.undefined)
        ret
    }
  }
  
}

