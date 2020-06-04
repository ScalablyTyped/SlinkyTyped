package typingsSlinky.rcMenu.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltinPlacements extends js.Object {
  var className: String
  var defaultOpenKeys: js.Array[_]
  var defaultSelectedKeys: js.Array[_]
  var mode: String
  var onClick: js.Function0[Unit]
  var onDeselect: js.Function0[Unit]
  var onOpenChange: js.Function0[Unit]
  var onSelect: js.Function0[Unit]
  var overflowedIndicator: ReactElement
  var prefixCls: String
  var selectable: Boolean
  var subMenuCloseDelay: Double
  var subMenuOpenDelay: Double
  var triggerSubMenuAction: String
}

object BuiltinPlacements {
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
  ): BuiltinPlacements = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultOpenKeys = defaultOpenKeys.asInstanceOf[js.Any], defaultSelectedKeys = defaultSelectedKeys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onDeselect = js.Any.fromFunction0(onDeselect), onOpenChange = js.Any.fromFunction0(onOpenChange), onSelect = js.Any.fromFunction0(onSelect), overflowedIndicator = overflowedIndicator.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], subMenuCloseDelay = subMenuCloseDelay.asInstanceOf[js.Any], subMenuOpenDelay = subMenuOpenDelay.asInstanceOf[js.Any], triggerSubMenuAction = triggerSubMenuAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltinPlacements]
  }
  @scala.inline
  implicit class BuiltinPlacementsOps[Self <: BuiltinPlacements] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultOpenKeys(value: js.Array[_]): Self = this.set("defaultOpenKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultSelectedKeys(value: js.Array[_]): Self = this.set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDeselect(value: () => Unit): Self = this.set("onDeselect", js.Any.fromFunction0(value))
    @scala.inline
    def setOnOpenChange(value: () => Unit): Self = this.set("onOpenChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnSelect(value: () => Unit): Self = this.set("onSelect", js.Any.fromFunction0(value))
    @scala.inline
    def setOverflowedIndicator(value: ReactElement): Self = this.set("overflowedIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubMenuCloseDelay(value: Double): Self = this.set("subMenuCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubMenuOpenDelay(value: Double): Self = this.set("subMenuOpenDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerSubMenuAction(value: String): Self = this.set("triggerSubMenuAction", value.asInstanceOf[js.Any])
  }
  
}

