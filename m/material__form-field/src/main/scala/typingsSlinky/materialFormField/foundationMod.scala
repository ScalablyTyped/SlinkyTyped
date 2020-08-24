package typingsSlinky.materialFormField

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialFormField.adapterMod.MDCFormFieldAdapter
import typingsSlinky.materialFormField.anon.LABELSELECTOR
import typingsSlinky.materialFormField.anon.PartialMDCFormFieldAdapte
import typingsSlinky.materialFormField.anon.ROOT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCFormFieldFoundation () extends MDCFoundation[MDCFormFieldAdapter] {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  
  @js.native
  class default () extends MDCFormFieldFoundation {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    def cssClasses: ROOT = js.native
    def defaultAdapter: MDCFormFieldAdapter = js.native
    def strings: LABELSELECTOR = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: ROOT = js.native
    def defaultAdapter: MDCFormFieldAdapter = js.native
    def strings: LABELSELECTOR = js.native
  }
  
}

