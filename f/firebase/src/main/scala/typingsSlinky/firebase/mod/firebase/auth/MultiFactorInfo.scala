package typingsSlinky.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure containing the information of a second factor entity.
  */
@js.native
trait MultiFactorInfo extends StObject {
  
  /**
    * The user friendly name of the current second factor.
    */
  var displayName: js.UndefOr[String | Null] = js.native
  
  /**
    * The enrollment date of the second factor formatted as a UTC string.
    */
  var enrollmentTime: String = js.native
  
  /**
    * The identifier of the second factor.
    */
  var factorId: String = js.native
  
  /**
    * The multi-factor enrollment ID.
    */
  var uid: String = js.native
}
object MultiFactorInfo {
  
  @scala.inline
  def apply(enrollmentTime: String, factorId: String, uid: String): MultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = factorId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorInfo]
  }
  
  @scala.inline
  implicit class MultiFactorInfoMutableBuilder[Self <: MultiFactorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnrollmentTime(value: String): Self = StObject.set(x, "enrollmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorId(value: String): Self = StObject.set(x, "factorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
