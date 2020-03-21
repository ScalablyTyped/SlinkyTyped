package typingsSlinky.reactAutosuggest.mod

import slinky.core.TagMod
import typingsSlinky.reactAutosuggest.AnonClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuggestionsContainerParams extends js.Object {
  var children: TagMod[Any]
  var containerProps: AnonClassName
  var query: String
}

object RenderSuggestionsContainerParams {
  @scala.inline
  def apply(children: TagMod[Any], containerProps: AnonClassName, query: String): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], containerProps = containerProps.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
}

