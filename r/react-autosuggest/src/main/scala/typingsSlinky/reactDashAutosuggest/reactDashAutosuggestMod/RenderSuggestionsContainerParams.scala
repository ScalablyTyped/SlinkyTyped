package typingsSlinky.reactDashAutosuggest.reactDashAutosuggestMod

import slinky.core.TagMod
import typingsSlinky.reactDashAutosuggest.Anon_ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuggestionsContainerParams extends js.Object {
  var children: TagMod[Any]
  var containerProps: Anon_ClassName
  var query: String
}

object RenderSuggestionsContainerParams {
  @scala.inline
  def apply(children: TagMod[Any], containerProps: Anon_ClassName, query: String): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], containerProps = containerProps.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
}

