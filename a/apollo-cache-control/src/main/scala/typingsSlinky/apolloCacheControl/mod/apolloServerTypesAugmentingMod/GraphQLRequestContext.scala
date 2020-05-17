package typingsSlinky.apolloCacheControl.mod.apolloServerTypesAugmentingMod

import typingsSlinky.apolloCacheControl.anon.RequiredCacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLRequestContext[TContext] extends js.Object {
  var overallCachePolicy: js.UndefOr[RequiredCacheHint] = js.native
}

object GraphQLRequestContext {
  @scala.inline
  def apply[TContext](): GraphQLRequestContext[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLRequestContext[TContext]]
  }
  @scala.inline
  implicit class GraphQLRequestContextOps[Self[tcontext] <: GraphQLRequestContext[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withOverallCachePolicy(value: RequiredCacheHint): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overallCachePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverallCachePolicy: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overallCachePolicy")(js.undefined)
        ret
    }
  }
  
}

