package typingsSlinky.graphqlQueryComplexity.mod.graphqlTypeDefinitionAugmentingMod

import typingsSlinky.graphqlQueryComplexity.queryComplexityMod.Complexity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLField[TSource, TContext, TArgs] extends js.Object {
  var complexity: js.UndefOr[Complexity] = js.native
}

object GraphQLField {
  @scala.inline
  def apply[TSource, TContext, TArgs](): GraphQLField[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLField[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class GraphQLFieldOps[Self[tsource, tcontext, targs] <: GraphQLField[tsource, tcontext, targs], TSource, TContext, TArgs] (val x: Self[TSource, TContext, TArgs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSource, TContext, TArgs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSource, TContext, TArgs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TSource, TContext, TArgs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TSource, TContext, TArgs]) with Other]
    @scala.inline
    def withComplexity(value: Complexity): Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplexity: Self[TSource, TContext, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexity")(js.undefined)
        ret
    }
  }
  
}

