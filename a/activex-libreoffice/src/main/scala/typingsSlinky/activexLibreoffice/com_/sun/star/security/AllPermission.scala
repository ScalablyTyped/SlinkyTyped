package typingsSlinky.activexLibreoffice.com_.sun.star.security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link AllPermission} is a permission that implies all other permissions.
  * @since OOo 1.1.2
  */
@js.native
trait AllPermission extends StObject {
  
  var dummy: Double = js.native
}
object AllPermission {
  
  @scala.inline
  def apply(dummy: Double): AllPermission = {
    val __obj = js.Dynamic.literal(dummy = dummy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllPermission]
  }
  
  @scala.inline
  implicit class AllPermissionMutableBuilder[Self <: AllPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDummy(value: Double): Self = StObject.set(x, "dummy", value.asInstanceOf[js.Any])
  }
}
