package typingsSlinky.cathoQuantum.tabbedViewMod

import slinky.core.TagMod
import typingsSlinky.cathoQuantum.AnonComponentsSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbedViewProps extends js.Object {
  var activeTab: js.UndefOr[String] = js.undefined
  var children: js.Array[TagMod[Any]] | TagMod[Any]
  var fluid: js.UndefOr[Boolean] = js.undefined
  var skin: js.UndefOr[neutral | primary] = js.undefined
  var theme: js.UndefOr[AnonComponentsSpacing] = js.undefined
}

object TabbedViewProps {
  @scala.inline
  def apply(
    children: js.Array[TagMod[Any]] | TagMod[Any],
    activeTab: String = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    skin: neutral | primary = null,
    theme: AnonComponentsSpacing = null
  ): TabbedViewProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedViewProps]
  }
}

