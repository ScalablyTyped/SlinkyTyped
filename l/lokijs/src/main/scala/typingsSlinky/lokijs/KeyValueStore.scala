package typingsSlinky.lokijs

import typingsSlinky.lokijs.anon.Found
import typingsSlinky.lokijs.lokijsNumbers.`-1`
import typingsSlinky.lokijs.lokijsNumbers.`0`
import typingsSlinky.lokijs.lokijsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValueStore extends js.Object {
  var keys: js.Array[_] = js.native
  var values: js.Array[_] = js.native
  def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found] = js.native
  def get(key: js.Any): js.Array[_] = js.native
  def set(key: js.Any, value: js.Any): Unit = js.native
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, _]): Unit = js.native
  def sort(a: js.Any, b: js.Any): `-1` | `0` | `1` = js.native
}

object KeyValueStore {
  @scala.inline
  def apply(
    bs: () => js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found],
    get: js.Any => js.Array[_],
    keys: js.Array[_],
    set: (js.Any, js.Any) => Unit,
    setSort: js.Function2[/* target */ js.Any, /* test */ js.Any, _] => Unit,
    sort: (js.Any, js.Any) => `-1` | `0` | `1`,
    values: js.Array[_]
  ): KeyValueStore = {
    val __obj = js.Dynamic.literal(bs = js.Any.fromFunction0(bs), get = js.Any.fromFunction1(get), keys = keys.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setSort = js.Any.fromFunction1(setSort), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueStore]
  }
  @scala.inline
  implicit class KeyValueStoreOps[Self <: KeyValueStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBs(value: () => js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSort(value: js.Function2[/* target */ js.Any, /* test */ js.Any, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(value: (js.Any, js.Any) => `-1` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

