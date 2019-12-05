package typingsSlinky.algoliasearchDashHelper

import typingsSlinky.algoliasearchDashHelper.algoliasearchDashHelperMod.SearchParameters
import typingsSlinky.algoliasearchDashHelper.algoliasearchDashHelperMod.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: SearchResults
  var state: SearchParameters
}

object Anon_Content {
  @scala.inline
  def apply(content: SearchResults, state: SearchParameters): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Content]
  }
}

