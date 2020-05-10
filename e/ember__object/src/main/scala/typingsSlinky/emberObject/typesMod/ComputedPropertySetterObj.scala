package typingsSlinky.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputedPropertySetterObj[T] extends _ComputedPropertyObj[T] {
  def set(key: String, value: T): T = js.native
}

object ComputedPropertySetterObj {
  @scala.inline
  def apply[T](set: (String, T) => T): ComputedPropertySetterObj[T] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[ComputedPropertySetterObj[T]]
  }
  @scala.inline
  implicit class ComputedPropertySetterObjOps[Self[t] <: ComputedPropertySetterObj[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSet(value: (String, T) => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

