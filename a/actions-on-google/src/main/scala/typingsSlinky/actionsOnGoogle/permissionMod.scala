package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.permissionPermissionMod.PermissionOptions
import typingsSlinky.actionsOnGoogle.updateMod.UpdatePermissionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/permission", "Permission")
  @js.native
  class Permission protected ()
    extends typingsSlinky.actionsOnGoogle.permissionPermissionMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/permission", "UpdatePermission")
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
