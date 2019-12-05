package typingsSlinky.baseui.layerMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersManagerProps extends js.Object {
  var children: TagMod[Any]
  var zIndex: js.UndefOr[Double] = js.undefined
}

object LayersManagerProps {
  @scala.inline
  def apply(children: TagMod[Any], zIndex: Int | Double = null): LayersManagerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersManagerProps]
  }
}

