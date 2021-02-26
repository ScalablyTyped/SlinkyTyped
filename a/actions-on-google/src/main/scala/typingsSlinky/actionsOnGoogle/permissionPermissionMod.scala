package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPERMISSION
import typingsSlinky.actionsOnGoogle.helperHelperMod.SoloHelper
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2PermissionValueSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2PermissionValueSpecPermissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionPermissionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/permission/permission", "Permission")
  @js.native
  class Permission protected () extends SoloHelper[actionsDotintentDotPERMISSION, GoogleActionsV2PermissionValueSpec] {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  type PermissionArgument = Boolean
  
  @js.native
  trait PermissionOptions extends StObject {
    
    /**
      * Context why the permission is being asked.
      * It's the TTS prompt prefix (action phrase) we ask the user.
      * @public
      */
    var context: js.UndefOr[String] = js.native
    
    /**
      * Extra properties to be spread into the value.
      * For advanced usages like used in {@link UpdatePermission}
      * @public
      */
    var extra: js.UndefOr[GoogleActionsV2PermissionValueSpec] = js.native
    
    /**
      * Array or string of permissions App supports,
      * each of which comes from {@link GoogleActionsV2PermissionValueSpecPermissions}.
      * @public
      */
    var permissions: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions] = js.native
  }
  object PermissionOptions {
    
    @scala.inline
    def apply(
      permissions: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions]
    ): PermissionOptions = {
      val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionOptions]
    }
    
    @scala.inline
    implicit class PermissionOptionsMutableBuilder[Self <: PermissionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setExtra(value: GoogleActionsV2PermissionValueSpec): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setPermissions(
        value: GoogleActionsV2PermissionValueSpecPermissions | js.Array[GoogleActionsV2PermissionValueSpecPermissions]
      ): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsVarargs(value: GoogleActionsV2PermissionValueSpecPermissions*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    }
  }
}
