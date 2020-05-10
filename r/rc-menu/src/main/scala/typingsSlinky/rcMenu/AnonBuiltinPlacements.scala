package typingsSlinky.rcMenu

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuiltinPlacements extends js.Object {
  var className: String = js.native
  var defaultOpenKeys: js.Array[_] = js.native
  var defaultSelectedKeys: js.Array[_] = js.native
  var mode: String = js.native
  var onClick: js.Function0[Unit] = js.native
  var onDeselect: js.Function0[Unit] = js.native
  var onOpenChange: js.Function0[Unit] = js.native
  var onSelect: js.Function0[Unit] = js.native
  var overflowedIndicator: ReactElement = js.native
  var prefixCls: String = js.native
  var selectable: Boolean = js.native
  var subMenuCloseDelay: Double = js.native
  var subMenuOpenDelay: Double = js.native
  var triggerSubMenuAction: String = js.native
}

object AnonBuiltinPlacements {
  @scala.inline
  def apply(
    className: String,
    defaultOpenKeys: js.Array[_],
    defaultSelectedKeys: js.Array[_],
    mode: String,
    onClick: () => Unit,
    onDeselect: () => Unit,
    onOpenChange: () => Unit,
    onSelect: () => Unit,
    overflowedIndicator: ReactElement,
    prefixCls: String,
    selectable: Boolean,
    subMenuCloseDelay: Double,
    subMenuOpenDelay: Double,
    triggerSubMenuAction: String
  ): AnonBuiltinPlacements = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultOpenKeys = defaultOpenKeys.asInstanceOf[js.Any], defaultSelectedKeys = defaultSelectedKeys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onDeselect = js.Any.fromFunction0(onDeselect), onOpenChange = js.Any.fromFunction0(onOpenChange), onSelect = js.Any.fromFunction0(onSelect), overflowedIndicator = overflowedIndicator.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], subMenuCloseDelay = subMenuCloseDelay.asInstanceOf[js.Any], subMenuOpenDelay = subMenuOpenDelay.asInstanceOf[js.Any], triggerSubMenuAction = triggerSubMenuAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuiltinPlacements]
  }
  @scala.inline
  implicit class AnonBuiltinPlacementsOps[Self <: AnonBuiltinPlacements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOpenKeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSelectedKeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDeselect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOpenChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOverflowedIndicator(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowedIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubMenuCloseDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuCloseDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubMenuOpenDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuOpenDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerSubMenuAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerSubMenuAction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

