package typingsSlinky.javascriptObfuscator.imapstorageMod

import typingsSlinky.javascriptObfuscator.iinitializableMod.IInitializable
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapStorage[K, V]
  extends IInitializable[js.Array[scala.Nothing]] {
  /**
    * @param {K} key
    * @returns {V}
    */
  def get(key: K): V = js.native
  /**
    * @param {V} value
    * @returns {K | null}
    */
  def getKeyOf(value: V): K | Null = js.native
  /**
    * @returns number
    */
  def getLength(): Double = js.native
  /**
    * @returns {Map<K, V>}
    */
  def getStorage(): Map[K, V] = js.native
  /**
    * @returns string
    */
  def getStorageId(): String = js.native
  /**
    * @param {K} key
    * @returns {boolean}
    */
  def has(key: K): Boolean = js.native
  /**
    * @param storage
    * @param mergeId
    */
  def mergeWith(storage: this.type, mergeId: Boolean): Unit = js.native
  /**
    * @param {K} key
    * @param {V} value
    */
  def set(key: K, value: V): Unit = js.native
}

object IMapStorage {
  @scala.inline
  def apply[K, V](
    get: K => V,
    getKeyOf: V => K | Null,
    getLength: () => Double,
    getStorage: () => Map[K, V],
    getStorageId: () => String,
    has: K => Boolean,
    initialize: js.Array[scala.Nothing] => Unit,
    mergeWith: (IMapStorage[K, V], Boolean) => Unit,
    set: (K, V) => Unit
  ): IMapStorage[K, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getKeyOf = js.Any.fromFunction1(getKeyOf), getLength = js.Any.fromFunction0(getLength), getStorage = js.Any.fromFunction0(getStorage), getStorageId = js.Any.fromFunction0(getStorageId), has = js.Any.fromFunction1(has), initialize = js.Any.fromFunction1(initialize), mergeWith = js.Any.fromFunction2(mergeWith), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[IMapStorage[K, V]]
  }
  @scala.inline
  implicit class IMapStorageOps[Self[k, v] <: IMapStorage[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withGet(value: K => V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetKeyOf(value: V => K | Null): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStorage(value: () => Map[K, V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStorage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStorageId(value: () => String): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStorageId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHas(value: K => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMergeWith(value: (IMapStorage[K, V], Boolean) => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeWith")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet(value: (K, V) => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

