package typingsSlinky.apolloReactHooks.typesMod

import typingsSlinky.apolloReactCommon.typesMod.BaseMutationOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationOptions[TData, TVariables] extends BaseMutationOptions[TData, TVariables] {
  var mutation: DocumentNode = js.native
}

object MutationOptions {
  @scala.inline
  def apply[TData, TVariables](mutation: DocumentNode): MutationOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class MutationOptionsOps[Self[tdata, tvariables] <: MutationOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
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
  }
  
}

