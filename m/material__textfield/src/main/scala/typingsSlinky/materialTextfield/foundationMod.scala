package typingsSlinky.materialTextfield

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialTextfield.anon.PartialMDCTextFieldCharac
import typingsSlinky.materialTextfield.anon.ROOT
import typingsSlinky.materialTextfield.anon.ROOTSELECTOR
import typingsSlinky.materialTextfield.characterCounterAdapterMod.MDCTextFieldCharacterCounterAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/textfield/character-counter/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCTextFieldCharacterCounterFoundation () extends MDCFoundation[MDCTextFieldCharacterCounterAdapter] {
    def this(adapter: PartialMDCTextFieldCharac) = this()
    
    def setCounterValue(currentLength: Double, maxLength: Double): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTextFieldCharacterCounterFoundation extends js.Object {
    
    def cssClasses: ROOT = js.native
    
    /**
      * See {@link MDCTextFieldCharacterCounterAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTextFieldCharacterCounterAdapter = js.native
    
    def strings: ROOTSELECTOR = js.native
  }
  
  @js.native
  class default () extends MDCTextFieldCharacterCounterFoundation {
    def this(adapter: PartialMDCTextFieldCharac) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: ROOT = js.native
    
    /**
      * See {@link MDCTextFieldCharacterCounterAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTextFieldCharacterCounterAdapter = js.native
    
    def strings: ROOTSELECTOR = js.native
  }
}
