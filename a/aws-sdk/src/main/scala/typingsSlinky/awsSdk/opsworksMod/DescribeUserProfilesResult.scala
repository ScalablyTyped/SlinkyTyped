package typingsSlinky.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserProfilesResult extends StObject {
  
  /**
    * A Users object that describes the specified users.
    */
  var UserProfiles: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.UserProfiles] = js.native
}
object DescribeUserProfilesResult {
  
  @scala.inline
  def apply(): DescribeUserProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfilesResult]
  }
  
  @scala.inline
  implicit class DescribeUserProfilesResultMutableBuilder[Self <: DescribeUserProfilesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProfiles(value: UserProfiles): Self = StObject.set(x, "UserProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfilesUndefined: Self = StObject.set(x, "UserProfiles", js.undefined)
    
    @scala.inline
    def setUserProfilesVarargs(value: UserProfile*): Self = StObject.set(x, "UserProfiles", js.Array(value :_*))
  }
}
