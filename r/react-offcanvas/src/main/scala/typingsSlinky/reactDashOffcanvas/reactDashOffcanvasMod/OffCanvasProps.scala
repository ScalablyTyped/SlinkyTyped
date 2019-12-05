package typingsSlinky.reactDashOffcanvas.reactDashOffcanvasMod

import slinky.core.TagMod
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasStrings.left
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasStrings.overlay
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasStrings.parallax
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasStrings.push
import typingsSlinky.reactDashOffcanvas.reactDashOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffCanvasProps extends js.Object {
  var children: TagMod[Any]
  var effect: js.UndefOr[push | overlay | parallax] = js.undefined
  var isMenuOpened: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[left | right] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object OffCanvasProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    effect: push | overlay | parallax = null,
    isMenuOpened: js.UndefOr[Boolean] = js.undefined,
    position: left | right = null,
    transitionDuration: Int | Double = null,
    width: Int | Double = null
  ): OffCanvasProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(isMenuOpened)) __obj.updateDynamic("isMenuOpened")(isMenuOpened.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffCanvasProps]
  }
}

