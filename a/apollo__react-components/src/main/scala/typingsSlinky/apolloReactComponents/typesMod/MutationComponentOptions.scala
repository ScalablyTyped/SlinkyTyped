package typingsSlinky.apolloReactComponents.typesMod

import slinky.core.facade.ReactElement
import typingsSlinky.apolloReactCommon.typesMod.BaseMutationOptions
import typingsSlinky.apolloReactCommon.typesMod.MutationFunction
import typingsSlinky.apolloReactCommon.typesMod.MutationResult
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationComponentOptions[TData, TVariables] extends BaseMutationOptions[TData, TVariables] {
  var mutation: DocumentNode = js.native
  def children(mutateFunction: MutationFunction[TData, TVariables], result: MutationResult[TData]): ReactElement | Null = js.native
}

object MutationComponentOptions {
  @scala.inline
  def apply[TData, TVariables](
    children: (MutationFunction[TData, TVariables], MutationResult[TData]) => ReactElement | Null,
    mutation: DocumentNode
  ): MutationComponentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), mutation = mutation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationComponentOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class MutationComponentOptionsOps[Self[tdata, tvariables] <: MutationComponentOptions[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withChildren(value: (MutationFunction[TData, TVariables], MutationResult[TData]) => ReactElement | Null): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMutation(value: DocumentNode): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

