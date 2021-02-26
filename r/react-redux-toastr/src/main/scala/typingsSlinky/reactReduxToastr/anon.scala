package typingsSlinky.reactReduxToastr

import typingsSlinky.reactReduxToastr.mod.ConfirmToastrCustomOptions
import typingsSlinky.reactReduxToastr.mod.ConfirmToastrOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CancelText extends StObject {
    
    var cancelText: String = js.native
    
    var okText: String = js.native
  }
  object CancelText {
    
    @scala.inline
    def apply(cancelText: String, okText: String): CancelText = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelText]
    }
    
    @scala.inline
    implicit class CancelTextMutableBuilder[Self <: CancelText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var message: String = js.native
    
    var options: ConfirmToastrOptions | ConfirmToastrCustomOptions = js.native
    
    var show: Boolean = js.native
  }
  object Id {
    
    @scala.inline
    def apply(
      id: String,
      message: String,
      options: ConfirmToastrOptions | ConfirmToastrCustomOptions,
      show: Boolean
    ): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: ConfirmToastrOptions | ConfirmToastrCustomOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
}
