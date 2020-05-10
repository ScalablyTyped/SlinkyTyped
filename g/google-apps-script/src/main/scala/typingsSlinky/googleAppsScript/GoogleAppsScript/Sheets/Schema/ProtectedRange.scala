package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectedRange extends js.Object {
  var description: js.UndefOr[String] = js.native
  var editors: js.UndefOr[Editors] = js.native
  var namedRangeId: js.UndefOr[String] = js.native
  var protectedRangeId: js.UndefOr[Double] = js.native
  var range: js.UndefOr[GridRange] = js.native
  var requestingUserCanEdit: js.UndefOr[Boolean] = js.native
  var unprotectedRanges: js.UndefOr[js.Array[GridRange]] = js.native
  var warningOnly: js.UndefOr[Boolean] = js.native
}

object ProtectedRange {
  @scala.inline
  def apply(): ProtectedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectedRange]
  }
  @scala.inline
  implicit class ProtectedRangeOps[Self <: ProtectedRange] (val x: Self) extends AnyVal {
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
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEditors(value: Editors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editors")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedRangeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedRangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRangeId")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectedRangeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedRangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedRangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedRangeId")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestingUserCanEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestingUserCanEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestingUserCanEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestingUserCanEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprotectedRanges(value: js.Array[GridRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotectedRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprotectedRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotectedRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningOnly")(js.undefined)
        ret
    }
  }
  
}

