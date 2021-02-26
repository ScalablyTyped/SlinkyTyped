package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFieldLevelEncryptionProfileResult extends StObject {
  
  /**
    * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * Return the field-level encryption profile information.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryptionProfile] = js.native
}
object GetFieldLevelEncryptionProfileResult {
  
  @scala.inline
  def apply(): GetFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileResult]
  }
  
  @scala.inline
  implicit class GetFieldLevelEncryptionProfileResultMutableBuilder[Self <: GetFieldLevelEncryptionProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setFieldLevelEncryptionProfile(value: FieldLevelEncryptionProfile): Self = StObject.set(x, "FieldLevelEncryptionProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLevelEncryptionProfileUndefined: Self = StObject.set(x, "FieldLevelEncryptionProfile", js.undefined)
  }
}
