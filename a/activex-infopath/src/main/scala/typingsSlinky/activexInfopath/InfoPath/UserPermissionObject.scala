package typingsSlinky.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPermissionObject extends StObject {
  
  var ExpirationDate: js.Any = js.native
  
  @JSName("InfoPath.UserPermissionObject_typekey")
  var InfoPathDotUserPermissionObject_typekey: UserPermissionObject = js.native
  
  val Parent: js.Any = js.native
  
  var Permission: Double = js.native
  
  def Remove(): Unit = js.native
  
  val UserId: String = js.native
}
object UserPermissionObject {
  
  @scala.inline
  def apply(
    ExpirationDate: js.Any,
    InfoPathDotUserPermissionObject_typekey: UserPermissionObject,
    Parent: js.Any,
    Permission: Double,
    Remove: () => Unit,
    UserId: String
  ): UserPermissionObject = {
    val __obj = js.Dynamic.literal(ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), UserId = UserId.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.UserPermissionObject_typekey")(InfoPathDotUserPermissionObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPermissionObject]
  }
  
  @scala.inline
  implicit class UserPermissionObjectMutableBuilder[Self <: UserPermissionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationDate(value: js.Any): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotUserPermissionObject_typekey(value: UserPermissionObject): Self = StObject.set(x, "InfoPath.UserPermissionObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: Double): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
