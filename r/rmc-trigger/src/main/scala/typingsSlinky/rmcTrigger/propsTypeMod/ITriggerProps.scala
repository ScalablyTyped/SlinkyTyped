package typingsSlinky.rmcTrigger.propsTypeMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITriggerProps extends js.Object {
  var afterPopupVisibleChange: js.UndefOr[js.Function] = js.native
  var builtinPlacements: js.UndefOr[js.Any] = js.native
  var defaultPopupVisible: js.UndefOr[Boolean] = js.native
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.native
  var getDocument: js.UndefOr[js.Function] = js.native
  var getPopupClassNameFromAlign: js.UndefOr[js.Any] = js.native
  var getPopupContainer: js.UndefOr[js.Function] = js.native
  var mask: js.UndefOr[Boolean] = js.native
  var maskAnimation: js.UndefOr[String] = js.native
  var maskClosable: js.UndefOr[Boolean] = js.native
  var maskTransitionName: js.UndefOr[String | js.Object] = js.native
  var onPopupAlign: js.UndefOr[js.Function] = js.native
  var onPopupVisibleChange: js.UndefOr[js.Function] = js.native
  var popup: TagMod[Any] | js.Function = js.native
  var popupAlign: js.UndefOr[js.Any] = js.native
  var popupAnimation: js.UndefOr[js.Any] = js.native
  var popupClassName: js.UndefOr[String] = js.native
  var popupPlacement: js.UndefOr[String] = js.native
  var popupStyle: js.UndefOr[js.Any] = js.native
  var popupTransitionName: js.UndefOr[String | js.Object] = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object ITriggerProps {
  @scala.inline
  def apply(): ITriggerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITriggerProps]
  }
  @scala.inline
  implicit class ITriggerPropsOps[Self <: ITriggerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterPopupVisibleChange(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPopupVisibleChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterPopupVisibleChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPopupVisibleChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBuiltinPlacements(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtinPlacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltinPlacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtinPlacements")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPopupVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPopupVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPopupVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPopupVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyPopupOnHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyPopupOnHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyPopupOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyPopupOnHide")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDocument(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPopupClassNameFromAlign(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupClassNameFromAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetPopupClassNameFromAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupClassNameFromAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPopupContainer(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetPopupContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskTransitionName(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskTransitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskTransitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPopupAlign(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPopupAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPopupVisibleChange(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupVisibleChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPopupVisibleChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupVisibleChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopup(value: TagMod[Any] | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupAlign(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupAnimation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupTransitionName(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

