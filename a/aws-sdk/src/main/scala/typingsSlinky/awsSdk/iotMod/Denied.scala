package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Denied extends StObject {
  
  /**
    * Information that explicitly denies the authorization. 
    */
  var explicitDeny: js.UndefOr[ExplicitDeny] = js.native
  
  /**
    * Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an action on a resource it is considered an implicit deny.
    */
  var implicitDeny: js.UndefOr[ImplicitDeny] = js.native
}
object Denied {
  
  @scala.inline
  def apply(): Denied = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Denied]
  }
  
  @scala.inline
  implicit class DeniedMutableBuilder[Self <: Denied] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitDeny(value: ExplicitDeny): Self = StObject.set(x, "explicitDeny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitDenyUndefined: Self = StObject.set(x, "explicitDeny", js.undefined)
    
    @scala.inline
    def setImplicitDeny(value: ImplicitDeny): Self = StObject.set(x, "implicitDeny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitDenyUndefined: Self = StObject.set(x, "implicitDeny", js.undefined)
  }
}
