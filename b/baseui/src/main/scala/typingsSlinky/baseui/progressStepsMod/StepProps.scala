package typingsSlinky.baseui.progressStepsMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var isActive: js.UndefOr[Boolean] = js.undefined
  var isCompleted: js.UndefOr[Boolean] = js.undefined
  var isLast: js.UndefOr[Boolean] = js.undefined
  var overrides: js.UndefOr[StepOverrides] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object StepProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isCompleted: js.UndefOr[Boolean] = js.undefined,
    isLast: js.UndefOr[Boolean] = js.undefined,
    overrides: StepOverrides = null,
    title: TagMod[Any] = null
  ): StepProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompleted)) __obj.updateDynamic("isCompleted")(isCompleted.asInstanceOf[js.Any])
    if (!js.isUndefined(isLast)) __obj.updateDynamic("isLast")(isLast.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepProps]
  }
}

