package typingsSlinky.atom.autocompletePlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.atom.autocompletePlusMod.TextSuggestion
  - typingsSlinky.atom.autocompletePlusMod.SnippetSuggestion
*/
trait AnySuggestion extends js.Object

object AnySuggestion {
  @scala.inline
  def TextSuggestion(text: String): AnySuggestion = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySuggestion]
  }
  @scala.inline
  def SnippetSuggestion(snippet: String): AnySuggestion = {
    val __obj = js.Dynamic.literal(snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySuggestion]
  }
}

