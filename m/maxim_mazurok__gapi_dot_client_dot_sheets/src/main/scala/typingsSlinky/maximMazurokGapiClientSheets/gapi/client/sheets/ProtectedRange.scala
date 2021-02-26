package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectedRange extends StObject {
  
  /** The description of this protected range. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The users and groups with edit access to the protected range. This field is only visible to users with edit access to the protected range and the document. Editors are not supported
    * with warning_only protection.
    */
  var editors: js.UndefOr[Editors] = js.native
  
  /** The named range this protected range is backed by, if any. When writing, only one of range or named_range_id may be set. */
  var namedRangeId: js.UndefOr[String] = js.native
  
  /** The ID of the protected range. This field is read-only. */
  var protectedRangeId: js.UndefOr[Double] = js.native
  
  /**
    * The range that is being protected. The range may be fully unbounded, in which case this is considered a protected sheet. When writing, only one of range or named_range_id may be
    * set.
    */
  var range: js.UndefOr[GridRange] = js.native
  
  /** True if the user who requested this protected range can edit the protected area. This field is read-only. */
  var requestingUserCanEdit: js.UndefOr[Boolean] = js.native
  
  /** The list of unprotected ranges within a protected sheet. Unprotected ranges are only supported on protected sheets. */
  var unprotectedRanges: js.UndefOr[js.Array[GridRange]] = js.native
  
  /**
    * True if this protected range will show a warning when editing. Warning-based protection means that every user can edit data in the protected range, except editing will prompt a
    * warning asking the user to confirm the edit. When writing: if this field is true, then editors is ignored. Additionally, if this field is changed from true to false and the
    * `editors` field is not set (nor included in the field mask), then the editors will be set to all the editors in the document.
    */
  var warningOnly: js.UndefOr[Boolean] = js.native
}
object ProtectedRange {
  
  @scala.inline
  def apply(): ProtectedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectedRange]
  }
  
  @scala.inline
  implicit class ProtectedRangeMutableBuilder[Self <: ProtectedRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEditors(value: Editors): Self = StObject.set(x, "editors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorsUndefined: Self = StObject.set(x, "editors", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    @scala.inline
    def setProtectedRangeId(value: Double): Self = StObject.set(x, "protectedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangeIdUndefined: Self = StObject.set(x, "protectedRangeId", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRequestingUserCanEdit(value: Boolean): Self = StObject.set(x, "requestingUserCanEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestingUserCanEditUndefined: Self = StObject.set(x, "requestingUserCanEdit", js.undefined)
    
    @scala.inline
    def setUnprotectedRanges(value: js.Array[GridRange]): Self = StObject.set(x, "unprotectedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprotectedRangesUndefined: Self = StObject.set(x, "unprotectedRanges", js.undefined)
    
    @scala.inline
    def setUnprotectedRangesVarargs(value: GridRange*): Self = StObject.set(x, "unprotectedRanges", js.Array(value :_*))
    
    @scala.inline
    def setWarningOnly(value: Boolean): Self = StObject.set(x, "warningOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningOnlyUndefined: Self = StObject.set(x, "warningOnly", js.undefined)
  }
}
