package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyStatus extends StObject {
  
  /**
    * 
    */
  var IsPublic: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.IsPublic] = js.native
}
object PolicyStatus {
  
  @scala.inline
  def apply(): PolicyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyStatus]
  }
  
  @scala.inline
  implicit class PolicyStatusMutableBuilder[Self <: PolicyStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPublic(value: IsPublic): Self = StObject.set(x, "IsPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublicUndefined: Self = StObject.set(x, "IsPublic", js.undefined)
  }
}
