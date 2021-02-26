package typingsSlinky.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grantee extends StObject {
  
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[String] = js.native
  
  /**
    * Email address of the grantee.
    */
  var EmailAddress: js.UndefOr[String] = js.native
  
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[String] = js.native
  
  /**
    * Type of grantee
    */
  var Type: typingsSlinky.awsSdk.glacierMod.Type = js.native
  
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[String] = js.native
}
object Grantee {
  
  @scala.inline
  def apply(Type: Type): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
  
  @scala.inline
  implicit class GranteeMutableBuilder[Self <: Grantee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
  }
}
