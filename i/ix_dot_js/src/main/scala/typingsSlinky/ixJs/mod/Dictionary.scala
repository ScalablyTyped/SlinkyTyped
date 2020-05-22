package typingsSlinky.ixJs.mod

import typingsSlinky.ixJs.Ix.EqualityComparer
import typingsSlinky.ixJs.Ix.KeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ix", "Dictionary")
@js.native
class Dictionary[TKey, TValue] ()
  extends typingsSlinky.ixJs.Ix.Dictionary[TKey, TValue] {
  def this(capacity: Double) = this()
  def this(capacity: Double, comparer: EqualityComparer[TKey, TKey]) = this()
  /* CompleteClass */
  override def add(key: TKey, value: TValue): Unit = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def get(key: TKey): TValue = js.native
  /* CompleteClass */
  override def getValues(): js.Array[TValue] = js.native
  /* CompleteClass */
  override def has(key: TKey): Boolean = js.native
  /* CompleteClass */
  override def length(): Double = js.native
  /* CompleteClass */
  override def remove(key: TKey): Boolean = js.native
  /* CompleteClass */
  override def set(key: TKey, value: TValue): Unit = js.native
  /* CompleteClass */
  override def toEnumerable(): typingsSlinky.ixJs.Ix.Enumerable[KeyValuePair[TKey, TValue]] = js.native
  /* CompleteClass */
  override def tryGetValue(key: TKey): TValue = js.native
}

