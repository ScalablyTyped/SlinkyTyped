package typingsSlinky.apolloServerCaching.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxSize[V] extends js.Object {
  var maxSize: js.UndefOr[Double] = js.native
  var onDispose: js.UndefOr[js.Function2[/* key */ String, /* value */ V, Unit]] = js.native
  var sizeCalculator: js.UndefOr[js.Function2[/* value */ V, /* key */ String, Double]] = js.native
}

object MaxSize {
  @scala.inline
  def apply[V](): MaxSize[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxSize[V]]
  }
  @scala.inline
  implicit class MaxSizeOps[Self[v] <: MaxSize[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withMaxSize(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDispose(value: (/* key */ String, /* value */ V) => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDispose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDispose: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDispose")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeCalculator(value: (/* value */ V, /* key */ String) => Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeCalculator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSizeCalculator: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeCalculator")(js.undefined)
        ret
    }
  }
  
}

