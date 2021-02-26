package typingsSlinky.cathoQuantum

import slinky.core.ReactComponentClass
import typingsSlinky.cathoQuantum.anon.`12`
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod {
  
  @JSImport("@catho/quantum/ProgressBar", JSImport.Default)
  @js.native
  class default ()
    extends Component[ProgressBarProps, js.Object, js.Any]
  
  type ProgressBar = ReactComponentClass[ProgressBarProps]
  
  @js.native
  trait ProgressBarProps extends StObject {
    
    var height: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var progressPercent: js.UndefOr[Double] = js.native
    
    var progressText: js.UndefOr[Double] = js.native
    
    var skin: js.UndefOr[neutral | primary | secondary] = js.native
    
    var theme: js.UndefOr[`12`] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object ProgressBarProps {
    
    @scala.inline
    def apply(): ProgressBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarProps]
    }
    
    @scala.inline
    implicit class ProgressBarPropsMutableBuilder[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
      
      @scala.inline
      def setProgressText(value: Double): Self = StObject.set(x, "progressText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressTextUndefined: Self = StObject.set(x, "progressText", js.undefined)
      
      @scala.inline
      def setSkin(value: neutral | primary | secondary): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setTheme(value: `12`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
