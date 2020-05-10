package typingsSlinky.atom.autocompletePlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetSuggestion
  extends SuggestionBase
     with AnySuggestion {
  /**
    *  A snippet string. This will allow users to tab through function arguments
    *  or other options.
    */
  var snippet: String = js.native
}

object SnippetSuggestion {
  @scala.inline
  def apply(snippet: String): SnippetSuggestion = {
    val __obj = js.Dynamic.literal(snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnippetSuggestion]
  }
  @scala.inline
  implicit class SnippetSuggestionOps[Self <: SnippetSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

