package typingsSlinky.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  var del: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var keys: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var mget: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var mset: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var reset: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var setex: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  var ttl: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  // These functions will just be bound to the Cache object if they exist so args can be anything
  def get[T](args: js.Any*): js.Promise[_] = js.native
  def set[T](args: js.Any*): js.Promise[_] = js.native
}

object Store {
  @scala.inline
  def apply(get: /* repeated */ js.Any => js.Promise[_], set: /* repeated */ js.Any => js.Promise[_]): Store = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: /* repeated */ js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: /* repeated */ js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDel(value: /* repeated */ js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: /* repeated */ js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withMget(value: /* repeated */ js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mget")(js.undefined)
        ret
    }
    @scala.inline
    def withMset(value: /* repeated */ js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mset")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: /* repeated */ js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withSetex(value: /* repeated */ js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setex")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: /* repeated */ js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

