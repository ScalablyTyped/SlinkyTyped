package typingsSlinky.promiseDag.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseImplementation[P /* <: js.Thenable[_] */] extends js.Object {
  def all(values: js.Array[_]): P = js.native
  def reject(value: js.Any): P = js.native
  def resolve(value: js.Any): P = js.native
}

object PromiseImplementation {
  @scala.inline
  def apply[P](all: js.Array[_] => P, reject: js.Any => P, resolve: js.Any => P): PromiseImplementation[P] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[PromiseImplementation[P]]
  }
  @scala.inline
  implicit class PromiseImplementationOps[Self[p] <: PromiseImplementation[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withAll(value: js.Array[_] => P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReject(value: js.Any => P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolve(value: js.Any => P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

