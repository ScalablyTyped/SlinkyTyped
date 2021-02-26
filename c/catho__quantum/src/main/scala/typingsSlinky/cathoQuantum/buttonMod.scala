package typingsSlinky.cathoQuantum

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.anon.Breakpoints
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.reset
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.submit
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.cathoQuantum.iconButtonMod.IconButton
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("@catho/quantum/Button", JSImport.Default)
  @js.native
  class default ()
    extends Component[ButtonProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Button", "default.Icon")
    @js.native
    def Icon: IconButton = js.native
    @scala.inline
    def Icon_=(x: IconButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
  }
  
  type Button = ReactComponentClass[ButtonProps]
  
  @js.native
  trait ButtonProps extends StObject {
    
    @JSName("$as")
    var $as: js.UndefOr[ReactElement | String] = js.native
    
    var center: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var full: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
    
    var skin: js.UndefOr[neutral | primary | secondary | success | warning | error] = js.native
    
    var stroked: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[Breakpoints] = js.native
    
    var `type`: js.UndefOr[button | reset | submit] = js.native
  }
  object ButtonProps {
    
    @scala.inline
    def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$as(value: ReactElement | String): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$asReactElement(value: ReactElement): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSkin(value: neutral | primary | secondary | success | warning | error): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setStroked(value: Boolean): Self = StObject.set(x, "stroked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokedUndefined: Self = StObject.set(x, "stroked", js.undefined)
      
      @scala.inline
      def setTheme(value: Breakpoints): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: button | reset | submit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
