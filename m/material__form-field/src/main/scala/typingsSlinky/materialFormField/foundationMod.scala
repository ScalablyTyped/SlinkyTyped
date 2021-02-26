package typingsSlinky.materialFormField

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialFormField.adapterMod.MDCFormFieldAdapter
import typingsSlinky.materialFormField.anon.PartialMDCFormFieldAdapte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/form-field/foundation", JSImport.Default)
  @js.native
  class default () extends MDCFormFieldFoundation {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  
  @JSImport("@material/form-field/foundation", "MDCFormFieldFoundation")
  @js.native
  class MDCFormFieldFoundation () extends MDCFoundation[MDCFormFieldAdapter] {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
}
