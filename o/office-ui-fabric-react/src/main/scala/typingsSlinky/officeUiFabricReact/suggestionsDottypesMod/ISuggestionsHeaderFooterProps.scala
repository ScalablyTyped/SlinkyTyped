package typingsSlinky.officeUiFabricReact.suggestionsDottypesMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsHeaderFooterProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onExecute: js.UndefOr[js.Function0[Unit]] = js.undefined
  def renderItem(): ReactElement
  def shouldShow(): Boolean
}

object ISuggestionsHeaderFooterProps {
  @scala.inline
  def apply(
    renderItem: () => ReactElement,
    shouldShow: () => Boolean,
    ariaLabel: String = null,
    className: String = null,
    onExecute: () => Unit = null
  ): ISuggestionsHeaderFooterProps = {
    val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction0(renderItem), shouldShow = js.Any.fromFunction0(shouldShow))
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onExecute != null) __obj.updateDynamic("onExecute")(js.Any.fromFunction0(onExecute))
    __obj.asInstanceOf[ISuggestionsHeaderFooterProps]
  }
}

