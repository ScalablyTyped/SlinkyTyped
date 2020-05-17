package typingsSlinky.grpcGrpcJs.filterMod

import typingsSlinky.grpcGrpcJs.callStreamMod.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterFactory[T /* <: Filter */] extends js.Object {
  def createFilter(callStream: Call): T = js.native
}

object FilterFactory {
  @scala.inline
  def apply[T](createFilter: Call => T): FilterFactory[T] = {
    val __obj = js.Dynamic.literal(createFilter = js.Any.fromFunction1(createFilter))
    __obj.asInstanceOf[FilterFactory[T]]
  }
  @scala.inline
  implicit class FilterFactoryOps[Self[t] <: FilterFactory[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCreateFilter(value: Call => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFilter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

