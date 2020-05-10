package typingsSlinky.apolloClient.watchQueryOptionsMod

import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationOptions[T, TVariables] extends MutationBaseOptions[T, TVariables] {
  var context: js.UndefOr[js.Any] = js.native
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
  var mutation: DocumentNode = js.native
}

object MutationOptions {
  @scala.inline
  def apply[T, TVariables](mutation: DocumentNode): MutationOptions[T, TVariables] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOptions[T, TVariables]]
  }
  @scala.inline
  implicit class MutationOptionsOps[Self[t, tvariables] <: MutationOptions[t, tvariables], T, TVariables] (val x: Self[T, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, TVariables]) with Other]
    @scala.inline
    def withMutation(value: DocumentNode): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchPolicy(value: FetchPolicy): Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchPolicy: Self[T, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(js.undefined)
        ret
    }
  }
  
}

