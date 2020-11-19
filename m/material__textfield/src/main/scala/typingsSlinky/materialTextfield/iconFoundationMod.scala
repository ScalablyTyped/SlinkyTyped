package typingsSlinky.materialTextfield

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialTextfield.anon.ICONEVENT
import typingsSlinky.materialTextfield.anon.PartialMDCTextFieldIconAd
import typingsSlinky.materialTextfield.anon.ROOT
import typingsSlinky.materialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/textfield/icon/foundation", JSImport.Namespace)
@js.native
object iconFoundationMod extends js.Object {
  
  @js.native
  class MDCTextFieldIconFoundation () extends MDCFoundation[MDCTextFieldIconAdapter] {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
    
    def handleInteraction(evt: KeyboardEvent): Unit = js.native
    def handleInteraction(evt: MouseEvent): Unit = js.native
    
    def setAriaLabel(label: String): Unit = js.native
    
    def setContent(content: String): Unit = js.native
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTextFieldIconFoundation extends js.Object {
    
    def cssClasses: ROOT = js.native
    
    /**
      * See {@link MDCTextFieldIconAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTextFieldIconAdapter = js.native
    
    def strings: ICONEVENT = js.native
  }
  
  @js.native
  class default () extends MDCTextFieldIconFoundation {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: ROOT = js.native
    
    /**
      * See {@link MDCTextFieldIconAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTextFieldIconAdapter = js.native
    
    def strings: ICONEVENT = js.native
  }
}
