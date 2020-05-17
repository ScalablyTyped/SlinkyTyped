package typingsSlinky.lokijs

import typingsSlinky.lokijs.anon.Found
import typingsSlinky.lokijs.lokijsNumbers.`-1`
import typingsSlinky.lokijs.lokijsNumbers.`0`
import typingsSlinky.lokijs.lokijsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortedIndex extends js.Object {
  var field: String = js.native
  var keys: js.Array[_] = js.native
  var values: js.Array[_] = js.native
  def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found] = js.native
  // clear will zap the index
  def clear(): Unit = js.native
  // get all values which have a key == the given key
  def get(key: js.Any): js.Array[_] = js.native
  // get all vals from start to end
  def getAll(key: js.Any, start: Double, end: Double): js.Array[_] = js.native
  // get all values which have a key > the given key
  def getGt(key: js.Any): js.Array[_] = js.native
  // get all values which have a key < the given key
  def getLt(key: js.Any): js.Array[_] = js.native
  // just in case someone wants to do something smart with ranges
  def getPos(key: js.Any): Found = js.native
  // remove the value from the index, if the value was the last one, remove the key
  def remove(key: js.Any, value: js.Any): Unit = js.native
  // add the value you want returned  to the key in the index
  def set(key: js.Any, value: js.Any): Unit = js.native
  // and allow override of the default sort
  def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, Double]): Unit = js.native
  // set the default sort
  def sort(a: js.Any, b: js.Any): `-1` | `0` | `1` = js.native
}

object SortedIndex {
  @scala.inline
  def apply(
    bs: () => js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found],
    clear: () => Unit,
    field: String,
    get: js.Any => js.Array[_],
    getAll: (js.Any, Double, Double) => js.Array[_],
    getGt: js.Any => js.Array[_],
    getLt: js.Any => js.Array[_],
    getPos: js.Any => Found,
    keys: js.Array[_],
    remove: (js.Any, js.Any) => Unit,
    set: (js.Any, js.Any) => Unit,
    setSort: js.Function2[/* target */ js.Any, /* test */ js.Any, Double] => Unit,
    sort: (js.Any, js.Any) => `-1` | `0` | `1`,
    values: js.Array[_]
  ): SortedIndex = {
    val __obj = js.Dynamic.literal(bs = js.Any.fromFunction0(bs), clear = js.Any.fromFunction0(clear), field = field.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction3(getAll), getGt = js.Any.fromFunction1(getGt), getLt = js.Any.fromFunction1(getLt), getPos = js.Any.fromFunction1(getPos), keys = keys.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), setSort = js.Any.fromFunction1(setSort), sort = js.Any.fromFunction2(sort), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedIndex]
  }
  @scala.inline
  implicit class SortedIndexOps[Self <: SortedIndex] (val x: Self) extends AnyVal {
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
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAll(value: (js.Any, Double, Double) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetGt(value: js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLt(value: js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPos(value: js.Any => Found): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPos")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSort(value: js.Function2[/* target */ js.Any, /* test */ js.Any, Double] => Unit): Self = {
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

