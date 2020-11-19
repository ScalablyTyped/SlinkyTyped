package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.permissionPermissionMod.PermissionOptions
import typingsSlinky.actionsOnGoogle.updateMod.UpdatePermissionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/permission", JSImport.Namespace)
@js.native
object permissionMod extends js.Object {
  
  @js.native
  class Permission protected ()
    extends typingsSlinky.actionsOnGoogle.permissionPermissionMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @js.native
  class UpdatePermission protected ()
    extends typingsSlinky.actionsOnGoogle.updateMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
}
