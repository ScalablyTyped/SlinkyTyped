package typingsSlinky.apolloEngineReporting.anon

import typingsSlinky.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RewriteError extends js.Object {
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.native
}

object RewriteError {
  @scala.inline
  def apply(): RewriteError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RewriteError]
  }
  @scala.inline
  implicit class RewriteErrorOps[Self <: RewriteError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRewriteError(value: /* err */ GraphQLError => GraphQLError | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRewriteError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteError")(js.undefined)
        ret
    }
  }
  
}

