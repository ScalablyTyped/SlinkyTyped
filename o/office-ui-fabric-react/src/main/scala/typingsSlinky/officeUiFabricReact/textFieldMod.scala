package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.IMaskedTextFieldProps
import typingsSlinky.officeUiFabricReact.textFieldTypesMod.ITextFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TextField", "DEFAULT_MASK_CHAR")
  @js.native
  val DEFAULT_MASK_CHAR: /* "_" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField", "MaskedTextField")
  @js.native
  class MaskedTextField protected ()
    extends typingsSlinky.officeUiFabricReact.maskedTextFieldMod.MaskedTextField {
    def this(props: IMaskedTextFieldProps) = this()
  }
  /* static members */
  object MaskedTextField {
    
    @JSImport("office-ui-fabric-react/lib/components/TextField", "MaskedTextField")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/TextField", "MaskedTextField.defaultProps")
    @js.native
    def defaultProps: IMaskedTextFieldProps = js.native
    @scala.inline
    def defaultProps_=(x: IMaskedTextFieldProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/TextField", "TextField")
  @js.native
  val TextField: ReactComponentClass[ITextFieldProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TextField", "TextFieldBase")
  @js.native
  class TextFieldBase protected ()
    extends typingsSlinky.officeUiFabricReact.textFieldBaseMod.TextFieldBase {
    def this(props: ITextFieldProps) = this()
  }
  /* static members */
  object TextFieldBase {
    
    @JSImport("office-ui-fabric-react/lib/components/TextField", "TextFieldBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/TextField", "TextFieldBase.defaultProps")
    @js.native
    def defaultProps: ITextFieldProps = js.native
    @scala.inline
    def defaultProps_=(x: ITextFieldProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
