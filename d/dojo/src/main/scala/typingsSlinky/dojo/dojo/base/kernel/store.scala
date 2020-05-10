package typingsSlinky.dojo.dojo.base.kernel

import typingsSlinky.dojo.dojo.store.api.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.store.html
  *
  *
  */
@js.native
trait store extends js.Object {
  /**
    *
    */
  var util: js.Object = js.native
  /**
    *
    * @param masterStore
    * @param cachingStore
    * @param options
    */
  def Cache(masterStore: js.Any, cachingStore: js.Any, options: js.Any): js.Any = js.native
  /**
    *
    */
  def DataStore(): Unit = js.native
  /**
    *
    */
  def JsonRest(): Unit = js.native
  /**
    *
    */
  def Memory(): Unit = js.native
  /**
    * The Observable store wrapper takes a store and sets an observe method on query()
    * results that can be used to monitor results for changes.
    * Observable wraps an existing store so that notifications can be made when a query
    * is performed.
    *
    * @param store
    */
  def Observable(store: Store): js.Any = js.native
}

object store {
  @scala.inline
  def apply(
    Cache: (js.Any, js.Any, js.Any) => js.Any,
    DataStore: () => Unit,
    JsonRest: () => Unit,
    Memory: () => Unit,
    Observable: Store => js.Any,
    util: js.Object
  ): store = {
    val __obj = js.Dynamic.literal(Cache = js.Any.fromFunction3(Cache), DataStore = js.Any.fromFunction0(DataStore), JsonRest = js.Any.fromFunction0(JsonRest), Memory = js.Any.fromFunction0(Memory), Observable = js.Any.fromFunction1(Observable), util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[store]
  }
  @scala.inline
  implicit class storeOps[Self <: store] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cache")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDataStore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJsonRest(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonRest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMemory(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Memory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObservable(value: Store => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Observable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUtil(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("util")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

