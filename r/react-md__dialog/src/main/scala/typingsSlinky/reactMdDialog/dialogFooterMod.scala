package typingsSlinky.reactMdDialog

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdDialog.reactMdDialogStrings.`stacked-end`
import typingsSlinky.reactMdDialog.reactMdDialogStrings.`stacked-start`
import typingsSlinky.reactMdDialog.reactMdDialogStrings.between
import typingsSlinky.reactMdDialog.reactMdDialogStrings.end
import typingsSlinky.reactMdDialog.reactMdDialogStrings.none
import typingsSlinky.reactMdDialog.reactMdDialogStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogFooterMod {
  
  @JSImport("@react-md/dialog/types/DialogFooter", "DialogFooter")
  @js.native
  val DialogFooter: ForwardRefExoticComponent[DialogFooterProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait DialogFooterProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * An optional alignment for the content within the footer. Since the majority
      * of dialog footers are used to contain action buttons, the default alignment
      * is near the end.
      */
    var align: js.UndefOr[none | start | end | between | `stacked-start` | `stacked-end`] = js.native
  }
  object DialogFooterProps {
    
    @scala.inline
    def apply(): DialogFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogFooterProps]
    }
    
    @scala.inline
    implicit class DialogFooterPropsMutableBuilder[Self <: DialogFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: none | start | end | between | `stacked-start` | `stacked-end`): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
