package typingsSlinky.baseui.tabsMod

import slinky.core.TagMod
import typingsSlinky.baseui.AnonActiveKey
import typingsSlinky.baseui.SharedPropsactiveboolean
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeKey: js.UndefOr[Key] = js.undefined
  var children: TagMod[Any]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ AnonActiveKey, _]] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var overrides: js.UndefOr[TabsOverrides[SharedPropsactiveboolean]] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    activeKey: Key = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* args */ AnonActiveKey => _ = null,
    orientation: horizontal | vertical = null,
    overrides: TabsOverrides[SharedPropsactiveboolean] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

