package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsSuggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/suggestion", JSImport.Namespace)
@js.native
object suggestionMod extends js.Object {
  
  @js.native
  class Suggestions protected () extends js.Object {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
    
    /** @public */
    def add(suggestions: String*): this.type = js.native
    
    /** @public */
    var suggestions: js.Array[GoogleActionsV2UiElementsSuggestion] = js.native
  }
}
