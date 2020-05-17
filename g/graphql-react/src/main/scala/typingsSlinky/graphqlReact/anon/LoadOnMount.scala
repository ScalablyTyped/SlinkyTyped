package typingsSlinky.graphqlReact.anon

import typingsSlinky.graphqlReact.mod.GraphQLFetchOptions
import typingsSlinky.graphqlReact.mod.GraphQLFetchOptionsOverride
import typingsSlinky.graphqlReact.mod.GraphQLOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadOnMount[V] extends js.Object {
  var fetchOptionsOverride: js.UndefOr[GraphQLFetchOptionsOverride] = js.native
  var loadOnMount: js.UndefOr[Boolean] = js.native
  var loadOnReload: js.UndefOr[Boolean] = js.native
  var loadOnReset: js.UndefOr[Boolean] = js.native
  var operation: GraphQLOperation[V] = js.native
  var reloadOnLoad: js.UndefOr[Boolean] = js.native
  var resetOnLoad: js.UndefOr[Boolean] = js.native
}

object LoadOnMount {
  @scala.inline
  def apply[V](operation: GraphQLOperation[V]): LoadOnMount[V] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOnMount[V]]
  }
  @scala.inline
  implicit class LoadOnMountOps[Self[v] <: LoadOnMount[v], V] (val x: Self[V]) extends AnyVal {
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
    def withLoadOnMount(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnMount: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadOnReload(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnReload: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnReload")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadOnReset(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnReset: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnReset")(js.undefined)
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

