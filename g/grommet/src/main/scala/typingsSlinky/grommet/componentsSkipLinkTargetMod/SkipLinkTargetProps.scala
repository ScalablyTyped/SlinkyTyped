package typingsSlinky.grommet.componentsSkipLinkTargetMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinkTargetProps extends js.Object {
  var id: String
  var label: js.UndefOr[TagMod[Any]] = js.undefined
}

object SkipLinkTargetProps {
  @scala.inline
  def apply(id: String, label: TagMod[Any] = null): SkipLinkTargetProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinkTargetProps]
  }
}

