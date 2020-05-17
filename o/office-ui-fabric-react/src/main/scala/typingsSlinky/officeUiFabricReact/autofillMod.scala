package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Autofill", JSImport.Namespace)
@js.native
object autofillMod extends js.Object {
  @js.native
  class Autofill protected ()
    extends typingsSlinky.officeUiFabricReact.autofillAutofillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  
  @js.native
  class BaseAutoFill ()
    extends typingsSlinky.officeUiFabricReact.autofillAutofillMod.Autofill
  
  /* static members */
  @js.native
  object Autofill extends js.Object {
    var defaultProps: EnableAutofillOnKeyPress = js.native
  }
  
}

