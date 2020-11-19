package typingsSlinky.antd.popconfirmMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.buttonButtonMod.LegacyButtonType
import typingsSlinky.antd.buttonButtonMod.NativeButtonProps
import typingsSlinky.antd.getRenderPropValueMod.RenderFunction
import typingsSlinky.antd.tooltipMod.AbstractTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class PopconfirmPropsOps[Self <: PopconfirmProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancelButtonProps(value: NativeButtonProps): Self = this.set("cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonProps: Self = this.set("cancelButtonProps", js.undefined)
    
    @scala.inline
    def setCancelTextReactElement(value: ReactElement): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelText(value: ReactElement): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setOkButtonProps(value: NativeButtonProps): Self = this.set("okButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkButtonProps: Self = this.set("okButtonProps", js.undefined)
    
    @scala.inline
    def setOkTextReactElement(value: ReactElement): Self = this.set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkText(value: ReactElement): Self = this.set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    
    @scala.inline
    def setOkType(value: LegacyButtonType): Self = this.set("okType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkType: Self = this.set("okType", js.undefined)
    
    @scala.inline
    def setOnCancel(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): Self = this.set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit): Self = this.set("onConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
    
    @scala.inline
    def setOnVisibleChange(
      value: (/* visible */ Boolean, /* e */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLDivElement]]) => Unit
    ): Self = this.set("onVisibleChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnVisibleChange: Self = this.set("onVisibleChange", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction0(value: () => ReactElement): Self = this.set("title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: ReactElement | RenderFunction): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
