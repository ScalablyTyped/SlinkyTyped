package typingsSlinky.reactPortal.mod

import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps
  extends Props[js.Any] {
  @JSName("children")
  var children_PortalProps: TagMod[Any]
  var node: js.UndefOr[Element | Null] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    key: Key = null,
    node: js.UndefOr[Null | Element] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[js.Any]] = js.undefined
  ): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(node)) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

