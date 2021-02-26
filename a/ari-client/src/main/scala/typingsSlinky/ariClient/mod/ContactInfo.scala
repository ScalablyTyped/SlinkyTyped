package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactInfo extends StObject {
  
  /**
    * The Address of Record this contact belongs to.
    */
  var aor: String = js.native
  
  /**
    * The current status of the contact.
    */
  var contact_status: String = js.native
  
  /**
    * Current round trip time, in microseconds, for the contact.
    */
  var roundtrip_usec: js.UndefOr[String] = js.native
  
  /**
    * The location of the contact.
    */
  var uri: String = js.native
}
object ContactInfo {
  
  @scala.inline
  def apply(aor: String, contact_status: String, uri: String): ContactInfo = {
    val __obj = js.Dynamic.literal(aor = aor.asInstanceOf[js.Any], contact_status = contact_status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactInfo]
  }
  
  @scala.inline
  implicit class ContactInfoMutableBuilder[Self <: ContactInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAor(value: String): Self = StObject.set(x, "aor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact_status(value: String): Self = StObject.set(x, "contact_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundtrip_usec(value: String): Self = StObject.set(x, "roundtrip_usec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundtrip_usecUndefined: Self = StObject.set(x, "roundtrip_usec", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
