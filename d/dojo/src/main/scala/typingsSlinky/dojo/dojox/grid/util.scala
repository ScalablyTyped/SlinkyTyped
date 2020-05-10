package typingsSlinky.dojo.dojox.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/util.html
  *
  * grid utility library
  *
  */
@js.native
trait util extends js.Object {
  /**
    *
    */
  var gridViewTag: String = js.native
  /**
    *
    */
  var keyEvents: js.Array[_] = js.native
  /**
    *
    */
  var mouseEvents: js.Array[_] = js.native
  /**
    *
    */
  var na: String = js.native
  /**
    *
    */
  var rowIndexTag: String = js.native
  /**
    *
    * @param inA
    * @param inB
    */
  def arrayCompare(inA: js.Any, inB: js.Any): Unit = js.native
  /**
    *
    * @param inArray
    * @param inIndex
    * @param inValue
    */
  def arrayInsert(inArray: js.Any, inIndex: js.Any, inValue: js.Any): Unit = js.native
  /**
    *
    * @param inArray
    * @param inIndex
    */
  def arrayRemove(inArray: js.Any, inIndex: js.Any): Unit = js.native
  /**
    *
    * @param inArray
    * @param inI
    * @param inJ
    */
  def arraySwap(inArray: js.Any, inI: js.Any, inJ: js.Any): Unit = js.native
  /**
    *
    * @param ob
    * @param ev
    * @param args
    */
  def fire(ob: js.Any, ev: js.Any, args: js.Any): js.Any = js.native
  /**
    *
    * @param inNode
    * @param inObject
    * @param inMethod
    * @param inEvents
    */
  def funnelEvents(inNode: js.Any, inObject: js.Any, inMethod: js.Any, inEvents: js.Any): Unit = js.native
  /**
    *
    * @param inNode
    */
  def removeNode(inNode: js.Any): js.Any = js.native
  /**
    *
    * @param inElement
    * @param inHeight
    */
  def setStyleHeightPx(inElement: js.Any, inHeight: js.Any): Unit = js.native
}

object util {
  @scala.inline
  def apply(
    arrayCompare: (js.Any, js.Any) => Unit,
    arrayInsert: (js.Any, js.Any, js.Any) => Unit,
    arrayRemove: (js.Any, js.Any) => Unit,
    arraySwap: (js.Any, js.Any, js.Any) => Unit,
    fire: (js.Any, js.Any, js.Any) => js.Any,
    funnelEvents: (js.Any, js.Any, js.Any, js.Any) => Unit,
    gridViewTag: String,
    keyEvents: js.Array[_],
    mouseEvents: js.Array[_],
    na: String,
    removeNode: js.Any => js.Any,
    rowIndexTag: String,
    setStyleHeightPx: (js.Any, js.Any) => Unit
  ): util = {
    val __obj = js.Dynamic.literal(arrayCompare = js.Any.fromFunction2(arrayCompare), arrayInsert = js.Any.fromFunction3(arrayInsert), arrayRemove = js.Any.fromFunction2(arrayRemove), arraySwap = js.Any.fromFunction3(arraySwap), fire = js.Any.fromFunction3(fire), funnelEvents = js.Any.fromFunction4(funnelEvents), gridViewTag = gridViewTag.asInstanceOf[js.Any], keyEvents = keyEvents.asInstanceOf[js.Any], mouseEvents = mouseEvents.asInstanceOf[js.Any], na = na.asInstanceOf[js.Any], removeNode = js.Any.fromFunction1(removeNode), rowIndexTag = rowIndexTag.asInstanceOf[js.Any], setStyleHeightPx = js.Any.fromFunction2(setStyleHeightPx))
    __obj.asInstanceOf[util]
  }
  @scala.inline
  implicit class utilOps[Self <: util] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayCompare(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayCompare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withArrayInsert(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayInsert")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withArrayRemove(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayRemove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withArraySwap(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arraySwap")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFire(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFunnelEvents(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnelEvents")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGridViewTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridViewTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyEvents(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseEvents(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("na")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveNode(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowIndexTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndexTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetStyleHeightPx(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleHeightPx")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

