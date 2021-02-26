package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.permissionPermissionMod.Permission
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2Argument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/permission/update", "UpdatePermission")
  @js.native
  class UpdatePermission protected () extends Permission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
  
  @js.native
  trait UpdatePermissionOptions extends StObject {
    
    /**
      * The necessary arguments to fulfill the intent triggered on update.
      * These can be retrieved using {@link Arguments#get|conv.arguments.get}.
      * @public
      */
    var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.native
    
    /**
      * The Dialogflow/Actions SDK intent name to be triggered when the update is received.
      * @public
      */
    var intent: String = js.native
  }
  object UpdatePermissionOptions {
    
    @scala.inline
    def apply(intent: String): UpdatePermissionOptions = {
      val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatePermissionOptions]
    }
    
    @scala.inline
    implicit class UpdatePermissionOptionsMutableBuilder[Self <: UpdatePermissionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Array[GoogleActionsV2Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setArgumentsVarargs(value: GoogleActionsV2Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      @scala.inline
      def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    }
  }
  
  type UpdatePermissionUserIdArgument = String
}
