package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialFormField.adapterMod.MDCFormFieldAdapter
import typingsSlinky.materialFormField.anon.LABELSELECTOR
import typingsSlinky.materialFormField.anon.PartialMDCFormFieldAdapte
import typingsSlinky.materialFormField.anon.ROOT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "formField")
@js.native
object formField extends js.Object {
  
  @js.native
  class MDCFormField ()
    extends typingsSlinky.materialFormField.mod.MDCFormField
  /* static members */
  @js.native
  object MDCFormField extends js.Object {
    
    def attachTo(root: HTMLElement): typingsSlinky.materialFormField.componentMod.MDCFormField = js.native
  }
  
  @js.native
  class MDCFormFieldFoundation ()
    extends typingsSlinky.materialFormField.mod.MDCFormFieldFoundation {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    
    def cssClasses: ROOT = js.native
    
    def defaultAdapter: MDCFormFieldAdapter = js.native
    
    def strings: LABELSELECTOR = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var ROOT: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var LABEL_SELECTOR: String = js.native
  }
}
