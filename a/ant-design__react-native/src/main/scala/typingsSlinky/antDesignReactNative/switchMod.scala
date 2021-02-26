package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.switchPropsTypeMod.SwitchPropsType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod {
  
  @JSImport("@ant-design/react-native/lib/switch", JSImport.Default)
  @js.native
  def default(props: AntmSwitchProps): ReactElement = js.native
  
  @js.native
  trait AntmSwitchProps extends SwitchPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object AntmSwitchProps {
    
    @scala.inline
    def apply(): AntmSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntmSwitchProps]
    }
    
    @scala.inline
    implicit class AntmSwitchPropsMutableBuilder[Self <: AntmSwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
