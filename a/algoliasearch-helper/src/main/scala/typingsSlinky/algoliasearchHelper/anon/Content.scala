package typingsSlinky.algoliasearchHelper.anon

import typingsSlinky.algoliasearchHelper.mod.SearchParameters
import typingsSlinky.algoliasearchHelper.mod.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: SearchResults
  var state: SearchParameters
}

object Content {
  @scala.inline
  def apply(content: SearchResults, state: SearchParameters): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

