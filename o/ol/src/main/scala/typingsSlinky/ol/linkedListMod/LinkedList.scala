package typingsSlinky.ol.linkedListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedList extends js.Object {
  def concat(list: LinkedList): Unit = js.native
  def firstItem(): js.Any = js.native
  def getCurrItem(): js.Any = js.native
  def getLength(): Double = js.native
  def getNextItem(): js.Any = js.native
  def getPrevItem(): js.Any = js.native
  def insertItem(data: js.Any): Unit = js.native
  def lastItem(): js.Any = js.native
  def nextItem(): js.Any = js.native
  def prevItem(): js.Any = js.native
  def removeItem(): Unit = js.native
  def setFirstItem(): Unit = js.native
}

object LinkedList {
  @scala.inline
  def apply(
    concat: LinkedList => Unit,
    firstItem: () => js.Any,
    getCurrItem: () => js.Any,
    getLength: () => Double,
    getNextItem: () => js.Any,
    getPrevItem: () => js.Any,
    insertItem: js.Any => Unit,
    lastItem: () => js.Any,
    nextItem: () => js.Any,
    prevItem: () => js.Any,
    removeItem: () => Unit,
    setFirstItem: () => Unit
  ): LinkedList = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), firstItem = js.Any.fromFunction0(firstItem), getCurrItem = js.Any.fromFunction0(getCurrItem), getLength = js.Any.fromFunction0(getLength), getNextItem = js.Any.fromFunction0(getNextItem), getPrevItem = js.Any.fromFunction0(getPrevItem), insertItem = js.Any.fromFunction1(insertItem), lastItem = js.Any.fromFunction0(lastItem), nextItem = js.Any.fromFunction0(nextItem), prevItem = js.Any.fromFunction0(prevItem), removeItem = js.Any.fromFunction0(removeItem), setFirstItem = js.Any.fromFunction0(setFirstItem))
    __obj.asInstanceOf[LinkedList]
  }
  @scala.inline
  implicit class LinkedListOps[Self <: LinkedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcat(value: LinkedList => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstItem(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrItem(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNextItem(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrevItem(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrevItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertItem(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLastItem(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextItem(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrevItem(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFirstItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFirstItem")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

