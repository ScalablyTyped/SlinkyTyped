package typingsSlinky.inboxsdk.mod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchQueryRewriter extends js.Object {
  var term: String = js.native
  def termReplacer(): String | js.Promise[String] = js.native
}

object SearchQueryRewriter {
  @scala.inline
  def apply(term: String, termReplacer: () => String | js.Promise[String]): SearchQueryRewriter = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any], termReplacer = js.Any.fromFunction0(termReplacer))
    __obj.asInstanceOf[SearchQueryRewriter]
  }
  @scala.inline
  implicit class SearchQueryRewriterOps[Self <: SearchQueryRewriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTermReplacer(value: () => String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termReplacer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

