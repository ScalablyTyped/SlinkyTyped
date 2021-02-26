package typingsSlinky.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AriaRoles extends StObject {
  
  var allowedAttrs: js.UndefOr[js.Array[String]] = js.native
  
  var nameFromContent: js.UndefOr[Boolean] = js.native
  
  var requiredAttrs: js.UndefOr[js.Array[String]] = js.native
  
  var requiredContext: js.UndefOr[js.Array[String]] = js.native
  
  var requiredOwned: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: AriaRolesType | DpubRolesType = js.native
  
  var unsupported: js.UndefOr[Boolean] = js.native
}
object AriaRoles {
  
  @scala.inline
  def apply(`type`: AriaRolesType | DpubRolesType): AriaRoles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaRoles]
  }
  
  @scala.inline
  implicit class AriaRolesMutableBuilder[Self <: AriaRoles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedAttrs(value: js.Array[String]): Self = StObject.set(x, "allowedAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedAttrsUndefined: Self = StObject.set(x, "allowedAttrs", js.undefined)
    
    @scala.inline
    def setAllowedAttrsVarargs(value: String*): Self = StObject.set(x, "allowedAttrs", js.Array(value :_*))
    
    @scala.inline
    def setNameFromContent(value: Boolean): Self = StObject.set(x, "nameFromContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFromContentUndefined: Self = StObject.set(x, "nameFromContent", js.undefined)
    
    @scala.inline
    def setRequiredAttrs(value: js.Array[String]): Self = StObject.set(x, "requiredAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredAttrsUndefined: Self = StObject.set(x, "requiredAttrs", js.undefined)
    
    @scala.inline
    def setRequiredAttrsVarargs(value: String*): Self = StObject.set(x, "requiredAttrs", js.Array(value :_*))
    
    @scala.inline
    def setRequiredContext(value: js.Array[String]): Self = StObject.set(x, "requiredContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredContextUndefined: Self = StObject.set(x, "requiredContext", js.undefined)
    
    @scala.inline
    def setRequiredContextVarargs(value: String*): Self = StObject.set(x, "requiredContext", js.Array(value :_*))
    
    @scala.inline
    def setRequiredOwned(value: js.Array[String]): Self = StObject.set(x, "requiredOwned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredOwnedUndefined: Self = StObject.set(x, "requiredOwned", js.undefined)
    
    @scala.inline
    def setRequiredOwnedVarargs(value: String*): Self = StObject.set(x, "requiredOwned", js.Array(value :_*))
    
    @scala.inline
    def setType(value: AriaRolesType | DpubRolesType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsupported(value: Boolean): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsupportedUndefined: Self = StObject.set(x, "unsupported", js.undefined)
  }
}
