package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.info
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.warning
import typingsSlinky.antd.errorBoundaryMod.default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  object default extends Shortcut {
    
    @JSImport("antd/lib/alert", JSImport.Default)
    @js.native
    val ^ : AlertInterface = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/alert", "default.ErrorBoundary")
    @js.native
    class ErrorBoundary ()
      extends typingsSlinky.antd.errorBoundaryMod.default
    
    type _To = AlertInterface
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: AlertInterface = ^
  }
  
  @js.native
  trait AlertInterface extends FunctionComponent[AlertProps] {
    
    var ErrorBoundary: Instantiable0[default] = js.native
  }
  
  @js.native
  trait AlertProps extends StObject {
    
    /** Trigger when animation ending of Alert */
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var banner: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** Whether Alert can be closed */
    var closable: js.UndefOr[Boolean] = js.native
    
    /** Close text to show */
    var closeText: js.UndefOr[ReactElement] = js.native
    
    /** Additional content of Alert */
    var description: js.UndefOr[ReactElement] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    /** Content of Alert */
    var message: ReactElement = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    /** Callback when close Alert */
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    /** https://www.w3.org/TR/2014/REC-html5-20141028/dom.html#aria-role-attribute */
    var role: js.UndefOr[String] = js.native
    
    /** Whether to show icon */
    var showIcon: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Type of Alert styles, options:`success`, `info`, `warning`, `error`
      */
    var `type`: js.UndefOr[success | info | warning | error] = js.native
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
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setBanner(value: Boolean): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseText(value: ReactElement): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTextReactElement(value: ReactElement): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: success | info | warning | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
