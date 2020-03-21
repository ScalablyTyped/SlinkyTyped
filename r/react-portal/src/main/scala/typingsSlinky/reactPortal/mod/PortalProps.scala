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
  def apply(children: TagMod[Any], key: Key = null, node: Element = null, ref: LegacyRef[js.Any] = null): PortalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

