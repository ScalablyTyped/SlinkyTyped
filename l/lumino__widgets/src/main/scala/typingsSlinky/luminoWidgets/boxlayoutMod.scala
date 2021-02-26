package typingsSlinky.luminoWidgets

import typingsSlinky.luminoWidgets.boxlayoutMod.BoxLayout.Alignment
import typingsSlinky.luminoWidgets.boxlayoutMod.BoxLayout.Direction
import typingsSlinky.luminoWidgets.boxlayoutMod.BoxLayout.IOptions
import typingsSlinky.luminoWidgets.panellayoutMod.PanelLayout
import typingsSlinky.luminoWidgets.widgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxlayoutMod {
  
  @JSImport("@lumino/widgets/types/boxlayout", "BoxLayout")
  @js.native
  /**
    * Construct a new box layout.
    *
    * @param options - The options for initializing the layout.
    */
  class BoxLayout () extends PanelLayout {
    def this(options: IOptions) = this()
    
    var _alignment: js.Any = js.native
    
    var _box: js.Any = js.native
    
    var _direction: js.Any = js.native
    
    var _dirty: js.Any = js.native
    
    /**
      * Fit the layout to the total size required by the widgets.
      */
    var _fit: js.Any = js.native
    
    var _fixed: js.Any = js.native
    
    var _items: js.Any = js.native
    
    var _sizers: js.Any = js.native
    
    var _spacing: js.Any = js.native
    
    /**
      * Update the layout position and size of the widgets.
      *
      * The parent offset dimensions should be `-1` if unknown.
      */
    var _update: js.Any = js.native
    
    /**
      * Get the content alignment for the box layout.
      *
      * #### Notes
      * This is the alignment of the widgets in the layout direction.
      *
      * The alignment has no effect if the widgets can expand to fill the
      * entire box layout.
      */
    /**
      * Set the content alignment for the box layout.
      *
      * #### Notes
      * This is the alignment of the widgets in the layout direction.
      *
      * The alignment has no effect if the widgets can expand to fill the
      * entire box layout.
      */
    var alignment: Alignment = js.native
    
    /**
      * Get the layout direction for the box layout.
      */
    /**
      * Set the layout direction for the box layout.
      */
    var direction: Direction = js.native
    
    /**
      * Get the inter-element spacing for the box layout.
      */
    /**
      * Set the inter-element spacing for the box layout.
      */
    var spacing: Double = js.native
  }
  object BoxLayout {
    
    /**
      * Get the box layout size basis for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The box layout size basis for the widget.
      */
    @JSImport("@lumino/widgets/types/boxlayout", "BoxLayout.getSizeBasis")
    @js.native
    def getSizeBasis(widget: Widget): Double = js.native
    
    /**
      * Get the box layout stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The box layout stretch factor for the widget.
      */
    @JSImport("@lumino/widgets/types/boxlayout", "BoxLayout.getStretch")
    @js.native
    def getStretch(widget: Widget): Double = js.native
    
    /**
      * Set the box layout size basis for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the size basis.
      */
    @JSImport("@lumino/widgets/types/boxlayout", "BoxLayout.setSizeBasis")
    @js.native
    def setSizeBasis(widget: Widget, value: Double): Unit = js.native
    
    /**
      * Set the box layout stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the stretch factor.
      */
    @JSImport("@lumino/widgets/types/boxlayout", "BoxLayout.setStretch")
    @js.native
    def setStretch(widget: Widget, value: Double): Unit = js.native
    
    /**
      * A type alias for a box layout alignment.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.start
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.center
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.end
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.justify
    */
    trait Alignment extends StObject
    object Alignment {
      
      @scala.inline
      def center: typingsSlinky.luminoWidgets.luminoWidgetsStrings.center = "center".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.center]
      
      @scala.inline
      def end: typingsSlinky.luminoWidgets.luminoWidgetsStrings.end = "end".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.end]
      
      @scala.inline
      def justify: typingsSlinky.luminoWidgets.luminoWidgetsStrings.justify = "justify".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.justify]
      
      @scala.inline
      def start: typingsSlinky.luminoWidgets.luminoWidgetsStrings.start = "start".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.start]
    }
    
    /**
      * A type alias for a box layout direction.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`left-to-right`
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`right-to-left`
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`top-to-bottom`
      - typingsSlinky.luminoWidgets.luminoWidgetsStrings.`bottom-to-top`
    */
    trait Direction extends StObject
    object Direction {
      
      @scala.inline
      def `bottom-to-top`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`bottom-to-top` = "bottom-to-top".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`bottom-to-top`]
      
      @scala.inline
      def `left-to-right`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`left-to-right` = "left-to-right".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`left-to-right`]
      
      @scala.inline
      def `right-to-left`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`right-to-left` = "right-to-left".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`right-to-left`]
      
      @scala.inline
      def `top-to-bottom`: typingsSlinky.luminoWidgets.luminoWidgetsStrings.`top-to-bottom` = "top-to-bottom".asInstanceOf[typingsSlinky.luminoWidgets.luminoWidgetsStrings.`top-to-bottom`]
    }
    
    /**
      * An options object for initializing a box layout.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The content alignment of the layout.
        *
        * The default is `'start'`.
        */
      var alignment: js.UndefOr[Alignment] = js.native
      
      /**
        * The direction of the layout.
        *
        * The default is `'top-to-bottom'`.
        */
      var direction: js.UndefOr[Direction] = js.native
      
      /**
        * The spacing between items in the layout.
        *
        * The default is `4`.
        */
      var spacing: js.UndefOr[Double] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
        
        @scala.inline
        def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
        
        @scala.inline
        def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      }
    }
  }
}
