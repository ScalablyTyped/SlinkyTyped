package typingsSlinky.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Site Directory contact.
  */
@js.native
trait SchemaDirectorySiteContact extends StObject {
  
  /**
    * Address of this directory site contact.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * Email address of this directory site contact.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * First name of this directory site contact.
    */
  var firstName: js.UndefOr[String] = js.native
  
  /**
    * ID of this directory site contact. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySiteContact&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Last name of this directory site contact.
    */
  var lastName: js.UndefOr[String] = js.native
  
  /**
    * Phone number of this directory site contact.
    */
  var phone: js.UndefOr[String] = js.native
  
  /**
    * Directory site contact role.
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * Title or designation of this directory site contact.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Directory site contact type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaDirectorySiteContact {
  
  @scala.inline
  def apply(): SchemaDirectorySiteContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySiteContact]
  }
  
  @scala.inline
  implicit class SchemaDirectorySiteContactMutableBuilder[Self <: SchemaDirectorySiteContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
