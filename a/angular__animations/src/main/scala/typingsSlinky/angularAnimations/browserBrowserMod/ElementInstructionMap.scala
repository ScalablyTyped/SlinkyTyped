package typingsSlinky.angularAnimations.browserBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementInstructionMap extends js.Object {
  var _map: js.Any = js.native
  def append(element: js.Any, instructions: js.Array[AnimationTimelineInstruction]): Unit = js.native
  def clear(): Unit = js.native
  def consume(element: js.Any): js.Array[AnimationTimelineInstruction] = js.native
  def has(element: js.Any): Boolean = js.native
}

object ElementInstructionMap {
  @scala.inline
  def apply(
    _map: js.Any,
    append: (js.Any, js.Array[AnimationTimelineInstruction]) => Unit,
    clear: () => Unit,
    consume: js.Any => js.Array[AnimationTimelineInstruction],
    has: js.Any => Boolean
  ): ElementInstructionMap = {
    val __obj = js.Dynamic.literal(_map = _map.asInstanceOf[js.Any], append = js.Any.fromFunction2(append), clear = js.Any.fromFunction0(clear), consume = js.Any.fromFunction1(consume), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[ElementInstructionMap]
  }
  @scala.inline
  implicit class ElementInstructionMapOps[Self <: ElementInstructionMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_map(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppend(value: (js.Any, js.Array[AnimationTimelineInstruction]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConsume(value: js.Any => js.Array[AnimationTimelineInstruction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consume")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

