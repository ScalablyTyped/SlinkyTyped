package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Immediate extends RefCounted {
  var _onImmediate: js.Function = js.native
  def hasRef(): Boolean = js.native
}

object Immediate {
  @scala.inline
  def apply(_onImmediate: js.Function, hasRef: () => Boolean, ref: () => Immediate, unref: () => Immediate): Immediate = {
    val __obj = js.Dynamic.literal(_onImmediate = _onImmediate.asInstanceOf[js.Any], hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
    __obj.asInstanceOf[Immediate]
  }
  @scala.inline
  implicit class ImmediateOps[Self <: Immediate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_onImmediate(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onImmediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasRef(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRef")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

