package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Autofill", JSImport.Namespace)
@js.native
object libAutofillMod extends js.Object {
  
  @js.native
  class Autofill protected ()
    extends typingsSlinky.officeUiFabricReact.autofillMod.Autofill {
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
