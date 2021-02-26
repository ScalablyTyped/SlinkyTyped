package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserData extends StObject {
  
  /**
    * The email of a user.
    */
  var Email: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Email] = js.native
  
  /**
    * The enrollment ARN of a user.
    */
  var EnrollmentId: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.EnrollmentId] = js.native
  
  /**
    * The enrollment status of a user.
    */
  var EnrollmentStatus: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.EnrollmentStatus] = js.native
  
  /**
    * The first name of a user.
    */
  var FirstName: js.UndefOr[userFirstName] = js.native
  
  /**
    * The last name of a user.
    */
  var LastName: js.UndefOr[userLastName] = js.native
  
  /**
    * The ARN of a user.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}
object UserData {
  
  @scala.inline
  def apply(): UserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserData]
  }
  
  @scala.inline
  implicit class UserDataMutableBuilder[Self <: UserData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setEnrollmentId(value: EnrollmentId): Self = StObject.set(x, "EnrollmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentIdUndefined: Self = StObject.set(x, "EnrollmentId", js.undefined)
    
    @scala.inline
    def setEnrollmentStatus(value: EnrollmentStatus): Self = StObject.set(x, "EnrollmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentStatusUndefined: Self = StObject.set(x, "EnrollmentStatus", js.undefined)
    
    @scala.inline
    def setFirstName(value: userFirstName): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    @scala.inline
    def setLastName(value: userLastName): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    @scala.inline
    def setUserArn(value: Arn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
