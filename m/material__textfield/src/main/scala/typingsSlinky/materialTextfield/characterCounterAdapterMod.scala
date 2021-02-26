package typingsSlinky.materialTextfield

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object characterCounterAdapterMod {
  
  @js.native
  trait MDCTextFieldCharacterCounterAdapter extends StObject {
    
    /**
      * Sets the text content of character counter element.
      */
    def setContent(content: String): Unit = js.native
  }
  object MDCTextFieldCharacterCounterAdapter {
    
    @scala.inline
    def apply(setContent: String => Unit): MDCTextFieldCharacterCounterAdapter = {
      val __obj = js.Dynamic.literal(setContent = js.Any.fromFunction1(setContent))
      __obj.asInstanceOf[MDCTextFieldCharacterCounterAdapter]
    }
    
    @scala.inline
    implicit class MDCTextFieldCharacterCounterAdapterMutableBuilder[Self <: MDCTextFieldCharacterCounterAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetContent(value: String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    }
  }
}
