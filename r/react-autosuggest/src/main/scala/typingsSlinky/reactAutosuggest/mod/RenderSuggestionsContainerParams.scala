package typingsSlinky.reactAutosuggest.mod

import slinky.core.TagMod
import typingsSlinky.reactAutosuggest.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuggestionsContainerParams extends js.Object {
  var children: TagMod[Any]
  var containerProps: ClassName
  var query: String
}

object RenderSuggestionsContainerParams {
  @scala.inline
  def apply(containerProps: ClassName, query: String, children: TagMod[Any] = null): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal(containerProps = containerProps.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
}

