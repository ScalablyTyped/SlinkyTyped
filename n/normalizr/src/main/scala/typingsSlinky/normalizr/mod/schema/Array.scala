package typingsSlinky.normalizr.mod.schema

import typingsSlinky.normalizr.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  def define(definition: Schema_[_]): Unit = js.native
}

object Array {
  @scala.inline
  def apply[T](define: Schema_[_] => Unit): Array[T] = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
    __obj.asInstanceOf[Array[T]]
  }
  @scala.inline
  implicit class ArrayOps[Self[t] <: Array[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDefine(value: Schema_[_] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("define")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

