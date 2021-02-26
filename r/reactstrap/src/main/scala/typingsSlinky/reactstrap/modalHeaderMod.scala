package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactstrap.mod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalHeaderMod {
  
  @JSImport("reactstrap/lib/ModalHeader", JSImport.Default)
  @js.native
  class default ()
    extends Component[ModalHeaderProps, js.Object, js.Any]
  
  type ModalHeader = ReactComponentClass[ModalHeaderProps]
  
  @js.native
  trait ModalHeaderProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
    
    var toggle: js.UndefOr[MouseEventHandler[_]] = js.native
    
    var wrapTag: js.UndefOr[ReactElement] = js.native
  }
  object ModalHeaderProps {
    
    @scala.inline
    def apply(): ModalHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalHeaderProps]
    }
    
    @scala.inline
    implicit class ModalHeaderPropsMutableBuilder[Self <: ModalHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTag(value: ReactElement): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setToggle(value: SyntheticMouseEvent[_] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setWrapTag(value: ReactElement): Self = StObject.set(x, "wrapTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "wrapTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "wrapTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTagUndefined: Self = StObject.set(x, "wrapTag", js.undefined)
    }
  }
}
