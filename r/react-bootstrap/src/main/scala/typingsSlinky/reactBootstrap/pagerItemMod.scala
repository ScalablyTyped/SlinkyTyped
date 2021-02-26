package typingsSlinky.reactBootstrap

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerItemMod {
  
  @JSImport("react-bootstrap/lib/PagerItem", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PagerItemProps, js.Object, js.Any]
  
  @js.native
  trait PagerItem
    extends Component[PagerItemProps, js.Object, js.Any]
  
  @js.native
  trait PagerItemProps extends HTMLProps[PagerItem] {
    
    var eventKey: js.UndefOr[js.Any] = js.native
    
    var next: js.UndefOr[Boolean] = js.native
    
    @JSName("onSelect")
    var onSelect_PagerItemProps: js.UndefOr[SelectCallback] = js.native
    
    var previous: js.UndefOr[Boolean] = js.native
  }
  object PagerItemProps {
    
    @scala.inline
    def apply(): PagerItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerItemProps]
    }
    
    @scala.inline
    implicit class PagerItemPropsMutableBuilder[Self <: PagerItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventKey(value: js.Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
}
