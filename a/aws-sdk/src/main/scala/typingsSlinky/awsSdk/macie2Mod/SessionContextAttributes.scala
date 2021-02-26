package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionContextAttributes extends StObject {
  
  /**
    * The date and time, in UTC and ISO 8601 format, when the credentials were issued.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
    */
  var mfaAuthenticated: js.UndefOr[boolean] = js.native
}
object SessionContextAttributes {
  
  @scala.inline
  def apply(): SessionContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionContextAttributes]
  }
  
  @scala.inline
  implicit class SessionContextAttributesMutableBuilder[Self <: SessionContextAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setMfaAuthenticated(value: boolean): Self = StObject.set(x, "mfaAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfaAuthenticatedUndefined: Self = StObject.set(x, "mfaAuthenticated", js.undefined)
  }
}
