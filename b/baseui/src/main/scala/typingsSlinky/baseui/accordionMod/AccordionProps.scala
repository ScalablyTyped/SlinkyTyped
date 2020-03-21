package typingsSlinky.baseui.accordionMod

import slinky.core.TagMod
import typingsSlinky.baseui.AnonExpanded
import typingsSlinky.baseui.SharedPropsexpandednever
import typingsSlinky.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var accordion: js.UndefOr[Boolean] = js.undefined
  var children: TagMod[Any]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[AccordionState] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ AnonExpanded, _]] = js.undefined
  var overrides: js.UndefOr[AccordionOverrides[SharedPropsexpandednever]] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var renderPanelContent: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer[AccordionState]] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    accordion: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: AccordionState = null,
    onChange: /* args */ AnonExpanded => _ = null,
    overrides: AccordionOverrides[SharedPropsexpandednever] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderPanelContent: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (expand, AccordionState, AccordionState) => AccordionState = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPanelContent)) __obj.updateDynamic("renderPanelContent")(renderPanelContent.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[AccordionProps]
  }
}

