package typingsSlinky.ionicons.stencilCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionalUtilities extends js.Object {
  def forEach(
    children: js.Array[VNode],
    cb: js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], Unit]
  ): Unit = js.native
  def map(
    children: js.Array[VNode],
    cb: js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], ChildNode]
  ): js.Array[VNode] = js.native
}

object FunctionalUtilities {
  @scala.inline
  def apply(
    forEach: (js.Array[VNode], js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], Unit]) => Unit,
    map: (js.Array[VNode], js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], ChildNode]) => js.Array[VNode]
  ): FunctionalUtilities = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction2(forEach), map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[FunctionalUtilities]
  }
  @scala.inline
  implicit class FunctionalUtilitiesOps[Self <: FunctionalUtilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForEach(
      value: (js.Array[VNode], js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMap(
      value: (js.Array[VNode], js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], ChildNode]) => js.Array[VNode]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

