package typingsSlinky.reactOverlays.rootCloseWrapperMod

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.reactOverlays.reactOverlaysStrings.click
import typingsSlinky.reactOverlays.reactOverlaysStrings.mousedown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootCloseWrapperProps extends js.Object {
  /**
    * Children to render.
    */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /**
    * Disable the the RootCloseWrapper, preventing it from triggering
    * `onRootClose`.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Choose which document mouse event to bind to
    */
  var event: js.UndefOr[click | mousedown] = js.undefined
  /**
    * Callback fired after click or mousedown. Also triggers when user hits `esc`.
    */
  var onRootClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, _], Unit]] = js.undefined
}

object RootCloseWrapperProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    event: click | mousedown = null,
    onRootClose: /* e */ SyntheticEvent[Event, _] => Unit = null
  ): RootCloseWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (onRootClose != null) __obj.updateDynamic("onRootClose")(js.Any.fromFunction1(onRootClose))
    __obj.asInstanceOf[RootCloseWrapperProps]
  }
}

