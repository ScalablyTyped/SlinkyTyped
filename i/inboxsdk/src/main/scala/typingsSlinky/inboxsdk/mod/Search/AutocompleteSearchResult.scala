package typingsSlinky.inboxsdk.mod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.Search.AutocompleteSearchResultText
  - typingsSlinky.inboxsdk.mod.Search.AutocompleteSearchResultHtml
*/
trait AutocompleteSearchResult extends js.Object

object AutocompleteSearchResult {
  @scala.inline
  def AutocompleteSearchResultText(description: String, name: String): AutocompleteSearchResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteSearchResult]
  }
  @scala.inline
  def AutocompleteSearchResultHtml(descriptionHTML: String, nameHTML: String): AutocompleteSearchResult = {
    val __obj = js.Dynamic.literal(descriptionHTML = descriptionHTML.asInstanceOf[js.Any], nameHTML = nameHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteSearchResult]
  }
}

