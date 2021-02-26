package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyVersion extends StObject {
  
  /**
    * The date and time the policy was created.
    */
  var createDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  
  /**
    * The policy version ID.
    */
  var versionId: js.UndefOr[PolicyVersionId] = js.native
}
object PolicyVersion {
  
  @scala.inline
  def apply(): PolicyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVersion]
  }
  
  @scala.inline
  implicit class PolicyVersionMutableBuilder[Self <: PolicyVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "createDate", js.undefined)
    
    @scala.inline
    def setIsDefaultVersion(value: IsDefaultVersion): Self = StObject.set(x, "isDefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultVersionUndefined: Self = StObject.set(x, "isDefaultVersion", js.undefined)
    
    @scala.inline
    def setVersionId(value: PolicyVersionId): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
