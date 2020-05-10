package typingsSlinky.javascriptObfuscator.iarraystorageMod

import typingsSlinky.javascriptObfuscator.iinitializableMod.IInitializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IArrayStorage[V]
  extends IInitializable[js.Array[scala.Nothing]] {
  /**
    * @param {number} key
    * @returns {V}
    */
  def get(key: Double): V = js.native
  /**
    * @param value
    * @returns number | null
    */
  def getKeyOf(value: V): Double | Null = js.native
  /**
    * @returns number
    */
  def getLength(): Double = js.native
  /**
    * @returns {V[]}
    */
  def getStorage(): js.Array[V] = js.native
  /**
    * @returns string
    */
  def getStorageId(): String = js.native
  /**
    * @param storage
    * @param mergeId
    */
  def mergeWith(storage: this.type, mergeId: Boolean): Unit = js.native
  /**
    * @param {number} key
    * @param {V} value
    */
  def set(key: Double, value: V): Unit = js.native
}

object IArrayStorage {
  @scala.inline
  def apply[V](
    get: Double => V,
    getKeyOf: V => Double | Null,
    getLength: () => Double,
    getStorage: () => js.Array[V],
    getStorageId: () => String,
    initialize: js.Array[scala.Nothing] => Unit,
    mergeWith: (IArrayStorage[V], Boolean) => Unit,
    set: (Double, V) => Unit
  ): IArrayStorage[V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getKeyOf = js.Any.fromFunction1(getKeyOf), getLength = js.Any.fromFunction0(getLength), getStorage = js.Any.fromFunction0(getStorage), getStorageId = js.Any.fromFunction0(getStorageId), initialize = js.Any.fromFunction1(initialize), mergeWith = js.Any.fromFunction2(mergeWith), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[IArrayStorage[V]]
  }
  @scala.inline
  implicit class IArrayStorageOps[Self[v] <: IArrayStorage[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withGet(value: Double => V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetKeyOf(value: V => Double | Null): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStorage(value: () => js.Array[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStorage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStorageId(value: () => String): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStorageId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMergeWith(value: (IArrayStorage[V], Boolean) => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeWith")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet(value: (Double, V) => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

