package typingsSlinky.reactMdDialog

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentMod {
  
  @JSImport("@react-md/dialog/types/DialogContent", "DialogContent")
  @js.native
  val DialogContent: ForwardRefExoticComponent[DialogContentProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait DialogContentProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the default padding for the content should be removed. This is
      * helpful when the child elements already have the required padding (such as
      * lists).  In all other cases, it is recommended to apply a custom className
      * with the padding overrides instead.
      */
    var disablePadding: js.UndefOr[Boolean] = js.native
  }
  object DialogContentProps {
    
    @scala.inline
    def apply(): DialogContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogContentProps]
    }
    
    @scala.inline
    implicit class DialogContentPropsMutableBuilder[Self <: DialogContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
    }
  }
}
