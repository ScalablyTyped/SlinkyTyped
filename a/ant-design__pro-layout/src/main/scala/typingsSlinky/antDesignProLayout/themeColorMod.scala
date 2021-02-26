package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.antDesignProLayout.anon.Color
import typingsSlinky.antDesignProLayout.anon.DefaultMessage
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeColorMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/ThemeColor", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ThemeColorProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait TagProps extends StObject {
    
    var check: Boolean = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: String = js.native
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object TagProps {
    
    @scala.inline
    def apply(check: Boolean, color: String): TagProps = {
      val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagProps]
    }
    
    @scala.inline
    implicit class TagPropsMutableBuilder[Self <: TagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  @js.native
  trait ThemeColorProps extends StObject {
    
    var colors: js.UndefOr[js.Array[Color]] = js.native
    
    def formatMessage(data: DefaultMessage): String = js.native
    
    def onChange(color: String): Unit = js.native
    
    var value: String = js.native
  }
  object ThemeColorProps {
    
    @scala.inline
    def apply(formatMessage: DefaultMessage => String, onChange: String => Unit, value: String): ThemeColorProps = {
      val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeColorProps]
    }
    
    @scala.inline
    implicit class ThemeColorPropsMutableBuilder[Self <: ThemeColorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setFormatMessage(value: DefaultMessage => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[ThemeColorProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `themeColorMod.foo` */
  override def _to: ForwardRefExoticComponent[ThemeColorProps with RefAttributes[HTMLDivElement]] = default
}
