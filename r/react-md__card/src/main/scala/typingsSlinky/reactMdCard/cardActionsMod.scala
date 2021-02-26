package typingsSlinky.reactMdCard

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdCard.reactMdCardStrings.center
import typingsSlinky.reactMdCard.reactMdCardStrings.end
import typingsSlinky.reactMdCard.reactMdCardStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionsMod {
  
  @JSImport("@react-md/card/types/CardActions", "CardActions")
  @js.native
  val CardActions: ForwardRefExoticComponent[CardActionsProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait CardActionsProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * The alignment to use for the card actions. This is really just a simple
      * pass through to the `justify-content` flex property.
      */
    var align: js.UndefOr[start | end | center] = js.native
  }
  object CardActionsProps {
    
    @scala.inline
    def apply(): CardActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardActionsProps]
    }
    
    @scala.inline
    implicit class CardActionsPropsMutableBuilder[Self <: CardActionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: start | end | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
