package typingsSlinky.reactSvgPanZoomLoader.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSvgPanZoomLoaderProps extends js.Object {
  var proxy: js.UndefOr[TagMod[Any]] = js.undefined
  var src: String
  def render(content: TagMod[Any]): TagMod[Any]
}

object ReactSvgPanZoomLoaderProps {
  @scala.inline
  def apply(render: TagMod[Any] => TagMod[Any], src: String, proxy: TagMod[Any] = null): ReactSvgPanZoomLoaderProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), src = src.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSvgPanZoomLoaderProps]
  }
}

