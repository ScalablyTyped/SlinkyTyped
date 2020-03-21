package typingsSlinky.draftJs.mod.Draft.Model.ImmutableData

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftBlockRenderConfig extends js.Object {
  var element: String
  var wrapper: js.UndefOr[TagMod[Any]] = js.undefined
}

object DraftBlockRenderConfig {
  @scala.inline
  def apply(element: String, wrapper: TagMod[Any] = null): DraftBlockRenderConfig = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftBlockRenderConfig]
  }
}

