package typingsSlinky.antDesignIcons

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.antDesignIcons.componentsIconMod.IconBaseProps
import typingsSlinky.antDesignIcons.componentsTwoTonePrimaryColorMod.TwoToneColor
import typingsSlinky.antDesignIconsSvg.typesMod.IconDefinition
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsAntdIconMod extends Shortcut {
  
  @JSImport("@ant-design/icons/lib/components/AntdIcon", JSImport.Default)
  @js.native
  val default: IconBaseComponent[IconComponentProps] = js.native
  
  @js.native
  trait AntdIconProps extends IconBaseProps {
    
    var twoToneColor: js.UndefOr[TwoToneColor] = js.native
  }
  object AntdIconProps {
    
    @scala.inline
    def apply(): AntdIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntdIconProps]
    }
    
    @scala.inline
    implicit class AntdIconPropsMutableBuilder[Self <: AntdIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTwoToneColor(value: TwoToneColor): Self = StObject.set(x, "twoToneColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoToneColorUndefined: Self = StObject.set(x, "twoToneColor", js.undefined)
    }
  }
  
  @js.native
  trait IconBaseComponent[Props] extends ForwardRefExoticComponent[Props with RefAttributes[HTMLSpanElement]] {
    
    var getTwoToneColor: js.Function0[TwoToneColor] = js.native
    
    var setTwoToneColor: js.Function1[/* twoToneColor */ TwoToneColor, Unit] = js.native
  }
  
  @js.native
  trait IconComponentProps extends AntdIconProps {
    
    var icon: IconDefinition = js.native
  }
  object IconComponentProps {
    
    @scala.inline
    def apply(icon: IconDefinition): IconComponentProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconComponentProps]
    }
    
    @scala.inline
    implicit class IconComponentPropsMutableBuilder[Self <: IconComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = IconBaseComponent[IconComponentProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsAntdIconMod.foo` */
  override def _to: IconBaseComponent[IconComponentProps] = default
}
