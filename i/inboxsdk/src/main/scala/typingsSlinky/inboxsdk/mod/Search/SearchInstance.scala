package typingsSlinky.inboxsdk.mod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchInstance extends js.Object {
  def registerSearchQueryRewriter(rewriter: SearchQueryRewriter): Unit = js.native
  def registerSearchSuggestionsProvider(
    handler: js.Function1[
      /* query */ String, 
      js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
    ]
  ): Unit = js.native
}

object SearchInstance {
  @scala.inline
  def apply(
    registerSearchQueryRewriter: SearchQueryRewriter => Unit,
    registerSearchSuggestionsProvider: js.Function1[
      /* query */ String, 
      js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
    ] => Unit
  ): SearchInstance = {
    val __obj = js.Dynamic.literal(registerSearchQueryRewriter = js.Any.fromFunction1(registerSearchQueryRewriter), registerSearchSuggestionsProvider = js.Any.fromFunction1(registerSearchSuggestionsProvider))
    __obj.asInstanceOf[SearchInstance]
  }
  @scala.inline
  implicit class SearchInstanceOps[Self <: SearchInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterSearchQueryRewriter(value: SearchQueryRewriter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSearchQueryRewriter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterSearchSuggestionsProvider(
      value: js.Function1[
          /* query */ String, 
          js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
        ] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSearchSuggestionsProvider")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

