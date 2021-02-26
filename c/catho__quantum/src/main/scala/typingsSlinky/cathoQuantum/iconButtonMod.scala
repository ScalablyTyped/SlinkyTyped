package typingsSlinky.cathoQuantum

import slinky.core.ReactComponentClass
import typingsSlinky.cathoQuantum.anon.Spacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.error
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.success
import typingsSlinky.cathoQuantum.cathoQuantumStrings.warning
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonMod {
  
  type IconButton = ReactComponentClass[IconButtonProps]
  
  @js.native
  trait IconButtonProps extends StObject {
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
    
    var skin: js.UndefOr[neutral | primary | secondary | success | warning | error] = js.native
    
    var theme: js.UndefOr[Spacing] = js.native
  }
  object IconButtonProps {
    
    @scala.inline
    def apply(): IconButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconButtonProps]
    }
    
    @scala.inline
    implicit class IconButtonPropsMutableBuilder[Self <: IconButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSkin(value: neutral | primary | secondary | success | warning | error): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setTheme(value: Spacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
