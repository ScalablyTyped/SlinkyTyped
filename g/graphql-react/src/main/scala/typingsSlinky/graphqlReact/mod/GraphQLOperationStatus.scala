package typingsSlinky.graphqlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLOperationStatus[T] extends js.Object {
  var cacheKey: GraphQLCacheKey = js.native
  var cacheValue: js.UndefOr[GraphQLCacheValue[T]] = js.native
  var loading: Boolean = js.native
  def load(): Unit = js.native
}

object GraphQLOperationStatus {
  @scala.inline
  def apply[T](cacheKey: GraphQLCacheKey, load: () => Unit, loading: Boolean): GraphQLOperationStatus[T] = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLOperationStatus[T]]
  }
  @scala.inline
  implicit class GraphQLOperationStatusOps[Self[t] <: GraphQLOperationStatus[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCacheKey(value: GraphQLCacheKey): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheValue(value: GraphQLCacheValue[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheValue")(js.undefined)
        ret
    }
  }
  
}

