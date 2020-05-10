package typingsSlinky.apolloReactHooks.typesMod

import typingsSlinky.apolloReactCommon.typesMod.BaseMutationOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationHookOptions[TData, TVariables] extends BaseMutationOptions[TData, TVariables] {
  var mutation: js.UndefOr[DocumentNode] = js.native
}

object MutationHookOptions {
  @scala.inline
  def apply[TData, TVariables](): MutationHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationHookOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class MutationHookOptionsOps[Self[tdata, tvariables] <: MutationHookOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withMutation(value: DocumentNode): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutation: Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(js.undefined)
        ret
    }
  }
  
}

