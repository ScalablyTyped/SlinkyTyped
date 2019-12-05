package typingsSlinky.baseui.layerMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerProps extends js.Object {
  var children: TagMod[Any]
  var host: js.UndefOr[HTMLElement] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onMount: js.UndefOr[js.Function0[_]] = js.undefined
  var onUnmount: js.UndefOr[js.Function0[_]] = js.undefined
}

object LayerProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    host: HTMLElement = null,
    index: Int | Double = null,
    mountNode: HTMLElement = null,
    onMount: () => _ = null,
    onUnmount: () => _ = null
  ): LayerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction0(onMount))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction0(onUnmount))
    __obj.asInstanceOf[LayerProps]
  }
}

