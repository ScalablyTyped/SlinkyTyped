package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactstrap.fadeMod.FadeProps
import typingsSlinky.reactstrap.mod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("reactstrap/lib/Alert", JSImport.Default)
  @js.native
  class default ()
    extends Component[AlertProps, js.Object, js.Any]
  
  type Alert = ReactComponentClass[AlertProps]
  
  @js.native
  trait AlertProps extends UncontrolledAlertProps {
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var toggle: js.UndefOr[MouseEventHandler[_]] = js.native
  }
  object AlertProps {
    
    @scala.inline
    def apply(): AlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertProps]
    }
    
    @scala.inline
    implicit class AlertPropsMutableBuilder[Self <: AlertProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setToggle(value: SyntheticMouseEvent[_] => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  @js.native
  trait UncontrolledAlertProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var closeAriaLabel: js.UndefOr[String] = js.native
    
    var closeClassName: js.UndefOr[String] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var fade: js.UndefOr[Boolean] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
    
    var transition: js.UndefOr[FadeProps] = js.native
  }
  object UncontrolledAlertProps {
    
    @scala.inline
    def apply(): UncontrolledAlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UncontrolledAlertProps]
    }
    
    @scala.inline
    implicit class UncontrolledAlertPropsMutableBuilder[Self <: UncontrolledAlertProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseAriaLabel(value: String): Self = StObject.set(x, "closeAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAriaLabelUndefined: Self = StObject.set(x, "closeAriaLabel", js.undefined)
      
      @scala.inline
      def setCloseClassName(value: String): Self = StObject.set(x, "closeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseClassNameUndefined: Self = StObject.set(x, "closeClassName", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setTag(value: ReactElement): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTransition(value: FadeProps): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
}
