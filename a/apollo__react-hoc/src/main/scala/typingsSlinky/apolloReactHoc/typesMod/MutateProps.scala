package typingsSlinky.apolloReactHoc.typesMod

import typingsSlinky.apolloReactCommon.typesMod.MutationFetchResult
import typingsSlinky.apolloReactCommon.typesMod.MutationFunction
import typingsSlinky.apolloReactCommon.typesMod.MutationFunctionOptions
import typingsSlinky.apolloReactCommon.typesMod.MutationResult
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutateProps[TData, TGraphQLVariables] extends js.Object {
  var mutate: MutationFunction[TData, TGraphQLVariables] = js.native
  var result: MutationResult[TData] = js.native
}

object MutateProps {
  @scala.inline
  def apply[TData, TGraphQLVariables](
    mutate: /* options */ js.UndefOr[MutationFunctionOptions[TData, TGraphQLVariables]] => js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]],
    result: MutationResult[TData]
  ): MutateProps[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(mutate = js.Any.fromFunction1(mutate), result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutateProps[TData, TGraphQLVariables]]
  }
  @scala.inline
  implicit class MutatePropsOps[Self[tdata, tgraphqlvariables] <: MutateProps[tdata, tgraphqlvariables], TData, TGraphQLVariables] (val x: Self[TData, TGraphQLVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TGraphQLVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TGraphQLVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TGraphQLVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TGraphQLVariables]) with Other]
    @scala.inline
    def withMutate(
      value: /* options */ js.UndefOr[MutationFunctionOptions[TData, TGraphQLVariables]] => js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]]
    ): Self[TData, TGraphQLVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResult(value: MutationResult[TData]): Self[TData, TGraphQLVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

