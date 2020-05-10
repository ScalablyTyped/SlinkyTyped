package typingsSlinky.normalizr.mod.schema

import typingsSlinky.normalizr.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object[T] extends Schema_[T] {
  def define(definition: Schema_[_]): Unit = js.native
}

object Object {
  @scala.inline
  def apply[T](define: Schema_[_] => Unit): Object[T] = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction1(define))
    __obj.asInstanceOf[Object[T]]
  }
  @scala.inline
  implicit class ObjectOps[Self[t] <: Object[t], T] (val x: Self[T]) extends AnyVal {
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

