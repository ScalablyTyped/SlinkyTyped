package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.richMod._RichResponseItem
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2SimpleResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/simple", "SimpleResponse")
  @js.native
  class SimpleResponse protected ()
    extends _RichResponseItem
       with GoogleActionsV2SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @js.native
  trait SimpleResponseOptions extends StObject {
    
    /**
      * Speech to be spoken to user. SSML allowed.
      * @public
      */
    var speech: String = js.native
    
    /**
      * Optional text to be shown to user
      * @public
      */
    var text: js.UndefOr[String] = js.native
  }
  object SimpleResponseOptions {
    
    @scala.inline
    def apply(speech: String): SimpleResponseOptions = {
      val __obj = js.Dynamic.literal(speech = speech.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleResponseOptions]
    }
    
    @scala.inline
    implicit class SimpleResponseOptionsMutableBuilder[Self <: SimpleResponseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpeech(value: String): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
