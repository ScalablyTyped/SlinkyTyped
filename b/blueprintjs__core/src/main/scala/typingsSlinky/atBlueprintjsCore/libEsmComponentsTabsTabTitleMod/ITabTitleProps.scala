package typingsSlinky.atBlueprintjsCore.libEsmComponentsTabsTabTitleMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.atBlueprintjsCore.libEsmComponentsTabsTabMod.ITabProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsTabsTabMod.TabId
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabTitleProps extends ITabProps {
  /** ID of the parent `Tabs` to which this tab belongs. Used to generate ID for ARIA attributes. */
  var parentId: TabId
  /** Whether the tab is currently selected. */
  var selected: Boolean
  /** Handler invoked when this tab is clicked. */
  def onClick(id: TabId, event: SyntheticMouseEvent[HTMLElement]): Unit
}

object ITabTitleProps {
  @scala.inline
  def apply(
    id: TabId,
    onClick: (TabId, SyntheticMouseEvent[HTMLElement]) => Unit,
    parentId: TabId,
    selected: Boolean,
    children: TagMod[Any] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    panel: Element = null,
    panelClassName: String = null,
    title: TagMod[Any] = null
  ): ITabTitleProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), parentId = parentId.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabTitleProps]
  }
}

