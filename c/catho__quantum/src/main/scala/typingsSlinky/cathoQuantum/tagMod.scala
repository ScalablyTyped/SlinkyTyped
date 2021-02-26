package typingsSlinky.cathoQuantum

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.anon.ColorsComponentsSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("@catho/quantum/Tag", JSImport.Default)
  @js.native
  class default ()
    extends Component[TagProps, js.Object, js.Any]
  
  type Tag = ReactComponentClass[TagProps]
  
  @js.native
  trait TagProps extends StObject {
    
    var bold: js.UndefOr[Boolean] = js.native
    
    var inverted: js.UndefOr[Boolean] = js.native
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var size: js.UndefOr[small | medium | large] = js.native
    
    var skin: js.UndefOr[neutral | primary | success | warning | error] = js.native
    
    var stroked: js.UndefOr[Boolean] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var theme: js.UndefOr[ColorsComponentsSpacing] = js.native
  }
  object TagProps {
    
    @scala.inline
    def apply(): TagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagProps]
    }
    
    @scala.inline
    implicit class TagPropsMutableBuilder[Self <: TagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setOnClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSkin(value: neutral | primary | success | warning | error): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setStroked(value: Boolean): Self = StObject.set(x, "stroked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokedUndefined: Self = StObject.set(x, "stroked", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTheme(value: ColorsComponentsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
