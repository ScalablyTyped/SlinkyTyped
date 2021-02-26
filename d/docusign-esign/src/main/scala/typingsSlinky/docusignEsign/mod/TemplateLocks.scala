package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateLocks extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Sets the time, in seconds, until the lock expires when there is no activity on the envelope.
    *
    * If no value is entered, then the default value of 300 seconds is used. The maximum value is 1,800 seconds.
    *
    * The lock duration can be extended.
    *
    */
  var lockDurationInSeconds: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier provided to the owner of the lock. You must use this token with subsequent calls to prove ownership of the lock.
    */
  var lockToken: js.UndefOr[String] = js.native
  
  /**
    * The type of lock.  Currently `edit` is the only supported type.
    */
  var lockType: js.UndefOr[String] = js.native
  
  /**
    * Specifies the friendly name of  the application that is locking the envelope.
    */
  var lockedByApp: js.UndefOr[String] = js.native
  
  /**
    * A complex type containing information about the user that has the envelope or template locked.
    */
  var lockedByUser: js.UndefOr[UserInfo] = js.native
  
  /**
    * The date and time that the lock expires.
    */
  var lockedUntilDateTime: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, a scratchpad is used to edit information.
    *
    */
  var useScratchPad: js.UndefOr[String] = js.native
}
object TemplateLocks {
  
  @scala.inline
  def apply(): TemplateLocks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateLocks]
  }
  
  @scala.inline
  implicit class TemplateLocksMutableBuilder[Self <: TemplateLocks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setLockDurationInSeconds(value: String): Self = StObject.set(x, "lockDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockDurationInSecondsUndefined: Self = StObject.set(x, "lockDurationInSeconds", js.undefined)
    
    @scala.inline
    def setLockToken(value: String): Self = StObject.set(x, "lockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockTokenUndefined: Self = StObject.set(x, "lockToken", js.undefined)
    
    @scala.inline
    def setLockType(value: String): Self = StObject.set(x, "lockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockTypeUndefined: Self = StObject.set(x, "lockType", js.undefined)
    
    @scala.inline
    def setLockedByApp(value: String): Self = StObject.set(x, "lockedByApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedByAppUndefined: Self = StObject.set(x, "lockedByApp", js.undefined)
    
    @scala.inline
    def setLockedByUser(value: UserInfo): Self = StObject.set(x, "lockedByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedByUserUndefined: Self = StObject.set(x, "lockedByUser", js.undefined)
    
    @scala.inline
    def setLockedUntilDateTime(value: String): Self = StObject.set(x, "lockedUntilDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUntilDateTimeUndefined: Self = StObject.set(x, "lockedUntilDateTime", js.undefined)
    
    @scala.inline
    def setUseScratchPad(value: String): Self = StObject.set(x, "useScratchPad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseScratchPadUndefined: Self = StObject.set(x, "useScratchPad", js.undefined)
  }
}
