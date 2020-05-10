package typingsSlinky.apolloReactHoc.typesMod

import typingsSlinky.apolloReactCommon.typesMod.BaseMutationOptions
import typingsSlinky.apolloReactCommon.typesMod.BaseQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationOption[TProps, TData, TGraphQLVariables, TChildProps] extends js.Object {
  var alias: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[
    BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables]) | (js.Function1[
      /* props */ TProps, 
      BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables])
    ])
  ] = js.native
  var props: js.UndefOr[
    js.Function2[
      /* props */ OptionProps[TProps, TData, TGraphQLVariables], 
      /* lastProps */ js.UndefOr[TChildProps | Unit], 
      TChildProps
    ]
  ] = js.native
  var shouldResubscribe: js.UndefOr[js.Function2[/* props */ TProps, /* nextProps */ TProps, Boolean]] = js.native
  var skip: js.UndefOr[Boolean | (js.Function1[/* props */ TProps, Boolean])] = js.native
  var withRef: js.UndefOr[Boolean] = js.native
}

object OperationOption {
  @scala.inline
  def apply[TProps, TData, TGraphQLVariables, TChildProps](): OperationOption[TProps, TData, TGraphQLVariables, TChildProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationOption[TProps, TData, TGraphQLVariables, TChildProps]]
  }
  @scala.inline
  implicit class OperationOptionOps[Self[tprops, tdata, tgraphqlvariables, tchildprops] <: OperationOption[tprops, tdata, tgraphqlvariables, tchildprops], TProps, TData, TGraphQLVariables, TChildProps] (val x: Self[TProps, TData, TGraphQLVariables, TChildProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProps, TData, TGraphQLVariables, TChildProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProps, TData, TGraphQLVariables, TChildProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TProps, TData, TGraphQLVariables, TChildProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TProps, TData, TGraphQLVariables, TChildProps]) with Other]
    @scala.inline
    def withAlias(value: String): Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsFunction1(
      value: /* props */ TProps => BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables])
    ): Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(
      value: BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables]) | (js.Function1[
          /* props */ TProps, 
          BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables])
        ])
    ): Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(
      value: (/* props */ OptionProps[TProps, TData, TGraphQLVariables], /* lastProps */ js.UndefOr[TChildProps | Unit]) => TChildProps
    ): Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProps: Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldResubscribe(value: (/* props */ TProps, /* nextProps */ TProps) => Boolean): Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldResubscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShouldResubscribe: Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldResubscribe")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFunction1(value: /* props */ TProps => Boolean): Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkip(value: Boolean | (js.Function1[/* props */ TProps, Boolean])): Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withWithRef(value: Boolean): Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithRef: Self[TProps, TData, TGraphQLVariables, TChildProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(js.undefined)
        ret
    }
  }
  
}

