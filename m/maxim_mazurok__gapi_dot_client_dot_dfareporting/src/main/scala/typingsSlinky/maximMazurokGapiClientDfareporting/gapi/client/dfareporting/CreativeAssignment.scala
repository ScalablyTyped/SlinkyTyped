package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeAssignment extends js.Object {
  
  /** Whether this creative assignment is active. When true, the creative will be included in the ad's rotation. */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether applicable event tags should fire when this creative assignment is rendered. If this value is unset when the ad is inserted or updated, it will default to true for all
    * creative types EXCEPT for INTERNAL_REDIRECT, INTERSTITIAL_INTERNAL_REDIRECT, and INSTREAM_VIDEO.
    */
  var applyEventTags: js.UndefOr[Boolean] = js.native
  
  /** Click-through URL of the creative assignment. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.native
  
  /** Companion creative overrides for this creative assignment. Applicable to video ads. */
  var companionCreativeOverrides: js.UndefOr[js.Array[CompanionClickThroughOverride]] = js.native
  
  /** Creative group assignments for this creative assignment. Only one assignment per creative group number is allowed for a maximum of two assignments. */
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.native
  
  /** ID of the creative to be assigned. This is a required field. */
  var creativeId: js.UndefOr[String] = js.native
  
  /** Dimension value for the ID of the creative. This is a read-only, auto-generated field. */
  var creativeIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Rich media exit overrides for this creative assignment. Applicable when the creative type is any of the following: - DISPLAY - RICH_MEDIA_INPAGE - RICH_MEDIA_INPAGE_FLOATING -
    * RICH_MEDIA_IM_EXPAND - RICH_MEDIA_EXPANDING - RICH_MEDIA_INTERSTITIAL_FLOAT - RICH_MEDIA_MOBILE_IN_APP - RICH_MEDIA_MULTI_FLOATING - RICH_MEDIA_PEEL_DOWN - VPAID_LINEAR -
    * VPAID_NON_LINEAR
    */
  var richMediaExitOverrides: js.UndefOr[js.Array[RichMediaExitOverride]] = js.native
  
  /** Sequence number of the creative assignment, applicable when the rotation type is CREATIVE_ROTATION_TYPE_SEQUENTIAL. Acceptable values are 1 to 65535, inclusive. */
  var sequence: js.UndefOr[Double] = js.native
  
  /** Whether the creative to be assigned is SSL-compliant. This is a read-only field that is auto-generated when the ad is inserted or updated. */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  var startTime: js.UndefOr[String] = js.native
  
  /** Weight of the creative assignment, applicable when the rotation type is CREATIVE_ROTATION_TYPE_RANDOM. Value must be greater than or equal to 1. */
  var weight: js.UndefOr[Double] = js.native
}
object CreativeAssignment {
  
  @scala.inline
  def apply(): CreativeAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssignment]
  }
  
  @scala.inline
  implicit class CreativeAssignmentOps[Self <: CreativeAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setApplyEventTags(value: Boolean): Self = this.set("applyEventTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyEventTags: Self = this.set("applyEventTags", js.undefined)
    
    @scala.inline
    def setClickThroughUrl(value: ClickThroughUrl): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    
    @scala.inline
    def setCompanionCreativeOverridesVarargs(value: CompanionClickThroughOverride*): Self = this.set("companionCreativeOverrides", js.Array(value :_*))
    
    @scala.inline
    def setCompanionCreativeOverrides(value: js.Array[CompanionClickThroughOverride]): Self = this.set("companionCreativeOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanionCreativeOverrides: Self = this.set("companionCreativeOverrides", js.undefined)
    
    @scala.inline
    def setCreativeGroupAssignmentsVarargs(value: CreativeGroupAssignment*): Self = this.set("creativeGroupAssignments", js.Array(value :_*))
    
    @scala.inline
    def setCreativeGroupAssignments(value: js.Array[CreativeGroupAssignment]): Self = this.set("creativeGroupAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeGroupAssignments: Self = this.set("creativeGroupAssignments", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    
    @scala.inline
    def setCreativeIdDimensionValue(value: DimensionValue): Self = this.set("creativeIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeIdDimensionValue: Self = this.set("creativeIdDimensionValue", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setRichMediaExitOverridesVarargs(value: RichMediaExitOverride*): Self = this.set("richMediaExitOverrides", js.Array(value :_*))
    
    @scala.inline
    def setRichMediaExitOverrides(value: js.Array[RichMediaExitOverride]): Self = this.set("richMediaExitOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRichMediaExitOverrides: Self = this.set("richMediaExitOverrides", js.undefined)
    
    @scala.inline
    def setSequence(value: Double): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
