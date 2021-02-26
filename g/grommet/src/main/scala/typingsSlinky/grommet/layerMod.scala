package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.grommet.grommetStrings.fadeIn
import typingsSlinky.grommet.grommetStrings.horizontal
import typingsSlinky.grommet.grommetStrings.none
import typingsSlinky.grommet.grommetStrings.slide
import typingsSlinky.grommet.grommetStrings.vertical
import typingsSlinky.grommet.utilsMod.AnimateType
import typingsSlinky.grommet.utilsMod.KeyboardType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Layer", "Layer")
  @js.native
  class Layer protected ()
    extends Component[
          LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          js.Object, 
          js.Any
        ] {
    def this(props: LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Layer", "Layer")
  @js.native
  val Layer: ReactComponentClass[
    LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.bottom
    - typingsSlinky.grommet.grommetStrings.`bottom-left`
    - typingsSlinky.grommet.grommetStrings.`bottom-right`
    - typingsSlinky.grommet.grommetStrings.center
    - typingsSlinky.grommet.grommetStrings.hidden
    - typingsSlinky.grommet.grommetStrings.left
    - typingsSlinky.grommet.grommetStrings.right
    - typingsSlinky.grommet.grommetStrings.top
    - typingsSlinky.grommet.grommetStrings.`top-left`
    - typingsSlinky.grommet.grommetStrings.`top-right`
  */
  trait LayerPositionType extends StObject
  object LayerPositionType {
    
    @scala.inline
    def bottom: typingsSlinky.grommet.grommetStrings.bottom = "bottom".asInstanceOf[typingsSlinky.grommet.grommetStrings.bottom]
    
    @scala.inline
    def `bottom-left`: typingsSlinky.grommet.grommetStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsSlinky.grommet.grommetStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typingsSlinky.grommet.grommetStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsSlinky.grommet.grommetStrings.`bottom-right`]
    
    @scala.inline
    def center: typingsSlinky.grommet.grommetStrings.center = "center".asInstanceOf[typingsSlinky.grommet.grommetStrings.center]
    
    @scala.inline
    def hidden: typingsSlinky.grommet.grommetStrings.hidden = "hidden".asInstanceOf[typingsSlinky.grommet.grommetStrings.hidden]
    
    @scala.inline
    def left: typingsSlinky.grommet.grommetStrings.left = "left".asInstanceOf[typingsSlinky.grommet.grommetStrings.left]
    
    @scala.inline
    def right: typingsSlinky.grommet.grommetStrings.right = "right".asInstanceOf[typingsSlinky.grommet.grommetStrings.right]
    
    @scala.inline
    def top: typingsSlinky.grommet.grommetStrings.top = "top".asInstanceOf[typingsSlinky.grommet.grommetStrings.top]
    
    @scala.inline
    def `top-left`: typingsSlinky.grommet.grommetStrings.`top-left` = "top-left".asInstanceOf[typingsSlinky.grommet.grommetStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typingsSlinky.grommet.grommetStrings.`top-right` = "top-right".asInstanceOf[typingsSlinky.grommet.grommetStrings.`top-right`]
  }
  
  @js.native
  trait LayerProps extends StObject {
    
    var animate: js.UndefOr[AnimateType] = js.native
    
    var animation: js.UndefOr[none | slide | fadeIn | Boolean] = js.native
    
    var full: js.UndefOr[Boolean | vertical | horizontal] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var modal: js.UndefOr[Boolean] = js.native
    
    var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var onEsc: js.UndefOr[KeyboardType] = js.native
    
    var plain: js.UndefOr[Boolean] = js.native
    
    var position: js.UndefOr[LayerPositionType] = js.native
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    var target: js.UndefOr[js.Object] = js.native
  }
  object LayerProps {
    
    @scala.inline
    def apply(): LayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerProps]
    }
    
    @scala.inline
    implicit class LayerPropsMutableBuilder[Self <: LayerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: AnimateType): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setAnimation(value: none | slide | fadeIn | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setFull(value: Boolean | vertical | horizontal): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setOnClickOutside(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      @scala.inline
      def setOnEsc(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onEsc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setPosition(value: LayerPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
