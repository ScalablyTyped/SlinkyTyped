package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceConflictMatch extends js.Object {
  var conflicting_reference_offset_ms: js.UndefOr[String] = js.native
  var length_ms: js.UndefOr[String] = js.native
  var original_reference_offset_ms: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object ReferenceConflictMatch {
  @scala.inline
  def apply(): ReferenceConflictMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceConflictMatch]
  }
  @scala.inline
  implicit class ReferenceConflictMatchOps[Self <: ReferenceConflictMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflicting_reference_offset_ms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicting_reference_offset_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflicting_reference_offset_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicting_reference_offset_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withLength_ms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginal_reference_offset_ms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_reference_offset_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginal_reference_offset_ms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_reference_offset_ms")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

