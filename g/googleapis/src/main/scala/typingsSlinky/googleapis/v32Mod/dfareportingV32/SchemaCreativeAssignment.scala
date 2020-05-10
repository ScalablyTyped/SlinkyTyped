package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Assignment.
  */
@js.native
trait SchemaCreativeAssignment extends js.Object {
  /**
    * Whether this creative assignment is active. When true, the creative will
    * be included in the ad&#39;s rotation.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Whether applicable event tags should fire when this creative assignment
    * is rendered. If this value is unset when the ad is inserted or updated,
    * it will default to true for all creative types EXCEPT for
    * INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and INSTREAM_VIDEO.
    */
  var applyEventTags: js.UndefOr[Boolean] = js.native
  /**
    * Click-through URL of the creative assignment.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.native
  /**
    * Companion creative overrides for this creative assignment. Applicable to
    * video ads.
    */
  var companionCreativeOverrides: js.UndefOr[js.Array[SchemaCompanionClickThroughOverride]] = js.native
  /**
    * Creative group assignments for this creative assignment. Only one
    * assignment per creative group number is allowed for a maximum of two
    * assignments.
    */
  var creativeGroupAssignments: js.UndefOr[js.Array[SchemaCreativeGroupAssignment]] = js.native
  /**
    * ID of the creative to be assigned. This is a required field.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the creative. This is a read-only,
    * auto-generated field.
    */
  var creativeIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Date and time that the assigned creative should stop serving. Must be
    * later than the start time.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Rich media exit overrides for this creative assignment. Applicable when
    * the creative type is any of the following:  - DISPLAY - RICH_MEDIA_INPAGE
    * - RICH_MEDIA_INPAGE_FLOATING - RICH_MEDIA_IM_EXPAND -
    * RICH_MEDIA_EXPANDING - RICH_MEDIA_INTERSTITIAL_FLOAT -
    * RICH_MEDIA_MOBILE_IN_APP - RICH_MEDIA_MULTI_FLOATING -
    * RICH_MEDIA_PEEL_DOWN - VPAID_LINEAR - VPAID_NON_LINEAR
    */
  var richMediaExitOverrides: js.UndefOr[js.Array[SchemaRichMediaExitOverride]] = js.native
  /**
    * Sequence number of the creative assignment, applicable when the rotation
    * type is CREATIVE_ROTATION_TYPE_SEQUENTIAL. Acceptable values are 1 to
    * 65535, inclusive.
    */
  var sequence: js.UndefOr[Double] = js.native
  /**
    * Whether the creative to be assigned is SSL-compliant. This is a read-only
    * field that is auto-generated when the ad is inserted or updated.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  /**
    * Date and time that the assigned creative should start serving.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Weight of the creative assignment, applicable when the rotation type is
    * CREATIVE_ROTATION_TYPE_RANDOM. Value must be greater than or equal to 1.
    */
  var weight: js.UndefOr[Double] = js.native
}

object SchemaCreativeAssignment {
  @scala.inline
  def apply(): SchemaCreativeAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeAssignment]
  }
  @scala.inline
  implicit class SchemaCreativeAssignmentOps[Self <: SchemaCreativeAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
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
    def withApplyEventTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyEventTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyEventTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyEventTags")(js.undefined)
        ret
    }
    @scala.inline
    def withClickThroughUrl(value: SchemaClickThroughUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanionCreativeOverrides(value: js.Array[SchemaCompanionClickThroughOverride]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionCreativeOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanionCreativeOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionCreativeOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeGroupAssignments(value: js.Array[SchemaCreativeGroupAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeGroupAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeGroupAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeGroupAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRichMediaExitOverrides(value: js.Array[SchemaRichMediaExitOverride]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richMediaExitOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRichMediaExitOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richMediaExitOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withSequence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withSslCompliant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCompliant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCompliant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCompliant")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

