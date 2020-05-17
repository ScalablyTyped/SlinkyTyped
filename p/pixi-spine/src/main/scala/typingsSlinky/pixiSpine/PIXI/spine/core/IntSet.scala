package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntSet extends js.Object {
  var array: js.Array[Double] = js.native
  def add(value: Double): Boolean = js.native
  def clear(): Unit = js.native
  def contains(value: Double): Boolean = js.native
  def remove(value: Double): Unit = js.native
}

object IntSet {
  @scala.inline
  def apply(
    add: Double => Boolean,
    array: js.Array[Double],
    clear: () => Unit,
    contains: Double => Boolean,
    remove: Double => Unit
  ): IntSet = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), array = array.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[IntSet]
  }
  @scala.inline
  implicit class IntSetOps[Self <: IntSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArray(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContains(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

