package typingsSlinky.cathoQuantum

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.anon.Colors
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("@catho/quantum/Alert", JSImport.Default)
  @js.native
  class default ()
    extends Component[AlertProps, js.Object, js.Any]
  
  type Alert = ReactComponentClass[AlertProps]
  
  @js.native
  trait AlertProps extends StObject {
    
    var children: ReactElement = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var onClose: MouseEventHandler[HTMLButtonElement] = js.native
    
    var skin: js.UndefOr[primary | success | error | neutral | warning] = js.native
    
    var theme: js.UndefOr[Colors] = js.native
  }
  object AlertProps {
    
    @scala.inline
    def apply(onClose: SyntheticMouseEvent[HTMLButtonElement] => Unit): AlertProps = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose))
      __obj.asInstanceOf[AlertProps]
    }
    
    @scala.inline
    implicit class AlertPropsMutableBuilder[Self <: AlertProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkin(value: primary | success | error | neutral | warning): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setTheme(value: Colors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
