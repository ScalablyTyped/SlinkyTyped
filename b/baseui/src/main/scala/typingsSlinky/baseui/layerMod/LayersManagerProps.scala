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
  def apply(children: TagMod[Any] = null, zIndex: js.UndefOr[Double] = js.undefined): LayersManagerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersManagerProps]
  }
}

