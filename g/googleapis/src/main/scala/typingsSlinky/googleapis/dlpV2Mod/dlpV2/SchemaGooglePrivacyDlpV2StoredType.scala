package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a StoredInfoType to use with scanning.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StoredType extends StObject {
  
  /**
    * Timestamp indicating when the version of the `StoredInfoType` used for
    * inspection was created. Output-only field, populated by the system.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Resource name of the requested `StoredInfoType`, for example
    * `organizations/433245324/storedInfoTypes/432452342` or
    * `projects/project-id/storedInfoTypes/432452342`.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2StoredType {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2StoredType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredType]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StoredTypeMutableBuilder[Self <: SchemaGooglePrivacyDlpV2StoredType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
