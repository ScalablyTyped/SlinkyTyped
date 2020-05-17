package typingsSlinky.gapiClientAdmin.gapi.client.admin

import typingsSlinky.gapiClientAdmin.anon.CustomerId
import typingsSlinky.gapiClientAdmin.anon.DatetimeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageReport extends js.Object {
  /** The date to which the record belongs. */
  var date: js.UndefOr[String] = js.native
  /** Information about the type of the item. */
  var entity: js.UndefOr[CustomerId] = js.native
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  /** The kind of object. */
  var kind: js.UndefOr[String] = js.native
  /** Parameter value pairs for various applications. */
  var parameters: js.UndefOr[js.Array[DatetimeValue]] = js.native
}

object UsageReport {
  @scala.inline
  def apply(): UsageReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageReport]
  }
  @scala.inline
  implicit class UsageReportOps[Self <: UsageReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withEntity(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[DatetimeValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

