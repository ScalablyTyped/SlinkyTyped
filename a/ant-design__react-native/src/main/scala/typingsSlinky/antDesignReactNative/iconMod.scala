package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.anon.Size
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.lg
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.md
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.sm
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.xs
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.xxs
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("@ant-design/react-native/lib/icon", JSImport.Default)
  @js.native
  class default () extends Icon
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/icon", "default.defaultProps")
    @js.native
    def defaultProps: Size = js.native
    @scala.inline
    def defaultProps_=(x: Size): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/icon", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Icon
    extends Component[IconProps, js.Any, js.Any]
  
  type IconNames = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OutlineGlyphMapType */ js.Any
  
  @js.native
  trait IconProps extends TextProps {
    
    var color: js.UndefOr[String] = js.native
    
    var name: IconNames = js.native
    
    var size: js.UndefOr[xxs | xs | sm | md | lg | Double] = js.native
  }
  object IconProps {
    
    @scala.inline
    def apply(name: IconNames): IconProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    @scala.inline
    implicit class IconPropsMutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setName(value: IconNames): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: xxs | xs | sm | md | lg | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
