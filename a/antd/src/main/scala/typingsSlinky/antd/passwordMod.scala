package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.antd.inputInputMod.InputProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passwordMod extends Shortcut {
  
  @JSImport("antd/lib/input/Password", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PasswordProps with RefAttributes[_]] = js.native
  
  @js.native
  trait PasswordProps extends InputProps {
    
    val action: js.UndefOr[String] = js.native
    
    var iconRender: js.UndefOr[js.Function1[/* visible */ Boolean, ReactElement]] = js.native
    
    val inputPrefixCls: js.UndefOr[String] = js.native
    
    var visibilityToggle: js.UndefOr[Boolean] = js.native
  }
  object PasswordProps {
    
    @scala.inline
    def apply(): PasswordProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasswordProps]
    }
    
    @scala.inline
    implicit class PasswordPropsMutableBuilder[Self <: PasswordProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setIconRender(value: /* visible */ Boolean => ReactElement): Self = StObject.set(x, "iconRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      @scala.inline
      def setInputPrefixCls(value: String): Self = StObject.set(x, "inputPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPrefixClsUndefined: Self = StObject.set(x, "inputPrefixCls", js.undefined)
      
      @scala.inline
      def setVisibilityToggle(value: Boolean): Self = StObject.set(x, "visibilityToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityToggleUndefined: Self = StObject.set(x, "visibilityToggle", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PasswordProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `passwordMod.foo` */
  override def _to: ForwardRefExoticComponent[PasswordProps with RefAttributes[_]] = default
}
