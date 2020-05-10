package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A protected range.
  */
@js.native
trait SchemaProtectedRange extends js.Object {
  /**
    * The description of this protected range.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The users and groups with edit access to the protected range. This field
    * is only visible to users with edit access to the protected range and the
    * document. Editors are not supported with warning_only protection.
    */
  var editors: js.UndefOr[SchemaEditors] = js.native
  /**
    * The named range this protected range is backed by, if any.  When writing,
    * only one of range or named_range_id may be set.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  /**
    * The ID of the protected range. This field is read-only.
    */
  var protectedRangeId: js.UndefOr[Double] = js.native
  /**
    * The range that is being protected. The range may be fully unbounded, in
    * which case this is considered a protected sheet.  When writing, only one
    * of range or named_range_id may be set.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * True if the user who requested this protected range can edit the
    * protected area. This field is read-only.
    */
  var requestingUserCanEdit: js.UndefOr[Boolean] = js.native
  /**
    * The list of unprotected ranges within a protected sheet. Unprotected
    * ranges are only supported on protected sheets.
    */
  var unprotectedRanges: js.UndefOr[js.Array[SchemaGridRange]] = js.native
  /**
    * True if this protected range will show a warning when editing.
    * Warning-based protection means that every user can edit data in the
    * protected range, except editing will prompt a warning asking the user to
    * confirm the edit.  When writing: if this field is true, then editors is
    * ignored. Additionally, if this field is changed from true to false and
    * the `editors` field is not set (nor included in the field mask), then the
    * editors will be set to all the editors in the document.
    */
  var warningOnly: js.UndefOr[Boolean] = js.native
}

object SchemaProtectedRange {
  @scala.inline
  def apply(): SchemaProtectedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProtectedRange]
  }
  @scala.inline
  implicit class SchemaProtectedRangeOps[Self <: SchemaProtectedRange] (val x: Self) extends AnyVal {
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
    def withEditors(value: SchemaEditors): Self = {
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
    def withRange(value: SchemaGridRange): Self = {
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
    def withUnprotectedRanges(value: js.Array[SchemaGridRange]): Self = {
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

