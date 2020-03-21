package typingsSlinky.antDesignProLayout.libSettingDrawerMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingItemProps extends js.Object {
  var action: ReactElement
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledReason: js.UndefOr[TagMod[Any]] = js.undefined
  var title: TagMod[Any]
}

object SettingItemProps {
  @scala.inline
  def apply(
    action: ReactElement,
    title: TagMod[Any],
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledReason: TagMod[Any] = null
  ): SettingItemProps = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingItemProps]
  }
}

