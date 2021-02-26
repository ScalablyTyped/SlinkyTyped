package typingsSlinky.reactPanelgroup

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactPanelgroup.reactPanelgroupStrings.column
import typingsSlinky.reactPanelgroup.reactPanelgroupStrings.dynamic
import typingsSlinky.reactPanelgroup.reactPanelgroupStrings.fixed
import typingsSlinky.reactPanelgroup.reactPanelgroupStrings.row
import typingsSlinky.reactPanelgroup.reactPanelgroupStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-panelgroup", JSImport.Default)
  @js.native
  class default ()
    extends Component[PropTypes, js.Object, js.Any]
  
  type PanelGroup = ReactComponentClass[PropTypes]
  
  @js.native
  trait PanelWidth extends StObject {
    
    var minSize: js.UndefOr[Double] = js.native
    
    var resize: js.UndefOr[fixed | dynamic | stretch] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var snap: js.UndefOr[js.Array[Double]] = js.native
  }
  object PanelWidth {
    
    @scala.inline
    def apply(): PanelWidth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelWidth]
    }
    
    @scala.inline
    implicit class PanelWidthMutableBuilder[Self <: PanelWidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setResize(value: fixed | dynamic | stretch): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSnap(value: js.Array[Double]): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      @scala.inline
      def setSnapVarargs(value: Double*): Self = StObject.set(x, "snap", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PropTypes extends StObject {
    
    var borderColor: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[row | column] = js.native
    
    var onUpdate: js.UndefOr[js.Function1[/* data */ PanelWidth, Unit]] = js.native
    
    var panelColor: js.UndefOr[String] = js.native
    
    var panelWidths: js.UndefOr[js.Array[PanelWidth | Null]] = js.native
    
    var spacing: js.UndefOr[Double] = js.native
  }
  object PropTypes {
    
    @scala.inline
    def apply(): PropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropTypes]
    }
    
    @scala.inline
    implicit class PropTypesMutableBuilder[Self <: PropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setDirection(value: row | column): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* data */ PanelWidth => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setPanelColor(value: String): Self = StObject.set(x, "panelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelColorUndefined: Self = StObject.set(x, "panelColor", js.undefined)
      
      @scala.inline
      def setPanelWidths(value: js.Array[PanelWidth | Null]): Self = StObject.set(x, "panelWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelWidthsUndefined: Self = StObject.set(x, "panelWidths", js.undefined)
      
      @scala.inline
      def setPanelWidthsVarargs(value: (PanelWidth | Null)*): Self = StObject.set(x, "panelWidths", js.Array(value :_*))
      
      @scala.inline
      def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
}
