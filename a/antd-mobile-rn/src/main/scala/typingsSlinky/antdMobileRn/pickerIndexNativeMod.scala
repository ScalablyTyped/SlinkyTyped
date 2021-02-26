package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.AntLocale
import typingsSlinky.antdMobileRn.anon.Cascade
import typingsSlinky.antdMobileRn.pickerPropsTypeMod.PickerData
import typingsSlinky.antdMobileRn.pickerPropsTypeMod.PickerPropsType
import typingsSlinky.antdMobileRn.pickerStyleIndexNativeMod.IPickerStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/picker/index.native", JSImport.Default)
  @js.native
  class default () extends Picker
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/picker/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/picker/index.native", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/picker/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Cascade = js.native
    @scala.inline
    def defaultProps_=(x: Cascade): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Picker
    extends typingsSlinky.antdMobileRn.abstractPickerMod.default
  
  @js.native
  trait PickerNativeProps extends PickerPropsType {
    
    @JSName("styles")
    var styles_PickerNativeProps: js.UndefOr[IPickerStyle] = js.native
  }
  object PickerNativeProps {
    
    @scala.inline
    def apply(data: js.Array[js.Array[PickerData] | PickerData]): PickerNativeProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerNativeProps]
    }
    
    @scala.inline
    implicit class PickerNativePropsMutableBuilder[Self <: PickerNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: IPickerStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
