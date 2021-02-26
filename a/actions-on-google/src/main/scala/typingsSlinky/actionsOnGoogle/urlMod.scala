package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsOpenUrlAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/url", "OpenUrlAction")
  @js.native
  class OpenUrlAction protected () extends GoogleActionsV2UiElementsOpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @js.native
  trait OpenUrlActionOptions extends StObject {
    
    /** @public */
    var url: String = js.native
  }
  object OpenUrlActionOptions {
    
    @scala.inline
    def apply(url: String): OpenUrlActionOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenUrlActionOptions]
    }
    
    @scala.inline
    implicit class OpenUrlActionOptionsMutableBuilder[Self <: OpenUrlActionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
