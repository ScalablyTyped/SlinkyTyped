package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.buttonButtonMod.LegacyButtonType
import typingsSlinky.antd.buttonButtonMod.NativeButtonProps
import typingsSlinky.antd.getRenderPropValueMod.RenderFunction
import typingsSlinky.antd.tooltipMod.AbstractTooltipProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popconfirmMod extends Shortcut {
  
  @JSImport("antd/lib/popconfirm", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopconfirmProps with RefAttributes[_]] = js.native
  
  @js.native
  trait PopconfirmLocale extends StObject {
    
    var cancelText: String = js.native
    
    var okText: String = js.native
  }
  object PopconfirmLocale {
    
    @scala.inline
    def apply(cancelText: String, okText: String): PopconfirmLocale = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopconfirmLocale]
    }
    
    @scala.inline
    implicit class PopconfirmLocaleMutableBuilder[Self <: PopconfirmLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopconfirmProps extends AbstractTooltipProps {
    
    var cancelButtonProps: js.UndefOr[NativeButtonProps] = js.native
    
    var cancelText: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var okButtonProps: js.UndefOr[NativeButtonProps] = js.native
    
    var okText: js.UndefOr[ReactElement] = js.native
    
    var okType: js.UndefOr[LegacyButtonType] = js.native
    
    var onCancel: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]] = js.native
    
    var onConfirm: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], Unit]] = js.native
    
    @JSName("onVisibleChange")
    var onVisibleChange_PopconfirmProps: js.UndefOr[
        js.Function2[
          /* visible */ Boolean, 
          /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLDivElement]], 
          Unit
        ]
      ] = js.native
    
    var title: ReactElement | RenderFunction = js.native
  }
  object PopconfirmProps {
    
    @scala.inline
    def apply(): PopconfirmProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopconfirmProps]
    }
    
    @scala.inline
    implicit class PopconfirmPropsMutableBuilder[Self <: PopconfirmProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonProps(value: NativeButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelText(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextReactElement(value: ReactElement): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOkButtonProps(value: NativeButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      @scala.inline
      def setOkText(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextReactElement(value: ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(
        value: (/* visible */ Boolean, /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLDivElement]]) => Unit
      ): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait PopconfirmState extends StObject {
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PopconfirmState {
    
    @scala.inline
    def apply(): PopconfirmState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopconfirmState]
    }
    
    @scala.inline
    implicit class PopconfirmStateMutableBuilder[Self <: PopconfirmState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PopconfirmProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `popconfirmMod.foo` */
  override def _to: ForwardRefExoticComponent[PopconfirmProps with RefAttributes[_]] = default
}
