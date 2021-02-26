package typingsSlinky.reactPortalTooltip

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactPortalTooltip.anon.ArrowStyle
import typingsSlinky.reactPortalTooltip.cardMod.Card.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("react-portal-tooltip/lib/Card", JSImport.Default)
  @js.native
  class default ()
    extends Component[CardProps, js.Object, js.Any]
  
  object Card {
    
    /* Rewritten from type alias, can be one of: 
      - scala.Null
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.center
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.right
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.left
    */
    type Align = _Align | Null
    
    /* Rewritten from type alias, can be one of: 
      - scala.Null
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.center
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.top
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.right
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.bottom
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.left
    */
    type Arrow = _Arrow | Null
    
    @js.native
    trait CardProps extends StObject {
      
      var align: js.UndefOr[Align] = js.native
      
      var arrow: js.UndefOr[Arrow] = js.native
      
      var position: js.UndefOr[Position] = js.native
      
      var style: js.UndefOr[ArrowStyle] = js.native
      
      var useHover: js.UndefOr[Boolean] = js.native
    }
    object CardProps {
      
      @scala.inline
      def apply(): CardProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CardProps]
      }
      
      @scala.inline
      implicit class CardPropsMutableBuilder[Self <: CardProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignNull: Self = StObject.set(x, "align", null)
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setArrow(value: Arrow): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArrowNull: Self = StObject.set(x, "arrow", null)
        
        @scala.inline
        def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
        
        @scala.inline
        def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setStyle(value: ArrowStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setUseHover(value: Boolean): Self = StObject.set(x, "useHover", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseHoverUndefined: Self = StObject.set(x, "useHover", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.top
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.right
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.bottom
      - typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.left
    */
    trait Position extends StObject
    object Position {
      
      @scala.inline
      def bottom: typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.bottom = "bottom".asInstanceOf[typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.bottom]
      
      @scala.inline
      def left: typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.left = "left".asInstanceOf[typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.left]
      
      @scala.inline
      def right: typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.right = "right".asInstanceOf[typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.right]
      
      @scala.inline
      def top: typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.top = "top".asInstanceOf[typingsSlinky.reactPortalTooltip.reactPortalTooltipStrings.top]
    }
    
    trait _Align extends StObject
    
    trait _Arrow extends StObject
  }
  type Card = ReactComponentClass[CardProps]
}
