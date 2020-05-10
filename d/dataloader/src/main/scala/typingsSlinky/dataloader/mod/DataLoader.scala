package typingsSlinky.dataloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLoader[K, V] extends js.Object {
  /**
    * Clears the value at `key` from the cache, if it exists. Returns itself for
    * method chaining.
    */
  def clear(key: K): DataLoader[K, V] = js.native
  /**
    * Clears the entire cache. To be used when some event results in unknown
    * invalidations across this particular `DataLoader`. Returns itself for
    * method chaining.
    */
  def clearAll(): DataLoader[K, V] = js.native
  /**
    * Loads a key, returning a `Promise` for the value represented by that key.
    */
  def load(key: K): js.Promise[V] = js.native
  /**
    * Loads multiple keys, promising an array of values:
    *
    *     var [ a, b ] = await myLoader.loadMany([ 'a', 'b' ]);
    *
    * This is equivalent to the more verbose:
    *
    *     var [ a, b ] = await Promise.all([
    *       myLoader.load('a'),
    *       myLoader.load('b')
    *     ]);
    *
    */
  def loadMany(keys: js.Array[K]): js.Promise[js.Array[V]] = js.native
  /**
    * Adds the provied key and value to the cache. If the key already exists, no
    * change is made. Returns itself for method chaining.
    */
  def prime(key: K, value: V): DataLoader[K, V] = js.native
}

object DataLoader {
  @scala.inline
  def apply[K, V](
    clear: K => DataLoader[K, V],
    clearAll: () => DataLoader[K, V],
    load: K => js.Promise[V],
    loadMany: js.Array[K] => js.Promise[js.Array[V]],
    prime: (K, V) => DataLoader[K, V]
  ): DataLoader[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), clearAll = js.Any.fromFunction0(clearAll), load = js.Any.fromFunction1(load), loadMany = js.Any.fromFunction1(loadMany), prime = js.Any.fromFunction2(prime))
    __obj.asInstanceOf[DataLoader[K, V]]
  }
  @scala.inline
  implicit class DataLoaderOps[Self[k, v] <: DataLoader[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withClear(value: K => DataLoader[K, V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearAll(value: () => DataLoader[K, V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoad(value: K => js.Promise[V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadMany(value: js.Array[K] => js.Promise[js.Array[V]]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMany")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrime(value: (K, V) => DataLoader[K, V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prime")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

