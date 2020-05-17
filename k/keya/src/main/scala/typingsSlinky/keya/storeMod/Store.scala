package typingsSlinky.keya.storeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.keya.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  var name: String = js.native
  var store: StringDictionary[js.Any] = js.native
  var version: Double = js.native
  def all(): js.Promise[js.Array[Key]] = js.native
  def clear(): js.Promise[Unit] = js.native
  def delete(key: String): js.Promise[Boolean] = js.native
  def find(finder: js.Function2[/* value */ js.Any, /* name */ String, js.Promise[Boolean] | Boolean]): js.Promise[js.Array[Key]] = js.native
  def get(key: String): js.Promise[_] = js.native
  def initalize(): js.Promise[Unit] = js.native
  def load(): js.Promise[Unit] = js.native
  def save(): js.Promise[Unit] = js.native
  def set(key: String, value: js.Any): js.Promise[Boolean] = js.native
}

object Store {
  @scala.inline
  def apply(
    all: () => js.Promise[js.Array[Key]],
    clear: () => js.Promise[Unit],
    delete: String => js.Promise[Boolean],
    find: js.Function2[/* value */ js.Any, /* name */ String, js.Promise[Boolean] | Boolean] => js.Promise[js.Array[Key]],
    get: String => js.Promise[_],
    initalize: () => js.Promise[Unit],
    load: () => js.Promise[Unit],
    name: String,
    save: () => js.Promise[Unit],
    set: (String, js.Any) => js.Promise[Boolean],
    store: StringDictionary[js.Any],
    version: Double
  ): Store = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), find = js.Any.fromFunction1(find), get = js.Any.fromFunction1(get), initalize = js.Any.fromFunction0(initalize), load = js.Any.fromFunction0(load), name = name.asInstanceOf[js.Any], save = js.Any.fromFunction0(save), set = js.Any.fromFunction2(set), store = store.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: () => js.Promise[js.Array[Key]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClear(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: String => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFind(
      value: js.Function2[/* value */ js.Any, /* name */ String, js.Promise[Boolean] | Boolean] => js.Promise[js.Array[Key]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitalize(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoad(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, js.Any) => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStore(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

