package typingsSlinky.reactMdBadge

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("@react-md/badge/types/Badge", "Badge")
  @js.native
  val Badge: ForwardRefExoticComponent[BadgeProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @js.native
  trait BadgeProps extends HTMLAttributes[HTMLSpanElement] {
    
    /**
      * Boolean if the badge should still display if the children is set to `0`, or
      * `null`.  The default behavior is to render null for these cases since it
      * isn't extremely helpful to display an "empty" badge.
      */
    var disableNullOnZero: js.UndefOr[Boolean] = js.native
    
    /**
      * The id for the badge. This is required for a11y since the element that the
      * badge is fixed to should include this id in the `aria-describedby` list.
      */
    @JSName("id")
    var id_BadgeProps: String = js.native
    
    /**
      * The theme to use for the badge.
      */
    var theme: js.UndefOr[BadgeTheme] = js.native
  }
  object BadgeProps {
    
    @scala.inline
    def apply(id: String): BadgeProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeProps]
    }
    
    @scala.inline
    implicit class BadgePropsMutableBuilder[Self <: BadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableNullOnZero(value: Boolean): Self = StObject.set(x, "disableNullOnZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableNullOnZeroUndefined: Self = StObject.set(x, "disableNullOnZero", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: BadgeTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdBadge.reactMdBadgeStrings.primary
    - typingsSlinky.reactMdBadge.reactMdBadgeStrings.secondary
    - typingsSlinky.reactMdBadge.reactMdBadgeStrings.default
    - typingsSlinky.reactMdBadge.reactMdBadgeStrings.clear
  */
  trait BadgeTheme extends StObject
  object BadgeTheme {
    
    @scala.inline
    def default: typingsSlinky.reactMdBadge.reactMdBadgeStrings.default = "default".asInstanceOf[typingsSlinky.reactMdBadge.reactMdBadgeStrings.default]
    
    @scala.inline
    def clear: typingsSlinky.reactMdBadge.reactMdBadgeStrings.clear = "clear".asInstanceOf[typingsSlinky.reactMdBadge.reactMdBadgeStrings.clear]
    
    @scala.inline
    def primary: typingsSlinky.reactMdBadge.reactMdBadgeStrings.primary = "primary".asInstanceOf[typingsSlinky.reactMdBadge.reactMdBadgeStrings.primary]
    
    @scala.inline
    def secondary: typingsSlinky.reactMdBadge.reactMdBadgeStrings.secondary = "secondary".asInstanceOf[typingsSlinky.reactMdBadge.reactMdBadgeStrings.secondary]
  }
}
