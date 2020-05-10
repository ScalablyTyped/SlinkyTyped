package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextKey[T] extends js.Object {
  def get(): js.UndefOr[T] = js.native
  def reset(): Unit = js.native
  def set(value: T): Unit = js.native
}

object IContextKey {
  @scala.inline
  def apply[T](get: () => js.UndefOr[T], reset: () => Unit, set: T => Unit): IContextKey[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IContextKey[T]]
  }
  @scala.inline
  implicit class IContextKeyOps[Self[t] <: IContextKey[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGet(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

