package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTextFieldTextFieldDotTypesMod.ITextFieldProps
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings._underscore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/TextField", JSImport.Namespace)
@js.native
object libTextFieldMod extends js.Object {
  @js.native
  class MaskedTextField protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTextFieldMod.MaskedTextField {
    def this(props: ITextFieldProps) = this()
  }
  
  @js.native
  class TextFieldBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsTextFieldMod.TextFieldBase {
    def this(props: ITextFieldProps) = this()
  }
  
  val DEFAULT_MASK_CHAR: _underscore = js.native
  val TextField: ReactComponentClass[ITextFieldProps] = js.native
  /* static members */
  @js.native
  object MaskedTextField extends js.Object {
    var defaultProps: ITextFieldProps = js.native
  }
  
  /* static members */
  @js.native
  object TextFieldBase extends js.Object {
    var defaultProps: ITextFieldProps = js.native
  }
  
}

