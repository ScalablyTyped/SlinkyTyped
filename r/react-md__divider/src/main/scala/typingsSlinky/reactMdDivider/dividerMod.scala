package typingsSlinky.reactMdDivider

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLHRElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod {
  
  @JSImport("@react-md/divider/types/Divider", "Divider")
  @js.native
  val Divider: ForwardRefExoticComponent[DividerProps with RefAttributes[DividerElement]] = js.native
  
  type DividerElement = HTMLHRElement | HTMLDivElement
  
  @js.native
  trait DividerProps extends HTMLAttributes[DividerElement] {
    
    /**
      * Boolean if the divider should appear inset instead of full width. This
      * really just applied a margin-left (or margin-right when dir="rtl").
      *
      * If you want to create a divider that is centered, you most likely want to
      * use the `rmd-divider-theme-update-var` mixin instead to update the
      * `max-size` of the divider.
      */
    var inset: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the divider should be vertical instead of horizontal. This will
      * change the divider to be rendered as a `<div>` instead of an `<hr>`.
      *
      * Note: If your parent element of the divider does not have a static height
      * set, you **must** manually set the height of the divider to a static
      * non-percentage number OR use the `VerticalDivider` component instead to
      * automagically create a valid percentage height.
      */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object DividerProps {
    
    @scala.inline
    def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
    
    @scala.inline
    implicit class DividerPropsMutableBuilder[Self <: DividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
