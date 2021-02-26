package typingsSlinky.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The entity that owns an Organization. The lifetime of the Organization and
  * all of its descendants are bound to the `OrganizationOwner`. If the
  * `OrganizationOwner` is deleted, the Organization and all its descendants
  * will be deleted.
  */
@js.native
trait SchemaOrganizationOwner extends StObject {
  
  /**
    * The G Suite customer id used in the Directory API.
    */
  var directoryCustomerId: js.UndefOr[String] = js.native
}
object SchemaOrganizationOwner {
  
  @scala.inline
  def apply(): SchemaOrganizationOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganizationOwner]
  }
  
  @scala.inline
  implicit class SchemaOrganizationOwnerMutableBuilder[Self <: SchemaOrganizationOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryCustomerId(value: String): Self = StObject.set(x, "directoryCustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryCustomerIdUndefined: Self = StObject.set(x, "directoryCustomerId", js.undefined)
  }
}
