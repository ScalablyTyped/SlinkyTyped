package typingsSlinky.materialFormField

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialFormField.anon.PartialMDCFormFieldAdapte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/form-field", "MDCFormField")
  @js.native
  class MDCFormField protected ()
    extends typingsSlinky.materialFormField.componentMod.MDCFormField {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialFormField.foundationMod.MDCFormFieldFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCFormField {
    
    @JSImport("@material/form-field", "MDCFormField.attachTo")
    @js.native
    def attachTo(root: HTMLElement): typingsSlinky.materialFormField.componentMod.MDCFormField = js.native
  }
  
  @JSImport("@material/form-field", "MDCFormFieldFoundation")
  @js.native
  class MDCFormFieldFoundation ()
    extends typingsSlinky.materialFormField.foundationMod.MDCFormFieldFoundation {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/form-field", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/form-field", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/form-field", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/form-field", "strings.LABEL_SELECTOR")
    @js.native
    def LABEL_SELECTOR: String = js.native
    @scala.inline
    def LABEL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
