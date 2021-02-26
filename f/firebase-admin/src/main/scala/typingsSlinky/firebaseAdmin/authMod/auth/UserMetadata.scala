package typingsSlinky.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a user's metadata.
  */
@js.native
trait UserMetadata extends StObject {
  
  /**
    * The date the user was created, formatted as a UTC string.
    */
  var creationTime: String = js.native
  
  /**
    * The time at which the user was last active (ID token refreshed),
    * formatted as a UTC Date string (eg 'Sat, 03 Feb 2001 04:05:06 GMT').
    * Returns null if the user was never active.
    */
  var lastRefreshTime: js.UndefOr[String | Null] = js.native
  
  /**
    * The date the user last signed in, formatted as a UTC string.
    */
  var lastSignInTime: String = js.native
  
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}
object UserMetadata {
  
  @scala.inline
  def apply(creationTime: String, lastSignInTime: String, toJSON: () => js.Object): UserMetadata = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], lastSignInTime = lastSignInTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[UserMetadata]
  }
  
  @scala.inline
  implicit class UserMetadataMutableBuilder[Self <: UserMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRefreshTimeNull: Self = StObject.set(x, "lastRefreshTime", null)
    
    @scala.inline
    def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    @scala.inline
    def setLastSignInTime(value: String): Self = StObject.set(x, "lastSignInTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
