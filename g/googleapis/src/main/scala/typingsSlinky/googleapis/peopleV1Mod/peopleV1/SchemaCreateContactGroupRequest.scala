package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to create a new contact group.
  */
@js.native
trait SchemaCreateContactGroupRequest extends StObject {
  
  /**
    * The contact group to create.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.native
}
object SchemaCreateContactGroupRequest {
  
  @scala.inline
  def apply(): SchemaCreateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContactGroupRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateContactGroupRequestMutableBuilder[Self <: SchemaCreateContactGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactGroup(value: SchemaContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
  }
}
