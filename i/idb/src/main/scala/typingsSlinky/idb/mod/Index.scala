package typingsSlinky.idb.mod

import org.scalajs.dom.raw.IDBKeyRange
import typingsSlinky.std.IDBValidKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index[TValue, TKey] extends HasCursor[TValue, TKey] {
  
  /** Returns a Promise of an IDBRequest object that (in a separate thread) counts the matching records.
    * If no arguments are provided, it returns the total number of records in the store.
    * @param key A key or IDBKeyRange object that specifies a range of records you want to count.
    * @returns A promise that resolves with the total when the underlying count IDBRequest is successful. */
  def count(): js.Promise[Double] = js.native
  def count(key: IDBKeyRange): js.Promise[Double] = js.native
  def count(key: IDBValidKey): js.Promise[Double] = js.native
  
  /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves with the store object store selected by the specified key.
    * This is for retrieving specific records from an object store.
    * @param key The key or key range that identifies the record to be retrieved.
    * @returns A promise that resolves with the item when the underlying get IDBRequest is successful. */
  def get(key: IDBKeyRange): js.Promise[TValue] = js.native
  def get(key: IDBValidKey): js.Promise[TValue] = js.native
  
  /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves with the objects in the object store matching the specified parameter or all objects in the store if no parameters are given.
    * @param query Optional. A key or IDBKeyRange to be queried. If nothing is passed, this will default to a key range that selects all the records in this object store.
    * @param count Optional. Specifies the number of values to return if more than one is found. If it is lower than 0 or greater than 232-1 a TypeError exception will be thrown.
    * @returns A promise that resolves with the items when the underlying getAll IDBRequest is successful. */
  def getAll(): js.Promise[js.Array[TValue]] = js.native
  def getAll(query: js.UndefOr[IDBValidKey], count: Double): js.Promise[js.Array[TValue]] = js.native
  def getAll(query: IDBKeyRange): js.Promise[js.Array[TValue]] = js.native
  def getAll(query: IDBKeyRange, count: Double): js.Promise[js.Array[TValue]] = js.native
  def getAll(query: IDBValidKey): js.Promise[js.Array[TValue]] = js.native
  
  /** Returns a Promise of an IDBRequest object that (in a separate thread) resolves with record keys for all the objects matching the specified parameter or all record keys in the store if no parameters are given.
    * @param query Optional. A key or IDBKeyRange to be queried. If nothing is passed, this will default to a key range that selects all the records in this object store.
    * @param count Optional. Specifies the number of values to return if more than one is found. If it is lower than 0 or greater than 232-1 a TypeError exception will be thrown.
    * @returns A promise that resolves with the record keys when the underlying getAllKeys IDBRequest is successful. */
  def getAllKeys(): js.Promise[js.Array[TKey]] = js.native
  def getAllKeys(query: js.UndefOr[scala.Nothing], count: Double): js.Promise[js.Array[TKey]] = js.native
  def getAllKeys(query: IDBKeyRange): js.Promise[js.Array[TKey]] = js.native
  def getAllKeys(query: IDBKeyRange, count: Double): js.Promise[js.Array[TKey]] = js.native
  
  /** Returns a Promise of an IDBRequest object that (in a separate thread) finds either the given key or the primary key, if key is an IDBKeyRange.
    * @param key The key or key range that identifies the record to be retrieved.
    * @returns A promise that resolves with the item when the underlying get IDBRequest is successful. */
  def getKey(key: IDBKeyRange): js.Promise[TValue] = js.native
  def getKey(key: IDBValidKey): js.Promise[TValue] = js.native
  
  /** The key path of this index. If null, this index is not auto-populated. */
  val keyPath: String | js.Array[String] = js.native
  
  /** Affects how the index behaves when the result of evaluating the index's key path yields an array.
    * If true, there is one record in the index for each item in an array of keys.
    * If false, then there is one record for each key that is an array. */
  val multiEntry: Boolean = js.native
  
  /** The name of this index. */
  val name: String = js.native
  
  /** If true, this index does not allow duplicate values for a key. */
  val unique: Boolean = js.native
}
