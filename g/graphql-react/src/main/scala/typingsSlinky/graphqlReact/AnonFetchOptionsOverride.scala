package typingsSlinky.graphqlReact

import typingsSlinky.graphqlReact.mod.GraphQLFetchOptions
import typingsSlinky.graphqlReact.mod.GraphQLFetchOptionsOverride
import typingsSlinky.graphqlReact.mod.GraphQLOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFetchOptionsOverride[V] extends js.Object {
  var fetchOptionsOverride: js.UndefOr[GraphQLFetchOptionsOverride] = js.native
  var operation: GraphQLOperation[V] = js.native
  var reloadOnLoad: js.UndefOr[Boolean] = js.native
  var resetOnLoad: js.UndefOr[Boolean] = js.native
}

object AnonFetchOptionsOverride {
  @scala.inline
  def apply[V](operation: GraphQLOperation[V]): AnonFetchOptionsOverride[V] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetchOptionsOverride[V]]
  }
  @scala.inline
  implicit class AnonFetchOptionsOverrideOps[Self[v] <: AnonFetchOptionsOverride[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withOperation(value: GraphQLOperation[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchOptionsOverride(value: /* options */ GraphQLFetchOptions => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOptionsOverride")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFetchOptionsOverride: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchOptionsOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadOnLoad(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadOnLoad: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnLoad(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnLoad: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnLoad")(js.undefined)
        ret
    }
  }
  
}

