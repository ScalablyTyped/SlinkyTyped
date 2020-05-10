package typingsSlinky.dojo.dojox.collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/collections/_base.html
  *
  *
  */
@js.native
trait base extends js.Object {
  /**
    *
    */
  var Set: js.Object = js.native
  /**
    * Returns a new object of type dojox.collections.ArrayList
    *
    * @param arr               Optional
    */
  def ArrayList(arr: js.Array[_]): Unit = js.native
  /**
    *
    * @param data
    */
  def BinaryTree(data: js.Any): Unit = js.native
  /**
    * Returns an object of type dojox.collections.Dictionary
    *
    * @param dictionary               Optional
    */
  def Dictionary(dictionary: typingsSlinky.dojo.dojox.collections.Dictionary): Unit = js.native
  /**
    * return an object of type dojox.collections.DictionaryEntry
    *
    * @param k
    * @param v
    */
  def DictionaryEntry(k: String, v: js.Object): Unit = js.native
  /**
    * return an object of type dojox.collections.DictionaryIterator
    *
    * @param obj
    */
  def DictionaryIterator(obj: js.Object): Unit = js.native
  /**
    * return an object of type dojox.collections.Iterator
    *
    * @param a
    */
  def Iterator(a: js.Array[_]): Unit = js.native
  /**
    * return an object of type dojox.collections.Queue
    *
    * @param arr               Optional
    */
  def Queue(arr: js.Array[_]): Unit = js.native
  /**
    * creates a collection that acts like a dictionary but is also internally sorted.
    * Note that the act of adding any elements forces an internal resort, making this object potentially slow.
    *
    * @param dictionary               Optional
    */
  def SortedList(dictionary: js.Object): Unit = js.native
  /**
    * returns an object of type dojox.collections.Stack
    *
    * @param arr               Optional
    */
  def Stack(arr: js.Array[_]): Unit = js.native
}

object base {
  @scala.inline
  def apply(
    ArrayList: js.Array[_] => Unit,
    BinaryTree: js.Any => Unit,
    Dictionary: Dictionary => Unit,
    DictionaryEntry: (String, js.Object) => Unit,
    DictionaryIterator: js.Object => Unit,
    Iterator: js.Array[_] => Unit,
    Queue: js.Array[_] => Unit,
    Set: js.Object,
    SortedList: js.Object => Unit,
    Stack: js.Array[_] => Unit
  ): base = {
    val __obj = js.Dynamic.literal(ArrayList = js.Any.fromFunction1(ArrayList), BinaryTree = js.Any.fromFunction1(BinaryTree), Dictionary = js.Any.fromFunction1(Dictionary), DictionaryEntry = js.Any.fromFunction2(DictionaryEntry), DictionaryIterator = js.Any.fromFunction1(DictionaryIterator), Iterator = js.Any.fromFunction1(Iterator), Queue = js.Any.fromFunction1(Queue), Set = Set.asInstanceOf[js.Any], SortedList = js.Any.fromFunction1(SortedList), Stack = js.Any.fromFunction1(Stack))
    __obj.asInstanceOf[base]
  }
  @scala.inline
  implicit class baseOps[Self <: base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayList(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBinaryTree(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinaryTree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDictionary(value: Dictionary => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dictionary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDictionaryEntry(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DictionaryEntry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDictionaryIterator(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DictionaryIterator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIterator(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iterator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueue(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Queue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortedList(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStack(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stack")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

