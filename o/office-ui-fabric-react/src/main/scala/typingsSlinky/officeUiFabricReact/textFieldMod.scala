package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.IMaskedTextFieldProps
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/TextField", JSImport.Namespace)
@js.native
object textFieldMod extends js.Object {
  
  val DEFAULT_MASK_CHAR: /* "_" */ String = js.native
  
  val TextField: ReactComponentClass[ITextFieldProps] = js.native
  
  @js.native
  class MaskedTextField protected ()
    extends typingsSlinky.officeUiFabricReact.maskedTextFieldMod.MaskedTextField {
    def this(props: IMaskedTextFieldProps) = this()
  }
  /* static members */
  @js.native
  object MaskedTextField extends js.Object {
    
    var defaultProps: IMaskedTextFieldProps = js.native
  }
  
  @js.native
  class TextFieldBase protected ()
    extends typingsSlinky.officeUiFabricReact.textFieldBaseMod.TextFieldBase {
    def this(props: ITextFieldProps) = this()
  }
  /* static members */
  @js.native
  object TextFieldBase extends js.Object {
    
    var defaultProps: ITextFieldProps = js.native
  }
}
