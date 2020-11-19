package typingsSlinky.materialFloatingLabel

import org.scalajs.dom.raw.Element
import typingsSlinky.materialFloatingLabel.adapterMod.MDCFloatingLabelAdapter
import typingsSlinky.materialFloatingLabel.anon.LABELFLOATABOVE
import typingsSlinky.materialFloatingLabel.anon.PartialMDCFloatingLabelAd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/floating-label", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCFloatingLabel ()
    extends typingsSlinky.materialFloatingLabel.componentMod.MDCFloatingLabel
  /* static members */
  @js.native
  object MDCFloatingLabel extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialFloatingLabel.componentMod.MDCFloatingLabel = js.native
  }
  
  @js.native
  class MDCFloatingLabelFoundation ()
    extends typingsSlinky.materialFloatingLabel.foundationMod.MDCFloatingLabelFoundation {
    def this(adapter: PartialMDCFloatingLabelAd) = this()
  }
  /* static members */
  @js.native
  object MDCFloatingLabelFoundation extends js.Object {
    
    def cssClasses: LABELFLOATABOVE = js.native
    
    /**
      * See {@link MDCFloatingLabelAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCFloatingLabelAdapter = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var LABEL_FLOAT_ABOVE: String = js.native
    
    var LABEL_REQUIRED: String = js.native
    
    var LABEL_SHAKE: String = js.native
    
    var ROOT: String = js.native
  }
}
