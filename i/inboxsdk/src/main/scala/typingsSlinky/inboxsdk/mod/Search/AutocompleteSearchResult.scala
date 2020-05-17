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
  implicit def apply(value: AutocompleteSearchResultHtml): AutocompleteSearchResult = value.asInstanceOf[AutocompleteSearchResult]
  @scala.inline
  implicit def apply(value: AutocompleteSearchResultText): AutocompleteSearchResult = value.asInstanceOf[AutocompleteSearchResult]
}

