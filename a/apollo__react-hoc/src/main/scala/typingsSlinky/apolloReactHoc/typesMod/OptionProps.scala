package typingsSlinky.apolloReactHoc.typesMod

import typingsSlinky.apolloReactCommon.typesMod.MutationFetchResult
import typingsSlinky.apolloReactCommon.typesMod.MutationFunction
import typingsSlinky.apolloReactCommon.typesMod.MutationFunctionOptions
import typingsSlinky.apolloReactCommon.typesMod.MutationResult
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@apollo/react-hoc.@apollo/react-hoc/lib/types.DataProps<TData, TGraphQLVariables>> */
/* Inlined parent std.Partial<@apollo/react-hoc.@apollo/react-hoc/lib/types.MutateProps<TData, TGraphQLVariables>> */
@js.native
trait OptionProps[TProps, TData, TGraphQLVariables] extends js.Object {
  var data: js.UndefOr[DataValue[TData, TGraphQLVariables]] = js.native
  var mutate: js.UndefOr[MutationFunction[TData, TGraphQLVariables]] = js.native
  var ownProps: TProps = js.native
  var result: js.UndefOr[MutationResult[TData]] = js.native
}

object OptionProps {
  @scala.inline
  def apply[TProps, TData, TGraphQLVariables](ownProps: TProps): OptionProps[TProps, TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(ownProps = ownProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProps[TProps, TData, TGraphQLVariables]]
  }
  @scala.inline
  implicit class OptionPropsOps[Self[tprops, tdata, tgraphqlvariables] <: OptionProps[tprops, tdata, tgraphqlvariables], TProps, TData, TGraphQLVariables] (val x: Self[TProps, TData, TGraphQLVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProps, TData, TGraphQLVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProps, TData, TGraphQLVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TProps, TData, TGraphQLVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TProps, TData, TGraphQLVariables]) with Other]
    @scala.inline
    def withOwnProps(value: TProps): Self[TProps, TData, TGraphQLVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: DataValue[TData, TGraphQLVariables]): Self[TProps, TData, TGraphQLVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TProps, TData, TGraphQLVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withMutate(
      value: /* options */ js.UndefOr[MutationFunctionOptions[TData, TGraphQLVariables]] => js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]]
    ): Self[TProps, TData, TGraphQLVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMutate: Self[TProps, TData, TGraphQLVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutate")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: MutationResult[TData]): Self[TProps, TData, TGraphQLVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self[TProps, TData, TGraphQLVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

