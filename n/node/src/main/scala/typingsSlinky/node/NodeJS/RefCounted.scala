package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefCounted extends js.Object {
  def ref(): this.type = js.native
  def unref(): this.type = js.native
}

object RefCounted {
  @scala.inline
  def apply(ref: () => RefCounted, unref: () => RefCounted): RefCounted = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
    __obj.asInstanceOf[RefCounted]
  }
  @scala.inline
  implicit class RefCountedOps[Self <: RefCounted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRef(value: () => RefCounted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnref(value: () => RefCounted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unref")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

