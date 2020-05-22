package typingsSlinky.nextReactDevOverlay.shadowPortalMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowPortalProps extends js.Object {
  var children: TagMod[Any]
}

object ShadowPortalProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): ShadowPortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowPortalProps]
  }
}

