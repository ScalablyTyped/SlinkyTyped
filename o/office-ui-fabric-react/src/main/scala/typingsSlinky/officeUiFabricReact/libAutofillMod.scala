package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Autofill", JSImport.Namespace)
@js.native
object libAutofillMod extends js.Object {
  @js.native
  class Autofill protected ()
    extends typingsSlinky.officeUiFabricReact.autofillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  
  @js.native
  class BaseAutoFill ()
    extends typingsSlinky.officeUiFabricReact.autofillAutofillMod.Autofill
  
  /* static members */
  @js.native
  object Autofill extends js.Object {
    var defaultProps: AnonEnableAutofillOnKeyPress = js.native
  }
  
}

