package typingsSlinky.dojo.dojox.gfx3d.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.scheduler.html
  *
  *
  */
@js.native
trait scheduler extends js.Object {
  /**
    *
    */
  def BinarySearchTree(): Unit = js.native
  /**
    *
    * @param buffer
    * @param outline
    */
  def bsp(buffer: js.Any, outline: js.Any): js.Any = js.native
  /**
    *
    * @param it
    */
  def order(it: js.Any): js.Any = js.native
  /**
    *
    * @param it
    */
  def outline(it: js.Any): js.Any = js.native
  /**
    *
    * @param buffer
    * @param order
    */
  def zOrder(buffer: js.Any, order: js.Any): js.Any = js.native
}

object scheduler {
  @scala.inline
  def apply(
    BinarySearchTree: () => Unit,
    bsp: (js.Any, js.Any) => js.Any,
    order: js.Any => js.Any,
    outline: js.Any => js.Any,
    zOrder: (js.Any, js.Any) => js.Any
  ): scheduler = {
    val __obj = js.Dynamic.literal(BinarySearchTree = js.Any.fromFunction0(BinarySearchTree), bsp = js.Any.fromFunction2(bsp), order = js.Any.fromFunction1(order), outline = js.Any.fromFunction1(outline), zOrder = js.Any.fromFunction2(zOrder))
    __obj.asInstanceOf[scheduler]
  }
  @scala.inline
  implicit class schedulerOps[Self <: scheduler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinarySearchTree(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BinarySearchTree")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBsp(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOrder(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutline(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withZOrder(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrder")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

