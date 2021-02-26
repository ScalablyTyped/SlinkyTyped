package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shared extends StObject {
  
  // The identity of the owner of the shared item. Read-only.
  var owner: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
  var scope: js.UndefOr[NullableOption[String]] = js.native
  
  // The identity of the user who shared the item. Read-only.
  var sharedBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // The UTC date and time when the item was shared. Read-only.
  var sharedDateTime: js.UndefOr[NullableOption[String]] = js.native
}
object Shared {
  
  @scala.inline
  def apply(): Shared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shared]
  }
  
  @scala.inline
  implicit class SharedMutableBuilder[Self <: Shared] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: NullableOption[IdentitySet]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setScope(value: NullableOption[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeNull: Self = StObject.set(x, "scope", null)
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSharedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "sharedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedByNull: Self = StObject.set(x, "sharedBy", null)
    
    @scala.inline
    def setSharedByUndefined: Self = StObject.set(x, "sharedBy", js.undefined)
    
    @scala.inline
    def setSharedDateTime(value: NullableOption[String]): Self = StObject.set(x, "sharedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDateTimeNull: Self = StObject.set(x, "sharedDateTime", null)
    
    @scala.inline
    def setSharedDateTimeUndefined: Self = StObject.set(x, "sharedDateTime", js.undefined)
  }
}
