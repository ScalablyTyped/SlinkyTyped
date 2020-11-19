package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/pickers/AutoFill/BaseAutoFill", JSImport.Namespace)
@js.native
object baseAutoFillMod extends js.Object {
  
  @js.native
  class Autofill protected ()
    extends typingsSlinky.officeUiFabricReact.autofillAutofillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  /* static members */
  @js.native
  object Autofill extends js.Object {
    
    var defaultProps: EnableAutofillOnKeyPress = js.native
  }
  
  @js.native
  class BaseAutoFill ()
    extends typingsSlinky.officeUiFabricReact.autofillAutofillMod.Autofill
}
