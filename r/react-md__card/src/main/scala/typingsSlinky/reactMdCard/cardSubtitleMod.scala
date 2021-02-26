package typingsSlinky.reactMdCard

import org.scalajs.dom.raw.HTMLHeadingElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardSubtitleMod {
  
  @JSImport("@react-md/card/types/CardSubtitle", "CardSubtitle")
  @js.native
  val CardSubtitle: ForwardRefExoticComponent[CardSubtitleProps with RefAttributes[HTMLHeadingElement]] = js.native
  
  @js.native
  trait CardSubtitleProps extends HTMLAttributes[HTMLHeadingElement] {
    
    /**
      * Boolean if the subtitle should no longer use the secondary text color
      * within cards.
      */
    var disableSecondaryColor: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the title should not be able to line-wrap and will ellipsis long
      * text.
      */
    var noWrap: js.UndefOr[Boolean] = js.native
  }
  object CardSubtitleProps {
    
    @scala.inline
    def apply(): CardSubtitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSubtitleProps]
    }
    
    @scala.inline
    implicit class CardSubtitlePropsMutableBuilder[Self <: CardSubtitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableSecondaryColor(value: Boolean): Self = StObject.set(x, "disableSecondaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSecondaryColorUndefined: Self = StObject.set(x, "disableSecondaryColor", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    }
  }
}
