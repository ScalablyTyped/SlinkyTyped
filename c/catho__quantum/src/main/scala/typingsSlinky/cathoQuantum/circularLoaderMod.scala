package typingsSlinky.cathoQuantum

import slinky.core.ReactComponentClass
import typingsSlinky.cathoQuantum.anon.Gutter
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xxlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xxxlarge
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularLoaderMod {
  
  @JSImport("@catho/quantum/CircularLoader", JSImport.Default)
  @js.native
  class default ()
    extends Component[CircularLoaderProps, js.Object, js.Any]
  
  type CircularLoader = ReactComponentClass[CircularLoaderProps]
  
  @js.native
  trait CircularLoaderProps extends StObject {
    
    var size: js.UndefOr[medium | large | xlarge | xxlarge | xxxlarge] = js.native
    
    var skin: js.UndefOr[primary | secondary] = js.native
    
    var theme: js.UndefOr[Gutter] = js.native
  }
  object CircularLoaderProps {
    
    @scala.inline
    def apply(): CircularLoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircularLoaderProps]
    }
    
    @scala.inline
    implicit class CircularLoaderPropsMutableBuilder[Self <: CircularLoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: medium | large | xlarge | xxlarge | xxxlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSkin(value: primary | secondary): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setTheme(value: Gutter): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
